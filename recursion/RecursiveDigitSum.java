class Result {
    public static int superDigit(String n, int k) {
    // Write your code here
        long sum =0;
        
        for(int i =0;i<n.length();i++){
            sum +=n.charAt(i)-'0';
        }
        
        return superNum(sum*k);
    }
    
    private static int superNum(long value){
        
        if(value<10)
            return  (int)value;
            
        long sum = 0;
        while(value>0){
            sum+=(value%10);
            value/=10;
        }
        return superNum(sum);
    }

}
