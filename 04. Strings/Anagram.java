import java.util.Arrays;
public class Anagram {
    public static void isAnagram(String str, String str2) {
        str = str.toLowerCase();
        str2 = str2.toLowerCase();

        if(str.length() != str2.length()) {
            System.out.println("Not an Anagram...! Length is not equal");
            return;
        }

        char[] s1 = str.toCharArray();
        char[] s2 = str2.toCharArray();

        Arrays.sort(s1);
        Arrays.sort(s2);

        if(Arrays.equals(s1, s2)) {
            System.out.println("Is an Anagram...!");
        } else {
            System.out.println("Not an Anagram...!");
        }
    }
    public static void main(String[] args) {
        String str = "Earth";
        String str2 = "Heart";
        isAnagram(str, str2);
    }
}