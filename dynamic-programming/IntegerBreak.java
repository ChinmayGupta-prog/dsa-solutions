class BreakValue {
    private int t[];
    private int searchBreak(int n){
        if(n == 1)
            return 1;
        
        if(t[n] !=-1)
            return t[n];
        
        
        int result = Integer.MIN_VALUE;


        for(int i=1;i<=n-1;i++){

            int prod = i* Math.max(n-i, searchBreak(n-i));
            result = Math.max(prod,result);
        }
        return t[n] = result;
    }
    public int integerBreak(int n) {
        t = new int[59];
        Arrays.fill(t,-1);
        return searchBreak(n);
    }
}
