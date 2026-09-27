import java.util.Scanner;

class ejercicio12 {
    public static void main(String[] args) {

        Scanner ddd = new Scanner(System.in);

        System.out.print("Ingrese el tamaño: ");
        int n = ddd.nextInt();

        System.out.println("\nCuadrado:");

        for (int fila = 1; fila <= n; fila++) {
            for (int columna = 1; columna <= n; columna++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("\nTriángulo:");

        for (int fila = 1; fila <= n; fila++) {
            for (int columna = 1; columna <= fila; columna++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        ddd.close();
    }
}
