
public class Ejercicio31 {

  public static int pregunaltura(){
    System.out.print("Introduce la altura: ");
    int altura=Integer.parseInt(System.console().readLine());
    return altura;
  }
    
  public static int bucleL(int altura){

    for (int i=1;i<=altura-1;i++){
      System.out.println("*");
      if (i==altura-1){
      System.out.print("*");
      }
    }

  for (int j=1;j<=(altura-1)/2;j++){
    System.out.print(" *");
      }

    return 0;
  }
  public static void main(String[] args) throws Exception {
  try {
    
  
  int altura=pregunaltura();
  int bucle=bucleL(altura);

    
  } catch (Exception e) {
    System.out.println("Error inesperado");
  }



    }
}
