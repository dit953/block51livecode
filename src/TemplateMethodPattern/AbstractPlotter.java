package TemplateMethodPattern;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Niklas on 2016-02-19.
 */
public abstract class AbstractPlotter extends JPanel {
    private int xOrigin;
    private int yOrigin;
    private final int xRatio = 50;
    private final int yRatio = 50;

    protected AbstractPlotter() {
        setBackground(Color.WHITE);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        setOrigin();
        drawCoordinates(g);
        plotFunction(g);
    }

    private void setOrigin() {
        xOrigin = getWidth() / 2;
        yOrigin = getHeight() / 2;
    }

    private void drawCoordinates(Graphics g) {
        g.setColor(Color.BLACK);
        g.drawLine(0, yOrigin, getWidth(), yOrigin);
        g.drawLine(xOrigin, 0, xOrigin, getHeight());
    }

    private void plotFunction(Graphics g) {
        g.setColor(Color.RED);
        for (int pixelX = 0; pixelX < getWidth(); pixelX++) {
            calculateAndDrawY(g, pixelX);
        }
    }

    private void calculateAndDrawY(Graphics g, int pixelX) {
        double x = convertXFromPixel(pixelX);
        double y = calculateY(x);
        int pixelY = convertYToPixel(y);
        drawY(g, pixelX, pixelY);
    }

    // This is the 'hole' in the template of the Template Method Pattern,
    // to be filled in by the concrete subclasses.
    protected abstract double calculateY(double x);

    private double convertXFromPixel(int pixelX) {
        return (pixelX - xOrigin) / (double) xRatio;
    }
    private int convertYToPixel(double y) {
        return yOrigin - (int) (y * yRatio);
    }
    private void drawY(Graphics g, int pixelX, int pixelY) {
        g.fillOval(pixelX - 1, pixelY - 1, 3, 3);
    }

    // protected double calculateY(double x);


}