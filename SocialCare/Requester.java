package SocialCare;


public class Requester implements Person {
    private String name;
    private String email;
    private String phoneNumber;
    private String paymentInfo;
    private int starRating; // average
    private int ID;

    public Requester(String name, String email, String phoneNumber, int ID) {

    }

    public void pay(PaymentSystem paymentSystem) {
	paymentSystem.makePayment(this);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getStarRating() {
        return starRating;
    }

    public void setStarRating(int starRating) {
        this.starRating = starRating;
    }

    public void giveFeedback(Responder responder) {

    }


    @Override
    public void giveFeedback(int ID) {

    }

    @Override
    public String fetchPaymentInfo() {
        return null;
    }

}
