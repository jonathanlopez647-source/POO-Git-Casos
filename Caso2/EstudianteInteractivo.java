package Caso2;

import java.util.Scanner;

public class EstudianteInteractivo {
private String nombre;
    private int edad;
    private String carrera;

    public EstudianteInteractivo(String Nombre, int Edad, String Carrera) {
        this.nombre = Nombre;
        this.edad = Edad;
        this.carrera = Carrera;
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
        this.edad = edad;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Carrera: " + carrera);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del estudiante: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese la edad del estudiante: ");
        int edad = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        System.out.print("Ingrese la carrera del estudiante: ");
        String carrera = scanner.nextLine();

        EstudianteInteractivo estudiante = new EstudianteInteractivo(nombre, edad, carrera);

        System.out.println("\nDatos del Estudiante:");
        estudiante.mostrarDatos();

        // Cerrar el scanner
        scanner.close();
    }
}
