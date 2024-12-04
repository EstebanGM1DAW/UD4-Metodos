public class calcularCubo {
    public static int cubo (int a) {
        int cubo = a*a;
        return cubo;
    }
    public static void main(String[] args) {
        int num1 = 9;
        int cuboNum = cubo(num1);
        System.out.println("El cubo de "+ num1+" es "+cuboNum);
    }
}
