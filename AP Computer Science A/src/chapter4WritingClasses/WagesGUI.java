package chapter4WritingClasses;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;		// Import these three classes, and most GUI stuff will compile
import java.text.DecimalFormat;


public class WagesGUI {

	private final int WIDTH = 600;
	private final int HEIGHT = 250;

	private final int FONT_SIZE = 30;
	private final Font FONT = new Font("Arial", Font.BOLD | Font.PLAIN, FONT_SIZE);

	private JFrame frame;
	private JPanel panelMain, panelWages, panelHours;
	private JLabel labelWages, labelHours, labelResult;
	private JTextField wages, hours;
	private JButton buttonResult;


	public WagesGUI() {

		panelMain = new JPanel();
		panelWages = new JPanel();
		panelHours = new JPanel();

		panelMain.setPreferredSize(new Dimension(WIDTH, HEIGHT));
		panelMain.setBackground(Color.red);
		panelHours.setBackground(Color.red);
		panelWages.setBackground(Color.red);

		panelMain.setLayout(new BoxLayout(panelMain, BoxLayout.Y_AXIS));

		labelWages = new JLabel("Hourly Wage:");
		labelHours = new JLabel("Number of Hours:");

		labelWages.setFont(new Font("Arial", Font.BOLD, FONT_SIZE));
		labelHours.setFont(new Font("Arial", Font.BOLD, FONT_SIZE));

		labelResult = new JLabel("Total Salary: ");
		labelResult.setAlignmentX(Component.CENTER_ALIGNMENT);
		labelResult.setFont(FONT);

		buttonResult = new JButton("Calculate");
		buttonResult.setAlignmentX(Component.CENTER_ALIGNMENT);
		buttonResult.setFont(FONT);
		buttonResult.addActionListener(new SalaryListener());

		wages = new JTextField(5);
		hours = new JTextField(5);
		wages.setFont(new Font("Arial", Font.PLAIN, FONT_SIZE));
		hours.setFont(new Font("Arial", Font.PLAIN, FONT_SIZE));

		// add everything to the panelMain
		panelWages.add(labelWages);
		panelWages.add(wages);

		panelHours.add(labelHours);
		panelHours.add(hours);

		panelMain.add(panelWages);
		panelMain.add(panelHours);

		panelMain.add(labelResult);
		panelMain.add(buttonResult);

	}

	public void display() {
		frame = new JFrame("How Much Did You Make?");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocation(200, 100);
		frame.getContentPane().add(panelMain);
		frame.pack();
		frame.setVisible(true);
		frame.setResizable(false);
	}


	private class SalaryListener implements ActionListener {

		public void actionPerformed (ActionEvent event) {

			double hour, wage;

			hour = Double.parseDouble(hours.getText());
			wage = Double.parseDouble(wages.getText());

			if (hour <= 0) {

				labelResult.setText("Invalid Number of Hours.");
				return;
			}

			if (wage <= 0) {

				labelResult.setText("Invalid Wage.");
				return;
			}

			double extraHours = 0;
			if (hour > 40) {
				extraHours = hour - 40;
				hour = 40;
			}

			DecimalFormat fmt = new DecimalFormat ("$0.00");
			Double total = wage * hour;

			if (extraHours > 0) {
				total += (wage * extraHours * 1.5);
			}


			labelResult.setText("Total Salary: " + fmt.format(total));
		}
	}


	public static void main(String[] args) {
		WagesGUI converter = new WagesGUI();
		converter.display();

	}

}