class Unique {
    public char findTheDifference(String s, String t) {
        
        if(s.length()==0)
            return t.charAt(0);
        int countChar[] = new int[26];
        for(int i=0;i<s.length();i++){
            countChar[s.charAt(i)-'a']++;
        }
        char result = ' ';
        for(int j=0;j<t.length();j++){
            char ch = t.charAt(j);
            if(countChar[ch-'a']!=0)
                countChar[ch-'a']--;
            else{
                result = t.charAt(j);
                break;
            }
        }
        return result;
    }
}
