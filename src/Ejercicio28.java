
public class Ejercicio28 {

  public static int pedirnum(){
    System.out.print("Introduce un numero: ");
    int factorial=Integer.parseInt(System.console().readLine());
    return factorial;
  }

  public static int buclefactorial(int factorial){
    int resultado=1;
    for (int i=1;i<=factorial;i++){
      resultado=i*resultado;
    }
    return resultado;
  }

  public static void main(String[] args) throws Exception {
 
try {
    int factorial=pedirnum();
    if (factorial>=0){
    int resultadofinal=buclefactorial(factorial);
    System.out.println(factorial +"! = " +resultadofinal);
    }else System.out.println("Error, introduzca un numero positivo");
    } catch (Exception e) {
  System.out.println("Error inesperado");
}

    }
}
