package SocialCare;

public class Tracker {
    private TrackingObject trackingObject; // Could be either Request or Matcher


    public Tracker(TrackingObject trackingObject) {
        this.trackingObject = trackingObject;
    }

    public TrackingObject getTrackingObject() {
        return trackingObject;
    }

    public void setTrackingObject(TrackingObject trackingObject) {
        this.trackingObject = trackingObject;
    }

    public void trackRequests() {

    }

    public void trackMatcher() {

    }

    public void alertScheduler() {

    }

    public void alertNotifyer() {

    }
}