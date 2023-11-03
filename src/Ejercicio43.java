
public class Ejercicio43 {
    
  public static int pedirnum(){
    int numero=Integer.parseInt(System.console().readLine());
    if (numero<0){
      return 5/0;
    }else{
     return numero;
    }
    
  }
  
  public static void cambiosentido(int numero, int partir){

    int largo=Integer.toString(numero).length();
    int almacenaje=0;
    
    int largo2=1;
    for (int b=1;b<=largo-1;b++){
      largo2=largo2*10;
    }


    int contenedor1=0;
    int contenedor2=0;
    for (int i=1;i<=largo;i++){
      
      if(i<partir){
        contenedor1=contenedor1*10+numero/largo2;
      }else contenedor2=contenedor2*10+numero/largo2;


      
      almacenaje=almacenaje+(numero%10)*largo2;
      numero=numero%largo2;
      largo2=largo2/10;
    }
    System.out.printf("Los numeros partidos son el %d y el %d",contenedor1,contenedor2);
  }

  

  public static void main(String[] args) throws Exception {
  try {
    
  
    System.out.print("Introduce un numero: ");
    int numero=pedirnum();
    System.out.print("Introduce la posicion a partir de la cual dividir el numero: ");
    int partir=pedirnum();
    int largo=Integer.toString(numero).length();
    if(partir>largo){
      int exit=1/0;
    }
    cambiosentido(numero,partir);
    
  

    } catch (Exception e) {
    System.out.println("Error inesperado");
  }
    }
}
