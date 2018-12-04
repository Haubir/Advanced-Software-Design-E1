package SocialCare;

public abstract class Constraints {
    protected String time;
    protected int numberOfResponders; // What type should this be? Replace T with the desired type.

    abstract String getTime();

    abstract int getNumberOfResponders();

    abstract void setTime(String time);

    abstract void setNumberOfResponders(int numberOfResponders);
}