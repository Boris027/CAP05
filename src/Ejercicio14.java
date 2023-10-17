import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) throws Exception {
      Scanner num1=new Scanner(System.in);
      System.out.print("Introduce la base: ");
      int base=num1.nextInt();
      System.out.print("Introduce la potencia: ");
      int potencia=num1.nextInt();
      num1.close();


      int resultado=1;
      if (potencia<0 || base<0){
        System.out.println("La base o la potencia que has introducido deben ser positivas");
      }
      else if (potencia==1){
        System.out.println("El resultado es: " +base);
      }
      else if (potencia==0){
        System.out.println("El resultado es: 1" );
      }
      
      else{
      for(int i=1;i<=potencia;i++){

        resultado=resultado*base;
      }
        System.out.println("El resultado es: " +resultado);
      }
      
    }
}
