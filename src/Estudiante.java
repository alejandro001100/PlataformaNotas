public class Estudiante {
    private String matricula;
    private String cedula;
    private String nombre;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void ingresarDatos() {
        System.out.println("Ingrese la matrícula del estudiante:");
        matricula = System.console().readLine();
        System.out.println("Ingrese la cédula del estudiante:");
        cedula = System.console().readLine();
        System.out.println("Ingrese el nombre del estudiante:");
        nombre = System.console().readLine();
    }

    public void imprimirDatos() {
        System.out.println("Matrícula: " + matricula);
        System.out.println("Cédula: " + cedula);
        System.out.println("Nombre: " + nombre);
    }
}
