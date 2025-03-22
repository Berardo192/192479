import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int aprobados = 0;
        int reprobados = 0;
        
        for (int i = 1; i <= 4; i++){
            System.out.println("estudiante numero: " + i);
            System.out.print("ingresar la primera nota: ");
            float nota1 = input.nextFloat();
            System.out.print("ingresar la segunda nota: ");
            float nota2 = input.nextFloat();
            System.out.print("ingresar la tercera nota: ");
            float nota3 = input.nextFloat();

            float promedio = (nota1 + nota2 + nota3) / 3;

            if (promedio >= 3.0){
                aprobados++;
            }else {
                reprobados++;
            }
        }
        System.out.println("el numero de estudiantes que aprobaron: "+ aprobados);
        System.out.println("el numero de estudiantes que reprobaron: " + reprobados);
        input.close();

    }
}
