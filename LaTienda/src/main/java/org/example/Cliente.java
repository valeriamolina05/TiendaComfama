package org.example;

public class Cliente {

    //ATRIBUTOS (VARIABLES QUE ALMACENAN DATOS DE LA CLASE)
    private String nombre;
    public int edad;            //Dato primitivo
    public String telefono;     //Dato en envoltura
    public String direccion;
    public Integer comprasMes;


    //METODOS ESPECIALES
    //1. Constructor vacio
    public Cliente() {
    }

    //2. Constructor lleno

    public Cliente(String nombre, int edad, String telefono, String direccion, Integer comprasMes) {
        this.nombre = nombre;
        this.edad = edad;
        this.telefono = telefono;
        this.direccion = direccion;
        this.comprasMes = comprasMes;
    }


    //METODOS ORDINARIOS
}
