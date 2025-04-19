package com.primeraplicacionjava.bucles;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota = 0;
        double promedioNota = 0;

        for (int i = 0; i < 4; i++) {
            System.out.println("Escribe la nota que le darías a la película Matrix");
            nota = teclado.nextDouble();
            promedioNota = promedioNota + nota;
        }

        System.out.println("El promedio de la película Matrix es: " + promedioNota / 4);

    }
}
