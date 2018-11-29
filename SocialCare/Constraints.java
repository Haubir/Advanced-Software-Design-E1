package SocialCare;

public interface Constraints {
    private long time;
    private T noofresponders; // What type should this be? Replace T with the desired type.

    public long getTime() {
        return time;
    }

    public T getNOR() { // Replace T with the desired type.
        return noofresponders;
    }
}