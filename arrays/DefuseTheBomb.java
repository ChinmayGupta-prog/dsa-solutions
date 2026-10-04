class DefuseTheBomb  {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] result = new int[n];

        if (k == 0) {
            return result;
        }

        for (int i = 0; i < n; i++) {
            int sum = 0;

            for (int step = 1; step <= Math.abs(k); step++) {
                int index;

                if (k > 0) {
                    index = (i + step) % n;
                } else {
                    index = (i - step + n) % n;
                }

                sum += code[index];
            }

            result[i] = sum;
        }

        return result;
    }
}
