public class App {
    public static void main(String[] args)  {
        
        int valorN = 6;

        int [] multiplos = new int[10];

        
        
        for (int i = 0 ; i < multiplos.length ;i++){
            int tabla = valorN * (i + 1);
            multiplos[i] = tabla ;
        }
        
        for(int i = 0 ; i < multiplos.length; i++){
        System.out.println(multiplos[i]);
        }
    }
}
