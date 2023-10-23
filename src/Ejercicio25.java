
public class Ejercicio25 {

  /*
   * Esta funcion lo que hace es pedir un numero y devolverlo
   * La variable numero es el numero que se le pide al usuario
   */
  public static int pedirnum(int nada){
    System.out.print("Introduce un numero: ");
     int numero=Integer.parseInt(System.console().readLine());
     return numero;
  }

  /*
   * Esta función recoge el numero anterior que se la ha pedido al usuario y esta se transforma en una string
   * Luego de ser transformada en una string se utiliza el .length para saber cuantos digitos tiene el numero
   * y asi poder saber cuantas veces ejecutar el bucle.
   * Por ejemplo 1234=4 digitos
   * Y el resultado del valor lo almacena en una variable llamada repetbucle
   */
  public static int numerorepeticionbucle(int numero1){
    String numeropalabra=Integer.toString(numero1);
    return numeropalabra.length();
  }

  /*
   * Esta funcion hace el papel de bucle, coge el numero, me imprime el resto de ese numero partido entre 10,
   * luego de eso el numero se convierte en el mismo numero dividido entre 10 y asi asta que alcanza el contador
   * el mismo numero que de digitos tenia el repetbucle que son los digitos que tiene el numero que introducimos inicialmente
   */
  public static int bucle(int contador, int repetbucle, int numero){
    while(contador!=repetbucle){
        System.out.print(numero%10);
        
        numero=numero/10;
        contador=contador+1;

      } 
    return 0;
  }

  public static void main(String[] args) throws Exception {
    try {
      
     int contador=0;
     int numero=pedirnum(0);
     int repetbucle=numerorepeticionbucle(numero);
     int resultado=bucle(contador, repetbucle, numero);
      } catch (Exception e) {
      System.out.print("Error inesperado");
    }
     

      
    }
}
