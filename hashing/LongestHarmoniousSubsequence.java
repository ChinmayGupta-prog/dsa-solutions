class LongestSubsequence {
    public int findLHS(int[] nums) {
        Map<Integer,Integer> frequencyMap = new HashMap<>();

        for(int num: nums){
            frequencyMap.put(num, frequencyMap.getOrDefault(num,0)+1);
        }

        int maxLength = 0;
        for(int key: frequencyMap.keySet()){
            if(frequencyMap.containsKey(key+1)){
                int currentLength = frequencyMap.get(key) + frequencyMap.get(key+1);
                maxLength = Math.max(maxLength,currentLength);
            }
        }
        return maxLength;   
    }
}
