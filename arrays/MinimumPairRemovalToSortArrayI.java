import java.util.ArrayList;
import java.util.List;

class MinimumPairRemovalToSortArrayI {
    public int minimumPairRemoval(int[] nums) {
        List<Integer> list = new ArrayList<>();

        for (int num : nums) {
            list.add(num);
        }

        int operations = 0;

        while (!isSorted(list)) {
            int minSum = Integer.MAX_VALUE;
            int pairIndex = -1;

            for (int i = 0; i < list.size() - 1; i++) {
                int sum = list.get(i) + list.get(i + 1);

                // Strict < keeps the leftmost pair when sums tie.
                if (sum < minSum) {
                    minSum = sum;
                    pairIndex = i;
                }
            }

            list.set(pairIndex, minSum);
            list.remove(pairIndex + 1);

            operations++;
        }

        return operations;
    }

    private boolean isSorted(List<Integer> list) {
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < list.get(i - 1)) {
                return false;
            }
        }

        return true;
    }
}
