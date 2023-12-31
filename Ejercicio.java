

package com.mycompany.ejercicio;

public class Ejercicio {

    public static void main(String[] args) {
        Ejercicio ex = new Ejercicio();
        
        System.out.println(ex.factorial(5));
        System.out.println(ex.factorial_r(5));
    }
    
    public int factorial_r(int num) {
        if (num == 0 || num == 1) {
            return 1;
        } else {
            return factorial_r(num - 1) * num;
        }
    }
    
    public int factorial(int num) {
        int aux = 1;
        for (int a = 1; a <= num; a++) {
            aux = aux * a;
        }
        return aux; 
    }
}



