package org.example;

import org.example.clases.Empleado;

public class Main {
    public static void main(String[] args) {

        //Dentro del metodo main escribo mi programa y creo los objetos
        //Creando una variable ordinaria
        int edad = 5;
        System.out.println(edad);

        //Creando nuestro primer objeto
        //Los objetos son copias de una clase
        //Los objetos son instancias de una clase
        //Los objetos son variables que se crean para poder inicializar los atributos de la clase
        Cliente objeto =new Cliente();
        //Se usa un objeto para acceder a los atributos y metodos de la clase por separado
        objeto.edad=18;
        System.out.println(objeto.edad);
        objeto.nombre="Valeria Molina";
        System.out.println(objeto.nombre);

        //Creando un objeto utilizando un constructor lleno
        Cliente objetoDos = new Cliente("Valeria",18, "3173157575", "cra 60", 12);
        System.out.println(objetoDos.edad);
        System.out.println(objetoDos.nombre);

        //Creando un objeto de la clase empleado
        Empleado objetoTres = new Empleado();
        System.out.println(objetoTres);





    }
}