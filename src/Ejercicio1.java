
// Importo la clase Scanner desde el paquete java.util (carpeta d eutilidades java)
import java.util.Scanner;
public static void main(String[] args) {
    // int [] numeros = new int [5];  Forma de reservar espacio en memoria para almacenar array
    Scanner input = new Scanner(System.in); //Instancio la clase, con el constructor system.in
    String nombre;
    char [] caracter  = new char[5];

    System.out.println("Ingrese un Nombre");
    nombre= input.nextLine();
    System.out.println("Bienvenido " + nombre  );
    
    
    //Imprimo en pantalla de forma ordenada, opcion 1
    for (int i = 0; i < caracter.length ; i++){
        System.out.println(caracter[i]);
    }
    // Imprimo en pantalla de forma invertida
    for (int i = caracter.length -1 ; i >= 0 ; i--){
        System.out.println(caracter[i]);
    }


    input.close();
    }

