package StrategyPattern;

import javax.swing.*;

/**
 * Created by Niklas on 2016-02-19.
 */
public class MainPlotter {

    public static void main(String[] args) {
        // Here we simulate calling the method with different 'strategies'
        // (in this case functions) at different points in time.
        displayOnScreen(Math::sin);
        waitForIt();
        displayOnScreen(Math::cos);
        waitForIt();
        displayOnScreen(x -> x);
        waitForIt();
        displayOnScreen(x -> Math.pow(x,2));
    }

    // This is now where we use the Strategy Pattern, allowing
    // the decision of what to display with the method to be left
    // to the client (which in this case happens to be in the same
    // file, i.e. the main method).
    // (Actually... you could argue that displayOnScreen was always
    // using the Strategy Pattern, as the client could pass it
    // different Plotter objects to display).
    private static void displayOnScreen(Function f) {
        JFrame w = new JFrame();
        w.add(new Plotter(f));
        w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        w.setSize(400, 200);
        w.setVisible(true);

    }

    private static void waitForIt(){
        try {
            Thread.sleep(2000);
        }
        catch (InterruptedException e) {
            Thread.dumpStack();
        }
    }
}
