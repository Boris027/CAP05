
public class Ejercicio66 {
    

  
  public static int pedirnum(){
    System.out.print("Introduzca la altura de la figura (debe ser impar, mayor o igual a 3): ");
    int numero=Integer.parseInt(System.console().readLine());
    if (numero<3 || numero%2==0){
      return 5/0;
    }else{
     return numero;
    }
    
  }

  public static void figura(){
    
    System.out.printf("*%-4s*%n","");
  }
  


  public static void buclefigura(int altura){

    for(int i=1;i<=altura-altura/2;i++){
      
      for(int j=1;j<=i;j++){
        System.out.print(" ");
      }
      figura();
    }

    for(int i=altura/2;i>=1;i--){
      
      for(int j=1;j<=i;j++){
        System.out.print(" ");
      }
      figura();
    }


  }


  
 

  public static void main(String[] args) throws Exception {
  try {

    int altura=pedirnum();
    buclefigura(altura);


    } catch (Exception e) {
    System.out.println("Error inesperado");
  }
    }
}
