package prakanpo.waranya.lab9;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

public class DiceImageCanvas extends JPanel {
    protected int diceNumber;
    protected Graphics2D g2d;
    protected Ellipse2D.Double circleCenter, circleTopRight, circleBottomLeft,
            circleTopLeft, circleBottomRight, circleTopCenter, circleBottomCenter;
    protected Rectangle2D.Double square;
    protected int width = 150, height = 150;
    protected int canvasWidth = 400, canvasHeight = 400;
    protected int circleWidth = 30, circleHeight = 30;
    protected int startSquareX = 125;
    protected int startSquareY = 40;
    protected int margin = 10;
    public DiceImageCanvas(int diceNumber) {
        this.diceNumber = diceNumber;
        this.setSize(canvasWidth,canvasHeight);  // set size
        square = new Rectangle2D.Double(startSquareX, startSquareY,width, height);// initialize a rectangle which is a background
        createCircles();        // call method createCircles to place dots on a rectangle
    }

    protected void createCircles() {         // fill red on all circles that will be placed on a rectangle

        int CenterX = ((width / 2) - (circleWidth / 2) + startSquareX);
        int CenterY = ((height / 2) - (circleHeight / 2) + startSquareY);
        int Left = (startSquareX + margin);
        int Right = (startSquareX+width)-margin-(circleWidth);
        int Top = startSquareY+margin;
        int Bottom = (startSquareY+height)-margin-(circleHeight);

        circleCenter = new Ellipse2D.Double(CenterX, CenterY, circleWidth, circleHeight);// set size
        circleTopRight = new Ellipse2D.Double(Right, Top, circleWidth, circleHeight);
        circleBottomLeft = new Ellipse2D.Double(Left, Bottom, circleWidth, circleHeight);
        circleTopLeft = new Ellipse2D.Double(Left,Top, circleWidth,circleHeight);
        circleBottomRight = new Ellipse2D.Double(Right, Bottom, circleWidth, circleHeight);
        circleTopCenter = new Ellipse2D.Double(CenterX, Top, circleWidth, circleHeight);
        circleBottomCenter = new Ellipse2D.Double(CenterX, Bottom, circleWidth, circleHeight);
    }

    protected void drawDiceNumber() {  // depending on a dice number, place red dots properly on a rectangle
        g2d.setColor(Color.white);
        g2d.fill(square);
        g2d.setColor(Color.RED);

        if (diceNumber == 1) {
            g2d.fill(circleCenter);
        } else if (diceNumber == 2){
            g2d.fill(circleTopRight);
            g2d.fill(circleBottomLeft);
        } else if (diceNumber == 3){
            g2d.fill(circleTopRight);
            g2d.fill(circleCenter);
            g2d.fill(circleBottomLeft);
        } else if (diceNumber == 4){
            g2d.fill(circleTopRight);
            g2d.fill(circleTopLeft);
            g2d.fill(circleBottomRight);
            g2d.fill(circleBottomLeft);
        } else if (diceNumber == 5){
            g2d.fill(circleTopRight);
            g2d.fill(circleTopLeft);
            g2d.fill(circleBottomLeft);
            g2d.fill(circleCenter);
            g2d.fill(circleBottomRight);
        } else if (diceNumber == 6){
            g2d.fill(circleTopRight);
            g2d.fill(circleTopLeft);
            g2d.fill(circleBottomLeft);
            g2d.fill(circleTopCenter);
            g2d.fill(circleBottomCenter);
            g2d.fill(circleBottomRight);
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);// call paintComponent of super class
        g2d = (Graphics2D)g;        // cast graphics object to graphics2D object
        drawDiceNumber();         // call code to draw dice number

    }

}
