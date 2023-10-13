public class Main {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante();
        Materia materia = new Materia();

        System.out.println("Ingresando datos del estudiante...");
        estudiante.ingresarDatos();

        System.out.println("\nIngresando datos de la materia...");
        materia.ingresarDatos();

        System.out.println("\nDatos ingresados:");
        estudiante.imprimirDatos();
        materia.imprimirDatos();
    }
}
