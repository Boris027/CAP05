
public class Ejercicio35 {
    
  public static int pedirnum(){
    System.out.print("Introduce la altura de la x: ");
    int altura=Integer.parseInt(System.console().readLine());
    return altura;
  }


  public static int bucleX(int altura){
    for (int i=altura-altura/2;i>=1;i--){


      for (int b=1;b<=altura-i;b++){
        System.out.print(" ");
      }
      System.out.print("*");

      for (int k=1;k<=i+i-3;k++){
        System.out.print(" ");
      }
      if (i!=1){
        System.out.print("*");
      }
      
      System.out.println("");

    }

    for (int i=2;i<=altura/2+1;i++){


      for (int b=1;b<=altura-i;b++){
        System.out.print(" ");
      }
      System.out.print("*");

      for (int k=1;k<=i+i-3;k++){
        System.out.print(" ");
      }
      if (i!=1){
        System.out.print("*");
      }
      
      System.out.println("");

    }
    return 0;
  }
  public static void main(String[] args) throws Exception {
  
    try {
    
    int altura=pedirnum();
    if (altura%2==0 || altura<3){
      int exit=5/0;
    }
    int bucle=bucleX(altura);

    } catch (Exception e) {
      System.out.println("Error inesperado, introduzca una altura impar superior o igual a 3");
    }
    
    
  
  
    }
}
