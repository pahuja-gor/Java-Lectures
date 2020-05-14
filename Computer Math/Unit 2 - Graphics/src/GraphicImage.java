//import javafx.stage.Screen;

import javax.sound.midi.MidiChannel;
import javax.swing.*;
import java.awt.*;
import java.awt.desktop.ScreenSleepEvent;
import java.awt.geom.Area;


@SuppressWarnings("serial")
public class GraphicImage extends JPanel {

    public static final int SCREEN_SIZE = 500;
    public static final int WIDTH = SCREEN_SIZE;
    public static final int HEIGHT = SCREEN_SIZE;
    public static final int MIDPOINT = SCREEN_SIZE / 2;
    public static final int ONE_THIRD = SCREEN_SIZE / 3;
    public static final int QUARTER = SCREEN_SIZE / 4;

    public static final int CLEAR_SCREEN = -1;
    public static final int VERTICAL_LINES = 0;
    public static final int HORIZTONAL_LINES = 1;
    public static final int DIAGONAL_LINES = 2;
    public static final int CORNER_LINES = 3;
    public static final int WEB_TOP_RIGHT = 4;
    public static final int WEB_TOP_LEFT = 5;
    public static final int WEB_CENTER = 6;
    public static final int STARBURST = 7;
    public static final int VERTICAL_BARS = 8;
    public static final int TRIANGLES = 9;
    public static final int BULLSEYE = 10;
    public static final int CHECKERBOARD = 11;
    public static final int STAR = 12;
    public static final int RUBIX_CUBE = 13;
    public static final int DOTS = 14;
    public static final int PACMAN = 15;
    public static final int AMERICAN_FLAG = 16;
    public static final int BRICKS = 17;
    public static final int PIZZA = 18;
    public static final int PENCIL = 19;


