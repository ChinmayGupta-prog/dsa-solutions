class Altitude {
    public int largestAltitude(int[] gain) {
        int maxAltitude = 0;
        int netAltitude = 0;

        for (int value : gain) {
            netAltitude += value;
            maxAltitude = Math.max(maxAltitude, netAltitude);
        }

        return maxAltitude;
    }
}
