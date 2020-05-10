public class Main {

    public static void main(String[] args) {
        int opcion;
        do {
            mostrarMenu();
            opcion = leerOpcion();

            //OPCION FACTORIAL
            if (opcion == 1) {
                System.out.printf("El número factorial es %,d\n", factorial());
                System.out.println();
            }

            //OPCION MEDIA DE NÚMEROS
            if (opcion == 2) {
                System.out.printf("La media es %s%n\n", mediaNumeros());
            }

            //OPCION POTENCIA
            if (opcion == 3) {
                System.out.printf("El resultado de %s\n", potencia());
            }
        } while (opcion != 4);
    }

    public static void mostrarMenu() {
        System.out.print("1. Factorial\n");
        System.out.print("2. Media de números\n");
        System.out.print("3. Potencia\n");
        System.out.print("4. Salir\n");

    }
    public static int leerOpcion() {
        Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.print("ELIGE UNA OPCIÓN: ");
        int opcion = input.nextInt();
        while (opcion > 4 || opcion < 1) {
            mostrarMenu();
            System.out.print("ELIGE UNA OPCIÓN: ");
            opcion = input.nextInt();
        }
        return opcion;
    }

    public static int leerNumero() {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduce número: ");
        int numero = input.nextInt();
        while (numero < 0) {
            System.out.println("Sólo números positivos.");
            System.out.print("Introduce número: ");
            numero = input.nextInt();
        }
        return numero;
    }

    public static long factorial() {
        int numero = leerNumero();
        long factorial = 1;
        for (int i = numero; i > 1; i--) {
            factorial = factorial * i;
        }
        return factorial;
    }

    public static double mediaNumeros() {
        Scanner input = new Scanner(System.in);
        System.out.print("¿Media de cuántos números?: ");
        int numeroElementos = input.nextInt();
        while (numeroElementos <= 1) {
            System.out.println("Sólo números mayores que 1.");
            System.out.print("¿Media de cuántos números?: ");
            numeroElementos = input.nextInt();
        }
        double[] array = new double[numeroElementos];
        double media = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = leerNumero();
            media = media + array [i] / numeroElementos;
        }
        return media;

    }

    public static int potencia() {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduce número base: ");
        int base = input.nextInt();
        System.out.print("Introduce el exponente: ");
        int expo = input.nextInt();
        return (int)(Math.pow(base, expo));
    }
}
