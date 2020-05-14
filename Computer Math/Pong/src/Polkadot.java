//Polkadot.java

import java.awt.*;
import java.util.Random;

public class Polkadot {

    private double myX;
    private double myY;
    private double myDiameter;
    private Color myColor;
    private double myRadius;

    /**
     * Creates a red polkadot centered at (200, 200) with a diameter of 25.
     */
    public Polkadot() {
        myX = 200;
        myY = 200;
        myDiameter = 25;
        myColor = Color.RED;
        myRadius = myDiameter / 2;
    }

    /**
     * Creates a polkadot of color c centered at (x, y) with a diameter of d.
     *
     * @param x the x-coordinate of the center of the polkadot
     * @param y the y-coordinate of the center of the polkadot
     * @param d the diameter of the polkadot
     * @param c the color of the polkadot
     */
    public Polkadot(double x, double y, double d, Color c) {
        myX = x;
        myY = y;
        myDiameter = d;
        myColor = c;
        myRadius = d / 2;
    }


    /**
     * Gets the x-coordinate of the center of the polkadot
     *
     * @return the x-coordinate of the center of the polkadot
     */
    public double getX() {
        return myX;
    }

    /**
     * Gets the y-coordinate of the center of the polkadot
     *
     * @return the y-coordinate of the center of the polkadot
     */
    public double getY() {
        return myY;
    }

    /**
     * Gets the diameter of the polkadot
     *
     * @return the diameter of the polkadot
     */
    public double getDiameter() {
        return myDiameter;
    }

    /**
     * Gets the color of the polkadot
     *
     * @return the color of the polkadot
     */
    public Color getColor() {
        return myColor;
    }

    /**
     * Gets the radius of the polkadot
     *
     * @return the radius of the polkadot
     */
    public double getRadius() {
        return myRadius;
    }

    /**
     * Sets/Changes the x-coordinate of the center of the polkadot
     *
     * @param x the x-coordinate of the center of the polkadot
     */
    public void setX(double x) {
        myX = x;
    }

    /**
     * Sets/Changes the y-coordinate of the center of the polkadot
     *
     * @param y the y-coordinate of the center of the polkadot
     */
    public void setY(double y) {
        myY = y;
    }

    /**
     * Sets/Changes the color of the polkadot
     *
     * @param color the color of the polkadot
     */
    public void setColor(Color color) {
        myColor = color;
    }

    /**
     * Sets/Changes the diameter of the polkadot
     *
     * @param diameter the diameter of the polkadot
     */
    public void setDiameter(double diameter) {
        myDiameter = diameter;
        myRadius = diameter / 2;
    }

    /**
     * Sets/Changes the radius of the polkadot
     *
     * @param radius the radius of the polkadot
     */
    public void setRadius(double radius) {
        myRadius = radius;
        myDiameter = 2 * radius;
    }


    /**
     * Moves location to random (x, y) withing the edges or given dimensions of
     * the right edge and bottom edge
     * @param rightEdge the right side of the screen or area
     * @param bottomEdge the bottom side of the screen or area
     */
    public void jump(int rightEdge, int bottomEdge) {
        // moves location to random (x, y) within the edges
        myX = (Math.random() * (rightEdge - myDiameter) + myRadius);
        myY = (Math.random() * (bottomEdge - myDiameter) + myRadius);
    }

    /**
     * Draws the polkadot of the given color
     *
     * @param myBuffer the grapics object
     */
    public void draw(Graphics myBuffer) {
        myBuffer.setColor(myColor);
        myBuffer.fillOval((int) (myX - myRadius), (int) (myY - myRadius), (int) myDiameter, (int) myDiameter);


    }
}