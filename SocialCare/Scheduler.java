package SocialCare;

import java.util.HashMap;

public class Scheduler {
	private HashMap<Integer,Request> queue;

    public Scheduler() {

    }

    public void scheduleRequest(Request request, String timeToPost) {

    }

    public void post() {
        // 1. Fetch the Request
        Request toPost = this.queue.get(0); // TODO: This line should always return the first Request in the HashMap.
        // 2. Send to the matcher
        // TODO
        // 3. Change status to "Pending"
        toPost.setStatus("Posted");
    }

    public Request getRequest(int ID) {
    	// TODO: First check if the ID exists in the queue.
    	return this.queue.get(ID);
    }

    public void sortQueue() {

    }

}