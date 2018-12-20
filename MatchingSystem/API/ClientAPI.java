package MatchingSystem.API;

import MatchingSystem.Request;

/**
 * Created by Haubir on 12/19/18.
 */
public interface ClientAPI {

    public void delegateUserInfo();

    public void delegateNotifications();

    public void sendSchedules();

    public void delegateRequest(Request request);
}
