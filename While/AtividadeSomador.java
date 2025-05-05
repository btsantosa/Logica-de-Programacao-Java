package While;
import java.util.Scanner;

public class AtividadeSomador {
    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);
        int soma = 0;
        int x = leitor.nextInt();
        while (x != 0){
            soma = soma + x;
            x =leitor.nextInt();
        }
        System.out.println(soma);
    leitor.close();
    }
}
