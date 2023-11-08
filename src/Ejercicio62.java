
public class Ejercicio62 {
    
  public static int pedirnum(){
    System.out.print("Introduzca un nummero ");
    int numero=Integer.parseInt(System.console().readLine());
    if (numero<1){
      return 5/0;
    }else{
     return numero;
    }
    
  }
  
 public static void numeroseparado(int numero){
  int numeroguardado=numero;
  int afortunado=0;
  int desafortunado=0;
  int largo=Integer.toString(numero).length();
  for(int i=1;i<=largo;i++){

    
    if (numero%10==3 || numero%10==7 || numero%10==8 || numero%10==9){
      afortunado=afortunado+1;
    }else desafortunado=desafortunado+1;


    numero=numero/10;
  }
  
  if(afortunado>desafortunado){
    System.out.printf("El numero %d es afortunado",numeroguardado);
  }else if (afortunado<=desafortunado){
    System.out.printf("El numero %d no es afortunado",numeroguardado);
  }
 }
  

  public static void main(String[] args) throws Exception {
  try {
   
    int numero=pedirnum();
    numeroseparado(numero);
    

    } catch (Exception e) {
    System.out.println("Error inesperado");
  }
    }
}
