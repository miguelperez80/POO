
package parcialpoo1;


class Empleado_Asalariado extends Empleado {
    private double deducciones;

    public Empleado_Asalariado(String nombre, double salarioBase, double deducciones) {
        super(nombre, salarioBase);
        this.deducciones = deducciones;
    }

    public double getDeducciones() {
        return deducciones;
    }

    public void setDeducciones(double deducciones) {
        this.deducciones = deducciones;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() - deducciones;
    }
}
