

package com.mycompany.clase4;



public class Clase4 {

     public static void main(String[] args) {

        //-->Declaracion del objeto PERRO
	    animal perro = new perro("Stich","Carnivoro",15,"Doberman");
        perro.Alimentarse();
        //-->Declaracion de otro objeto PERRO
        perro perro1 = new perro("Teddy","Croquetas",10,"Chihuahua");
        perro1.Alimentarse();
        


        //-->Declaracion del objeto Gato
        animal gato1 = new gato("Pelusa","Galletas",15,"Siames");
        gato1.Alimentarse();
        //-->Declaracion del objeto Caballo
        animal caballo1 = new caballo("Spark","Pasto",25,"Fino");
        caballo1.Alimentarse();
         
        animal pajaro1 = new pajaro("pedro","gusanos",3,"condor");
        pajaro1.Alimentarse();
        
        animal tigre1 = new tigre ("jose","carne",5,"bengala");
        tigre1.Alimentarse();
        
        

    }
}
