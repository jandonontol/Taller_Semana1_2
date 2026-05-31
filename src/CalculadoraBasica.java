import java.util.Scanner;

public class CalculadoraBasica {

    public static double sumar(double a, double b) {
        return a + b;
    }

    public static double restar(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir entre cero.");
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("=== CASO 1: CALCULADORA BASICA ===");
            System.out.print("Ingrese el primer numero: ");
            double numero1 = scanner.nextDouble();

            System.out.print("Ingrese el segundo numero: ");
            double numero2 = scanner.nextDouble();

            System.out.println("Seleccione una operacion:");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicacion");
            System.out.println("4. Division");
            System.out.print("Opcion: ");
            int opcion = scanner.nextInt();

            double resultado;

            switch (opcion) {
                case 1:
                    resultado = sumar(numero1, numero2);
                    System.out.println("Resultado de la suma: " + resultado);
                    break;
                case 2:
                    resultado = restar(numero1, numero2);
                    System.out.println("Resultado de la resta: " + resultado);
                    break;
                case 3:
                    resultado = multiplicar(numero1, numero2);
                    System.out.println("Resultado de la multiplicacion: " + resultado);
                    break;
                case 4:
                    resultado = dividir(numero1, numero2);
                    System.out.println("Resultado de la division: " + resultado);
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: debe ingresar datos validos.");
        } finally {
            scanner.close();
        }
    }
}
