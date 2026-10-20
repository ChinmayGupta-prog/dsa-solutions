class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> h1 = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int first = nums[i];
            int second = target - first;

            if (h1.containsKey(second)) {
                return new int[]{i, h1.get(second)};
            } else {
                h1.put(first, i);
            }
        }

        return new int[]{};
    }
}
