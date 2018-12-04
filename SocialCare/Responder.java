package SocialCare;

public class Responder extends Person {
    private String skills;

    public Responder() {
    }

    public Responder(String name, String email, String phoneNumber) {

        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void setName(String name) {

    }

    @Override
    public String getEmail() {
        return null;
    }

    @Override
    public void setEmail(String email) {

    }

    @Override
    public String getPhoneNumber() {
        return null;
    }

    @Override
    public void setPhoneNumber(String phoneNumber) {

    }

    // Not used in this class.
    @Override
    public void giveFeedback(Responder responder) {

    }

    @Override
    public void giveFeedback(Request request) {

    }
}