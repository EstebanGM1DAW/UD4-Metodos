import java.util.Scanner;

public class Relacion8_2 {
    public static String convierteAPalabras (int n) {
        String[] opciones = {"cero","uno","dos","tres","cuatro","cinco","seis","siete","ocho","nueve"};
        String numPals=String.valueOf(n);
        String palabras = "";
        for (int i = 0;i<numPals.length();i++){
            palabras+=opciones[numPals.charAt(i)-48];
            if (i<numPals.length() - 1) {
                palabras+= ",";
            }
        }
        return palabras;
    }
    public static void main(String[] args) {
        System.out.println("Numero?");
        Scanner entrada = new Scanner(System.in);
        int numero = entrada.nextInt();
        String resultado = convierteAPalabras(numero) + " ";
        System.out.println(resultado);
        entrada.close();
    }
}
