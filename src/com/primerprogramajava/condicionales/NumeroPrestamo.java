package com.primerprogramajava.condicionales;

import java.util.Scanner;

public class NumeroPrestamo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el valor del préstamo: ");
        int valorPrestamo = scanner.nextInt();

        if (valorPrestamo >= 1000 && valorPrestamo <= 5000) {
            System.out.println("El préstamo ha sido aprobado.");
            System.out.println("El valor " + valorPrestamo + " esta dentro del intervalo permitido para el préstamo.");
        } else {
            System.out.println("El préstamo no ha sido aprobado.");
        }

    }
}
