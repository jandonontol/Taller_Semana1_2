public class CasoOperacion {
    public static void main(String[] args) {
        System.out.println("=== CASO 3: SOBRECARGA DE METODOS ===");

        Operacion operacion = new Operacion();

        System.out.println("Suma de dos enteros: " + operacion.sumar(10, 5));
        System.out.println("Suma de dos decimales: " + operacion.sumar(8.5, 3.2));
        System.out.println("Suma de tres enteros: " + operacion.sumar(4, 6, 9));
    }
}
