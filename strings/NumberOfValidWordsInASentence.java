class Solution {
    public int countValidWords(String sentence) {
        int count = 0;

        String[] words = sentence.trim().split("\\s+");

        for (String word : words) {
            if (isValid(word))
                count++;
        }

        return count;
    }

    private boolean isValid(String word) {
        int hyphen = 0;
        int punctuation = 0;

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            if (Character.isDigit(ch))
                return false;

            if (ch == '-') {
                hyphen++;

                if (hyphen > 1 || i == 0 ||
                    i == word.length() - 1)
                    return false;

                if (!Character.isLetter(word.charAt(i - 1)) ||
                    !Character.isLetter(word.charAt(i + 1)))
                    return false;
            }

            if (ch == '!' || ch == '.' || ch == ',') {
                punctuation++;

                if (punctuation > 1 ||
                    i != word.length() - 1)
                    return false;
            }
        }

        return true;
    }
}
