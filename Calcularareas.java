

package com.mycompany.calcularareas;

abstract class FormaGeometrica {
    
    public abstract double calcularArea();
}
class cuadrado extends FormaGeometrica {
    private final double lado;

    public cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado*lado;
    }
}
class triangulo extends FormaGeometrica {
    private final double base,altura;

    public triangulo (double base, double altura) {
        this.altura = altura;
        this.base = base;
    }

    @Override
    public double calcularArea() {
        return (base*altura)/2;
    }
}
public class Calcularareas {

    public static void main(String[] args) {
        
        cuadrado cuadrado1 = new cuadrado(5.0);
        double areacuadrado = cuadrado1.calcularArea();
        System.out.println("Área del cuadrado es: " + areacuadrado);
         
        triangulo triangulo1=new triangulo(5,6);
         double areatriangulo = triangulo1.calcularArea();
        System.out.println("Área del triangulo es: " + areatriangulo);
    }
}
