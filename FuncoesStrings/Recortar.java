package FuncoesStrings;

public class Recortar {
    public static void main(String[] args) {
        String original = "abcd FGHTJ ABC abc DEFG    ";
        System.out.println("String original: -" + original + "-");

        // recortar a partir da posição 2 (0, 1, 2)
        String string04 = original.substring(2);
        System.out.println("substring(2): -" + string04 + '-');
        // recortar a partir da posição 2 e antes da posição 7
        String string05 = original.substring(2, 7);
        System.out.println("substring(2, 7): -" + string05 + '-');
    }
}
