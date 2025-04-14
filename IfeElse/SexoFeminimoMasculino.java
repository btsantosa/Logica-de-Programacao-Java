import java.util.Scanner;

public class SexoFeminimoMasculino {

	public static void main(String[] args) {
		// Faça um Programa que verifique se uma letra digitada é "F" ou "M". 
		// Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido.
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite F - Feminino ou M - Masculino: ");
		String letra = entrada.nextLine();
		
		if (letra.equalsIgnoreCase("F")) {
			System.out.println("O genero é feminino");
		} else if(letra.equalsIgnoreCase("M")) {
			System.out.println("O genero é masculino");
		} else if(!letra.equalsIgnoreCase("F") && !letra.equalsIgnoreCase("M")) {
			System.out.println("Sexo invalido");
		}
		
		entrada.close();	
}}