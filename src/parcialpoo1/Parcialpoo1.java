
package parcialpoo1;
import java.util.ArrayList;

public class Parcialpoo1 {

   
    public static void main(String[] args) {
   ArrayList<Empleado> empleados = new ArrayList<>();

        // Llena el arreglo con al menos 10 datos diferentes
        empleados.add(new Empleado_Asalariado("juan", 3000000, 500));
        empleados.add(new Empleado_Asalariado("pedro", 3500000, 600));
        empleados.add(new Empleado_PorHoras("marta", 0, 160, 60000));
        empleados.add(new Empleado_PorHoras("carlos", 0, 180, 50000));
        empleados.add(new Empleado_Asalariado("gavi", 2800000, 400));
        empleados.add(new Empleado_Asalariado("leo", 3200000, 550));
        empleados.add(new Empleado_PorHoras("jose", 0, 140, 50000));
        empleados.add(new Empleado_PorHoras("miguel", 0, 200, 35000));
        empleados.add(new Empleado_Asalariado("angel", 2700000, 450));
        empleados.add(new Empleado_Asalariado("leider", 3100000, 520));

        // Obtener Empleados por horas
        System.out.println("Empleados por horas:");
        for (Empleado empleado : empleados) {
            if (empleado instanceof Empleado_PorHoras) {
                System.out.println(empleado.getNombre() + " - Salario: $" + empleado.calcularSalario());
            }
        }

        // Obtener Empleados Asalariados
        System.out.println("\nEmpleados asalariados:");
        for (Empleado empleado : empleados) {
            if (empleado instanceof Empleado_Asalariado) {
                System.out.println(empleado.getNombre() + " - Salario: $" + empleado.calcularSalario());
            }
        }

        // Modificar el nombre o salario de un empleado 
        for (Empleado empleado : empleados) {
            if (empleado.getNombre().equals("juan")) {
                empleado.setNombre("juan Modificado");
                empleado.setSalarioBase(2000000);
            }
        }

        // Obtener Empleados por horas nuevamente (para verificar que se modificó)
        System.out.println("\nEmpleados por horas despues de la modificacion:");
        for (Empleado empleado : empleados) {
            if (empleado instanceof Empleado_PorHoras) {
                System.out.println(empleado.getNombre() + " - Salario: $" + empleado.calcularSalario());
            }
        }

        // Obtener un empleado específico 
       
        String empleadoBuscado = "jose";
        for (Empleado empleado : empleados) {
            if (empleado.getNombre().equals(empleadoBuscado)) {
                System.out.println("\nEmpleado especifico (" + empleadoBuscado + "):");
                System.out.println("Nombre: " + empleado.getNombre());
                System.out.println("Salario: $" + empleado.calcularSalario());
                break;
            }
        }
    }
}
