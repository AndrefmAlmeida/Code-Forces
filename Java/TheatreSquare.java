import java.util.Scanner;

public class TheatreSquare {

    public static final void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter(" ");
        String in = input.nextLine();
        String[] t = in.split(" ");

        long n = Integer.parseInt(t[0]);
        long m = Integer.parseInt(t[1]);
        long a = Integer.parseInt(t[2]);

        System.out.println("aqui: " + (n * m) / (a * a));
        System.out.println((12 * 13) / (4 * 4));
        System.out.println((12 * 13) % (4 * 4));

        if ((n * m) % (a * a) == 0) {
            System.out.println((n * m) / (a * a));
        } else if ((n * m) / (a * a) == 0) {
            System.out.println("1");
        } else if ((n * m) % (a * a) == 0.75) {
            System.out.println((n * m) / (a * a) + 3);
        } else {
            System.out.println((n * m) / (a * a) + 2);
        }

        input.close();
    }

}