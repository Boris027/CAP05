
public class Ejercicio26 {


  public static void main(String[] args) throws Exception {
    try {
      
    System.out.print("Introduce un numero: ");
    int numero=Integer.parseInt(System.console().readLine());
    int numeroentero=numero;
    System.out.print("Introduce un digito del numero anterior: ");
    int digit=Integer.parseInt(System.console().readLine());
    String numstring=Integer.toString(numero);
    int largo=numstring.length();
    
    for (int i=largo;i>=1;i--){
      
      if(numero%10==digit){
        System.out.println(digit +" se encuentra en la posicion " +i +" de " +numeroentero );
      }
      
      numero=numero/10;


    }
    } catch (Exception e) {
      System.out.println("Error inesperado");
      }
      
    }
}
