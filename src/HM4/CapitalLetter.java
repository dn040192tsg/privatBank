package HM4;


import java.util.StringTokenizer;

public class CapitalLetter {
    public static void main(String[] args) {

        String s = "Истина — это то, что выдерживает проверку опытом. Эйнштейн А.";

        StringTokenizer tokenizer = new StringTokenizer(s);
        StringBuilder stringBuilder = new StringBuilder();

        while (tokenizer.hasMoreTokens()){
            String q = tokenizer.nextToken();
            stringBuilder.append(FirstUpperCase(q) + " ");
        }
        System.out.println(stringBuilder);

    }

    public static String FirstUpperCase (String s){
        if (s == null || s.isEmpty()) return "";
        return s.toUpperCase().substring(0,1).toUpperCase() + s.substring(1);
    }
}
