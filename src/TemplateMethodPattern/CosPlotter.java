package TemplateMethodPattern;

public class CosPlotter extends AbstractPlotter {

    @Override
    protected double calculateY(double x) {
        return Math.cos(x);
    }
}
