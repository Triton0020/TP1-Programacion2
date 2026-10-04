public class Prueba_procedimientos {

    public static void main(String[] args) {
        char[] caracteres = {'a', 'b', 'c', 'd', 'e'};
        mostrarOriginal(caracteres);
        mostrarInvertido(caracteres);
    }

    public static void mostrarOriginal(char[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }
    }

        public static void mostrarInvertido(char[] vector) {
        for (int i = vector.length-1; i >= 0; i--) {
            System.out.println(vector[i]);
        }
    }
}