
public class Ejercicio48 {
    
  public static int pedirnum(){
    System.out.print("Introduce un numero: ");
    int numero=Integer.parseInt(System.console().readLine());
    if (numero<1){
      return 5/0;
    }else{
     return numero;
    }
    
  }
  
  public static boolean aparicion(int numero,int coincidencia){

    int largo=Integer.toString(numero).length();
    int numerolargo=1;
    for (int i=1;i<=largo;i++){
      numerolargo=numerolargo*10;
    }
    numero=numero*10;
    
      
      for(int e=1;e<=numerolargo;e++){
        
        if(numero/numerolargo==coincidencia){
          
          return true;
          }
        
        
        
        numero=numero%numerolargo;
        numerolargo=numerolargo/10;
      }
      


    
      return false;
    }

  
  

    

  

  public static void main(String[] args) throws Exception {
  try {
    
  
    
    int numero=pedirnum();
    System.out.print("Digitos que aparecen en el numero: ");
    for(int i=1;i<=9;i++){
      boolean resultado=aparicion(numero,i);
      if (resultado==true){
        System.out.print(i +" ");
      }
    }
    
    System.out.println("");
    System.out.print("Digitos que no aparecen en el numero: ");
    for(int i=1;i<=9;i++){
      boolean resultado=aparicion(numero,i);
      if (resultado==false){
        System.out.print(i+ " ");
      }
    }

    

    } catch (Exception e) {
    System.out.println("Error inesperado");
  }
    }
}
