
public class Ejercicio42 {
    
  public static int pedirnum(){
    System.out.print("Introduce un numero: ");
    int numero=Integer.parseInt(System.console().readLine());
    if (numero<0){
      return 5/0;
    }else{
     return numero;
    }
    
  }
  
  public static int verdivisores(int numero){
    int almacenaje=0;
    for (int i=1;i<=numero;i++){

      if (numero%i==0){
        almacenaje=almacenaje+1;
      }


    }
    return almacenaje;
  }


  public static void main(String[] args) throws Exception {
    try {
      
  int numero=pedirnum();

  for(int i=numero;i<=numero+4;i++){
    int numdivisores=verdivisores(i);

    if (numdivisores==2){ 
      System.out.println(i +" es primo");
    }else System.out.println(i +" no es primo");

  }

  } catch (Exception e) {
      System.out.println("Error inesperado");
    }


    }
}
