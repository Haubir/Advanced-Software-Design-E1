/*
 * Project: Advanced-Software-Design-E1 
 * Class:   RealRequest
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
public class NurseRequest extends Constraints implements Request {

    public NurseRequest(String time, int noOfResponders) {}

    @Override
    public String getTime() {
        return null;
    }

    @Override
    public int getNoOfResponders() {
        return 0;
    }

    @Override
    public void setTime() {

    }

    @Override
    public void setNoOfResponders() {

    }
}