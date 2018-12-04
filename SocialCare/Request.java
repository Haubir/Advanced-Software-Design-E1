package SocialCare;

public class Request implements Constraints {
	private int ID;
	private String status; 

    public Request() {

    }

    public String getRequest() { // Replace String with the desired type.
        return "";
    }

    public void setRequest() {

    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        if (validStatus(status)) this.status = status;
        else System.out.println("Request.setStatus(): Wrong status input....");
    }

    private Boolean validStatus(String status) {
        ret = false;

        switch(status.toLower()) {
            case "scheduled":
            case "pending": // When waiting for a match
            case "matched":
            case "finished":
            case "aborted":
                ret = true;
                break;
        }

        return ret;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

}