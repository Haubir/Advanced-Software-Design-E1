/*
 * Project: Advanced-Software-Design-E1 
 * Class:   Matcher
 *
 * Version info
 * Created: 12/20/18
 * Creator: Haubir Mariwani
 *
 * Copyright notice
 * Property of Fasbros IT. Do not copy, alter, distribute, or sell in any way unless given explicit permission.
 */

package MatchingSystem;

enum PaymentSystem {HOURLY, PERJOB}

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
public class Matcher {

    public Matcher() {}

    public Boolean findResponder(Request request) {return false;}

    public void performMatch(Request request) {

    }

    public void matchNotification(Requester requester, Responder responder) {

    }

    public void log(String [] currentState) {

    }

    public Feedback getFeedback(Requester requester, Responder responder, Request request) {return null;}
}