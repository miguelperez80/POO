
package parcialpoo1;

public class Empleado_Porhoras {
   Empleado porhoras=new Empleado("jose ",0);
       
       
       
      public void calcularsalario(int horasTrabajadas, double tarifaPorHora) {
        porhoras.calcularsalario(horasTrabajadas, tarifaPorHora);
            
       
    }
      public void mostrarasalariado(int horasTrabajadas,double tarifaPorHora,String nombre,double salariobase,double salariototal ){
          System.out.println("el nuero de horas trabajadas fueron"+horasTrabajadas);
          System.out.println("la tarifa por horas fue de:  "+tarifaPorHora);
          System.out.println("el nombre es: "+nombre  );
          System.out.println("el salariobase fue de:  "+salariobase);
          System.out.println("el salario total fue de "+salariototal);
          
      }
       
    
}
