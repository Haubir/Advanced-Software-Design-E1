/*
 * Project: Advanced-Software-Design-E1 
 * Class:   Requester
 *
 * Version info
 * Created: 12/19/18
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
public class Requester implements User {
    private String name;
    private String email;
    private String phoneNumber;
    private String starRating;

    public Requester(String name, String email, String phoneNumber, String starRating) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.starRating = starRating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getStarRating() {
        return starRating;
    }

    public void setStarRating(String starRating) {
        this.starRating = starRating;
    }

    public Request createRequest() {return null;}

    public void sendRequest() {}

    public void modifyRequest(Request request) {}

    @Override
    public void createAccount() {

    }

    @Override
    public void deleteAccount() {

    }

    @Override
    public void login() {

    }

    @Override
    public void logout() {

    }

    @Override
    public void giveFeedback() {

    }

    @Override
    public void reportAbuse() {

    }

    @Override
    public void setConstraints() {

    }

    @Override
    public void setPreferences() {

    }

    @Override
    public void membershipType() {

    }

    @Override
    public void log(String[] currentState) {

    }
}