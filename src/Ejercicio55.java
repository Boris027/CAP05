
public class Ejercicio55 {
    
  public static int pedirnum(){
    System.out.print("Introduce un numero: ");
    int numero=Integer.parseInt(System.console().readLine());
    if (numero<1){
      return 5/0;
    }else{
     return numero;
    }
    
  }
  
  
    public static void desplazamiento(int numero){

      int largo=Integer.toString(numero).length();
      int divisor=1;
      for (int i=1;i<=largo;i++){
        divisor=divisor*10;
      }
      
      int divisor2=divisor/10;
      numero=numero*10;
      int numerofinal=0;
      int primero=0;
      for (int b=1;b<=largo;b++){
        if (b==largo){
           primero=numero/divisor;
        }else numerofinal=numerofinal*10+numero/divisor;
        numero=numero%divisor;
        divisor=divisor/10;
      }
      int resultado=primero*divisor2+numerofinal;
      System.out.println(resultado);
    }


  public static void main(String[] args) throws Exception {
  try {
   
    int numero=pedirnum();
    desplazamiento(numero);

    } catch (Exception e) {
    System.out.println("Error inesperado");
  }
    }
}
