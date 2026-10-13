class PalindromeNumber {
    public boolean isPalindrome(int x) {
        long result = 0;
        int old_x = x;

        while (old_x != 0 && x > 0) {
            int rev = old_x % 10;
            result = result * 10 + rev;
            old_x = old_x / 10;
        }

        if (x == result) {
            return true;
        }

        return false;
    }
}
