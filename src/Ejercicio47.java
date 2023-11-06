
public class Ejercicio47 {
    
  public static int pedirnum(){
    System.out.print("Introduce un numero: ");
    int numero=Integer.parseInt(System.console().readLine());
    if (numero<5 || numero%2==0){
      return 5/0;
    }else{
     return numero;
    }
    
  }
  
  public static void figura(int altura){
  
    int ancho=6;

    for (int i=1;i<=ancho;i++){
      System.out.print("M");
    }

    System.out.println("");

    for (int b=1;b<=(altura-2)/2;b++){
      System.out.print("M");

      for (int c=1;c<=ancho-2;c++){
      System.out.print(" ");
      }
      System.out.print("M");
      System.out.println("");
    }

    

    
  }
  

    

  

  public static void main(String[] args) throws Exception {
  try {
    
  
    
    int altura=pedirnum();
    figura(altura);
    figura(altura);
    int ancho=6;

    for (int i=1;i<=ancho;i++){
      System.out.print("M");
    }

    } catch (Exception e) {
    System.out.println("Error inesperado");
  }
    }
}
