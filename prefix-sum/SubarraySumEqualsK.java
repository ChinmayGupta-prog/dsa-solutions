class Subarray {
    public int subarraySum(int[] nums, int k) {
        int[] prefixSum = new int[nums.length];
        prefixSum[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            prefixSum[i] = nums[i]+prefixSum[i-1];
        }
        int count =0;
        Map<Integer,Integer> prefixCount = new  HashMap<>();
        for(int j=0;j<nums.length;j++){
            if(prefixSum[j]==k)
                count++;

            int value = prefixSum[j]-k;
            if(prefixCount.containsKey(value))
                count += prefixCount.get(value);
            prefixCount.put(prefixSum[j],prefixCount.getOrDefault(prefixSum[j],0)+1);
            
        }
        return count;
    }
}
