class PatternString {
    public boolean wordPattern(String pattern, String s) {
        String words[] = s.split("\\s");
        if(words.length != pattern.length())
            return false;
        Map<Character,String> charToWord = new HashMap<>();
        Set<String> seenWords = new HashSet<>();
        for(int i=0;i<pattern.length();i++){
            char ch = pattern.charAt(i);
            String w = words[i];
            if(charToWord.containsKey(ch)){
                if(!charToWord.get(ch).equals(w))
                    return false;
            }
            else{
                if(seenWords.contains(w))
                    return false;
                charToWord.put(ch,w);
                seenWords.add(w);
            }
        }
        return true;
    }
}
