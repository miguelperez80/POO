
package com.mycompany.clase4;


public abstract class animal {
     private String nombre,tipo_alimentacion;
    private int edad;

    public animal(String nombre,String tipo_alimentacion,int edad){
        this.nombre = nombre;
        this.tipo_alimentacion = tipo_alimentacion;
        this.edad = edad;
    }

   
    public abstract void Alimentarse();

    public void Moverse(){
        System.out.println("El animal se esta moviendo");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo_alimentacion() {
        return tipo_alimentacion;
    }

    public void setTipo_alimentacion(String tipo_alimentacion) {
        this.tipo_alimentacion = tipo_alimentacion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
    

