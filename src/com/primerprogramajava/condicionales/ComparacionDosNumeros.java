package com.primerprogramajava.condicionales;

import java.util.Scanner;

public class ComparacionDosNumeros {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer número: ");
        int primerNumero = scanner.nextInt();

        System.out.println("Ingrese el segundo número: ");
        int segundoNumero = scanner.nextInt();

        if (primerNumero > segundoNumero) {
            System.out.println("El número mayor es " + primerNumero);
        } else if (primerNumero < segundoNumero) {
            System.out.println("Los número mayor es " + segundoNumero);
        } else {
            System.out.println("Los números son iguales");
        }
    }
}
