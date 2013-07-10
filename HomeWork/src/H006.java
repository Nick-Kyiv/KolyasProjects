package src;

//- найти самое длинное слово в строке(разделенное одним пробелом)
public class H006 {
    public static final String SEPARATOR = " ";

    public static void main(String[] args) {
        String string = "heoworld l hho la";
        String[] words = string.split(SEPARATOR);
        System.out.println(string.length());
        String max, min;
        max = min = words[0];
        int maxN = 0, minN = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > max.length()) {
                max = words[i];
                maxN = i;
            }
            if (words[i].length() < min.length()) {
                min = words[i];
                minN = i;
            }
        }
        System.out.println("max = " + max + '\n' + "min = " + min);
        max = words[minN];
        min = words[maxN];
        System.out.println("maxChanged = " + max + '\n' + "minChanged = " + min);
    }
}

