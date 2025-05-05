import java.util.Scanner;
import java.util.Locale;
public class Atividade3 {
    public static void main(String[] args){

        // Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
        //código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
        
        Locale.setDefault(Locale.US);
        Scanner caixa = new Scanner(System.in);
        
        int codigoDaPeca1;
        int quantidadePeca1;
        float precoPeca1;
        double resultadoPeca1;

        int codigoDaPeca2;
        int quantidadePeca2;
        float precoPeca2;
        double resultadoPeca2;

        System.out.println("Digie o codigo da peça 1: ");
        codigoDaPeca1 = caixa.nextInt();
        System.out.println("Digite a quantidade: ");
        quantidadePeca1	= caixa.nextInt();
        System.out.println("Digite o preço: ");
        precoPeca1 = caixa.nextFloat();

        double total;

        System.out.println("Digie o codigo da peça 2: ");
        codigoDaPeca2 = caixa.nextInt();
        System.out.println("Digite a quantidade: ");
        quantidadePeca2	= caixa.nextInt();
        System.out.println("Digite o preço: ");
        precoPeca2 = caixa.nextFloat();

        resultadoPeca1 = quantidadePeca1 * precoPeca1;
        System.out.println(resultadoPeca1);

        resultadoPeca2 = quantidadePeca2 * precoPeca2;
        System.out.println(resultadoPeca2);

        total = resultadoPeca1 + resultadoPeca2;

        System.out.printf("O total deu: "+ total);

        caixa.close();
    }
}