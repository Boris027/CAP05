
public class Ejercicio29 {

  public static int pedirprimernum(){
      System.out.print("Introduce un numero: ");
      int numeropedido=Integer.parseInt(System.console().readLine());
      return numeropedido;
    }

  public static int pedirdivisor(){
    System.out.print("Introduce otro numero: ");
    int numerodivisor=Integer.parseInt(System.console().readLine());
    return numerodivisor;
  }

  public static int bucleresultado(int numeropedido, int numerodivisor){
    for (int i=1; i<=numeropedido-1;i++){

      if (i%numerodivisor==0){

        System.out.print("");

      }
      
      else{
      System.out.println(i);
      }

      
    }
    return 0;
  }
  public static void main(String[] args) throws Exception {
    try {
      
    
    int numeropedido=pedirprimernum();
    int numerodivisor=pedirdivisor();
    if (numeropedido>=0 && numerodivisor>=0){

    int resultado=bucleresultado(numeropedido,numerodivisor);

    }else{
      System.out.println("Los numeros deben ser positivos");}

    } catch (Exception e) {
      System.out.println("Error inesperado");
    }
    


    }
}
