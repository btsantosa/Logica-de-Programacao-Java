
import java.util.Scanner;
public class AtividadePostoGasolina {
    public static void main(String[] args){
        /*Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
        um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
        4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
        que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
        mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
        exemplo. */

        int alcool = 1;
        int gasolina = 2;
        int diesel = 3;
        int fim = 4;
        int escolha;

        Scanner leitor = new Scanner(System.in);

        while(true){
            System.out.println("Menu");
            System.out.println("1.Alcool");
            System.out.println("2.Gasolina");
            System.out.println("3.Diesel");
            System.out.println("4.Fim");

            System.out.println("Escolha uma das opções: ");
            escolha = leitor.nextInt();

            if (escolha == 1){
                escolha = alcool;
            }
        }

    }
}
