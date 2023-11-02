
public class Ejercicio34 {
    
  public static long pedirnum(){

    System.out.print("Introduzca un número: ");
    long numero=Long.parseLong(System.console().readLine());
    if (numero<0){
      return 1/0;
    } else return numero;
  }


  public static long medirlargo(long numero){
     long largo=Long.toString(numero).length();
    long divisorlargo=1;
    for (long j=1;j<=largo-1;j++){
      divisorlargo=divisorlargo*10;

    }
    return divisorlargo;
  }
  public static long sacarpares(long numero, long numero2){
    long pares=0;
    long divisorlargo=medirlargo(numero);
    long largo=Long.toString(numero).length();
    
    long divisorlargo2=medirlargo(numero2);
    long largo2=Long.toString(numero2).length();


    if(largo2>largo){
      largo=largo2;
    }

    for (long i=1;i<=largo;i++){
      
      if(numero!=0 && divisorlargo!=0){

      

      
      if ((numero/divisorlargo)%2==0){
        pares=pares*10+numero/divisorlargo;
      }

      numero=numero%divisorlargo;
      divisorlargo=divisorlargo/10;
      }

      
      if(numero2!=0 && divisorlargo2!=0){

      

      
      if ((numero2/divisorlargo2)%2==0){
        pares=pares*10+numero2/divisorlargo2;
      }

      numero2=numero2%divisorlargo2;
      divisorlargo2=divisorlargo2/10;
      }
    }
    
    return pares;
  }


  public static long sacarimpares(long numero, long numero2){
    long pares=0;
    long divisorlargo=medirlargo(numero);
    long largo=Long.toString(numero).length();
    
    long divisorlargo2=medirlargo(numero2);
    long largo2=Long.toString(numero2).length();


    if(largo2>largo){
      largo=largo2;
    }

    for (long i=1;i<=largo;i++){
      
      if(numero!=0 && divisorlargo!=0){

      

      
      if ((numero/divisorlargo)%2!=0){
        pares=pares*10+numero/divisorlargo;
      }

      numero=numero%divisorlargo;
      divisorlargo=divisorlargo/10;
      }

      
      if(numero2!=0 && divisorlargo2!=0){

      

      
      if ((numero2/divisorlargo2)%2!=0){
        pares=pares*10+numero2/divisorlargo2;
      }

      numero2=numero2%divisorlargo2;
      divisorlargo2=divisorlargo2/10;
      }
    }
    
    return pares;
  }
  public static void main(String[] args) throws Exception {
  try {
    
  
  long numero=pedirnum();
  long numero2=pedirnum();
  long pares=sacarpares(numero,numero2);
  System.out.printf("El numero formado por los digitos pares es %d%n",pares);
  long impares=sacarimpares(numero, numero2);
  System.out.printf("El numero formado por los digitos impares es %d",impares);

  } catch (Exception e) {
    System.out.println("Error inesperado");
  }




    }
}
