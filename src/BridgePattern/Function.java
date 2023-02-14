package BridgePattern;

/*
We could just as easily have used the existing type
java.util.Function<T,R>, with T and R both set to Double,
and of course in a real setting we should have, no good
duplicating functionality that already exists.
However, for educational purposes I've chosen to include
this here in order to be extra explicit about what
components this pattern needs.

This interface is a so-called "Functional Interface",
which means we can use lambda expressions to create
values of it, we don't have to create explicit named
classes.
 */
@FunctionalInterface
public interface Function {
    double apply(double x);
}
