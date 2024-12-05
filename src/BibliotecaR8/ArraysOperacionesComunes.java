package BibliotecaR8;
public class ArraysOperacionesComunes {
    public static int[] generarArray (int n,int max, int min) {
        int[] resultado = new int[n];
        for (int i = 0;i<resultado.length;i++) {
        resultado[i] = (int) (Math.random()*(max-min)+min);
        }
        return resultado;
    }
    public static int minimoArrayInt (int[] a) {
        int resultado=99999999;
        for (int i = 0;i<a.length;i++) {
            if (a[i] < resultado) {
                resultado = a[i];
            }
        }
        return resultado;
    }
    public static int maximoArrayInt (int[] a) {
        int resultado=0;
        for (int i = 0;i<a.length;i++) {
            if (a[i] > resultado) {
                resultado = a[i];
            }
        }
        return resultado;
    }
    public static double mediaArrayInt (int[] a) {
        double suma=0;
        int longitud = a.length; 
        for (int i = 0;i<longitud;i++) {
            suma += a[i];
        }
        double media = suma/longitud;
        return media;
    }
    public static boolean estaEnElArray (int[] a, int n) {
        boolean está = false; 
        for (int i = 0; i<a.length;i++) {
            if (a[i] == n) {
                está = true;
            }
        }
        return está;
    }
    public static int posicionEnArray (int[] a, int n) {
        int resultado = 0;
        for (int i = 0; i<a.length; i++) {
            if (a[i] == n) {
                resultado = i+1;
            }
        }
        return resultado;
    }
    public static int[] volteaArrayInt(int[] a) {
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) { // Recorremos el array original
            b[i] = a[a.length - 1 - i]; // Asignamos valores desde el final de `a` al principio de `b`
        }
        return b;
    }    
}
