
public class Ejercicio64 {
    

  
  public static int pedirnum(){
    System.out.print("Indique que quiere hacer con el rectángulo: ");
    int numero=Integer.parseInt(System.console().readLine());
    if (numero<1 || numero>4){
      return 5/0;
    }else{
     return numero;
    }
    
  }

  public static void menu(){

    System.out.println("1.Agrandarlo");
    System.out.println("2.Achicarlo");
    System.out.println("3.Cambiar la orientación");
    System.out.println("4.Salir");
  }
  
 
  public static void cuadrado(int alto, int ancho){

    for (int i=1;i<=ancho;i++){
      System.out.print("*");
    }
    System.out.println("");

    for (int i=1;i<=alto-2;i++){
      System.out.print("*");

      for (int j=1;j<=ancho-2;j++){
        System.out.print(" ");
      }
      System.out.print("*");
      System.out.println("");
    }
  
    for (int i=1;i<=ancho;i++){
      System.out.print("*");
    }
    System.out.println("");

  }

  public static void main(String[] args) throws Exception {
  try {

    boolean salida=false;
    int ancho=6;
    int alto=3;
    int cambio=0;
    while (salida==false){
      cuadrado(alto, ancho);
      menu();
      int numero=pedirnum();
      
      switch (numero) {
        case 1: alto=alto+1; ancho=ancho+1;
          break;
        case 2: alto=alto-1; ancho=ancho-1;
          break;
        case 3: cambio=ancho; ancho=alto; alto=cambio;
          break;
        case 4: salida=true;
          break;
        default: System.out.println("Esa opción no es posible");
          break;
      }

      if (ancho<=1 || alto<=1){
        System.out.println("Lo siento, no se puede bajar de 2");
        ancho=4; alto=2;
      }
    }
    
    
    

    } catch (Exception e) {
    System.out.println("Error inesperado");
  }
    }
}
