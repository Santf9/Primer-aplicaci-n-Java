package com.primerprogramajava.condicionales;

import java.util.Scanner;

public class ValidacionCodigoAcceso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int codigoAcceso = 2023;
        int nivelPermiso = 2;

        System.out.println("Por favor, ingrese el código de acceso:");
        int codigoIngresado = scanner.nextInt();
        System.out.println("Por favor, ingrese el nivel de permiso:");
        int nivelPermisoIngresado = scanner.nextInt();

        if (codigoIngresado == codigoAcceso  && nivelPermisoIngresado == nivelPermiso) {
            System.out.println("Acceso permitido, bienvenido al sistema");
        } else {
            System.out.println("Acceso denegado, código o nivel de permiso incorrecto");
        }
    }
}
