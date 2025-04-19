package com.primerprogramajava.condicionales;

import java.util.Scanner;

public class AprobadoODesaprobado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la nota del estudiante: ");
        double nota = scanner.nextDouble();

        if (nota >= 7.0) {
            System.out.println("El estudiante tuvo un promedio de " + nota + " y está aprobado.");
        } else if (nota >= 5.0 && nota <= 6.9) {
            System.out.println("El estudiante tuvo un promedio de " + nota + " y está en recuperación.");
        } else {
            System.out.println("El estudiante tuvo un promedio de " + nota + " y fue reprobado.");
            
        }
    }
}
