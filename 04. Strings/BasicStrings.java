import java.util.Scanner;
public class BasicStrings {
    public static void printLetters(String name) {
        for(int i = 0; i < name.length(); i++) {
            System.out.print(name.charAt(i) + " ");
        } System.out.println();
    }
    public static void main(String[] args) {
        char arr[] = {'a', 'b', 'c', 'd'};
        String str = "abcd";
        String str2 = new String("wxyz");
        System.out.println(str + " " + str2);

        System.out.println("Enter your name : ");
        Scanner sc = new Scanner(System.in);
        // String name = sc.next();
        String name = sc.nextLine();
        System.out.println("Your name is : " + name);
        System.out.println(name.length());
        printLetters(name);
    }
}