    private Color screenColor;
    private int pictureName = CLEAR_SCREEN;


    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawPicture(g, pictureName);
        repaint();
    }


    public void setColor(Color color) {
        screenColor = color;
    }

    public void setPictureName(int name) {
        pictureName = name;
    }

    public void drawPicture(Graphics g, int pictureName) {

        clearScreen(g);

        switch (pictureName) {

            case VERTICAL_LINES:
                drawVerticalLines(g);
                break;

            case HORIZTONAL_LINES:
                drawHorizontalLines(g);
                break;

            case DIAGONAL_LINES:
                drawDiagonalLines(g);
                break;

            case CORNER_LINES:
                drawCornerLines(g);
                break;

            case WEB_TOP_RIGHT:
                drawWebTopRight(g);
                break;

            case WEB_TOP_LEFT:
                drawWebTopLeft(g);
                break;

            case WEB_CENTER:
                drawWebCenter(g);
                break;

            case STARBURST:
                drawStarburst(g);
                break;

            case VERTICAL_BARS:
                drawVerticalBars(g);
                break;

            case TRIANGLES:
                drawTriangles(g);
                break;

            case BULLSEYE:
                drawBullseye(g);
                break;

            case CHECKERBOARD:
                drawCheckerboard(g);
                break;

            case STAR:
                drawStar(g);
                break;

            case RUBIX_CUBE:
                drawRubixCube(g);
                break;

            case DOTS:
                drawDots(g);
                break;

            case PACMAN:
                drawPacMan(g);
                break;

            case AMERICAN_FLAG:
                drawAmericanFlag(g);
                break;

            case BRICKS:
                drawBricks(g);
                break;

            case PIZZA:
                drawPizza(g);
                break;

            case PENCIL:
                drawPencil(g);
                break;

            default:
                clearScreen(g);
        }
    }


    /**
     * Clears the screen
     *
     * @param g the graphic
     */
    public void clearScreen(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, 500, 500);
    }


    /**
     * Draws 7 - 15 vertical lines equidistant apart
     *
     * @param g the graphic
     */
    public void drawVerticalLines(Graphics g) {
        g.setColor(Color.ORANGE);
        for (int x = 0; x <= SCREEN_SIZE; x += 50) {
            g.drawLine(x, 0, x, SCREEN_SIZE);
        }
    }


    /**
     * Draws 7 - 15 horizontal lines equidistant apart
     *
     * @param g the graphic
     */
    public void drawHorizontalLines(Graphics g) {
        g.setColor(new Color(204, 255, 204));
        for (int y = 0; y <= SCREEN_SIZE; y += 50) {
            g.drawLine(0, y, SCREEN_SIZE, y);
        }
    }


    /**
     * Draw 15 - 30 diagonal lines equidistant apart
     *
     * @param g the graphic
     */
    public void drawDiagonalLines(Graphics g) {
        g.setColor(Color.red);
        for (int x = 0; x <= SCREEN_SIZE; x += 50) {
            for (int y = 0; y <= SCREEN_SIZE; y += 50) {
                g.drawLine(x, y, y, x);
            }
        }
    }

    /**
     * Draw at least 15 lines all converging to the top-left corner
     *
     * @param g the graphic
     */
    public void drawCornerLines(Graphics g) {
        g.setColor(new Color(0, 153, 255));
        for (int y = 0; y <= SCREEN_SIZE; y += SCREEN_SIZE / 10) {
            g.drawLine(0, 0, SCREEN_SIZE, y);
        }
        for (int x = 0; x <= SCREEN_SIZE; x += SCREEN_SIZE / 10) {
            g.drawLine(0, 0, x, SCREEN_SIZE);
        }
    }

    /**
     * Draw the webbing pattern that appears in the top-right corner.
     *
     * @param g the graphic
     */
    public void drawWebTopRight(Graphics g) {
        g.setColor(new Color(0, 153, 255));
        for (int x = 0; x <= SCREEN_SIZE; x += 20) {
            g.drawLine(x, 0, SCREEN_SIZE, x);
        }
    }

    /**
     * Draw the webbing pattern that appears in the top-left corner.
     *
     * @param g the graphic
     */
    public void drawWebTopLeft(Graphics g) {
        g.setColor(new Color(0, 255, 153));
        for (int x = 0; x <= SCREEN_SIZE; x += 20) {
            g.drawLine(0, x, SCREEN_SIZE - x, 0);
        }
    }

    /**
     * Draw the webbing pattern that appears in the center of the screen.
     *
     * @param g the graphic
     */
    public void drawWebCenter(Graphics g) {
        g.setColor(new Color(95, 255, 100));
        for (int x = 0; x <= MIDPOINT; x += 25) {
            g.drawLine(MIDPOINT, x, MIDPOINT - x, MIDPOINT);
            g.drawLine(MIDPOINT, x, MIDPOINT + x, MIDPOINT);
            g.drawLine(x, MIDPOINT, MIDPOINT, MIDPOINT + x);
            g.drawLine(MIDPOINT, SCREEN_SIZE - x, MIDPOINT + x, MIDPOINT);
        }
    }

    /**
     * Draw a starburst of lines that appear to come from the center of the screen.
     *
     * @param g the graphic
     */
    public void drawStarburst(Graphics g) {
        g.setColor(Color.blue);
        for (int x = 0; x <= SCREEN_SIZE; x += 50) {
            g.drawLine(MIDPOINT, MIDPOINT, x, 0);
            g.drawLine(MIDPOINT, MIDPOINT, x, SCREEN_SIZE);
            for (int y = 0; y <= SCREEN_SIZE; y += 50) {
                g.drawLine(MIDPOINT, MIDPOINT, SCREEN_SIZE, y);
                g.drawLine(MIDPOINT, MIDPOINT, 0, y);
            }
        }
    }

    /**
     * Draw at least 5 vertical bars of the same width across the screen.
     *
     * @param g the graphic
     */
    public void drawVerticalBars(Graphics g) {
        g.setColor(Color.orange);
        for (int x = 0; x <= SCREEN_SIZE; x += 100) {
            g.fillRect(x, 0, 50, SCREEN_SIZE);
        }
    }

    /**
     * Draw the triangle pattern (similar to Triforce from Zelda games).
     *
     * @param g the graphic
     */
    public void drawTriangles(Graphics g) {
        g.setColor(new Color(127, 255, 0));
        int xPoints[] = {0, MIDPOINT, SCREEN_SIZE};
        int yPoints[] = {SCREEN_SIZE, 0, SCREEN_SIZE};
        g.fillPolygon(xPoints, yPoints, 3);
        g.setColor(Color.BLACK);
        int xPoints2[] = {QUARTER, MIDPOINT, 3 * QUARTER};
        int yPoints2[] = {MIDPOINT, SCREEN_SIZE, MIDPOINT};
        g.fillPolygon(xPoints2, yPoints2, 3);
    }

    /**
     * Draw a bullseye with at least 5 circles.
     *
     * @param g the graphic
     */
    public void drawBullseye(Graphics g) {
        int x = 0;
        int s = 0;
        while (x < SCREEN_SIZE && s < SCREEN_SIZE) {
            g.setColor(Color.yellow);
            g.fillOval(x, x, SCREEN_SIZE - s, SCREEN_SIZE - s);
            x += 40;
            s += 80;
            g.setColor(Color.black);
            g.fillOval(x, x, SCREEN_SIZE - s, SCREEN_SIZE - s);
            x += 40;
            s += 80;
        }
    }


    /**
     * Create an 8x8 square checkerboard
     *
     * @param g the Graphics object
     */
    public void drawCheckerboard(Graphics g) {
        int xSize = (SCREEN_SIZE / 8) + 1;
        int y = 0;
        //First row
        for (int x = 0; x < SCREEN_SIZE; x += 2 * xSize) {
            g.setColor(Color.red);
            g.fillRect(x, y, xSize, xSize);
        }
        //Second row
        y += xSize;
        for (int x = xSize; x < SCREEN_SIZE; x += 2 * xSize) {
            g.setColor(Color.red);
            g.fillRect(x, y, xSize, xSize);
        }
        //Third row
        y += xSize;
        for (int x = 0; x < SCREEN_SIZE; x += 2 * xSize) {
            g.setColor(Color.red);
            g.fillRect(x, y, xSize, xSize);
        }
        //Fourth row
        y += xSize;
        for (int x = xSize; x < SCREEN_SIZE; x += 2 * xSize) {
            g.setColor(Color.red);
            g.fillRect(x, y, xSize, xSize);
        }
        //Fifth row
        y += xSize;
        for (int x = 0; x < SCREEN_SIZE; x += 2 * xSize) {
            g.setColor(Color.red);
            g.fillRect(x, y, xSize, xSize);
        }
        //Sixth row
        y += xSize;
        for (int x = xSize; x < SCREEN_SIZE; x += 2 * xSize) {
            g.setColor(Color.red);
            g.fillRect(x, y, xSize, xSize);
        }
        //Seventh row
        y += xSize;
        for (int x = 0; x < SCREEN_SIZE; x += 2 * xSize) {
            g.setColor(Color.red);
            g.fillRect(x, y, xSize, xSize);
        }
        //Eight row
        y += xSize - 4;
        for (int x = xSize; x < SCREEN_SIZE; x += 2 * xSize) {
            g.setColor(Color.red);
            g.fillRect(x, y, xSize, xSize);
        }
    }


    /**
     * Create a 5-point star
     *
     * @param g the Graphics object
     */
    public void drawStar(Graphics g) {
        g.setColor(Color.green);
        int xPoints[] = {(QUARTER), MIDPOINT, (3*SCREEN_SIZE)/4, 0, SCREEN_SIZE};
        int yPoints[] = {SCREEN_SIZE, 0, SCREEN_SIZE, (QUARTER), (QUARTER)};
        g.drawPolygon(xPoints, yPoints, 5);
    }


    /**
     * Create a 3D Rubix Cube
     *
     * @param g the Graphics object
     */
    public void drawRubixCube(Graphics g) {
        g.setColor(Color.YELLOW);

        //Creates the Yellow Face
        g.fillRect((SCREEN_SIZE / 5), (SCREEN_SIZE / 5), MIDPOINT, MIDPOINT);
        g.setColor(Color.black);

        //Vertical Lines on the Yellow Face
        g.drawLine((SCREEN_SIZE / 5) + ((MIDPOINT) / 3), (SCREEN_SIZE / 5), (SCREEN_SIZE / 5) + ((MIDPOINT) / 3), (SCREEN_SIZE / 5) + (MIDPOINT));
        g.drawLine((SCREEN_SIZE / 5) + (2 * ((MIDPOINT) / 3)), (SCREEN_SIZE / 5), (SCREEN_SIZE / 5) + (2 * ((MIDPOINT) / 3)), (SCREEN_SIZE / 5) + (MIDPOINT));

        //Horizontal Lines on the Yellow Face
        g.drawLine((SCREEN_SIZE / 5), (SCREEN_SIZE / 5) + (((MIDPOINT) / 3)), (SCREEN_SIZE / 5) + (MIDPOINT), (SCREEN_SIZE / 5) + (((MIDPOINT) / 3)));
        g.drawLine((SCREEN_SIZE / 5), (SCREEN_SIZE / 5) + (2 * ((MIDPOINT) / 3)), (SCREEN_SIZE / 5) + (MIDPOINT), (SCREEN_SIZE / 5) + (2 * ((MIDPOINT) / 3)));

        //Creates the Blue Face
        int xPoints[] = {(SCREEN_SIZE / 5), (SCREEN_SIZE / 5) + (MIDPOINT), (SCREEN_SIZE / 5) + (MIDPOINT) + (((MIDPOINT) / 4)), (SCREEN_SIZE / 5) + (((MIDPOINT) / 3) / 2)};
        int yPoints[] = {(SCREEN_SIZE / 5), (SCREEN_SIZE / 5), (SCREEN_SIZE / 5) - (((MIDPOINT) / 3) / 2), (SCREEN_SIZE / 5) - (((MIDPOINT) / 3) / 2)};
        g.setColor(Color.blue);
        g.fillPolygon(xPoints, yPoints, 4);

        //Vertical Lines on the Blue Face
        g.setColor(Color.black);
        g.drawLine((SCREEN_SIZE / 5) + ((MIDPOINT) / 3), (SCREEN_SIZE / 5), ((SCREEN_SIZE / 5) + (MIDPOINT) / 2), (SCREEN_SIZE / 5) - (((MIDPOINT) / 3) / 2));
        g.drawLine((SCREEN_SIZE / 5) + (2 * ((MIDPOINT) / 3)), (SCREEN_SIZE / 5), ((SCREEN_SIZE / 5) + (5 * (MIDPOINT) / 3) / 2), (SCREEN_SIZE / 5) - (((MIDPOINT) / 3) / 2));

        //Horizontal Lines on the Blue Face
        g.setColor(Color.black);
        int oneThirdX = 113;   //Used this formula --> x: (2/3)(100) + (1/3)(140)
        int oneThirdY = 87;    //Used this formula --> y: (2/3)(100) + (1/3)(60)
        g.drawLine(oneThirdX, oneThirdY, oneThirdX + (MIDPOINT) + 10, oneThirdY);
        g.drawLine(oneThirdX + 15, oneThirdY - 15, oneThirdX + (MIDPOINT) + 30, oneThirdY - 15);

        //Creates the Red Face
        int xPoints2[] = {(SCREEN_SIZE / 5) + (MIDPOINT) + (((MIDPOINT) / 4)), (SCREEN_SIZE / 5) + MIDPOINT, (SCREEN_SIZE / 5) + MIDPOINT, (SCREEN_SIZE / 5) + (MIDPOINT) + ((MIDPOINT) / 4)};
        int yPoints2[] = {(SCREEN_SIZE / 5) - (((MIDPOINT) / 3) / 2), SCREEN_SIZE / 5, SCREEN_SIZE / 5 + MIDPOINT, (SCREEN_SIZE / 5) + (MIDPOINT) - (MIDPOINT / 3)};
        g.setColor(Color.red);
        g.fillPolygon(xPoints2, yPoints2, 4);

        //Vertical Lines on the Red Face
        g.setColor(Color.black);
        g.drawLine((oneThirdX + (MIDPOINT) + 7), oneThirdY - 1, (oneThirdX + (MIDPOINT) + 7), (oneThirdY - 1) + MIDPOINT);
        g.drawLine(oneThirdX + (MIDPOINT) + 30, oneThirdY - 15, oneThirdX + (MIDPOINT) + 30, (oneThirdY - 15) + MIDPOINT);

        //Horizontal Lines on the Red Face
        g.drawLine((SCREEN_SIZE / 5) + (MIDPOINT), (SCREEN_SIZE / 5) + (((MIDPOINT) / 3)), (SCREEN_SIZE / 5) + (MIDPOINT) + (((MIDPOINT) / 3)), (SCREEN_SIZE / 5) - (((MIDPOINT) / 3) / 2) + (MIDPOINT / 3) - 5);
        g.drawLine((SCREEN_SIZE / 5) + (MIDPOINT), (SCREEN_SIZE / 5) + (2 * ((MIDPOINT) / 3)), (SCREEN_SIZE / 5) + (MIDPOINT) + (((MIDPOINT) / 3)), (SCREEN_SIZE / 5) - (((MIDPOINT) / 3) / 2) + (2 * (MIDPOINT / 3)) - 30);
    }


    /**
     * Draw at least a grid of 4 x 4 dots, centered properly on the screen.
     *
     * @param g the graphic
     */
    public void drawDots(Graphics g) {
        g.setColor(Color.red);
        for (int y = (25 / 2); y <= SCREEN_SIZE; y += 75) {
            for (int x = (25 / 2); x <= SCREEN_SIZE; x += 75) {
                g.fillOval(x, y, 25, 25);
            }
        }
    }

    /**
     * Draw a proportional 5 point star.
     *
     * @param g the graphic
     */
    public void drawPacMan(Graphics g) {
        g.setColor(Color.YELLOW);
        g.fillOval(0, 0, SCREEN_SIZE, SCREEN_SIZE);
        g.setColor(Color.black);
        g.fillArc(0, 0, SCREEN_SIZE + 1, SCREEN_SIZE + 1, -25, 55);
        g.fillOval(MIDPOINT, QUARTER, SCREEN_SIZE / 10, SCREEN_SIZE / 10);
    }

    /**
     * Draws the row of six stars for the United States' Flag
     *
     * @param g    the graphic
     * @param z    the space between each "star"
     * @param x    one of the x components of the x-coordinate
     * @param y    the y-value of the "star"
     * @param size the size of the "star"
     */
    public void drawSixStars(Graphics g, int z, int x, int y, int size) {
        g.fillOval((z + (38 * x)), y, size, size);
        x++;
        g.fillOval((z + (38 * x)), y, size, size);
        x++;
        g.fillOval((z + (38 * x)), y, size, size);
        x++;
        g.fillOval((z + (38 * x)), y, size, size);
        x++;
        g.fillOval((z + (38 * x)), y, size, size);
        x++;
        g.fillOval((z + (38 * x)), y, size, size);
    }

    /**
     * Draws the row of five stars for the United States' Flag
     *
     * @param g    the graphic
     * @param z    the space between each "star"
     * @param x    one of the x components of the x-coordinate
     * @param y    the y-value of the "star"
     * @param size the size of the "star"
     */
    public void drawFiveStars(Graphics g, int z, int x, int y, int size) {
        g.fillOval((((z + 5) + (38 * x)) / 2), y, size, size);
        x += 2;
        g.fillOval((((z + 5) + (38 * x)) / 2), y, size, size);
        x += 2;
        g.fillOval((((z + 5) + (38 * x)) / 2), y, size, size);
        x += 2;
        g.fillOval((((z + 5) + (38 * x)) / 2), y, size, size);
        x += 2;
        g.fillOval((((z + 5) + (38 * x)) / 2), y, size, size);
    }

    /**
     * Draw an American Flag to scale.  You may use circles for the stars.
     *
     * @param g the graphic
     */
    public void drawAmericanFlag(Graphics g) {
        //Draws the red and white stripes
        g.setColor(Color.white);
        g.fillRect(0, 0, SCREEN_SIZE, SCREEN_SIZE);
        for (int y = 0; y <= SCREEN_SIZE; y += (2 * (SCREEN_SIZE / 13) + 1)) {
            g.setColor(Color.red);
            g.fillRect(0, y, SCREEN_SIZE, (SCREEN_SIZE / 13));
        }

        //Draws the blue banner
        g.setColor(Color.blue);
        g.fillRect(0, 0, (MIDPOINT) - (SCREEN_SIZE / 20), (MIDPOINT) + ((SCREEN_SIZE / 13) / 2));
        g.setColor(Color.white);

        //Draws the stars
        int spacing = 8;
        drawSixStars(g, spacing, 0, 5, 20);
        for (int y = 60; y <= 240; y += 60) {
            drawSixStars(g, spacing, 0, y, 20);
        }
        for (int y = 30; y <= 210; y += 60) {
            drawFiveStars(g, spacing, 1, y, 20);
        }
    }

    /**
     * Draw an alternating pattern that resembles bricks on a wall.
     *
     * @param g the graphic
     */
    public void drawBricks(Graphics g) {
        g.setColor(Color.red);
        g.fillRect(0, 0, SCREEN_SIZE, SCREEN_SIZE);
        //Draws the row of bricks that starts with one whole brick
        for (int x = 0; x <= SCREEN_SIZE; x += SCREEN_SIZE / 10) {
            g.setColor(Color.white);
            for (int y = 0; y <= SCREEN_SIZE; y += SCREEN_SIZE / 10) {
                g.drawRect(x, y, SCREEN_SIZE / 10, SCREEN_SIZE / 20);
            }
        }

        //Draws the row of bricks that starts with half a brick
        for (int x = 0 - ((SCREEN_SIZE / 10) / 2); x <= SCREEN_SIZE; x += ((SCREEN_SIZE / 10))) {
            g.setColor(Color.white);
            for (int y = SCREEN_SIZE / 20; y <= SCREEN_SIZE; y += SCREEN_SIZE / 10) {
                g.drawRect(x, y, SCREEN_SIZE / 10, SCREEN_SIZE / 20);
            }
        }
    }

    /**
     * Draw a slice of pizza - include crust, cheese,
     * and pepperoni (other toppings optional)
     *
     * @param g the graphic
     */
    public void drawPizza(Graphics g) {
        //Draws the crust
        g.setColor(new Color(177, 129, 67));
        g.fillArc((SCREEN_SIZE / 6), 0, SCREEN_SIZE, SCREEN_SIZE, -156, -55);

        //Draws the cheese
        g.setColor(new Color(227, 194, 113));
        g.fillArc((QUARTER), 0, SCREEN_SIZE, SCREEN_SIZE, -160, -45);

        //Draws the pepperoni slices
        g.setColor(new Color(167, 37, 31));
        g.fillOval((ONE_THIRD), (MIDPOINT), 40, 40);
        g.fillOval((MIDPOINT), (MIDPOINT) - 10, 40, 40);
        g.fillOval((MIDPOINT) - 100, (MIDPOINT) - 75, 40, 40);
    }

    /**
     * Draw a pencil, include an eraser, the metal thing that attaches
     * the eraser, pencil, and point.
     *
     * @param g the graphic
     */
    public void drawPencil(Graphics g) {
        //Body of the Pencil
        g.setColor(Color.yellow);
        g.fillRect(SCREEN_SIZE * (1 / 2) + (225 / 2), (QUARTER), 225, 100);
        g.setColor(new Color(225, 190, 161));

        //Wooden Tip
        int x1 = ((SCREEN_SIZE * (1 / 2) + (225 / 2)) + 225);
        int x2 = ((SCREEN_SIZE * (1 / 2) + (225 / 2)) + 225 + 75);
        int x3 = ((SCREEN_SIZE * (1 / 2) + (225 / 2)) + 225);

        int y1 = (QUARTER);
        int y2 = ((QUARTER) + 50);
        int y3 = ((QUARTER) + 100);

        int xPoints[] = {x1, x2, x3};
        int yPoints[] = {y1, y2, y3};
        g.fillPolygon(xPoints, yPoints, 3);

        //Eraser
        g.setColor(Color.pink);
        g.fillRect((SCREEN_SIZE * (1 / 2) + (225 / 2) - 45), (QUARTER), 45, 100);
        g.fillArc(((SCREEN_SIZE * (1 / 2) + (225 / 2)) - (80)), (QUARTER), 75, 100, 90, 180);

        //Ferrule-The metal thing that attaches the eraser to the pencil
        g.setColor(Color.GRAY);
        g.fillRect((SCREEN_SIZE * (1 / 2) + (225 / 2) - 25), (QUARTER), 25, 100);

        //Lead Tip
        g.setColor(new Color(74, 74, 74));
        int xPoints2[] = {((x1 + x2) / 2) + 1, x2, ((x2 + x3) / 2) + 1};
        int yPoints2[] = {((y1 + y2) / 2), y2, ((y2 + y3) / 2)};
        g.fillPolygon(xPoints2, yPoints2, 3);
    }
}