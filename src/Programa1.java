public class Programa1 {
    public static void main(String[] args)  {
        // Declaracion e inicializacion de array
        int [] edades = new int [5];
        int[] numeros = new int[5];

        // Carga de valores del array con BUCLE FOR usando .length
        for (int i = 0 ; i < edades.length ; i++){
            edades[i] = i;
        }

        // Visualizacion de valores con BUCLE FOR 
        for (int i = 0; i < edades.length ; i++){
            System.out.println("Edad en posición " + i + ": " + edades[i]);
        }

        System.out.println("El tamaño del array edades es: " + edades.length);

        // --- SEGUNDO ARRAY (ahora sí, adentro del main) ---
        
        // Asigno valores al array numeros con BUCLE FOR, el doble de su índice
        for(int i = 0; i < numeros.length ; i++){
            numeros[i] = 2 * i;
        }

        // Muestro el array numeros
        for (int i = 0; i < numeros.length ; i++){
            System.out.println("Número en posición " + i + ": " + numeros[i]);
        }
        
    } // <-- Aquí recién cierra el main correctamente
} // <-- Aquí cierra la clase App