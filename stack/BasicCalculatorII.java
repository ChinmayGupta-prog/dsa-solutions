class BasicCalculatorII {
    public int calculate(String s) {
        if (s == null || s.length() == 0)
            return 0;

        int length = s.length();
        int currentNumber = 0;
        int lastNumber = 0;
        int result = 0;
        char operator = '+';

        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);

            if (Character.isDigit(c)) {
                currentNumber = currentNumber * 10 + (c - '0');
            }

            if ((!Character.isDigit(c) && c != ' ') ||
                i == length - 1) {

                if (operator == '+' || operator == '-') {
                    result += lastNumber;
                    lastNumber = (operator == '+')
                        ? currentNumber : -currentNumber;
                } else if (operator == '*') {
                    lastNumber = lastNumber * currentNumber;
                } else if (operator == '/') {
                    lastNumber = lastNumber / currentNumber;
                }

                operator = c;
                currentNumber = 0;
            }
        }

        result += lastNumber;
        return result;
    }
}
