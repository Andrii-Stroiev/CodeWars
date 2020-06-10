public class Vowels {
    public static int getCount(String str) {
        int vowelsCount = 0;
        for (int i = 0; i < str.toCharArray().length; i++) {
            if (str.toCharArray()[i] == 'a' ||
                    str.toCharArray()[i] == 'o' ||
                    str.toCharArray()[i] == 'e'||
                    str.toCharArray()[i] == 'e' ||
                    str.toCharArray()[i] == 'u')  vowelsCount++;
        }
        return vowelsCount;
    }


}
