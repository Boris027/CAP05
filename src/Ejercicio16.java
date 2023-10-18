import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) throws Exception {
      Scanner num1=new Scanner(System.in);
      
      System.out.print("Introduce un numero: ");
      
      int contador=0;
      try {
        int numero=num1.nextInt();
        num1.close();

        for (int i=1;i<=numero;i++){
          if(numero%i==0){
            contador=contador+1;
          }
        }

        if (contador!=2){
            System.out.println("El numero " +numero +" no es primo");
          }else System.out.println("El numero " +numero +" si es primo");
          
      
      }catch (Exception e){
        System.out.println("Se ha producido un error");
      }
    }
}
