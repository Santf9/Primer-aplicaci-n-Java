package com.primerprogramajava.condicionales;

import java.util.Scanner;

public class VerificacionDescuento {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double precioProducto;
        double porcentajeDescuento = 0.9;
        double precioConDescuento;

        System.out.println("Ingrese el precio del producto: ");
        precioProducto = scanner.nextDouble();

        precioConDescuento = precioProducto * porcentajeDescuento;

        if (precioProducto >= 100.00) {
            System.out.println("El descuento del 10% se ha aplicado correctamente.");
            System.out.println("Precio original: $" + precioProducto);
            System.out.println("Precio con descuento: $" + precioConDescuento);
        } else {
            System.out.println("El descuento no se ha aplicado.\nValor total: $" + precioProducto);
        }
    }
}
