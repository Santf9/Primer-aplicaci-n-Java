package com.primeraplicacionjava.bucles;

import java.util.Scanner;

public class JuegoAdivinanza {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numeroAlearotio = (int) (Math.random() * 100) +1;
        int intentos = 0;

        while (intentos < 5) {
            System.out.println("Elige un número entre 1 y 100 ");
            int numeroUsuario = teclado.nextInt();
            intentos++;

            if (numeroUsuario < numeroAlearotio) {
                System.out.println("El número es mayor");
            } else if (numeroUsuario > numeroAlearotio) {
                System.out.println("El número es menor");
            } else {
                System.out.println("¡Felicidades! Adivinaste el número en" + intentos + "intentos.");
            }

        }
            if(intentos == 5) {
                System.out.println("Lo siento, has agotado tus intentos. El número secreto era: " + numeroAlearotio);
            }
    }
}
