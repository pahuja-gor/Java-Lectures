// Runs the game PONG

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;

public class Pong extends JPanel {
    private static final int FRAME = 800;
    private static final Color BACKGROUND = /*new Color(26, 159, 242)*/Color.black;
    private static final int PIXELS = 3;
    public int r = 32, g = 194, b = 14;
    public Color color = new Color(r, g, b);
    public double dx = (Math.random() * 4) + (1 / 2);
    public double dy = (Math.random() * 4) + (1 / 2);
    private BufferedImage myImage;
    private Graphics myBuffer;
    private Bumper leftBumper, rightBumper;
    private Ball pongBall;
    private int leftPlayerScore, rightPlayerScore;
    private Timer t;
    private boolean wPressed, sPressed, upPressed, downPressed;

    public Pong()       // just like all the other "Panels" in other labs
    {
        myImage = new BufferedImage(FRAME, FRAME, BufferedImage.TYPE_INT_RGB);
        myBuffer = myImage.getGraphics();
        drawBackground(myBuffer);
        Timer t = new Timer(5, new Listener());
        t.start();
        leftBumper = new Bumper(25, (FRAME / 2) - 75, 25, 150, color);
        rightBumper = new Bumper(750, (FRAME / 2) - 75, 25, 150, color);
        pongBall = new Ball(FRAME / 2, FRAME / 2, 30, color);
        wPressed = sPressed = upPressed = downPressed = false;
//        dx = (Math.random() * 13) - 6;
//        dy = (Math.random() * 13) - 6;
        //pongBall.jump(FRAME, FRAME);
        addKeyListener(new Key());
        setFocusable(true);
    }

    // Driver
    public static void main(String[] args) {
        JFrame frame = new JFrame("Pong");
        frame.setSize(FRAME, FRAME);
//        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
//        frame.setUndecorated(true);
        frame.setLocation(0, 0);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Pong p = new Pong();
        frame.setContentPane(p);
        //p.requestFocus();
        frame.setVisible(true);

    }

    /**
     * Draws the a green background
     *
     * @param g the graphics object
     */
    public void drawBackground(Graphics g) {
        g.setColor(BACKGROUND);
        g.fillRect(0, 0, FRAME, FRAME);
    }

    public void paintComponent(Graphics g) {
        g.drawImage(myImage, 0, 0, getWidth(), getHeight(), null);
//        for (int y = 0; y <= FRAME; y += 30) {
//            g.setColor(Color.black);
//            g.fillRect(FRAME / 2, y, 20, 20);
//        }
    }

    // moves the Left Bumper based upon which keys are
    // pressed or released
    public void updateLeftBumper() {
        if (wPressed == true && leftBumper.getY() > 0)
            leftBumper.setY(leftBumper.getY() - PIXELS);
        if (sPressed == true && (leftBumper.getY() + leftBumper.getYWidth()) < FRAME)
            leftBumper.setY(leftBumper.getY() + PIXELS);
    }

    // moves the Left Bumper based upon which keys are
    // pressed or released
    public void updateRightBumper() {
        if (upPressed == true && rightBumper.getY() > 0)
            rightBumper.setY(rightBumper.getY() - PIXELS);
        if (downPressed == true && (rightBumper.getY() + rightBumper.getYWidth()) < FRAME)
            rightBumper.setY(rightBumper.getY() + PIXELS);
    }

    public void Score(Ball b, Bumper lB, Bumper rB) {
        if ((b.getX() + b.getRadius()) > (rB.getX() + rB.getXWidth())) {

            leftPlayerScore += 1;
            System.out.println("The Score for Player 1 is " + leftPlayerScore);

            colorChanger();

            b.setX(FRAME / 2);
            b.setY(FRAME / 2);

            dx = (Math.random() * 4) + (1 / 2);
            dy = (Math.random() * 4) + (1 / 2);

            b.setdx(-dx);
            b.setdy(dy);

            System.out.println("dx is " + dx);
            System.out.println("dy is " + dy);
        }

        if ((b.getX() - b.getRadius()) < (lB.getX())) {

            rightPlayerScore += 1;
            System.out.println("The Score for Player 2 is " + rightPlayerScore);

            colorChanger();

            b.setX(FRAME / 2);
            b.setY(FRAME / 2);

            dx = (Math.random() * 4) + (1 / 2);
            dy = (Math.random() * 4) + (1 / 2);

            b.setdx(dx);
            b.setdy(dy);

            System.out.println("dx is " + dx);
            System.out.println("dy is " + dy);
        }
    }

    public void Speed() {
        myBuffer.setFont(new Font("Consolas", Font.BOLD, 20));
        myBuffer.drawString("dx: " + pongBall.getdx(), 0, 20);
        myBuffer.drawString("dy: " + pongBall.getdy(), 0, 40);
    }

