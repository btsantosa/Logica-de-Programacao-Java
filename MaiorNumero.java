import java.util.Scanner;  
import java.util.Locale; 
public class MaiorNumero {
    public static void main(String[]args){

        // Faça um Programa que peça dois números e imprima o maior deles.

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int primeiroNumero = entrada.nextInt();
        System.out.println("Digite o segundo número: ");
        int segundoNumero = entrada.nextInt();

        if (primeiroNumero > segundoNumero ){
            System.out.println("O prmeiro númeor é maior que o segundo");
        } else if (segundoNumero > primeiroNumero){
            System.out.println("O segundo número é maior que o primeiro");
        } 

        entrada.close();
    }
}
