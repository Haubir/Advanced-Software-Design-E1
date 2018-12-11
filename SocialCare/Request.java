package SocialCare;


public class Request extends Constraints implements TrackingObject{
	private int ID;
	private String status; 

    public Request() {

    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        if (validStatus(status)) this.status = status;
        else System.out.println("Request.setStatus(): Wrong status input....");
    }

    private Boolean validStatus(String status) {
        Boolean ret = false;

        if (status.toLowerCase().equals("scheduled")    ||
            status.toLowerCase().equals("pending")      ||
            status.toLowerCase().equals("matched")      ||
            status.toLowerCase().equals("finished")     ||
            status.toLowerCase().equals("aborted")) {
            // If this part of the code is reached, the input was valid.
            ret = true;
        }

        return ret;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public String getTime() {
        return this.time;
    }

    @Override
    public int getNumberOfResponders() {
        return this.numberOfResponders;
    }

    @Override
    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public void setNumberOfResponders(int numberOfResponders) {
        this.numberOfResponders = numberOfResponders;
    }
}