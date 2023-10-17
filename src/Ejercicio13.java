import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) throws Exception {
      Scanner num1=new Scanner(System.in);
      int positivo=0;
      int negativo=0;
      for (int i=1;i<=10;i++){

        System.out.print("Introduce 1 numero (" +i +"-10): ");
        int numero=num1.nextInt();


        if (numero>0){

          positivo=positivo+1;

        }else if(numero<0){
          negativo=negativo+1;
        }
        


      }

    
      System.out.print("Tienes " +positivo +" numeros positivos y " +negativo +" numeros negativos");
      
    }
}
