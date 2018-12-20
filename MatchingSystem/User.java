/*
 * Project: Advanced-Software-Design-E1 
 * Class:   User
 *
 * Version info
 * Created: 12/19/18
 * Creator: Haubir Mariwani
 *
 * Copyright notice
 * Property of Fasbros IT. Do not copy, alter, distribute, or sell in any way unless given explicit permission.
 */

package MatchingSystem;

import MatchingSystem.API.UserAPI;

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
public class User<T> extends UserAPI {
    private T userObject; // Could be either Requester or Responder

    public User(T userObject) {
        this.userObject = userObject;
    }

    public void createAccount() {

    }

    public void deleteAccount() {

    }

    public void login() {

    }

    public void logout() {

    }

    public void giveFeedback() {

    }

    public void reportAbuse() {

    }

    public void setConstraints() {

    }

    public void setPreferences() {

    }

    public void membershipType() {

    }


    public void gatherUserInfo() {

    }

    public void sendUserInfo() {

    }
}