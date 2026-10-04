import java.util.Scanner;

public class Prueba_doWhile {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int opcion;

        do{
            System.out.println("== MENU DE OPCIONES ==");
            System.out.println("1 - Ver arreglo en forma ordenada");
            System.out.println("2 - Ver arrglo en forma invertida");
            System.out.println("Seleccione la opcion (1 o 2): ");

            opcion= input.nextInt();

             if (opcion != 1 && opcion != 2){
                 System.out.println("Opcion incorrecta, intente de nuevo");
            }
        }while (opcion !=1 && opcion !=2); // Se repite mientras sea ditinto de 1 y distinto de 2, solo sale del blucle cuando sea falso    
        
        System.out.println("Elijio la opcion : " + opcion);
        
        input.close();
    }
}

