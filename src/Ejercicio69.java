
public class Ejercicio69 {
    

  
  public static int pedirnum(){
    
    int numero=Integer.parseInt(System.console().readLine());
    if (numero<3){
      return 5/0;
    }else{
     return numero;
    }
    
  }

  public static void piramide(int numero){

    int repeticion=6;
    for(int i=1;i<=numero;i++){
      
      for (int j=1;j<=numero-i;j++){
        System.out.print(" ");
      }


      if(i%2!=0){
        for (int k=1;k<=repeticion;k++){
        System.out.print("*");
      }
      }else{
        for (int k=1;k<=repeticion/2-2;k++){
        System.out.print("*");
        

      }
        System.out.print("    ");

      for (int k=1;k<=repeticion/2-2;k++){
        System.out.print("*");}
    }
      
      repeticion=repeticion+2;


      System.out.println("");



    }


  }
 

  public static void main(String[] args) throws Exception {
  try {
    System.out.print("Introduzca la altura de la piramide maya: ");
    int numero=pedirnum();
    piramide(numero);
    
    
    


    } catch (Exception e) {
    System.out.println("Error inesperado");
  }
    }
}
