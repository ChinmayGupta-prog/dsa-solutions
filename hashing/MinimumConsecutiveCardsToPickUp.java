class ConsecutiveCards {
    public int minimumCardPickup(int[] cards) {
        int minCards = Integer.MAX_VALUE;
        Map<Integer,Integer> cardLocation = new HashMap<>();
        for(int i=0;i<cards.length;i++){
            if(cardLocation.containsKey(cards[i])){
                minCards = Math.min(minCards,i-cardLocation.get(cards[i])+1);
            }
            cardLocation.put(cards[i],i);
        }
        if(minCards==Integer.MAX_VALUE)
            return -1;
        return minCards;
            
    }
}
