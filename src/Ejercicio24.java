
public class Ejercicio24 {

    
     public static void main(String[] args) throws Exception {
     
       
      System.out.print("Introduce la altura de la piramide: ");
      int altura=Integer.parseInt(System.console().readLine());

      for (int i=1;i<=altura;i++){


        for (int b=1;b<=altura-i;b++){
          System.out.print(" ");
        }

        for (int c=1;c<=i+i-1;c++){
          if (c<=i){
            System.out.print(c);
          }
          if (c>i){
            for (int d=c;d>=i;d--){
              System.out.print(d-1);
            }
          }
          
        }
        
        System.out.println("");



      }
    }
}
