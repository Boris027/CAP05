import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) throws Exception {
      Scanner num1=new Scanner(System.in);
      
      System.out.print("Introduce un numero: ");
      try {
        int numero=num1.nextInt();
        int numeroxd=0;
        
        if (numero>=0){
        for (int i=numero;i<=numero+100;i++){
          numeroxd=numeroxd+i;

        }
        System.out.println("El resultado es " +numeroxd);
        }else System.out.println("Error introduce un numero positivo");
      } catch (Exception e) {
        System.out.println("Error, el numero debe ser entero y positivo");
      }
      

    }
}
