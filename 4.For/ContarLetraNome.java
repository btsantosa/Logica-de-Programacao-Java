package For;
import java.util.Scanner;

public class ContarLetraNome {

	public static void main(String[] args) {
		// Contar quantas letras tem cada nome do array:
		
		Scanner leitor = new Scanner(System.in);
		int N = leitor.nextInt();
		int soma = 0;
		
		for (int i = 0; i < N; i++) {
			int x = leitor.nextInt();
			soma = soma + x;
			
		}
		System.out.println(soma);
		leitor.close();
	}
}