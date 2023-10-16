public class Ejercicio8 {
    public static void main(String[] args) throws Exception {
      
      System.out.print("Introduce el numero del cual quieras la tabla de multiplicar: ");
      int num1=Integer.parseInt(System.console().readLine());

      for (int i=1;i<=10;i++){
        System.out.println(num1*i);
      }

        
    }
}
