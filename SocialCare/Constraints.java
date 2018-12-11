package SocialCare;

public abstract class Constraints {
    protected String time;
    protected int numberOfResponders;

    abstract String getTime();

    abstract int getNumberOfResponders();

    abstract void setTime(String time);

    abstract void setNumberOfResponders(int numberOfResponders);
}