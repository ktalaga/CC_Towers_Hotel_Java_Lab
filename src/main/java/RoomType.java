public enum RoomType {

    SINGLE(1, 35),
    DOUBLE(2, 55),
    TWIN(2, 70),
    FAMILY(4, 110);

    private final int capacity;
    private final int rate;

    RoomType(int capacity, int rate){
        this.capacity = capacity;
        this.rate = rate;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getRate() {
        return rate;
    }
}
