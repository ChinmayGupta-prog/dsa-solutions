class ReverseStringII {
    public String reverseStr(String s, int k) {
        char stringToChar[] = s.toCharArray();

        for(int i=0;i<stringToChar.length;i+=(2*k)){
            int l =i;
            int r = Math.min(i+k-1,stringToChar.length-1);
            while(l<r){
                char temp = stringToChar[l];
                stringToChar[l] = stringToChar[r];
                stringToChar[r] = temp;
                l++;
                r--;
            }
        }
        return new String(stringToChar);   
    }
}
