import java.util.Scanner;
import BibliotecaR8.ArraysOperacionesComunes;
public class pruebas {
    public static void main(String[] args) {
        int a,b,c,comprobar,posicion;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Largo del array: ");
        a = entrada.nextInt();
        System.out.println("Maximo");
        b = entrada.nextInt();
        System.out.println("Minimo");
        c = entrada.nextInt();
        System.out.println("Numero a comprobar si esta o no: ");
        comprobar = entrada.nextInt();
        System.out.println("Numero que quieras saber su posicion (si es que esta): ");
        posicion = entrada.nextInt();
        int[] d = new int[a];
        int[] e = new int[a];
        d = ArraysOperacionesComunes.generarArray(a, b, c);
        e = ArraysOperacionesComunes.volteaArrayInt(d);
        for (int i = 0;i<d.length;i++) {
            System.out.print(d[i]+ " ");
        }
        System.out.println(" ");
        System.out.println("-------------------------");
        System.out.println("El numero mas pequeño del array es: " + ArraysOperacionesComunes.minimoArrayInt(d));
        System.out.println("-------------------------");
        System.out.println("El numero mas grande del array es: " + ArraysOperacionesComunes.maximoArrayInt(d));
        System.out.println("-------------------------");
        System.err.println("La media del array es: " + ArraysOperacionesComunes.mediaArrayInt(d));
        System.out.println("-------------------------");
        System.out.println("El numero esta en el array?: " + ArraysOperacionesComunes.estaEnElArray(d, comprobar));
        System.out.println("-------------------------");
        System.out.println("El numero buscado esta en la posicion: " + ArraysOperacionesComunes.posicionEnArray(d, posicion));
        System.out.println("-------------------------");
        System.out.println("Array al reves: ");
        for (int i = 0;i<d.length;i++) {
            System.out.print(e[i]+ " ");
        }
        entrada.close();
    }
}
