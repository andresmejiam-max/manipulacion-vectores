import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] vector = new int[15];

        // Llenar el vector
        for (int i = 0; i < vector.length; i++) {

            System.out.print("Ingrese el número " + (i + 1) + ": ");
            int numero = leerEntero(sc);

            while (numero < 10 || numero > 100) {
                System.out.println("El número debe estar entre 10 y 100.");
                System.out.print("Ingrese nuevamente el número: ");
                numero = leerEntero(sc);
            }

            vector[i] = numero;
        }

        // Mostrar vector
        System.out.println("\nVector ingresado:");

        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }

        // Buscar un número
        System.out.print("\n\nIngrese un número para buscar: ");
        int buscar = leerEntero(sc);

        boolean encontrado = false;

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == buscar) {
                System.out.println("El número se encuentra en la posición " + i);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("El número no se encuentra en el vector.");
        }

        // Mayor y menor
        int mayor = vector[0];
        int menor = vector[0];

        for (int i = 1; i < vector.length; i++) {

            if (vector[i] > mayor) {
                mayor = vector[i];
            }

            if (vector[i] < menor) {
                menor = vector[i];
            }
        }

        System.out.println("\nNúmero mayor: " + mayor);
        System.out.println("Número menor: " + menor);

        // Múltiplos
        System.out.print("\nIngrese un número para buscar sus múltiplos: ");
        int x = leerEntero(sc);

        if (x != 0) {

            boolean hayMultiplos = false;

            System.out.println("Múltiplos encontrados:");

            for (int i = 0; i < vector.length; i++) {

                if (vector[i] % x == 0) {
                    System.out.print(vector[i] + " ");
                    hayMultiplos = true;
                }
            }

            if (!hayMultiplos) {
                System.out.println("No hay múltiplos de " + x);
            }

        } else {
            System.out.println("No se puede buscar múltiplos de 0.");
        }

        // Suma
        int suma = 0;

        for (int i = 0; i < vector.length; i++) {
            suma = suma + vector[i];
        }

        System.out.println("\n\nSuma total: " + suma);

        // Promedio
        double promedio = (double) suma / vector.length;

        System.out.println("Promedio: " + promedio);

        // Vector con números mayores al promedio
        int cantidad = 0;

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] > promedio) {
                cantidad++;
            }
        }

        int[] nuevoVector = new int[cantidad];

        int posicion = 0;

        for (int i = 0; i < vector.length; i++) {

            if (vector[i] > promedio) {
                nuevoVector[posicion] = vector[i];
                posicion++;
            }
        }

        System.out.println("\nNúmeros por encima del promedio:");

        for (int i = 0; i < nuevoVector.length; i++) {
            System.out.print(nuevoVector[i] + " ");
        }

        sc.close();
    }

    static int leerEntero(Scanner sc) {
        while (!sc.hasNextInt()) {
            System.out.println("Entrada inválida. Ingrese un número entero.");
            sc.next();
        }
        return sc.nextInt();
    }
}