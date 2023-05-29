package org.example.clases;

public class Empleado {
    // ATRIBUTOS
    public Integer salario;
    private String nombre;

    //METODOS ESPECIALES
    //1. Constructor vacío
    public Empleado() {
    }

    //2. Constructor lleno
    public Empleado(Integer salario, String nombre) {
        this.salario = salario;
        this.nombre = nombre;
    }
}
