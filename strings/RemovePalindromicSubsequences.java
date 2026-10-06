class RemovePalindromicSubsequences{
    public int removePalindromeSub(String s) {
        String reversed = new StringBuilder(s)
                .reverse()
                .toString();

        if (s.equals(reversed)) {
            return 1;
        }

        return 2;
    }
}
