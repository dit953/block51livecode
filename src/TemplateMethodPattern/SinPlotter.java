package TemplateMethodPattern;

public class SinPlotter extends AbstractPlotter {

    @Override
    protected double calculateY(double x) {
        return Math.sin(x);
    }
}
