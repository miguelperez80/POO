
package parcialuno;

import java.util.ArrayList;


public class Parcialuno {
    

  
    public static void main(String[] args) {
   
        ArrayList<Empleado> empleados = new ArrayList<>();

        // Llena el arreglo con al menos 10 datos diferentes
        empleados.add(new Asalariado("juan", 3000000, 500000));
        empleados.add(new Asalariado("pedro", 3500000, 600000));
        empleados.add(new EmpleadoPorHoras("marta", 0, 160, 60000));
        empleados.add(new EmpleadoPorHoras("carlos", 0, 180, 50000));
        empleados.add(new Asalariado("gavi", 2800000, 400000));
        empleados.add(new Asalariado("leo", 3200000, 550000));
        empleados.add(new EmpleadoPorHoras("jose", 0, 140, 50000));
        empleados.add(new EmpleadoPorHoras("miguel", 0, 200, 35000));
        empleados.add(new Asalariado("angel", 2700000, 450000));
        empleados.add(new Asalariado("leider", 3100000, 520000));

        // Obtener Empleados por horas
        System.out.println("Empleados por horas:");
        for (Empleado empleado : empleados) {
            if (empleado instanceof EmpleadoPorHoras) {
                System.out.println(empleado.getNombre() + " - Salario: $" + empleado.calcularSalario());
            }
        }

        // Obtener Empleados Asalariados
        System.out.println("\nEmpleados asalariados:");
        for (Empleado empleado : empleados) {
            if (empleado instanceof Asalariado) {
                System.out.println(empleado.getNombre() + " - Salario: $" + empleado.calcularSalario());
            }
        }

        // Modificar el nombre o salario de un empleado (por ejemplo)
        for (Empleado empleado : empleados) {
            if (empleado.getNombre().equals("juan")) {
                empleado.setNombre("juan Modificado");
                empleado.setSalarioBase(2000000);
            }
        }

        // Obtener Empleados por horas nuevamente (para verificar que se modificó)
        System.out.println("\nEmpleados por horas despues de la modificacion:");
        for (Empleado empleado : empleados) {
            if (empleado instanceof EmpleadoPorHoras) {
                System.out.println(empleado.getNombre() + " - Salario: $" + empleado.calcularSalario());
            }
        }

        // Obtener un empleado específico (por ejemplo, "Empleado7")
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
        
    }
}
