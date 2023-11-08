
public class Ejercicio67 {
    

  
  public static int pedirnum(){
    
    int numero=Integer.parseInt(System.console().readLine());
    if (numero<1){
      return 5/0;
    }else{
     return numero;
    }
    
  }

  
  public static void escalera(int numero, int altura){
    int ancho=4;

    for (int i=1;i<=numero;i++){


    for (int w=1;w<=altura;w++){
      for(int j=1;j<=ancho*i;j++){
        System.out.print("*");
      }
      System.out.println("");
    }
      


    }




  }

  
 

  public static void main(String[] args) throws Exception {
  try {
    System.out.print("Introduzca el número de escalones: ");
    int numero=pedirnum();
    System.out.print("Introduzca la altura de cada escalon: ");
    int altura=pedirnum();
    escalera(numero, altura);
    


    } catch (Exception e) {
    System.out.println("Error inesperado");
  }
    }
}
