	import java.util.Scanner;
	public class VogalConsoante {
		public static void main(String[] args) {
		//Faça um Programa que verifique se uma letra digitada é vogal ou consoante.
			Scanner entrada = new Scanner(System.in);
			
			System.out.println("Digite uma letra: ");
			String letra = entrada.next();
			
			if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") 
					|| letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")) {
				System.out.println("Essa letra é uma vogal!");
			
				// length = comprimento, ele retorna o comprimento da palavra digitada
				// != diferente de 1, ou seja, mais que 1 ou menos que um, ele vai dar false
				// Character.isLetter = Verifica se o caractere digitado é uma letra
				// charAt(0) pega o primeiro caractere da string
				// ! (negação): O ! inverte o valor de isLetter. Ou seja, se o isLetter retornar false (não é letra), a negação vai torná-lo true, e o código vai ser executado.
				
			} else if (letra.length() != 1 || Character.isLetter(letra.charAt(0))) {
				System.out.println("Entrada inválida. Digite apenas uma letra.");
				
			} else {
				System.out.println("Essa letra é uma consoante");
			}
			
		entrada.close();		
	}}