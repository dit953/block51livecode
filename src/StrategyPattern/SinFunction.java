package StrategyPattern;

/*
This is the heavy-weight way to do it for components
of the Bridge Pattern. Since our components are
actually functions, we can get away with using
lambda expressions instead, see MainPlotter.
 */
public class SinFunction implements Function {

    @Override
    public double apply(double x) {
        return Math.sin(x);
    }
}
