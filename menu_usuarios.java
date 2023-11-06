import java.io.IOException;
import java.util.Scanner;

class Menu {
    public static int mostrarMenuUsuario() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("\nMenú para Admin:");
            System.out.println("1. Ingresar Medicamento");
            System.out.println("2. Ingresar Objeto");
            System.out.println("3. Retirar Medicamento");
            System.out.println("4. Retirar Objeto");
            System.out.println("5. Ver Inventario");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            return scanner.nextInt();
        }
    }

    public static int mostrarMenuAdmin() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("\nMenú para Usuario Regular:");
            System.out.println("1. Ver Inventario de Medicamentos");
            System.out.println("2. Ver Inventario de Objetos");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            return scanner.nextInt();
        }
    }

    // Resto de los métodos como writeIngreso, writeRetiro, leerOpcion, etc.

    public static void leerOpcionAdmin(InventarioMedicamentos inventarioMedicamentos, InventarioObjetos inventarioObjetos) throws IOException {
        while (true) {
            int opcion = mostrarMenuAdmin();

            switch (opcion) {
                // Casos para admin
            }
        }
    }

    public static void leerOpcionUsuario(InventarioMedicamentos inventarioMedicamentos, InventarioObjetos inventarioObjetos) throws IOException {
        while (true) {
            int opcion = mostrarMenuUsuario();

            switch (opcion) {
                // Casos para usuario regular
            }
        }
    }
}
