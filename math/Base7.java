class Base7 {
  public String convertToBase7(int num) {
        if (num == 0) return "0";

        StringBuilder result = new StringBuilder();
        boolean isNegative = num < 0;
        int n = Math.abs(num);

        while (n > 0) {
            result.append(n % 7);
            n /= 7;
        }

        if (isNegative) {
            result.append('-');
        }

        return result.reverse().toString();
    }
}
