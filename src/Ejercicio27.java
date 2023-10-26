
public class Ejercicio27 {

  public static int pedirnum(){
    System.out.print("Introduce un numero: ");
    int numeroleido=Integer.parseInt(System.console().readLine());
    return numeroleido;
  }

  public static int bucle(int numeroleido, int totalsuma){
    System.out.println("Los multiplos de " +numeroleido +" son: " );
    for (int i=1;i<=numeroleido/3;i++){
        System.out.println(i*3);
        totalsuma=totalsuma+i*3;
      }
    return totalsuma;
  }
  public static void main(String[] args) throws Exception {
    try {
      
      
      int numeroleido=pedirnum();
      if (numeroleido<0){
        System.out.println("Error, introduzca un numero positivo");
        
      }else{
        int totalsuma=bucle(numeroleido,0);
        System.out.println("La suma de todos sus multiplos es de " +totalsuma);
      }
      
      } catch (Exception e) {
      System.out.println("Error inesperado");
    }
    }
}
