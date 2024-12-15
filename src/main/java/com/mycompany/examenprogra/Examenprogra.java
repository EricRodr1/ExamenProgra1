
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.examenprogra;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Eric Rodriguez
 */
public class Examenprogra {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Supermercado
        double costofinal = 0;
        int productosregistrar;
        System.out.print("Cuantos productos desea registrar? ");
        productosregistrar = sc.nextInt();

        for (int i = 0; i < productosregistrar; i++) {
            System.out.print("Favor ingresar el precio del producto " + (i + 1) + ": ");
            double precio = sc.nextDouble();
            System.out.print("Favor ingresar la cantidad del producto " + (i + 1) + ": ");
            int cantidad = sc.nextInt();
            costofinal += precio * cantidad;
        }
        System.out.println("El costo total de la compra es: " + costofinal);

        // Agua
        System.out.println("Favor ingrese su consumo de agua mensual");
        double[] consumoagua = new double[12];
        for (int i = 0; i < 12; i++) {
            System.out.print("Consumo del mes " + (i + 1) + ": ");
            consumoagua[i] = sc.nextDouble();
        }

        double consumoanual = 0;
        for (double consumo : consumoagua) {
            consumoanual += consumo;
        }

        System.out.println("Su consumo de agua anual es: " + consumoanual);

        double promediomensual = consumoanual / 12;
        System.out.println("Su promedio mensual es: " + promediomensual);

        // Tienda Ropa
        Map<String, Integer> inventario = new HashMap<>();
        String seguir;

        do {
            System.out.print("Ingresa el nombre del producto: ");
            String nombreproducto = sc.next();
            System.out.print("Ingresa la cantidad del producto: ");
            int cantidadproducto = sc.nextInt();
            sc.nextLine(); // Limpiar el buffer

            inventario.put(nombreproducto, inventario.getOrDefault(nombreproducto, 0) + cantidadproducto);

            System.out.print("¿Deseas ingresar otro producto? (si o no): ");
            seguir = sc.nextLine();
        } while (seguir.equalsIgnoreCase("si"));

        System.out.println("Inventario final:");
        int totaldeproductos = 0;
        for (Map.Entry<String, Integer> entry : inventario.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
            totaldeproductos += entry.getValue();
        }

        System.out.println("Cantidad total de productos registrados: " + totaldeproductos);
    }
}
