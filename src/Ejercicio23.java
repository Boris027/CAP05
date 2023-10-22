import java.util.Scanner;

public class Ejercicio23 {

    
     public static void main(String[] args) throws Exception {
      
      int limite=10000;
      int numero=0;
      int contador=0;
      while (numero<limite){

      System.out.print("Que cantidad quieres introducir: ");
      int numero2=Integer.parseInt(System.console().readLine());
      if (numero2<0){
        break;
      }

      numero=numero+numero2;
      contador=contador+1;
      }
      if (numero<=limite){
      System.out.println("El total acumulado es de " +numero);
      System.out.println("Se han introducido un total de " +contador +" numeros");
      System.out.printf("%s%.2f%n","La media es de ", (float)numero/(float)contador);
      }else{
        System.out.println("Se ha excedido el limite");
      }

      
    }
}
