
package parcialpoo1;


public class Empleado 
{
  public String nombre;
  public double salariobase;

    public Empleado(String nombre, double salariobase) 
    {
        this.nombre = nombre;
        this.salariobase = salariobase;
    }
  
  
    public void mostrarempleado (String nombre ,double salariobase ){
        
        for (int i=0; i<=10;i++){
            System.out.println("el nombre del empleado"+i+" es:"+nombre);
        System.out.println("el salario base del empleado"+i+"es:"+salariobase); 
        } 
       
    }
  
    public void  calcularsalario(double deducciones,double salariomensual)
    {
      double salariototal=salariomensual-deducciones;
        
    }
   
   
    public void calcularsalario(int horasTrabajadas,double tarifaPorHora)
    {
       double salariototal=horasTrabajadas*tarifaPorHora;
        
     }
          
          
          
  
}
