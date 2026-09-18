class MisMatch {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int sum = n*(n+1)/2;
        int numSum = 0;
        for(int i=0;i<nums.length;i++){
            numSum+=nums[i];
        }
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int duplicate = 0;
        for(int i=0;i<nums.length;i++){
            if(map.get(nums[i])>1){
                duplicate = nums[i];
                break;
            }
        }
        int missing = sum - (numSum-duplicate);
        return new int[]{duplicate,missing};

    }
}
