
public class Ejercicio36 {
    
  public static int pedirnum(){
    System.out.print("Introduce un numero: ");
    int numero=Integer.parseInt(System.console().readLine());
    if (numero<0){
      return 5/0;
    }else{
     return numero;
    }
    
  }
  
  public static int cambiosentido(int numero){

    int largo=Integer.toString(numero).length();
    int almacenaje=0;
    
    int largo2=1;
    for (int b=1;b<=largo-1;b++){
      largo2=largo2*10;
    }

    for (int i=1;i<=largo;i++){
      almacenaje=almacenaje+(numero%10)*largo2;
      largo2=largo2/10;
      numero=numero/10;
    }

    return almacenaje;
  }

  public static boolean pruebacapicua(int numero, int numeroreverso){

    if (numero!=numeroreverso){
      return false;
    }else return true;
    
  }

  public static void main(String[] args) throws Exception {
  try {
    
  
    
    int numero=pedirnum();
    int numeroreverso=cambiosentido(numero);
    boolean capicua=pruebacapicua(numero, numeroreverso);
  
    if (capicua==true){
      System.out.printf("El numero %d que al reves es %d es capicua",numero,numeroreverso);
    }else if (capicua!=true){
      System.out.printf("El numero %d que al reves es %d no es capicua",numero,numeroreverso);
    }
  

    } catch (Exception e) {
    System.out.println("Error inesperado");
  }
    }
}
