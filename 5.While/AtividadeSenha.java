
import java.util.Scanner;
public class AtividadeSenha {
    public static void main(String[] args){

        /* Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
        incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
        impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002. */
        Scanner leitor = new Scanner(System.in);
        int senhaValida = 2002;        

        while (true){
            System.out.println("Digite a senha: ");
            int senhaUsuario = leitor.nextInt();
            if (senhaUsuario != senhaValida){
                System.out.println("Senha inválida, tente novamente!");

            } else {
                System.out.println("Senha correta! ");
                break;
            }
        }
            
        leitor.close();
        
    

    }
}
