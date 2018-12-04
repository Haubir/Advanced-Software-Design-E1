package SocialCare;

public abstract class Person {
    protected String name;
    protected String email;
    protected String phoneNumber;
    protected int starRating; // average


    abstract String getName();

    abstract void setName(String name);

    abstract String getEmail();

    abstract void setEmail(String email);

    abstract String getPhoneNumber();

    abstract void setPhoneNumber(String phoneNumber);

    abstract void giveFeedback(Responder responder);

    abstract void giveFeedback(Request request);
}