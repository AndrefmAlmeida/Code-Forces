import java.util.Scanner;

public class NextRound {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String firstLine = input.nextLine();
        String[] fixedFirstLine = firstLine.split(" ");
        String secondLine = input.nextLine();
        String[] fixedSecondLine = secondLine.split(" ");
        int count = 0;

        for (int i = 0; i < Integer.parseInt(fixedFirstLine[0]); i++) {
            if (Integer.parseInt(fixedSecondLine[i]) >= Integer
                    .parseInt(fixedSecondLine[Integer.parseInt(fixedFirstLine[1]) - 1])
                    && Integer.parseInt(fixedSecondLine[i]) > 0) {
                count++;
            }
        }
        System.out.println(count);
        input.close();
    }
}