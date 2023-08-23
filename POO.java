package POO;

public class POO {

    public static void main(String[] args) {
        POO instance = new POO();

       int result = instance.sum(1, 2);
        System.out.println("resultado:"+result);

        int edad = 25;
        double temperatura = 98.6;
        char calificacion = 'A';
        boolean activo = true;
        String nombre = "miguel angel";
        int[] numeros = {1, 2, 3, 4, 5};
        System.out.println("hola  " + nombre);

    }

    public int sum(int num1, int num2) {
        //System.out.println("result: " + (num1 + num2));
        return (num1+num2);
    }

}
