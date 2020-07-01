import java.util.Scanner;

public class Watermelon {

    public static final void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        if (m >= 1 & m <= 100) {
            if (m == 2) {
                System.out.println("NO");
            } else if (m % 2 == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } else {
            System.out.println("NO");
        }
        input.close();
    }
}