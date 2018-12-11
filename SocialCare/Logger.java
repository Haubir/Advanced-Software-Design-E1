package SocialCare;

import java.util.ArrayList;

public class Logger {
    private Request request;
    private Requester requester;
    private Responder responder;
    private String timestamp;
    private ArrayList<String> decisions; // String type should probably be changed to a more suitable type

    public Logger(Request request, Requester requester, Responder responder, String timestamp, ArrayList<String> decisions) {
        this.request = request;
        this.requester = requester;
        this.responder = responder;
        this.timestamp = timestamp;
        this.decisions = decisions;
    }

    public Requester getRequester() {
        return requester;
    }

    public void setRequester(Requester requester) {
        this.requester = requester;
    }

    public Responder getResponder() {
        return responder;
    }

    public void setResponder(Responder responder) {
        this.responder = responder;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public ArrayList<String> getDecisions() {
        return decisions;
    }

    public void setDecisions(ArrayList<String> decisions) {
        this.decisions = decisions;
    }
}