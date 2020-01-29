package fibonacci;

public class Fibonacci {

    public static void main(String[] args) {

        int hasta = 10, cero = 0, uno = 1, suma, fibonacci[];

        /* Config la cantidad de espacios o la cantidad de numeros de la serie fibonacci que quiere el usuario. */
        fibonacci = new int[hasta];

        /*Proceso de Fibonacci*/
        for (int i = 0; i < fibonacci.length; i++) {
            fibonacci[i] = cero;

            suma = cero + uno;
            cero = uno;
            uno = suma;
        }

        /*Recorrer el Array e imprimirlo*/
        for (int i = 0; i < fibonacci.length; i++) {
            System.out.print(fibonacci[i] + " ");
        }

        System.out.println();
    }
}
