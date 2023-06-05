package org.example.clases;

public class Empleado {
    // ATRIBUTOS
    private Integer salario;
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

    public Integer getSalario() {
        return salario;
    }

    public void setSalario(Integer salario) {
        if (salario < 0){
            System.out.println("Revise por favor");
        }else{
            this.salario = salario;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    //Metodos ordinarios
    //Los metodos ordinarios seran funciones que el desarrollador programa para ejecutar la logica de negocios

    //Calcular el salario mensual de un emepleado
    public Double calcularSalario (Integer salarioBase,Integer deducciones){

        final Double descuentoSalud = 0.04;
        final Double descuentoPension = 0.04;

        Double descuentosSeguridad= (salarioBase * descuentoSalud * descuentoPension);
        Double salario = salarioBase - deducciones - descuentosSeguridad;

        return salario;
    }
}
