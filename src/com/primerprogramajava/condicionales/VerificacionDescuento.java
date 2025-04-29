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
            System.out.println("Descuento del 10% aplicado.");
            System.out.println("Nuevo valor: $" + precioProducto);
            System.out.println("Precio con descuento: $" + precioConDescuento);
        } else {
            System.out.println("Descuento no aplicado.\nValor total: $" + precioProducto);
        }
    }
}
