import java.util.HashSet;
import java.util.Set;

class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> unique = new HashSet<>();

        for (int e : nums) {
            if (!unique.add(e))
                return true;
        }

        return false;
    }
}
