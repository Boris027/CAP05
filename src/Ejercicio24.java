
public class Ejercicio24 {

    
     public static void main(String[] args) throws Exception {
     
      try {
        
      
      System.out.print("Introduce la altura de la piramide: ");
      int altura=Integer.parseInt(System.console().readLine());
      altura=altura+1;
      
      int guardado=0;
      for (int i=1;i<=altura;i++){
        
        for (int espacios=1;espacios<=altura-i;espacios++){
          System.out.print(" ");
        }
        
        for(int contenido=1;contenido<=i+i-1;contenido++){
          if (i==contenido){
            break;
          }
          
          System.out.print(contenido);
          guardado=contenido;

        }
        for (int b=guardado;b>=1;b--){
          if (b-1==0){
            break;
          } else System.out.print(b-1);
          
        }
        
        
        
        

        System.out.println("");


      }
      } catch (Exception e) {
        System.out.println("Error, introduce un numero entero");
      }
    }
}
