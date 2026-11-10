import java.util.HashMap;
import java.util.Map;

class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.equals(magazine))
            return true;

        Map<Character, Integer> magaCharCount = new HashMap<>();

        for (int i = 0; i < magazine.length(); i++) {
            char c = magazine.charAt(i);
            magaCharCount.put(c, magaCharCount.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            char c = ransomNote.charAt(i);

            if (!magaCharCount.containsKey(c) || magaCharCount.get(c) == 0)
                return false;

            magaCharCount.put(c, magaCharCount.get(c) - 1);
        }

        return true;
    }
}
