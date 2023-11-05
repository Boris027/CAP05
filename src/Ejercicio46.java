
public class Ejercicio46 {
    
  public static int pedirnum(){
    int numero=Integer.parseInt(System.console().readLine());
    if (numero<2){
      return 5/0;
    }else{
     return numero;
    }
    
  }
  
  public static void rectangulo(int anchura,int altura){
  
    for(int i=1;i<=anchura;i++){
      System.out.print("* ");
    }
    System.out.println("");
    
    for(int b=1;b<=altura-2;b++){

      System.out.print("*");

      for (int j=1;j<=(anchura-2)*2+1;j++){
        System.out.print(" ");
      }
      System.out.print("*");
      System.out.println("");

    }

    for(int i=1;i<=anchura;i++){
      System.out.print("* ");
    }
    System.out.println("");
    
  }

  public static void main(String[] args) throws Exception {
    try {
      
    
    System.out.print("Por favor, introduzca la anchura del rectángulo (como mínimo 2): ");
    int anchura=pedirnum();
    System.out.print("Por favor, introduzca la altura del rectángulo (como mínimo 2): ");
    int altura=pedirnum();
    rectangulo(anchura, altura);
      } catch (Exception e) {
      System.out.println("Error inesperado");
    }

    }
}
