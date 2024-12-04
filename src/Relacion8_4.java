import java.util.Arrays;

public class Relacion8_4 {
    public static String convierteArrayenString(int[] n) {
        String arai = Arrays.toString(n);
        String araiconvert = "";
    for (int i = 0;i<arai.length();i++){
        switch (arai.charAt(i)) {
            case '0':
                araiconvert+='0';
                break;
            case '1':
                araiconvert+='1';
                break;
            case '2':
                araiconvert+='2';
                break;
            case '3':
                araiconvert+='3';
                break;
            case '4':
                araiconvert+='4';
                break;
            case '5':
                araiconvert+='5';
                break;
            case '6':
                araiconvert+='6';
                break;
            case '7':
                araiconvert+='7';
                break;
            case '8':
                araiconvert+='8';
                break;
            case '9':
                araiconvert+='9';
                break;
            default:
                break;
        }
    }
        return araiconvert;
    }
    public static void main(String[] args) {
            int[] array = {5,7,4,3,6,7};
            String resultado = convierteArrayenString(array);
            System.out.println(resultado);
    }
}
