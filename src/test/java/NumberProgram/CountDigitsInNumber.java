package NumberProgram;

public class CountDigitsInNumber {
    public static void main(String[] args) {

        int num = 15345;

        int count = 0;

        while (num > 0) {

            count++;

            num = num / 10;



        }

        System.out.println("Count of digits: " + count);

    }
}
