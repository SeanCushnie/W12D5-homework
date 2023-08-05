public enum PlaneType {



    BOEING747(100, 500),
    PAPER(1,1);
    private int capacity;
    private int total_weight;
    PlaneType(int capacity, int total_weight) {
        this.capacity = capacity;
        this.total_weight = total_weight;
    }

    public int getCapacity()
    {
        return capacity;
    }

    public int getTotal_weight()
    {
        return total_weight;
    }
}
