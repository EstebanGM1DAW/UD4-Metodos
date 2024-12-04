import java.util.Scanner;

public class Relacion8_3 {
    public static String figura (int n) {
        String fig="";
        for(int i = n;i>0;i--){
            for (int j=0;j<i;j++){
                fig+="*";
            }
            fig+='\n';
        }
        return fig;
        
    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Como de larga la figura?");
        int figura = entrada.nextInt();
        String resultado = figura(figura);
        System.out.println(resultado);
        entrada.close();
    }
}
