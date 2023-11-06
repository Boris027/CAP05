
public class Ejercicio57 {
    
  public static int pedirnum(){
    System.out.print("Introduce la altura de la figura: ");
    int numero=Integer.parseInt(System.console().readLine());
    if (numero<1){
      return 5/0;
    }else{
     return numero;
    }
    
  }
  
  public static void figura(int altura){


    for (int i=altura;i>=1;i--){

      
      for (int j=1;j<=altura-i;j++){
        System.out.print(" ");
      }
      System.out.print("*");
      for (int b=1;b<=i-2;b++){
        if(i==altura){
          System.out.print("*");
        }else System.out.print(" ");
      }
      if(i==1){

      }else System.out.print("*");
      System.out.println("");



    }


  }
    


  public static void main(String[] args) throws Exception {
  try {
   
    int altura=pedirnum();
    figura(altura);

    } catch (Exception e) {
    System.out.println("Error inesperado");
  }
    }
}
