import javax.swing.*;
import java.awt.*;

/**
 * @author
 */
@SuppressWarnings("serial")
public class PressYourLuckDisplay extends JPanel {

    private JLabel valueLabel, totalLabel, highScoreLabel;
    private int value, total, highScore;

    /**
     * Sets up the display for the game.
     */
    public PressYourLuckDisplay() {
        // Creates a table:  3 ROWS x 1 COLUMN
        setLayout(new GridLayout(3, 1));
        setBackground(new Color(255, 131, 0));

        Font font = new Font("Serif", Font.BOLD, 30);
        total = 0;
        value = 0;
        highScore = 0;

        valueLabel = new JLabel("Value: " + value);
        valueLabel.setFont(font);
        valueLabel.setForeground(Color.blue);
        add(valueLabel);

        totalLabel = new JLabel("Total: " + total);
        totalLabel.setFont(font);
        totalLabel.setForeground(Color.blue);
        add(totalLabel);

        highScoreLabel = new JLabel("High Score: " + highScore);
        highScoreLabel.setFont(font);
        highScoreLabel.setForeground(Color.blue);
        add(highScoreLabel);

    }


    /**
     * Updates the game each time a button is clicked.
     */
    public void update() {
        value = (int) (1 + Math.random() * 11);
        valueLabel.setText("Value: " + value);
        if ((value == 1) || (value == 2)) {
            total = 0;
            totalLabel.setText("Total: " + total);
        } else {
            total += value;
            totalLabel.setText("Total: " + total);
        }
        if (total > highScore) {
            highScore = total;
            highScoreLabel.setText("High Score: " + highScore);
        }
    }

}