
public class Ejercicio37 {

  public static int pedirnum(){
    System.out.print("Introduzca el numero: ");
    int numero=Integer.parseInt(System.console().readLine());
    if (numero<0){
      int exit=1/0;
      return exit;
    }else return numero;
  }

  public static int numeroseparado(int numero){
    int largo=Integer.toString(numero).length();
    System.out.print("El " +numero +" en decimal es el: ");
    int largo2=1;
    for(int a=1;a<=largo-1;a++){
      largo2=largo2*10;
    }

    for (int i=1;i<=largo;i++){

      

        
        
        for(int x=1;x<=numero/largo2;x++){
          if (numero==0){
            System.out.print("- ");
          }else{
          System.out.print("| ");}
        }
        
        if(i==largo){
          System.out.print(" en sistema de palotes");
          break;
        }
        System.out.print("- ");
      
        numero=numero%largo2;
        largo2=largo2/10;

    }
    
    
    return 0;

  }

  public static void main(String[] args) throws Exception {
  try {
    
  
  int numero=pedirnum();
  int numeroseparado=numeroseparado(numero);
  
    } catch (Exception e) {
    System.out.println("Error inesperado");
  }


    }
}
