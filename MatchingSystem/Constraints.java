package MatchingSystem;

/**
 * Created by Haubir on 12/20/18.
 */
public abstract class Constraints {
    private String time;
    private int noOfResponders;

    public abstract String getTime();

    public abstract int getNoOfResponders();

    public abstract void setTime(String time);

    public abstract void setNoOfResponders(int noOfResponders);
}
