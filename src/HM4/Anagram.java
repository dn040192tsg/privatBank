package HM4;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        String s1 = "Я в мире — сирота.";
        
        String s2 = "Я в Риме — Ариост.";

        System.out.println("результат сравнения анограм - " + anagramCheck (s1, s2));
    }

    public static boolean anagramCheck (String a, String b){

        a = a.replaceAll("[^А-Яа-я]", "").toLowerCase();
        b = b.replaceAll("[^А-Яа-я]", "").toLowerCase();

        char[] chars1 = a.toCharArray();
        char[] chars2 = b.toCharArray();

        Arrays.sort(chars1);
        Arrays.sort(chars2);

        return String.valueOf (chars1).equals(String.valueOf (chars2));
    }
}
