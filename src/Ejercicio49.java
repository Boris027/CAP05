
public class Ejercicio49 {
    
  public static int pedirnum(){
    System.out.print("Introduce un numero: ");
    int numero=Integer.parseInt(System.console().readLine());
    if (numero<1){
      return 5/0;
    }else{
     return numero;
    }
    
  }
  
 public static boolean medirprimo(int numero){
  int divisor=0;
  for(int i=1;i<=numero;i++){
          if (numero%i==0){
            divisor=divisor+1;
          }
        }
  if (divisor==2) return true;
  else if (divisor!=2) return false;
  return false;
 }
  
  
  

    

  

  public static void main(String[] args) throws Exception {
  try {
    
    boolean eleccion=false;
    int numgrande=0;
    int numpequeño=2147483647;
    int media=0;
    int contador=0;
    while (eleccion==false){
      int numero=pedirnum();
      boolean comprobarprimo=medirprimo(numero);
      
      if (comprobarprimo==true){
        break;
      }
      if (numero>numgrande){
        numgrande=numero;
      }
      if (numero<numpequeño){
        numpequeño=numero;
      }
      media=media+numero;
      contador=contador+1;
    }
    
    System.out.println("El máximo es de " +numgrande);
    System.out.println("El minimo es de " +numpequeño);
    System.out.println("La media es de " +(float)media/+(float)contador);
     
    

    

    } catch (Exception e) {
    System.out.println("Error inesperado");
  }
    }
}
