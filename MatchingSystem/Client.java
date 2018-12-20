/*
 * Project: Advanced-Software-Design-E1 
 * Class:   Client
 *
 * Version info
 * Created: 12/20/18
 * Creator: Haubir Mariwani
 *
 * Copyright notice
 * Property of Fasbros IT. Do not copy, alter, distribute, or sell in any way unless given explicit permission.
 */

package MatchingSystem;

import MatchingSystem.API.ClientAPI;

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
public class Client implements ClientAPI {

    public void getUserInfoDelegate() {}

    public void getNotificationDelegate() {}

    public Request getRequest() {
        return null;
    }

    public void delegateUserInfo() {}

    public void delegateNotifications() {}

    public void sendSchedules() {}

    public void delegateRequest(Request request) {}
}