
public class Ejercicio50 {
    
  public static int pedirnum(){
    int numero=Integer.parseInt(System.console().readLine());
    if (numero<1){
      return 5/0;
    }else{
     return numero;
    }
    
  }
  
  public static void principio(int altura, int espacios){
    System.out.print("*");

    for(int b=1;b<=2;b++){
      for (int i=1; i<=espacios;i++){
      System.out.print(" ");
    }
    for (int i=1; i<=4;i++){
      System.out.print("*");
    }
    }
    System.out.println("");
  }

  public static void medioarriba(int altura, int espacios){
    System.out.print("*");
    for (int i=1; i<=espacios;i++){
      System.out.print(" ");}
      System.out.print("*");
      for (int i=1; i<=espacios+3;i++){
      System.out.print(" ");}
      System.out.print("*");
      System.out.println("");
  }

  public static void medioabajo(int altura, int espacios){
    System.out.print("*");
    for (int i=1; i<=espacios+3;i++){
      System.out.print(" ");}
      System.out.print("*");
      for (int i=1; i<=espacios+3;i++){
      System.out.print(" ");}
      System.out.print("*");
      System.out.println("");
  }

  public static void dibujo(int altura, int espacios){
    principio(altura, espacios);
    
    
    medioarriba(altura, espacios);
    
    
    principio(altura, espacios);
    
    for (int i=1;i<=altura-4;i++){
      medioabajo(altura, espacios);
    }
    

    principio(altura, espacios);
    
    
    
    
    

    

  }
  
  
  

    

  

  public static void main(String[] args) throws Exception {
  try {
    System.out.print("Introduce la altura(minimo 5): ");
    int altura=pedirnum();
    if (altura<5){
      int exit=5/0;
    }
    System.out.print("Introduce el numero de espacios entre los numeros: ");
    int espacios=pedirnum();
    dibujo(altura, espacios);
    

    } catch (Exception e) {
    System.out.println("Error inesperado");
  }
    }
}
