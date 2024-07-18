public class Estudiante {
    private String apellido;
    private String Nombre;

    public Estudiante(){}

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String toString(){
        return Nombre+""+apellido;
    }
    
}
