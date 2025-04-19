package com.primerprogramajava.condicionales;

import java.util.Scanner;

public class ValidacionContrasena {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int password = 1234567;

        System.out.println("Ingrese la contraseña: ");
        int intentoPassword = scanner.nextInt();

        if (intentoPassword == password) {
            System.out.println("¡Acceso Permitido!");
        } else {
            System.out.println("¡Acceso Denegado!");
        }
    }
}
