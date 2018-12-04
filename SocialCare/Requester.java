package SocialCare;


public class Requester implements Person {


    public Requester() {

    }

    public void pay(PaymentSystem paymentSystem) {
	paymentSystem.makePayment(this);
    }

    @Override
    public void giveFeedback(Responder responder) {

    }
}
