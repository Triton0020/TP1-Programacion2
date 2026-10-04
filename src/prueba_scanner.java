import java.util.Scanner;

public class prueba_scanner {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        char [] caracteres = new char [5];

       for(int i = 0; i < caracteres.length ; i++){
            System.out.println("Ingrese un caracter");
            caracteres[i] = input.next().charAt(0); //  charAt empieza con indice cero y va entre ().
       }
        
       for (int i = 0 ; i < caracteres.length ; i++){
        System.out.println("Los caracteres ingresados son");
        System.out.println(caracteres[i]);
       }

       input.close();
    }
}
