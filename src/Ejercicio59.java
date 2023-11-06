
public class Ejercicio59 {
    
  public static int pedirnum(){
    System.out.print("Introduce la altura del arbol de navidad: ");
    int numero=Integer.parseInt(System.console().readLine());
    if (numero<4){
      return 5/0;
    }else{
     return numero;
    }
    
  }
  
  public static void arbolnavidad(int altura){

    for (int b=1;b<=altura-1;b++){
        System.out.print(" ");
      }
      System.out.print("*");
      System.out.println("");
    for(int i=1;i<=altura-2;i++){


      for (int b=1;b<=altura-i;b++){
        System.out.print(" ");
      }
       System.out.print("^");

      for (int c=1;c<=i+i-3;c++){
        if(i==altura-2){
          System.out.print("^");
        }else System.out.print(" ");
      }
      if(i==1){

      }else System.out.print("^");

       System.out.println("");

    }

    for (int w=1;w<=altura-2;w++){
      System.out.print(" ");
    }
    System.out.print(" Y");


  }
    


  public static void main(String[] args) throws Exception {
  try {
   
    int altura=pedirnum();
    arbolnavidad(altura);

    } catch (Exception e) {
    System.out.println("Error inesperado");
  }
    }
}
