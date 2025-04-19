package com.primerprogramajava.condicionales;

import java.util.Scanner;

public class CompatibilidadDonarSangre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la edad del donante: ");
        int edad = scanner.nextInt();
        System.out.println("Ingrese el peso del donante: ");
        int peso = scanner.nextInt();

        if (edad >= 18 && edad <= 65 && peso >= 50) {
            System.out.println("El donante es compatible para donar sangre.");
        } else {
            System.out.println("El donante no es compatible para donar sangre. El criterio no fue cumplido.\n" +
                    "Motivo: Debe tener entre 18 y 65 años y pesar más de 50 kg.");
        }
    }
}