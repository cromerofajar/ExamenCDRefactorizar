
package factorial;

public class Factorial {

    public static void main(String[] args) {

        int numero;
        int factorial;

        numero = 8;

        int veces;
        if (numero == 0) {
            factorial = 1;
        } else {
            factorial = 1;
            for (veces = numero; veces >= 1; veces--) {
                factorial = factorial * veces;
            }
        }

        System.out.println(factorial);

    }

}
