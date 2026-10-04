import java.util.HashMap;
import java.util.Map;

class LongestSubstringWithAtLeastKRepeatingCharacters {
    public int longestSubstring(String s, int k) {
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            Map<Character, Integer> frequencyMap = new HashMap<>();

            for (int j = i; j < s.length(); j++) {
                char c = s.charAt(j);
                frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);

                boolean flag = true;

                for (int frequency : frequencyMap.values()) {
                    if (frequency < k) {
                        flag = false;
                        break;
                    }
                }

                if (flag) {
                    result = Math.max(result, j - i + 1);
                }
            }
        }

        return result;
    }
}
