package MatchingSystem.API;

import MatchingSystem.Request;

/**
 * Created by Haubir on 12/19/18.
 */
public abstract class SchedulerAPI {

    public abstract void gatherRequestInfo(Request request);

    public abstract void sendRequestInfo(Request request);
}
