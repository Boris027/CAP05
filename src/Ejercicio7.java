public class Ejercicio7 {
    public static void main(String[] args) throws Exception {
      
      int numerosecreto=1234;

      for (int i=1;i<=4;i++){

        System.out.print("Introduce la contrasña (es de 4 digitos): ");
        int contraseña=Integer.parseInt(System.console().readLine());

        if (contraseña==numerosecreto){
          System.out.println("La caja fuerte se ha abierto satisfactoriamente");
          i=5;
        }
        else{
          System.out.println("Lo siento, esa no es la combinación, le quedan: " +(4-i) +" oportunidades");
        }


      }

        
    }
}
