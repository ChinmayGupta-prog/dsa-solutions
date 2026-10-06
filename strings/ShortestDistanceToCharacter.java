class ShortestDistanceToCharacter {
    public int[] shortestToChar(String s, char c) {
        int n = s.length();
        int[] answer = new int[n];

        for (int i = 0; i < n; i++) {
            int minDistance = n;

            for (int j = 0; j < n; j++) {
                if (s.charAt(j) == c) {
                    minDistance = Math.min(minDistance, Math.abs(i - j));
                }
            }

            answer[i] = minDistance;
        }

        return answer;
    }
}
