import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args){
        // Faça um programa para ler dois valores inteiros, e depois mostrar na tela a 
        //soma desses números com uma mensagem explicativa, conforme exemplos.
        Scanner leitor = new Scanner(System.in);

        int numero1;
        int numero2;
        int resultado;

        System.out.println("Digite um numero inteiro: ");
        numero1 = leitor.nextInt();
        System.out.println("Digite outro numero inteiro: ");
        numero2 = leitor.nextInt();
        
        resultado = numero1 + numero2;

        System.out.println("A soma dos números é: " + resultado);



        leitor.close();
    }
    
}
