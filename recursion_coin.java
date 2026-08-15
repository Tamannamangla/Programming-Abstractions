
import java.util.Scanner;

class Recursion_coin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        coin(n, "");
    }

    public static void coin(int n, String ans) {
        if (n == 0) {
            System.out.println(ans);
            return;
        }

        coin(n - 1, ans + "H");
        coin(n - 1, ans + "T");
    }
}
