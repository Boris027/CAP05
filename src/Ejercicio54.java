
public class Ejercicio54 {
    
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


    for (int i=1;i<=altura;i++){
      System.out.print("*");
    }
    System.out.println("");
    for (int b=altura-1;b>=1;b--){
      System.out.print("*");

      for (int c=1;c<=b-2;c++){
        System.out.print(" ");
      }
    if (b==1){

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
