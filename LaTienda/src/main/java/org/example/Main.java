package org.example;

import org.example.clases.Empleado;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // CREAR UN OBJETO ESPECIAL DE JAVA PARA RECIBIR DATOS POR TECLADO
        Scanner entradaTeclado = new Scanner(System.in);



        // CREAR UN OBJETO DE LA CLASE CLIENTE
        Cliente cliente = new Cliente();



     // Pidiendole el nombre al usuario
        System.out.print("Digita tu nombre: ");
        cliente.setNombre(entradaTeclado.next());
        System.out.println("Su nombre es: " + cliente.getNombre());

        System.out.println("Digita tu edad: ");
        cliente.setEdad(entradaTeclado.nextInt());
        System.out.println("Su edad es: " + cliente.getEdad());




    }
}