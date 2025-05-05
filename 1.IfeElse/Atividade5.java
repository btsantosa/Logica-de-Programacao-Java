import java.util.Scanner;

public class Atividade5 {
    public static void main(String []args){
        /*Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
        de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).. */
        Scanner leitor = new Scanner(System.in);

        int A = 0;
        int B = 0;
        int C = 0;
        int D = 0;

        System.out.println("Coloque o valor A: ");
        A = leitor.nextInt();
        System.out.println("Coloque o valor B: ");
        B = leitor.nextInt();
        System.out.println("Coloque o valor C: ");
        C = leitor.nextInt();
        System.out.println("Coloque o valor D: ");
        D = leitor.nextInt();

        int diferenca = (A * B - C * D);

        System.out.print("DIFERENCA = " + diferenca);


        leitor.close();
    }
}
