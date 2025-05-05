package DoWhile;
import java.util.Scanner;

public class exemplodowhile {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		double celsius = 0;
		double fahrenheit = 0;
		char resposta = 's';
		
		
		do { System.out.println("Digite a temperatura em Celsius: ");
		celsius = leitor.nextDouble();
		fahrenheit = (celsius * 1.8) + 32;
		System.out.println("Equivalente em fahrenheit: " + fahrenheit);
		System.out.println("Deseja repeitir? s/n: ");
		resposta = leitor.next().charAt(0);
		} while(resposta != 'n');
		
		leitor.close();
	}
}
	
		