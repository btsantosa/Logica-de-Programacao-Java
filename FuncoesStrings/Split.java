package FuncoesStrings;

public class Split {
    public static void main(String[] args) {
        String frase = "apple potato lemon";

        String[] vect = frase.split(" ");
        System.out.println(vect[0]);
        System.out.println(vect[1]);
        System.out.println(vect[2]);
    }
}
