
public class Ejercicio65 {
    

  
  public static int pedirnum(){
    int numero=Integer.parseInt(System.console().readLine());
    if (numero<1){
      return 5/0;
    }else{
     return numero;
    }
    
  }


  public static void piramide(int altura, int palito){



    for (int i=1;i<=altura;i++){


      for (int j=1;j<=altura-i;j++){
        System.out.print (" ");
      }
       System.out.print ("*");

      if(i!=palito){
        for(int k=1;k<=i+i-3;k++){
        System.out.print(" ");
      }
      }else{
        for(int k=1;k<=i+i-3;k++){
        System.out.print("*");
      }
      }
      



      if(i==1){

      }else System.out.print ("*");

      System.out.println("");

    }





  }
 

  public static void main(String[] args) throws Exception {
  try {

    System.out.print("Introduzca la altura de la A (un número mayor o igual a 3): ");
    int altura=pedirnum();
    if(altura<3){
      altura=altura/0;
    }
    System.out.print("Introduzca la fila del palito horizontal (entre 2 y "+(altura-1) +"): ");
    int palito=pedirnum();
    if(palito<2 || palito>altura || palito==altura || palito==1 ){
      altura=altura/0;
    }
    piramide(altura,palito);
    

    } catch (Exception e) {
    System.out.println("Error inesperado");
  }
    }
}
