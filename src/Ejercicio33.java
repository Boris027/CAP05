
public class Ejercicio33 {
    
  public static int pediraltura(){
    System.out.print("Introduzca la altura: ");
    int altura=Integer.parseInt(System.console().readLine());
    
    if (altura<0){
      int exit=5/0;
      return exit;
    }else return altura;
  }


  public static int bucleU(int altura){

    for (int i=1;i<=altura-1;i++){
      System.out.print("*");

        for (int j=1;j<=altura-2;j++){
          if (j!=altura-2){
            System.out.print("  ");
          }else System.out.print(" ");
          
        }
      System.out.print("*");
      System.out.println("");
    }
    System.out.print(" ");
    for(int l=1;l<=altura-2;l++){
      System.out.print("* ");
    }
    return 0;
  }


  public static void main(String[] args) throws Exception {

  try {
  int altura=pediraltura();
  int bucle=bucleU(altura);
  } catch (Exception e) {
    System.out.println("Error inesperado");
  }
    }
}
