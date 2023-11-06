
public class Ejercicio51 {
    
  public static int pedirnum(){
    System.out.print("Introduce un numero: ");
    int numero=Integer.parseInt(System.console().readLine());
    if (numero<1){
      return 5/0;
    }else{
     return numero;
    }
    
  }
  
  
  public static void numeroseparado(int numero){
    int contador=0;
    int uwu=0;
    int largo=Integer.toString(numero).length();
    int divisor=1;
    for (int i=1;i<=largo-1;i++){
      divisor=divisor*10;
    }
    

    for (int b=1;b<=largo;b++){

      
      if (numero/divisor==8 || numero/divisor==0){
        System.out.print("");
        contador=contador+1;
      }else{uwu=uwu*10+numero/divisor;}
      
      numero=numero%divisor;
      divisor=divisor/10;
    }

    if (contador>=1){
      System.out.println("Después de haber sido comido por el gusano numérico se queda en: " +uwu);
    }else System.out.println("El gusano númerico no se ha comido ningun dígito");
    
  }
  
  

    

  

  public static void main(String[] args) throws Exception {
  try {
   
    int numero=pedirnum();
    numeroseparado(numero);

    } catch (Exception e) {
    System.out.println("Error inesperado");
  }
    }
}
