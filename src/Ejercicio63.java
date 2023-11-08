
public class Ejercicio63 {
    
  public static int pedirnum(){
    
    int numero=Integer.parseInt(System.console().readLine());
    if (numero<1){
      return 5/0;
    }else{
     return numero;
    }
    
  }
  

  public static void piramide(int altura, int altura2){
    altura2=altura2+1;
    int contenedor=altura2-altura;
  

    int contenedor2=1;
    if(altura2>altura){
      contenedor=-1;
      contenedor2=altura-altura2;

    }

    

    

    for (int i=contenedor2;i<=altura;i++){

      

      if(i<0){
        for(int j=1;j<=altura;j++){
        System.out.print(" ");
      }}else{
        for(int j=1;j<=altura-i;j++){
          System.out.print(" ");
        }
      }
        

      for(int k=1;k<=i+i-1;k++){
        System.out.print("*");
      }

      
      if(i<=0){
        for(int j=1;j<=altura-1;j++){
       System.out.print(" ");
      }
      }else{for(int j=1;j<=altura-i;j++){
       System.out.print(" ");
      }}
      
      

      if(contenedor>=0){

        
        for(int l=1;l<=altura2-contenedor;l++){
          System.out.print(" ");
        }
        
        for(int m=1;m<=contenedor+contenedor-1;m++){
          System.out.print("*");
        }
        
      }



      System.out.println("");



      contenedor=contenedor+1;
    }

  }

  public static void main(String[] args) throws Exception {
  try {
    System.out.print("Introduzca la altura de la pirámide: ");
    int altura=pedirnum();
    System.out.print("Introduzca la altura de la segunda pirámide: ");
    int altura2=pedirnum();
    piramide(altura,altura2);
    

    } catch (Exception e) {
    System.out.println("Error inesperado");
  }
    }
}
