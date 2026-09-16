class EquivalentPairs {
    public int numEquivDominoPairs(int[][] dominoes) {
        int pairsValue[] = new int[100];
        int result = 0;
        for(int i=0;i<dominoes.length;i++){
            if(dominoes[i][0]>dominoes[i][1]){
                int value = dominoes[i][0];
                dominoes[i][0] = dominoes[i][1];
                dominoes[i][1] = value;
            }
            int pairProduct = dominoes[i][0] * 10 + dominoes[i][1];
            result += pairsValue[pairProduct];
            pairsValue[pairProduct]++;
        }
        return result;
    }
}
