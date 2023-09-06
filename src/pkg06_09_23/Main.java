
package pkg06_09_23;
import excercise.personal;

public class Main {
    
   
    
    

   
    public static void main(String[] args) {
        personal[] arrayperson= new personal[3];
        
         arrayperson[0]= new personal("psadmw","perez","1230");
         arrayperson[1]= new personal("hawdwada","perez","1230");
         arrayperson[2]= new personal("masdadw","perez","1230");
         
        //personal Personal= new personal("miguel ","perez","122313" );
        //  personal Persona2= new personal("dawda ","dwadawd","00000" );
        // System.out.println(personal.document);
        for (personal arrayperson1 : arrayperson) {
            System.out.println("persona ");
            System.out.println(arrayperson1.getDocument());
            System.out.println(arrayperson1.getLastname());
            System.out.println(arrayperson1.getName());
            System.out.println("-----------------------");
        }
        /* System.out.println("persona 2");
        System.out.println(Persona2.getDocument());
        System.out.println(Persona2.getName());
        System.out.println(Persona2.getLastname());
        System.out.println("-----------------------");
         */
    }
    
}
