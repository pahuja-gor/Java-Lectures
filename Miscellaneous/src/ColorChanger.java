import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Random;

@SuppressWarnings("serial")
public class ColorChanger extends JPanel {

    static Random numberGen = new Random();
    private BufferedImage design;

    public ColorChanger() {

        design = new BufferedImage(500, 500, BufferedImage.TYPE_INT_RGB);
        Graphics g = design.getGraphics();
        boolean isPlaying = true;

        int rFinal = numberGen.nextInt(255) + 1;
        int gFinal = numberGen.nextInt(255) + 1;
        int bFinal = numberGen.nextInt(255) + 1;

        long startTime = System.currentTimeMillis();

        while (isPlaying) {
            for (int x = 0; x < 500; x += 10) {
                for (int y = 0; y < 500; y += 10) {
                    int rVal = numberGen.nextInt(255) + 1;
                    int gVal = numberGen.nextInt(255) + 1;
                    int bVal = numberGen.nextInt(255) + 1;

                    g.setColor(new Color(rVal, gVal, bVal));
                    g.fillRect(x, y, 10, 10);
                    System.out.println("The RGB Value is (" + rVal + ", " + gVal + ", " + bVal + ")");

                    while (rVal == rFinal && bVal == bFinal && gVal == gFinal) {
                        for (int x1 = 0; x1 <= 500; x1 += 10) {
                            for (int y1 = 0; y1 <= 500; y1 += 10) {
                                Color finalColor = new Color(rFinal, gFinal, bFinal); // Test
                                g.setColor(finalColor);
                                g.fillRect(x1, y1, 10, 10);
                                System.out.println("The Final RGB Value is (" + rFinal + ", " + gFinal + ", " + bFinal + ")");
                            }
                        }
                        isPlaying = false;
                        break;
                    }
                    break;
                }
                break;
            }
        }

        long endTime = System.currentTimeMillis();
        long totalTime = (endTime - startTime) / 1000;
        System.out.println("This program ran for " + totalTime + " seconds.");
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Random Color");
        frame.setBackground(Color.black);
        frame.setSize(500, 500);
        frame.setLocation(0, 0);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(new ColorChanger());
        frame.setVisible(true);
    }

    public void paintComponent(Graphics g) {
        g.drawImage(design, 0, 0, getWidth(), getHeight(), null);
    }
}