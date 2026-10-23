class ReverseInteger {
    public int reverse(int x) {
        long inverseDigit = 0;

        while (x != 0) {
            int digit = x % 10;
            inverseDigit = inverseDigit * 10 + digit;
            x /= 10;
        }

        if (inverseDigit < Integer.MIN_VALUE ||
            inverseDigit > Integer.MAX_VALUE)
            return 0;

        return (int) inverseDigit;
    }
}
