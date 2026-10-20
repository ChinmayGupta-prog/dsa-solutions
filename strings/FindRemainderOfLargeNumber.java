class FindRemainderOfLargeNumber {

    public int findRemainder(String n, int k) {
        int rem = 0;

        for (int i = 0; i < n.length(); i++) {
            int digit = n.charAt(i) - '0';

            rem = (int) (((long) rem * 10 + digit) % k);
        }

        return rem;
    }
}
