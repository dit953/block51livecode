package BridgePattern;

import javax.swing.*;

/**
 * Created by Niklas on 2016-02-19.
 */
public class MainPlotter {

    public static void main(String[] args) {
        // We can create a new component object to pass along...
        Plotter p = new Plotter(new SinFunction());
        // ... but since our components are actually function objects,
        // we can use lambdas (or even function pointers, like here):
        Plotter p2 = new Plotter(Math::cos);
        displayOnScreen(p);
        displayOnScreen(p2);
    }

    private static void displayOnScreen(Plotter p) {
        JFrame w = new JFrame();
        w.add(p);
        w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        w.setSize(400, 200);
        w.setVisible(true);

    }
}
