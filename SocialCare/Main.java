
public class Main {
	private Scheduler scheduler;


    public void editRequest(int ID, String editOption) {
    	Request toEdit = this.scheduler.getRequest(ID);

    	switch(editOption.toLower()) {
    		case "constraints":
    			// TODO: Edit contraints functionality
    			break;
    		case "timetopost":
    			// TODO: Get input for new time to set
    			// toEdit.setTime(newTime);
    		case "numberofresponders":
				// TODO: Get input for new number of responders to set
    			// toEdit.setNumberOfResponders(newNumberOfResponders);
    	}
    }

    public void removeRequest(int ID) {

    }


}