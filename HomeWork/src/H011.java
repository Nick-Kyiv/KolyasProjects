package src;

//- удалить из предложения слова которые повторяются. (Слова разделенны одним пробелом)

import java.util.Arrays;

public class H011 {
    public static void main(String[] args) {
        String str = "m k m l g f j k m f h g d t r e w q a s d f g h j k l";
        String[] strs = str.split(" "), strsNew;
        System.out.println("String str(\"" + str + "\")." + "\nBefore (String[] strs): " + Arrays.toString(strs) + ".");
        String[] stringEnd = new String[];
        int i;
        for (String str1 : strs) {
            for (String str2 : strs) {
                if (!(str1).equals(str2)) {
                    for (String strEnd : stringEnd) {
                        strEnd = str1;
                    }
                };
            }
        }
    }
}

