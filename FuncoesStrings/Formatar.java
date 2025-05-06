package FuncoesStrings;

public class Formatar {
    public static void main(String[] args) {
        String original = "abcd FGHTJ ABC abc DEFG    ";
        System.out.println("String original: -" + original + "-");

        String string01 = original.toLowerCase();
        System.out.println("toLowerCase: -" + string01 + '-');
        
        String string02 = original.toUpperCase();
        System.out.println("toUpperCase: -"+ string02 + "-");

        String string03 = original.trim();
        System.out.println("trim: -"+ string03 + "-");
    }
}
