class ValidPalindrome {
    public boolean isPalindrome(String s) {
        for (int i = 0, j = s.length() - 1; i < j;) {
            char ch = s.charAt(i);
            char ch2 = s.charAt(j);

            if (!Character.isLetterOrDigit(ch)) {
                i++;
            } else if (!Character.isLetterOrDigit(ch2)) {
                j--;
            } else {
                if (Character.toLowerCase(ch) != Character.toLowerCase(ch2)) {
                    return false;
                }

                i++;
                j--;
            }
        }

        return true;
    }
}
