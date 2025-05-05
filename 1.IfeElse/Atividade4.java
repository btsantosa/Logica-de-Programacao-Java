import java.util.Scanner;
import java.util.Locale;
public class Atividade4 {
    public static void main(String[] args){
        /*  Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
        hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
        decimais.*/
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        int matricula;
        float horasTrabalhadas;
        float valorHora;

        System.out.println("Digite a matricula do funcionário: ");
        matricula = leitor.nextInt();

        System.out.println("Digite as horas trabalhadas: ");
        horasTrabalhadas = leitor.nextFloat();

        System.out.println("Digite o valor que recebe por hora: ");
        valorHora = leitor.nextFloat();

        double salario = horasTrabalhadas * valorHora;

        System.out.println("Matricula: "+ matricula + " Salario: " + salario);

        leitor.close();

    }
}
