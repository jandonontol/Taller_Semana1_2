public class CasoContador {
    public static void main(String[] args) {
        System.out.println("=== CASO 4: USO DE STATIC ===");

        Contador objeto1 = new Contador();
        Contador objeto2 = new Contador();
        Contador objeto3 = new Contador();

        System.out.println("Cantidad de objetos creados: " + Contador.getContador());
    }
}
