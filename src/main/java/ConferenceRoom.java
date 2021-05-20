public class ConferenceRoom extends Room{

    private String name;
    private boolean catering;
    private int capacity;

    public ConferenceRoom(String name, int capacity, boolean catering) {
        super();
        this.name = name;
        this.catering = catering;
        this.capacity = capacity;
    }

    public String getConferenceRoomName() {
        return name;
    }

    public boolean getConferenceRoomCatering() {
        return catering;
    }

    public void setCatering(boolean catering) {
        this.catering = catering;
    }

    public int getConferenceRoomCapacity() {
        return capacity;
    }

    public void setConferenceRoomCapacity(int capacity) {
        this.capacity = capacity;
    }
}
