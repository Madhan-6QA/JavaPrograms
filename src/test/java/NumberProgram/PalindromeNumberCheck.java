package NumberProgram;

public class PalindromeNumberCheck {
    public static void main(String[] args) {
        int num = 1221;

        int n= num;
        int res = 0;

        int rem;

        while (num > 0) {
            rem = num % 10;
            res = (res * 10) + rem;
            num = num / 10;
        }
        System.out.println("Palindrome number is " + res);
        if (n == res){
            System.out.printf("The number is %d palindrome ", res);
        } else {

            System.out.printf("The number is %d not palindrome ", res);
        }

    }
}
