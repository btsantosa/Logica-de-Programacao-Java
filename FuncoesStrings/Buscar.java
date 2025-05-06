package FuncoesStrings;

public class Buscar {
    public static void main(String[] args) {
        String original = "abcd FGHTJ ABC abc DEFG    ";
        System.out.println("Original: -" + original + "-");
        
        int i = original.indexOf("bc");
        System.out.println("indexOf: -" + i + "-");

        int j = original.lastIndexOf("bc");
        System.out.println("indexOf: -" + j + "-");
    }
}
