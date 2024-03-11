/**
 * Clase Calculadora que proporciona operaciones matemáticas básicas.
 * Se utiliza para demostrar la documentación con Javadoc.
 *
 * @author Tu nombre
 * @version 1.0
 */
public class Calculadora {

    /**
     * Realiza la suma de dos números.
     *
     * @param a El primer número.
     * @param b El segundo número.
     * @return La suma de a y b.
     */
    public static int suma(int a, int b) {
        return a + b;
    }

    /**
     * Realiza la resta de dos números.
     *
     * @param a El primer número.
     * @param b El segundo número.
     * @return La resta de a y b.
     */
    public static int resta(int a, int b) {
        return a - b;
    }

    /**
     * Realiza la multiplicación de dos números.
     *
     * @param a El primer número.
     * @param b El segundo número.
     * @return El producto de a y b.
     */
    public static int multiplica(int a, int b) {
        return a * b;
    }

    /**
     * Realiza la división de dos números.
     *
     * @param a El dividendo.
     * @param b El divisor.
     * @return El cociente de a y b.
     */
    public static double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Divisor no puede ser cero.");
        }
        return (double) a / b;
    }
}