    public void Stop(Graphics g) {
        if (leftPlayerScore == 5) {
            myBuffer.setColor(color);
            myBuffer.setFont(new Font("Consolas", Font.BOLD, 45));
            myBuffer.drawString("The Player on the Left Won!", 65, (FRAME / 2) - 25);
            myBuffer.setFont(new Font("Consolas", Font.PLAIN, 30));
            myBuffer.drawString("(Press Spacebar to Restart the Game)", 95, (FRAME / 2) + 40);
            myBuffer.setFont(new Font("Consolas", Font.BOLD, 125));
            myBuffer.drawString("" + leftPlayerScore, FRAME / 2 - 150, 100);

            leftBumper.setX(25);
            leftBumper.setY((FRAME / 2) - 75);
            rightBumper.setX(750);
            rightBumper.setY((FRAME / 2) - 75);
            pongBall.setX(FRAME / 2);
            pongBall.setY(FRAME / 2);
//            leftPlayerScore = 0;
//            rightPlayerScore = 0;
        }

        if (rightPlayerScore == 5) {
            myBuffer.setColor(color);
            myBuffer.setFont(new Font("Consolas", Font.BOLD, 45));
            myBuffer.drawString("The Player on the Right Won!", 50, (FRAME / 2) - 25);
            myBuffer.setFont(new Font("Consolas", Font.PLAIN, 30));
            myBuffer.drawString("(Press Spacebar to Restart the Game)", 95, (FRAME / 2) + 40);
            myBuffer.setFont(new Font("Consolas", Font.BOLD, 125));
            myBuffer.drawString("" + rightPlayerScore, FRAME / 2 + 150, 100);

            leftBumper.setX(25);
            leftBumper.setY((FRAME / 2) - 75);
            rightBumper.setX(750);
            rightBumper.setY((FRAME / 2) - 75);
            pongBall.setX(FRAME / 2);
            pongBall.setY(FRAME / 2);
//            leftPlayerScore = 0;
//            rightPlayerScore = 0;
        }
    }

    public void Restart() {

        dx = (Math.random() * 4) + (1 / 2);
        dy = (Math.random() * 4) + (1 / 2);

        pongBall.setdx(dx);
        pongBall.setdy(dy);

        leftPlayerScore = 0;
        rightPlayerScore = 0;

        r = (int) (Math.random() * 255 + 1);
        g = (int) (Math.random() * 255 + 1);
        b = (int) (Math.random() * 255 + 1);
        color = new Color(r, g, b);
        leftBumper.setMyColor(color);
        rightBumper.setMyColor(color);
        pongBall.setColor(color);
    }

    public void colorChanger() {
        r = (int) (Math.random() * 255 + 1);
        g = (int) (Math.random() * 255 + 1);
        b = (int) (Math.random() * 255 + 1);
        color = new Color(r, g, b);
        leftBumper.setMyColor(color);
        rightBumper.setMyColor(color);
        pongBall.setColor(color);
//        pongBall.setX(FRAME / 2);
//        pongBall.setY(FRAME / 2);
//        pongBall.setdx(0);
//        pongBall.setdy(0);
        System.out.println("The New Color is " + color);
    }

    // Determines all keys that are pressed or released
    private class Key extends KeyAdapter {
        // Determines which keys are pressed
        public void keyPressed(KeyEvent e) {
            if (e.getKeyCode() == KeyEvent.VK_W)
                wPressed = true;
            if (e.getKeyCode() == KeyEvent.VK_S)
                sPressed = true;
            if (e.getKeyCode() == KeyEvent.VK_UP)
                upPressed = true;
            if (e.getKeyCode() == KeyEvent.VK_DOWN)
                downPressed = true;
            if ((e.getKeyCode() == KeyEvent.VK_SPACE && pongBall.getX() == (FRAME / 2) && pongBall.getY() == (FRAME / 2))) {
                Restart();
            }
//            if (e.getKeyCode() == KeyEvent.VK_SPACE && pongBall.getX() == (FRAME/2) && pongBall.getY() == (FRAME/2) && pongBall.getdx() == 0 && pongBall.getdy() == 0) {
//
//            }
        }

        // Determines which keys are released
        public void keyReleased(KeyEvent e) {
            if (e.getKeyCode() == KeyEvent.VK_W)
                wPressed = false;
            if (e.getKeyCode() == KeyEvent.VK_S)
                sPressed = false;
            if (e.getKeyCode() == KeyEvent.VK_UP)
                upPressed = false;
            if (e.getKeyCode() == KeyEvent.VK_DOWN)
                downPressed = false;
        }
    }

    private class Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            myBuffer.setColor(BACKGROUND);
            myBuffer.fillRect(0, 0, FRAME, FRAME);
            pongBall.draw(myBuffer);
            pongBall.move(FRAME, FRAME);
            leftBumper.draw(myBuffer);
            rightBumper.draw(myBuffer);
//            int rVal = (int) (Math.random() * 255 + 1);
//            int gVal = (int) (Math.random() * 255 + 1);
//            int bVal = (int) (Math.random() * 255 + 1);
//            Color c = new Color(rVal, gVal, bVal);
//            leftBumper.setMyColor(c);
//            rightBumper.setMyColor(c);
//            pongBall.setColor(c);
            BumperCollision.collide(leftBumper, pongBall);
            BumperCollision.collide(rightBumper, pongBall);
            myBuffer.setColor(color);
            myBuffer.setFont(new Font("Consolas", Font.BOLD, 125));
            myBuffer.drawString("" + leftPlayerScore, FRAME / 2 - 150, 100);
            myBuffer.drawString("" + rightPlayerScore, FRAME / 2 + 150, 100);
            Score(pongBall, leftBumper, rightBumper);
            Speed();
            updateLeftBumper();
            updateRightBumper();
            Stop(myBuffer);
//            leftPlayerScore = 0;
//            rightPlayerScore = 0;
            repaint();
        }
    }
}