import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) throws Exception {
      Scanner num1=new Scanner(System.in);
      
      System.out.print("Introduce un numero: ");
      int numero=num1.nextInt();



      System.out.printf("%-6s%14s%12s%n","Normal","Cuadrado","Cubo");
      System.out.printf("%-6s%14s%12s%n","------","--------","----");

      for (int i=1;i<=5;i++){
        numero=numero+1;
        System.out.printf("%d%15d%15d%n",numero,numero*numero,numero*numero*numero);


      }
    }
}
