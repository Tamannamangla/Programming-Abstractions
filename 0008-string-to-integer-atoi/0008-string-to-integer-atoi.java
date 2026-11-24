class Solution {
    public int myAtoi(String s) {
        long a = 0;
        int sign = 1;
        boolean start = false;

        for(char ch : s.toCharArray()) {

            if(ch == ' ' && !start) {
                continue;
            }

            if(ch == '-' && !start) {
                sign = -1;
                start = true;
                continue;
            }

            if(ch == '+' && !start) {
                start = true;
                continue;
            }

            if(ch >= '0' && ch <= '9') {
                start = true;
                int digit = ch - '0';

                if(a > 214748364 || (a == 214748364 && digit > (sign == 1 ? 7 : 8))) {
                    return sign == 1 ? 2147483647 : -2147483648;
                }

                a = a * 10 + digit;
            }
            else {
                break;
            }
        }

        return (int)a * sign;
    }
}