class ExcelSheetColumnNumber {
    public int titleToNumber(String columnTitle) {
        long sum = 0;

        for (char column : columnTitle.toCharArray()) {
            sum = sum * 26 + (column - 'A') + 1;
        }

        return (int) sum;
    }
}
