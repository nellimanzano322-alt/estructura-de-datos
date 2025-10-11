package FIFO;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Paciente {
    private String nombre;
    private int edad;
    private double estatura;

    public Paciente(String nombre, int edad, double estatura) {
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getEstatura() {
        return estatura;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Edad: " + edad + ", Estatura: " + estatura + " m";
    }
}

public class Clinica {
    private static Queue<Paciente> cola = new LinkedList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;

        do {
            System.out.println("\n=== SISTEMA DE GESTIÓN DE PACIENTES ===");
            System.out.println("1. Registrar llegada de paciente");
            System.out.println("2. Atender paciente");
            System.out.println("3. Mostrar cola de espera");
            System.out.println("4. Verificar si la cola está vacía");
            System.out.println("5. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1 -> registrarPaciente();
                case 2 -> atenderPaciente();
                case 3 -> mostrarCola();
                case 4 -> verificarColaVacia();
                case 5 -> System.out.println("Saliendo del sistema...");
                default -> System.out.println("Opción no válida, intenta de nuevo.");
            }
        } while (opcion != 5);
    }

    private static void registrarPaciente() {
        System.out.print("Nombre del paciente: ");
        String nombre = sc.nextLine();
        System.out.print("Edad: ");
        int edad = sc.nextInt();
        System.out.print("Estatura (en metros): ");
        double estatura = sc.nextDouble();

        Paciente nuevo = new Paciente(nombre, edad, estatura);
        cola.add(nuevo);
        System.out.println("✅ Paciente agregado a la cola.");
    }

    private static void atenderPaciente() {
        if (cola.isEmpty()) {
            System.out.println("❌ No hay pacientes en espera.");
        } else {
            Paciente atendido = cola.poll(); // elimina y devuelve el primero
            System.out.println("\nAtendiendo al paciente:");
            System.out.println(atendido);
        }
    }

    private static void mostrarCola() {
        if (cola.isEmpty()) {
            System.out.println("No hay pacientes esperando.");
        } else {
            System.out.println("\nPacientes en espera:");
            for (Paciente p : cola) {
                System.out.println(p);
            }
        }
    }

    private static void verificarColaVacia() {
        if (cola.isEmpty()) {
            System.out.println("La cola está vacía.");
        } else {
            System.out.println("Hay pacientes esperando.");
        }
    }
}