package BibliotecaR8;

import java.util.Scanner;

public class generaArrayInt {
    public static int[] generarArray (int n,int max, int min) {
        int[] resultado = new int[n];
        for (int i = 0;i<resultado.length;i++) {
        resultado[i] = (int) (Math.random()*max+min);
        }
        return resultado;
    }
    public static void main(String[] args) {
        int a,b,c;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Largo del array: ");
        a = entrada.nextInt();
        System.out.println("Maximo");
        b = entrada.nextInt();
        System.out.println("Minimo");
        c = entrada.nextInt();
        int[] d = new int[a];
        for (int i = 0;i<d.length;i++) {
            System.out.print(generarArray(a, b, c)[i]+ " ");
        }
    }
}
