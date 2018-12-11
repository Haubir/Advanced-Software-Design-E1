package SocialCare;

import java.util.HashMap;

public class Scheduler {
	private HashMap<Integer,Request> queue;

    public Scheduler() {
        this.queue = new HashMap<Integer, Request>();
    }

    public void scheduleRequest(Request request, String timeToPost) {

    }

    public void post() {

    }

    public Request getRequest(int ID) {
    	return this.queue.get(ID);
    }

    public void sortQueue() {

    }

}