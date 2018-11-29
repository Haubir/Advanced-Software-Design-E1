package SocialCare;

import java.util.*;

public class Logger {
    private Requester requester;
    private Responder responder;
    private Timestamp timestamp;
    private ArrayList<> decisions;

    public Logger() {

    }

    public Logger(Requester requester, Responder responder, Timestamp timestamp, ArrayList<> decisions) {
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

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public ArrayList<> getDecisions() {
        return decisions;
    }

    public void setDecisions(ArrayList<> decisions) {
        this.decisions = decisions;
    }
}