
public class Ejercicio68 {
    

  
  public static int pedirnum(){
    
    int numero=Integer.parseInt(System.console().readLine());
    if (numero<1){
      return 5/0;
    }else{
     return numero;
    }
    
  }

  
  public static int vueltanumero(int numero){
    int largo=Integer.toString(numero).length();
    int numerofinal=0;
    for(int i=1;i<=largo;i++){
      
      if((numero%10)%2==0){
        numerofinal=numerofinal*10+numero%10+1;
      }else numerofinal=numerofinal*10+numero%10-1;
      numero=numero/10;
    }

    return numerofinal;
  }

  public static int vueltanumero2(int numero){
    int largo=Integer.toString(numero).length();
    int numerofinal=0;
    for(int i=1;i<=largo;i++){
      
      
      numerofinal=numerofinal*10+numero%10;
      
      numero=numero/10;
    }

    return numerofinal;
  }
  

  public static void main(String[] args) throws Exception {
  try {
    System.out.print("Introduzca el numero: ");
    int numero=pedirnum();
    int numerovoltedo=vueltanumero(numero);
    int resultado=vueltanumero2(numerovoltedo);
    System.out.printf("Dislocando el %d sale el %d ",numero,resultado);
    
    


    } catch (Exception e) {
    System.out.println("Error inesperado");
  }
    }
}
