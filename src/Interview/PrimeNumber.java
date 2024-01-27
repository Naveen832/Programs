package Interview;

public class PrimeNumber {
    public static void main(String[] args) {
        int a = 12;
        boolean flag = false;
        for (int i = 2; i <= a / 2; i++) {
            if (a % i == 0) {
                flag = false;
                break;
            }
        }


        if (!flag) {
            System.out.println(" not prime number");
        } else {
            System.out.println(" prime numb er");
        }

    }
}
