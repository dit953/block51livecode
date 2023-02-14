package NoPattern;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * Created by Niklas on 2016-02-19.
 */
public class MainPlotter {

    public static void main(String[] args) {
        Plotter p = new Plotter();
        displayOnScreen(p);
    }

    private static void displayOnScreen(Plotter p) {
        JFrame w = new JFrame();
        w.add(p);
        w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        w.setSize(400, 200);
        w.setVisible(true);

    }
}
