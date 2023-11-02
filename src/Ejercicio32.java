
public class Ejercicio32 {
    
  public static int pedirnum(){
    System.out.print("Introduce un numero entero positivo: ");
    int numpositivo=Integer.parseInt(System.console().readLine());
    if (numpositivo<0){
      int exit=5/0;
      return exit;
    }else return numpositivo;
  }


  public static int medirnum(int numpositivo){
  String largonumero=Integer.toString(numpositivo);
  int largonumero2 =largonumero.length();
  return largonumero2;

  }



  public static int buclenumero (int numpositivo, int largonumero){
    int sumapares=0;
  int largodivisor=1;
  for (int j=1;j<=largonumero-1;j++){
  largodivisor=largodivisor*10;
  }
  System.out.print("Digitos pares: ");
  for (int i=largodivisor; i>=1;i/=10){
    if ((numpositivo/i)%2==0){
      System.out.print(numpositivo/i +" ");
      sumapares=sumapares+numpositivo/i;
    }
    numpositivo=numpositivo%i;
  }
  System.out.println("");
  System.out.println("La suma de los numeros pares es de: " +sumapares);
  return 0;
  }




  public static void main(String[] args) throws Exception {
  try {
    
 
  int numpositivo=pedirnum();
  int largonumero=medirnum(numpositivo);
  int bucle=buclenumero(numpositivo, largonumero);
   } catch (Exception e) {
    System.out.println("Error inesperado");
  }
  
  
  
    }
}
