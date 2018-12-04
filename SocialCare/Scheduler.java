package SocialCare;

import java.util.HashMap;

public class Scheduler {
	private HashMap<ID,Request> queue;

    public Scheduler() {

    }

    public void scheduleRequest(Request request, String timeToPost) {

    }

    public void post() {
        // 1. send to matcher
        Request toPost = this.queue.top();
        toPost.setStatus("Posted");
    }

    public Request getRequest(int ID) {
    	// TODO: First check if the ID exists in the queue.
    	return this.queue.get(ID);
    }

    public void sortQueue() {

    }

}