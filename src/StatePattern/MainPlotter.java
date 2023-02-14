package StatePattern;

import javax.swing.*;

/**
 * Created by Niklas on 2016-02-19.
 */
public class MainPlotter {

    // Here we simulate switching between different 'states'
    // (in this case functions) at different points in time.
    public static void main(String[] args) {
        Plotter p = new Plotter();
        JFrame w = displayOnScreen(p);
        while (true) {
            waitForIt();
            p.switchToCos();
            w.repaint();
            waitForIt();
            p.switchToSin();
            w.repaint();
        }
    }

    private static JFrame displayOnScreen(Plotter p) {
        JFrame w = new JFrame();
        w.add(p);
        w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        w.setSize(400, 200);
        w.setVisible(true);
        return w;

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
