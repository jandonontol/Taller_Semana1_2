import java.util.ArrayList;
import java.util.Scanner;

public class ListaEstudiantes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> estudiantes = new ArrayList<>();

        System.out.println("=== CASO 5: LISTA DE ESTUDIANTES ===");

        try {
            System.out.print("Ingrese la cantidad de estudiantes: ");
            int cantidad = Integer.parseInt(scanner.nextLine());

            if (cantidad <= 0) {
                System.out.println("La cantidad debe ser mayor que cero.");
                return;
            }

            for (int i = 1; i <= cantidad; i++) {
                System.out.print("Ingrese el nombre del estudiante " + i + ": ");
                String nombre = scanner.nextLine().trim();

                if (nombre.isEmpty()) {
                    System.out.println("Nombre invalido. Se registrara como 'Sin nombre'.");
                    nombre = "Sin nombre";
                }

                estudiantes.add(nombre);
            }

            System.out.println("\nLista completa de estudiantes:");
            for (int i = 0; i < estudiantes.size(); i++) {
                System.out.println((i + 1) + ". " + estudiantes.get(i));
            }

        } catch (NumberFormatException e) {
            System.out.println("Error: debe ingresar un numero entero valido.");
        } catch (Exception e) {
            System.out.println("Ocurrio un error inesperado: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
