import java.util.Scanner;

public class Main {
    public static void main(String[] args ){
        Scanner entrada = new Scanner(System.in);

        System.out.print("¿Como te llamas ");
        String nombre = entrada.nextLine();

        System.out.print("¿En que año naciste?");
        int anioNacimiento = entrada.nextInt();

        int anioActual = 2026;
        int edad = anioActual - anioNacimiento;

        if (edad >= 18){
            System.out.println("Ya puedes entrara al antro, " + nombre);
        } else {
            System.out.println("Te faltan " + (18 - edad) + " años para entrara al antro");
        }
    }
}