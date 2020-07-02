import java.util.Scanner;

public class Team {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        int count = 0;
        int c = 0;

        for (int i = 0; i < n; i++) {
            String check = input.nextLine();
            String[] newCheck = check.split(" ");

            for (int j = 0; j < newCheck.length; j++) {
                if (newCheck[j].equals("1")) {
                    c++;
                }
            }
            if (c >= 2) {
                count++;
                c = 0;
            } else {
                c = 0;
            }

        }

        System.out.println(count);

        input.close();
    }
}