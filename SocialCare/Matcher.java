package SocialCare;

public class Matcher implements TrackingObject {

    public void performMatch() {

    }

    public Preference getPreference() {
        return null;
    }

    public Feedback getFeedback(){
        return null;
    }

    public void sendMatch(Notifier notifier, Person recipient) {
        notifier.notify();
    }

    public Response getResponse() {
        return null;
    }


}