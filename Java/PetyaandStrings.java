import java.util.Scanner;

public class PetyaandStrings {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String word1 = input.nextLine();
        String word2 = input.nextLine();

        if (word1.compareToIgnoreCase(word2) >= 1) {
            System.out.println("1");
        } else if (word1.compareToIgnoreCase(word2) <= -1) {
            System.out.println("-1");
        } else {
            System.out.println("0");
        }
        input.close();
    }
}