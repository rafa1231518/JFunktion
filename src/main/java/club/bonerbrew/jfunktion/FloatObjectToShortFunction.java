/**
 * Represents a function that accepts two arguments, a float and a generic, and produces a
 * short result.  This is the {@code float}-consuming-to-{@code short} primitive specialization for
 * {@link java.util.function.BiFunction}.
 *
 * @param <T> the type of the generic function argument
 *
 * @see java.util.function.BiFunction
 */
@FunctionalInterface
public interface FloatObjectToShortFunction<T> {

    /**
     * Applies this function to the given arguments.
     *
     * @param v1 the {@code float} argument
     * @param v2 the generic argument
     * @return the function result
     */
    short apply(float v1, T v2);
}
