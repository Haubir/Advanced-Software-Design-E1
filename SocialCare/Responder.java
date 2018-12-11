package SocialCare;

public class Responder implements Person {
    private String name;
    private String email;
    private String phoneNumber;
    private String paymentInfo;
    private String skills;
    private int starRating; // average
    private int ID;

    public Responder(String name, String email, String phoneNumber, String skills, int ID) {
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public String getName() {
        return null;
    }

    public void setName(String name) {

    }

    public String getEmail() {
        return null;
    }

    public void setEmail(String email) {

    }

    public String getPhoneNumber() {
        return null;
    }

    public void setPhoneNumber(String phoneNumber) {

    }

    public int getStarRating() {
        return starRating;
    }

    public void setStarRating(int starRating) {
        this.starRating = starRating;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public void giveFeedback(int ID) {

    }

    @Override
    public String fetchPaymentInfo() {
        return null;
    }
}