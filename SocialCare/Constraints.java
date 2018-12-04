package SocialCare;

public interface Constraints {
    private long time;
    private int numberOfResponders; // What type should this be? Replace T with the desired type.

    public long getTime() {
        return time;
    }

    public int getNumberOfResponders() { // Replace T with the desired type.
        return numberOfResponders;
    }

    public long setTime(String time) {
        this.time = time;
    }

    public int setNumberOfResponders(int noOfResponders) { // Replace T with the desired type.
        this.noOfResponders = noOfResponders;
    }
}