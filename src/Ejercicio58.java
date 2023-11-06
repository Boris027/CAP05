
public class Ejercicio58 {
    
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
      
      
      numero=numero*10;
      int numerofinal=0;
      int contador=0;
      
      for (int b=1;b<=largo;b++){
        numerofinal=numerofinal+numero/divisor;
        contador=contador+1;
        numero=numero%divisor;
        divisor=divisor/10;
      }
      System.out.print("La media de sus dígitos es: "+(float) numerofinal/ (float) contador);
      
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
