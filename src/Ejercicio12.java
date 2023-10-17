import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) throws Exception {
      Scanner num1=new Scanner(System.in);
      System.out.print("Cuantos numeros de la serie de fibonacci quieres ver?: ");
      int numero=num1.nextInt();
      num1.close();

      int numerox=1;
      int numeroy=0;
      int numerouwu=0;
      System.out.println(0);
      for (int i=1;i<=numero-1;i++){
       
        numerouwu=numeroy;
        System.out.println(numerox);
        numeroy=numerox;
        numerox=numerox+numerouwu;
        
        
        
        
      }
      
      

      
      
    }
}
