package SocialCare;

public class Responder implements Person {
    private String skills;

    public Responder() {
    }

    public Responder(String name, String email, String phonenumber) {

        this.name = name;
        this.email = email;
        this.phonenumber = phonenumber;
    }

    @Override
    public void giveFeedback(Request request) {

    }

}