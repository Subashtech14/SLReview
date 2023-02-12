package CharacterDemo;

import java.util.Arrays;

public class StringtoCharArray {
    public static void main(String[] args) {
        String str="javatpoint";
        char[] ch=str.toCharArray();

        System.out.println("String: "+str);
        System.out.println("char: "+ Arrays.toString(ch));
    }
}
