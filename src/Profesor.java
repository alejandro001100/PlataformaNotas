public class Profesor {
    private String nombre;
    private String cedula;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void ingresarDatos() {
        System.out.println("Ingrese el nombre del profesor:");
        nombre = System.console().readLine();
        System.out.println("Ingrese la cédula del profesor:");
        cedula = System.console().readLine();
    }

    public void imprimirDatos() {
        System.out.println("Nombre Profesor: " + nombre);
        System.out.println("Cédula Profesor: " + cedula);
    }
}
