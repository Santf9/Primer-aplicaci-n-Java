package com.primerprogramajava.condicionales;

import java.util.Scanner;

public class VerificacionDiaHabil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el día de la semana (en minúsculas): ");
        String dia = scanner.nextLine();

            switch (dia) {
                case "lunes":
                case "martes":
                case "miércoles":
                case "jueves":
                case "viernes":
                    System.out.println(dia + " es un día hábil.");
                    break;
                case "sábado":
                case "domingo":
                    System.out.println(dia + " no es un día hábil.");
                    break;
                default:
                    System.out.println("Día inválido. Por favor, ingrese un día de la semana válido.");
            }
    }
}
