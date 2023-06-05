package org.example;

public class Cliente {

    //ATRIBUTOS (VARIABLES QUE ALMACENAN DATOS DE LA CLASE)
    private String nombre;
    private int edad;            //Dato primitivo
    private String telefono;     //Dato en envoltura
    private String direccion;
    private Integer comprasMes;


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

    // 3. METODOS DE ENCAPSULADO (getters y setters)

    public String getNombre() { //validar que el nombre que llega tenga minimo 4 letras
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;


    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if(edad > 100){
            System.out.println("Un usuario no puede tener esa edad");
        }else {
            this.edad = edad;
        }
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) { // Validar que tenga 10 digitos
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getComprasMes() {
        return comprasMes;
    }

    public void setComprasMes(Integer comprasMes) { //Validar que no existan compras negativas
        if (comprasMes < 0){
            System.out.println("No se admiten compras negativas");
        }else{
            this.comprasMes = comprasMes;
        }

    }




    //METODOS ORDINARIOS
}
