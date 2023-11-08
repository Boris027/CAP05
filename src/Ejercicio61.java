
public class Ejercicio61 {
    
  public static int pedirnum(){
    System.out.print("Introduzca la altura de la V (minimo 3): ");
    int numero=Integer.parseInt(System.console().readLine());
    if (numero<3){
      return 5/0;
    }else{
     return numero;
    }
    
  }
  
  public static void piramide(int altura){

    for(int i=altura;i>=1;i--){

      for(int j=1;j<=altura-i;j++){
        System.out.print(" ");
      }

      for(int w=1;w<=3;w++){
        System.out.print("*");
      }
      

      for(int k=1;k<=i+i-2;k++){
        System.out.print(" ");
      }
      for(int w=1;w<=3;w++){
        System.out.print("*");
      }
      System.out.println("");
    }

  }
  

  public static void main(String[] args) throws Exception {
  try {
   
    int altura=pedirnum();
    piramide(altura);
    

    } catch (Exception e) {
    System.out.println("Error inesperado");
  }
    }
}
