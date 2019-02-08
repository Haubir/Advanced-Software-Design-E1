/*
 * Project: Advanced-Software-Design-E1 
 * Class:   Tracker
 *
 * Version info
 * Created: 12/20/18
 * Creator: Haubir Mariwani
 *
 * Copyright notice
 * Property of Fasbros IT. Do not copy, alter, distribute, or sell in any way unless given explicit permission.
 */

package MatchingSystem;

/**
 * Class summary.
 * <p>
 * Class Description.
 * </p>
 *
 * @author Haubir Mariwani <haubir.mariwani@fasbros.it>
 * @version JDK 1.8
 * @since JDK 1.8
 */
public class Tracker {
    private Request request;

    public Tracker(Request request) {
        this.request = request;
        track(this.request);
    }

    public Request getRequest() {
        return request;
    }

    public void setRequest(Request request) {
        this.request = request;
    }

    private void track(Request request) {}
}