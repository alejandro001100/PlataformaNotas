public class Materia {
    private String codigo;
    private Profesor profesor;
    private String nombre;

    public Materia() {
        profesor = new Profesor();
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void ingresarDatos() {
        System.out.println("Ingrese el código de la materia:");
        codigo = System.console().readLine();
        System.out.println("Ingrese el nombre de la materia:");
        nombre = System.console().readLine();
        System.out.println("Ingrese los datos del profesor:");
        profesor.ingresarDatos();
    }

    public void imprimirDatos() {
        System.out.println("Código Materia: " + codigo);
        System.out.println("Nombre Materia: " + nombre);
        profesor.imprimirDatos();


    }
}

