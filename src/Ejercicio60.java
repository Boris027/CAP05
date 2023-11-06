
public class Ejercicio60 {
    
  public static int pedirnum(){
    System.out.print("Introduzca la altura de los calcetines: ");
    int numero=Integer.parseInt(System.console().readLine());
    if (numero<4){
      return 5/0;
    }else{
     return numero;
    }
    
  }
  
  public static void partearriba(){

    System.out.println("***     ***");
  }
    
  public static void parteabajo(){
    System.out.println("******  ******");
  }

  public static void main(String[] args) throws Exception {
  try {
   
    int altura=pedirnum();
    
    for(int b=1;b<=altura-2;b++){
      partearriba();
    }

    for(int i=1;i<=2;i++){
      parteabajo();
    }

    } catch (Exception e) {
    System.out.println("Error inesperado");
  }
    }
}
