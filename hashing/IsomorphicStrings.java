class StringMapping {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> charToChar = new HashMap<>();
        HashSet<Character> seenChar = new HashSet<>();
        for(int i=0;i<s.length();i++){
            char tChar = t.charAt(i);
            char sChar = s.charAt(i);
            if(charToChar.containsKey(sChar)){
                if(charToChar.get(sChar)!=tChar)
                    return false;
            }
            else{
                if(seenChar.contains(tChar))
                    return false;
                charToChar.put(sChar,tChar);
                seenChar.add(tChar);
            }
        }
        return true;
    }
}
