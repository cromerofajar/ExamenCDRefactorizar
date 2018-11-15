package numerosprimos;

/**
 *
 * @author
 */
public class NumerosPrimos {

    /**
     * @param args the command line arguments
     */
    //Codificado por: sAfOrAs
    //LIstar los numeros según el numero de digitos indicado
    //Considero solo hasta numeros menores a 100000 (5 digitos), 
    //por el hecho de k buscar numeros primos a partir de 6 digitos, el proceso se hace muy lento.
    public static boolean p = false;

    public static void main(String arg[]) {
        int digitosDelNumero = 0;
        int digitosNumero = 0;
        digitosDelNumero = Integer.parseInt(arg[0]);
        if (digitosDelNumero <= 0) {
            System.out.println("Ingrese como parámetro, un numero de digitos correcto (mayor que 0): ");
        }
        for (int cantidadDigitos = 1; cantidadDigitos <= 99999; cantidadDigitos++) {
            int divisionEntera = cantidadDigitos;

            int contador = 0;

            while (divisionEntera != 0) {
                divisionEntera = divisionEntera / 10;
                contador++;
            }
            digitosNumero = contador;

            if (digitosNumero == digitosDelNumero) {
                if (cantidadDigitos < 4) {
                    p = true;
                } else {
                    if (cantidadDigitos % 2 == 0) {
                        p = false;
                    } else {
                        int contador1 = 0;
                        int i1 = 1;
                        int tope = (cantidadDigitos - 1) / 2;
                        if (tope % 2 == 0) {
                            tope--;
                        }

                        while (i1 <= tope) {
                            if (cantidadDigitos % i1 == 0) {
                                contador1++;
                            }
                            i1 += 2;
                            if (contador1 == 2) {
                                i1 = tope + 1;
                            }
                        }

                        if (contador1 == 1) {
                            p = true;
                        }
                    }
                }

                if (p == true) {
                    System.out.println(cantidadDigitos);
                }
            }
        }
    }

}
