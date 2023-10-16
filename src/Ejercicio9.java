import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) throws Exception {
      Scanner num1=new Scanner(System.in);

      System.out.print("Introduce un numero: ");
      int numero=num1.nextInt();
      num1.close();

      int contador=2;
      
      if (numero>=0 && numero<10){
        System.out.println("El numero tiene 1 digito");
      }





      for (int i=10;i<=numero;i*=10){
        
        if (numero/i>=1 && numero/i<=9){
          System.out.println("El numero tiene " +contador +" digitos");
          
        } 

        contador=contador+1;
      }

        
    }
}
