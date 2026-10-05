class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int n = s.length();
        int i = n - 1;
        int len = 0;

        while (i >= 0 && s.charAt(i) != ' ') {
            len++;
            i--;
        }

        return len;
    }
}
