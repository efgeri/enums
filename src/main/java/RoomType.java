public enum RoomType {
    SINGLE(1),
    DOUBLE(2),
    TRIPLE(3),
    FAMILY(4),
    SMALL(8),
    MEDIUM(12),
    LARGE(16);

    private final int value;

    RoomType(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}


