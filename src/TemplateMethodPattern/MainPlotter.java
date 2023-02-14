package TemplateMethodPattern;

import javax.swing.*;

/**
 * Created by Niklas on 2016-02-19.
 */
public class MainPlotter {

    public static void main(String[] args) {
        AbstractPlotter p = new SinPlotter();
        AbstractPlotter p2 = new CosPlotter();
        displayOnScreen(p);
        displayOnScreen(p2);
    }

    private static void displayOnScreen(AbstractPlotter p) {
        JFrame w = new JFrame();
        w.add(p);
        w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        w.setSize(400, 200);
        w.setVisible(true);

    }
}
