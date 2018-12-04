package SocialCare;


public class Requester extends Person {


    public Requester() {

    }

    public void pay(PaymentSystem paymentSystem) {
	paymentSystem.makePayment(this);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getEmail() {
        return this.email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    @Override
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void giveFeedback(Responder responder) {

    }

    // Not used in this class.
    @Override
    public void giveFeedback(Request request) {

    }
}
