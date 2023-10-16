import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) throws Exception {
      Scanner num1=new Scanner(System.in);
      float numeroxd=0;

      int contador=0;
      for (int i=0;i<=999999999;i++){
        
        System.out.print("Introduce un numero: ");
        float numero=num1.nextFloat();
        
        if (numero<0){
          System.out.printf("%s%.2f","La media de los numeros que has puesto es: ",(numeroxd/contador));
          i=999999999;
        }
        numeroxd=numeroxd+numero;

        contador=contador+1;
      }

        
    }
}
