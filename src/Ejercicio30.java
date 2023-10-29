
public class Ejercicio30 {

  public static int calculardia(String Dia1){
    
    int resultadoint=0;
    
    if (Dia1.equals("lunes")){
      resultadoint=1;
    }

    else if (Dia1.equals("martes")){
      resultadoint=2;
    }
    else if (Dia1.equals("miércoles")){
      resultadoint=3;
    }
    else if (Dia1.equals("jueves")){
      resultadoint=4;
    }
    else if (Dia1.equals("viernes")){
      resultadoint=5;
    }
    else if (Dia1.equals("sabado")){
      resultadoint=6;
    }
    else if (Dia1.equals("domingo")){
      resultadoint=7;
    }else {int excepcion=5/0;}
    return resultadoint;
  }

  public static int pedirhora(){
    System.out.print("Hora: ");
    int hora1=Integer.parseInt(System.console().readLine());
    if (hora1<1 || hora1>24){
      int excepcion=5/0;
    }
    return hora1;
  }

  public static int diferenciahoraria(int Dia, int hora, int Dia2, int hora2){
    int contador=0;
    for (int i=Dia;i<=Dia2;i++){
      if (i==Dia2){
        for (int j=hora+1;j<=hora2;j++){
        contador=contador+1;
      }
      }
      else{
        for (int j=hora+1;j<=24;j++){
          contador=contador+1;
        }
      }
      hora=0;
    }
    return contador;
  } 

  public static void main(String[] args) throws Exception {
    try {
      
    
    //primerdia
    System.out.println("Introduzca la primera hora");
    System.out.print("Dia: ");
    String Dia1=System.console().readLine();
    int Dia=calculardia(Dia1);
    int hora=pedirhora();
    //segundodia
    System.out.println("Introduzca la primera hora");
    System.out.print("Dia: ");
    String Dia_2=System.console().readLine();
    int Dia2=calculardia(Dia_2);
    int hora2=pedirhora();
    
    
    //permitir que el segundo dia sea mas grande que el primero
    int contador=0;
    if (Dia2<Dia){
       contador=diferenciahoraria(Dia2, hora2, Dia, hora);
       
    }else{
     contador=diferenciahoraria(Dia, hora, Dia2, hora2);
    }
    
    System.out.println(contador);

    System.out.printf("Entre las %d:00 del %s y las %d:00 del %s hay %d horas/s",hora,Dia1,hora2,Dia_2,contador);


    } catch (Exception e) {
      System.out.println("Error inesperado");
    }
    }
}
