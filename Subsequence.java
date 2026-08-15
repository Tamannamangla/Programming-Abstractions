import java.util.Scanner;

class Subsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String q = sc.nextLine();
        sub(q, "");
        sc.close();
    }

    public static void sub(String q, String ans) {
        if (q.length() == 0) {
            System.out.println(ans);
            return;
        }
        sub(q.substring(1), ans + "");
        sub(q.substring(1), ans + q.charAt(0));
    }
}
