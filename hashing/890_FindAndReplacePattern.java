class FindReplace {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> result = new ArrayList<>();
        Map<Character,Character> charToChar = new HashMap<>();
        Set<Character> seenChar = new HashSet<>();
        for(int i=0;i<words.length;i++){
            String word = words[i];
            boolean flag = true;
            for(int j=0;j<word.length();j++){
                char wordChar = word.charAt(j);
                char pattChar = pattern.charAt(j);
                if(charToChar.containsKey(pattChar)){
                    if(charToChar.get(pattChar)!=wordChar){
                        flag = false;
                        break;
                    }
                }
                else{
                    if(seenChar.contains(wordChar)){
                        flag=false;
                        break;
                    }
                    charToChar.put(pattChar,wordChar);
                        seenChar.add(wordChar);
                }
            }
            if(flag)
                result.add(word);
            charToChar.clear();
            seenChar.clear();
        }
        return result;
        
    }
}
