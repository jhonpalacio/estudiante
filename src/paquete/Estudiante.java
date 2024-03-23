package paquete;

public class Estudiante {
    private String nombre;
    private int edad;
    private String grado;

    public Estudiante(String nombre, int edad, String grado) {
        this.nombre = nombre;
        setEdad(edad);
        this.grado = grado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad >= 0) {
            this.edad = edad;
        } else {
            System.out.println("La edad no puede ser un valor negativo.");
        }
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }
}
