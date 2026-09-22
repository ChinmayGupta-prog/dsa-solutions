class StartValue {
    public int minStartValue(int[] nums) {
        int minPrefixSum = 0;
        int prefixSum = 0;

        for(int value: nums){
            prefixSum+=value;

            minPrefixSum = Math.min(minPrefixSum,prefixSum);
        }

        return 1-minPrefixSum;
    }
}
