import java.util.Scanner;

public class MuyMalHecho {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int contador = 0;

        System.out.println("Número de usuarios a ingresar:");
        int numero = input.nextInt();
        input.nextLine();

        int edad1 = 0, edad2 = 0, edad3 = 0;
        String nombre1 = "", nombre2 = "", nombre3 = "";

        while (contador < numero) {
            System.out.println("Nombre del usuario:");
            String nombre = input.nextLine();

            System.out.println("Edad del usuario:");
            int edad = input.nextInt();
            input.nextLine();

            if (contador == 0) {
                nombre1 = nombre;
                edad1 = edad;
            } else if (contador == 1) {
                nombre2 = nombre;
                edad2 = edad;
            } else if (contador == 2) {
                nombre3 = nombre;
                edad3 = edad;
            }

            if (edad >= 18) {
                System.out.println(nombre + " es mayor de edad.");
            } else {
                System.out.println(nombre + " es menor de edad.");
            }

            if (edad > 120 || edad < 1) {
                System.out.println("Edad no válida.");
            }

            contador = contador + 1;
        }

        System.out.println("Resumen:");
        System.out.println("Usuario 1: " + nombre1 + " - Edad: " + edad1);
        System.out.println("Usuario 2: " + nombre2 + " - Edad: " + edad2);
        System.out.println("Usuario 3: " + nombre3 + " - Edad: " + edad3);
        input.close();
    }
}
