package com.primerprogramajava.condicionales;

public class Condicional {
    public static void main(String[] args) {
        int fechaDeLanzamiento = 1999;
        String nombreDeLaPelicula = "Matrix";
        boolean incluidoEnElPlan = true;
        String planPlus = "Plan Plus";
        double notaDeLaPelicula = 8.7;

        if (fechaDeLanzamiento > 2000) {
            System.out.println("La película " + nombreDeLaPelicula + " es moderna");
        } else {
            System.out.println("La película " + nombreDeLaPelicula + " es clásica");
        }

        if (incluidoEnElPlan || planPlus.equals("Plan Plus")) {
            System.out.println("La película " + nombreDeLaPelicula + " está incluida en el plan");
        } else {
            System.out.println("La película " + nombreDeLaPelicula + " no está incluida en el plan");

        }
    }
}
