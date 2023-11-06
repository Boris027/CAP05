
public class Ejercicio45 {
    
  public static int pedirnum(){
    int numero=Integer.parseInt(System.console().readLine());
    if (numero<0){
      return 5/0;
    }else{
     return numero;
    }
    
  }
  
  public static void cambiosentido(int numero, int partir, int insertar){

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
      }else if(i==partir){
        if(i==largo){
          contenedor2=contenedor2+insertar;
        }else contenedor1=contenedor1*10+insertar;
      }else if(i>partir){contenedor2=contenedor2*10+numero/largo2;}


      
      almacenaje=almacenaje+(numero%10)*largo2;
      numero=numero%largo2;
      largo2=largo2/10;
    }
    System.out.printf("El resultado final es el %d%d%n",contenedor1,contenedor2);

    //mismo resultado pero en numero
    /*String numerouwu=Integer.toString(contenedor1);
    String numerouwu2=Integer.toString(contenedor2);
    String numerofinal=(numerouwu+numerouwu2);
    int numeroentero=Integer.parseInt(numerofinal);
    System.out.println(numeroentero+1);*/
    
  }

  

  public static void main(String[] args) throws Exception {
  try {
    
  
    System.out.print("Introduce un numero: ");
    int numero=pedirnum();
    System.out.print("Introduce la posicion a partir de la cual quiere modificar el numero: ");
    int partir=pedirnum();
    int largo=Integer.toString(numero).length();
    if(partir>largo){
      int exit=1/0;
    }
    System.out.print("Introduce el numero que quiere insertar: ");
    int insertar=pedirnum();
    cambiosentido(numero,partir,insertar);
    
  

    } catch (Exception e) {
    System.out.println("Error inesperado");
  }
    }
}
