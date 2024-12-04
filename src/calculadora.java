import java.util.Scanner;
public class calculadora {
    
    static int suma (int a, int b) {
        int resultado = a + b;
        return resultado;
    }
    static int resta (int a, int b) {
        int resultado = a - b;
        return resultado;
    }
    static int multiplicacion (int a, int b) {
        int resultado = a * b;
        return resultado;
    }
    static int division (int a, int b) {
        int resultado = a / b;
        return resultado;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num1,num2;
        num1 = entrada.nextInt();
        entrada.nextLine();
        num2 = entrada.nextInt();
        int num3 = suma(num1,num2);
        int num4 = resta(num1, num2);
        int num5 = multiplicacion(num1, num2);
        int num6 = division(num1, num2);
        System.out.println(num3 +" "+ num4 +" "+ num5 +" "+ num6);
        entrada.close();
    }
}
