import java.util.Scanner;

public class Ejercicio19 {

    public static int altura(){
      System.out.print("Introduce la altura de la piramide: ");
      int altura=Integer.parseInt(System.console().readLine());
      return altura;
     }

     public static String caracter(){
      System.out.print("Introduce el caracter con el que quieras hacerla: ");
      String caracter=System.console().readLine();
      return caracter;
     }

     public static int piramide(int altura,String caracter){
      for (int i=1;i<=altura;i++){
        for (int b=1;b<=altura-i;b++){
          System.out.print(" ");
        }
        for (int c=1;c<=i+i-1;c++){
          System.out.print(caracter);
        }
        System.out.println("");
      }
      return 0;
     }


     public static void main(String[] args) throws Exception {
      int altura=altura();
      if (altura>0){
      String caracter=caracter();
      if (caracter.length()==1){
      int piramide=piramide(altura, caracter);
       } else System.out.println("Error, tienes que introducir un unico caracter");
       } else System.out.println("Error, no se pueden introducir una altura negativa");
      
    

    }
}
