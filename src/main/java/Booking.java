public class Booking {

    private Bedroom bedroom;
    private int duration;

    public Booking(Bedroom bedroom, int duration) {
        this.bedroom = bedroom;
        this.duration = duration;
    }

    public Bedroom getBedroom() {
        return bedroom;
    }

    public int getDuration() {
        return duration;
    }
}
