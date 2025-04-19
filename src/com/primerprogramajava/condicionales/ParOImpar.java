package com.primerprogramajava.condicionales;

import java.util.Scanner;

public class ParOImpar {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un número entero
        System.out.println("Ingrese un número entero: ");
        int numero = scanner.nextInt();

        // Verificar si el número es par o impar con el operador % de módulo
        if (numero % 2 == 0) {
            System.out.println("El número " + numero + " es par.");
        } else {
            System.out.println("El número " + numero + " es impar.");
        }
        // Cerrar el escáner
        scanner.close();
    }
}
