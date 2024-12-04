public class Relacion8_5 {
    public static int[] concatena(int[] a,int[] b){
        int cont=-1;
        int[] resultado = new int[a.length + b.length];
        for (int i = 0;i<a.length;i++) {
            resultado[i] = a[i];
            cont++;
        }
        for (int i =0;i<b.length;i++) {
            resultado[cont] = b[i];
            cont++;
        }
        return resultado;
    }
    public static void main(String[] args) {
        int[] a = {7,4,8,3};
        int[] b = {9,2,5,1};
        int[] c = concatena(a, b);
        for (int i = 0; c.length>i;i++) {
            System.err.print(c[i]+"\t");
        }
    }
}
