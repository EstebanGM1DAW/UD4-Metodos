import java.util.Scanner;
public class Relacion8_1 {
    public static String convierteEnPalotes(int n) {
        String palos = String.valueOf(n); // Convertimos el número a String
        String palos2 = ""; // Cadena donde construiremos la representación en palotes
        String[] palitos = {"-", "|", "||", "|||", "||||", "|||||", "||||||", "|||||||", "||||||||", "|||||||||"}; // Representaciones en palotes
        
        // Recorremos cada carácter del número como String
        for (int i = 0; i < palos.length(); i++) {
            palos2 += palitos[palos.charAt(i)-48]; // Accedemos directamente al índice del array usando el dígito
            if (i < palos.length() - 1) {
                palos2 += "-"; //separador solo si no es el último dígito
            }
        }

        return palos2; // Retornamos la cadena en formato palotes
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qué número quieres pasar a palotes:");
        int num = entrada.nextInt(); // Capturamos el número ingresado
        String resultado = convierteEnPalotes(num); // Convertimos el número a formato palotes
        System.out.println("El número en palotes es: " + resultado); // Imprimimos el resultado
        entrada.close();
    }
}
