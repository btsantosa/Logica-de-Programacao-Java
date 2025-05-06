package FuncoesStrings;
public class Substituir {
    public static void main(String[] args) {
        String original = "abcd FGHTJ ABC abc DEFG    ";
        System.out.println("String original: -" + original + "-");

        String string06 = original.replace('a', 'x');
        System.out.println("replace('a', 'x'): -" + string06 + '-');

        String string07 = original.replace("abc", "xy");
        System.out.println("replace(\"abc\", \"xy\"): -" + string07 + '-');
    }
}
