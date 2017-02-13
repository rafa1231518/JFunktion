/**
 * Represents a function that accepts two arguments, a boolean and a generic, and produces a
 * double result.  This is the {@code boolean}-consuming-to-{@code double} primitive specialization for
 * {@link java.util.function.BiFunction}.
 *
 * @param <T> the type of the generic function argument
 *
 * @see java.util.function.BiFunction
 */
@FunctionalInterface
public interface BooleanObjectToDoubleFunction<T> {

    /**
     * Applies this function to the given arguments.
     *
     * @param v1 the {@code boolean} argument
     * @param v2 the generic argument
     * @return the function result
     */
    double apply(boolean v1, T v2);
}
