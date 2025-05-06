package While;
import java.util.Scanner;

public class AtividadeWhile2 {
    public static void main(String[] args){
        /* Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
        cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
        menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma). */

        Scanner leitor = new Scanner(System.in);

        int x;
        int y;
        
        System.out.println("Escreva coordenada X: ");
        x = leitor.nextInt();
        System.out.println("Escre coordenada Y: ");
        y = leitor.nextInt();

        while ( x != 0 && y != 0){
            if (x > 0 && y > 0){
                System.out.println("primeira");
            } else if (x < 0 && y > 0){
                System.out.println("segunda");
            } else if (x < 0 && y < 0){
                System.out.println("terceira");
            } else {
                System.out.println("quarto");
            }
            x = leitor.nextInt();
            y = leitor.nextInt();
        }
           

        leitor.close();

    }
    
}
