package com.primerprogramajava.condicionales;

import java.util.Scanner;

public class VerificacionTriangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer lado: ");
        int ladoA = scanner.nextInt();
        System.out.println("Ingrese el segundo lado: ");
        int ladoB = scanner.nextInt();
        System.out.println("Ingrese el tercer lado: ");
        int ladoC = scanner.nextInt();

        // Verificación de la condición del triángulo
        if (ladoA + ladoB > ladoC && ladoA + ladoC > ladoB && ladoB + ladoC > ladoA) {
            System.out.println("Los lados pueden forman un triángulo.");
        } else {
            System.out.println("Los lados no pueden formar un triángulo. Intenta con otros valores");
        }
    }
}
