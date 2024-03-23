package paquete;


public class Main {
    public static void main(String[] args) {
        // Crear una nueva instancia de Estudiante
        Estudiante estudiante = new Estudiante("Juan", 20, "Universitario");

        // Imprimir los detalles del estudiante
        System.out.println("Nombre: " + estudiante.getNombre());
        System.out.println("Edad: " + estudiante.getEdad());
        System.out.println("Grado: " + estudiante.getGrado());

        // Modificar el nombre, edad y grado del estudiante
        estudiante.setNombre("Maria");
        estudiante.setEdad(22);
        estudiante.setGrado("Posgrado");

        // Imprimir los nuevos detalles del estudiante
        System.out.println("Nuevo Nombre: " + estudiante.getNombre());
        System.out.println("Nueva Edad: " + estudiante.getEdad());
        System.out.println("Nuevo Grado: " + estudiante.getGrado());
    }
}
