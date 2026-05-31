public class CasoPersona {
    public static void main(String[] args) {
        System.out.println("=== CASO 2: CLASE PERSONA ===");

        Persona persona1 = new Persona("Alejandro", 31);
        Persona persona2 = new Persona("Lucia", 25);

        System.out.println("Datos de la primera persona:");
        persona1.mostrarDatos();

        System.out.println("\nDatos de la segunda persona:");
        persona2.mostrarDatos();
    }
}
