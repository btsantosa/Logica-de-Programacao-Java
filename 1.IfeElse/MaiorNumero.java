import java.util.Locale;
import java.util.Scanner;  
public class MaiorNumero {
    public static void main(String[]args){

        // Faça um Programa que peça dois números e imprima o maior deles.
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        float primeiroNumero = entrada.nextFloat();
        System.out.println("Digite o segundo número: ");
        float segundoNumero = entrada.nextFloat();

        if (primeiroNumero > segundoNumero ){
            System.out.println("O prmeiro númeor é maior que o segundo");
        } else if (segundoNumero > primeiroNumero){
            System.out.println("O segundo número é maior que o primeiro");
        } 

        entrada.close();
    }
}
