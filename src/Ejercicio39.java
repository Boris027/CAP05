
public class Ejercicio39 {

  public static int pedirnum(){
    System.out.print("Por favor, introduzca un numero entero positivo: ");
    int numero=Integer.parseInt(System.console().readLine());
    if (numero<0){
      int exit=1/0;
      return exit;
    }else return numero;
  }

  
  public static void factorial(int numero){
    int contenedor=1;
    for (int i=1;i<=numero;i++){
      contenedor=contenedor*i;
    }
    System.out.println(numero +"! = " +contenedor);
  }

  public static void main(String[] args) throws Exception {
    try {
    int numero=pedirnum();
    for(int i=1;i<=numero;i++){
      factorial(i);
    }

    } catch (Exception e) {
      System.out.println("Error inesperado");
    }


    }
}
