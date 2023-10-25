import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) throws Exception {
      Scanner num1=new Scanner(System.in);
      System.out.print("Introduce la base: ");
      int base=num1.nextInt();
      System.out.print("Introduce el exponente: ");
      int exponente=num1.nextInt();
      num1.close();
      int base_fija=base;
      for (int i=1;i<=exponente;i++){
        System.out.println(base_fija +" elevado " + i +" = " +base);
        base=base*base_fija;
      }

      
    }
}
