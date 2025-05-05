import java.util.Scanner;
public class Atividade2 {
    public static void main(String[] args){
        //Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
        //casas decimais conforme exemplos.
        // Fórmula da área: area = π . raio2
        // Considere o valor de π = 3.14159

        Scanner leitor = new Scanner(System.in);
        double pi = 3.14159;
        double area;
        double raio;

        System.out.println("Digite o raio do circulo: ");
        raio = leitor.nextDouble();

        area = pi * (raio * 2);
        System.out.printf("O raio é: %.4f", area);
        
        leitor.close();
    }
}
