package SocialCare;

public class Matcher implements TrackingObject {
    private String status;

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


    @Override
    public String getStatus() {
        return this.status;
    }

    @Override
    public Boolean validStatus(String status) {
        return null;
    }
}