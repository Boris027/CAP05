import java.util.Scanner;

public class Ejercicio22 {

    public static int numdivisores(int numero){
      int contador=0;
      for (int i=1;i<=numero;i++){
          if (numero%i==0){
           contador=contador+1;
          }
        }
        return contador;
    }

    public static int imprimirprimo(int numero,int resultado){
      if (numero==2){
        System.out.println("El numero es primo " +resultado);
      }
      return 0;
    }
     public static void main(String[] args) throws Exception {
      int contador=0;
      for(int b=2;b<=100;b++){
      contador=numdivisores(b);
      imprimirprimo(contador,b);
      contador=0;
      }



    }
}
