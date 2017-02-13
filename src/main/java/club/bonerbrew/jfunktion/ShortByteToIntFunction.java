// THIS CODE IS MACHINE-GENERATED, DO NOT EDIT!

package club.bonerbrew.jfunktion;

/**
 * Represents a function that accepts two arguments, a short and a generic, and produces a
 * byte result.  This is the {@code short} and {@code byte}-consuming-to-{@code int} primitive specialization for
 * {@link java.util.function.BiFunction}.
 *
 * @see java.util.function.BiFunction
 */
@FunctionalInterface
public interface ShortByteToIntFunction {

    /**
     * Applies this function to the given arguments.
     *
     * @param v1 the {@code short} argument
     * @param v2 the {@code byte} argument
     * @return the function result
     */
    int apply(short v1, byte v2);
}