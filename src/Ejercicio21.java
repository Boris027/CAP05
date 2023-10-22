import java.util.Scanner;

public class Ejercicio21 {
    public static int pregunta(){
      System.out.print("Introduce un numero: ");
        int numero=Integer.parseInt(System.console().readLine());
        return numero;
    }
    public static int exit(int numero){
      return 0;
    }

     public static void main(String[] args) throws Exception {
      int positivo=0;
      int impares=0;
      int contadorimpares=0;
      int par=0;
      while (positivo>=0){
        int numero=pregunta();
        exit(numero);
        if (numero<1){
          break;
        }

        if (numero%2!=0){
          impares=impares+numero;
          contadorimpares=contadorimpares+1;
        }

        if (numero%2==0){
          par=numero;
        }
        positivo=positivo+1;
      }
      System.out.println("Has introducido "+positivo+" numeros");
      System.out.printf("%s%.2f%n","La media de los impares es de: ",(float)impares/(float)contadorimpares);
      System.out.printf("%s%d%n","El numero mas grande de los pares es: ",par);
    }
}
