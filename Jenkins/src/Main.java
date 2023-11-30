import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su nombre:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese su apellido:");
        String apellido = scanner.nextLine();

        System.out.println("Ingrese su ciudad:");
        String ciudad = scanner.nextLine();

        System.out.println("Ingrese su edad:");
        int edad = scanner.nextInt();

        System.out.println("Información del usuario:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Ciudad: " + ciudad);
        System.out.println("Edad: " + edad);

        scanner.close();
    }
}