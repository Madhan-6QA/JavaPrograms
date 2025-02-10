package NumberProgram;

public class ProductOfDigits {
    public static void main(String[] args) {
        int num = 153;

        int res=1;

        int rem;

        while (num > 0) {

            rem = num % 10;

            res = res * rem;

            num = num / 10;

        }

        System.out.println("Product of digits: "+res);

    }
}
