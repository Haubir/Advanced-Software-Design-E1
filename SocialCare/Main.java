package SocialCare;

public class Main {
	private Scheduler scheduler;


    public void editRequest(int ID, String editOption) {
    	Request toEdit = this.scheduler.getRequest(ID);
		String option = editOption.toLowerCase();

		if (option.equals("constraints")) {
			// TODO: Edit contraints functionality
		}
		else if (option.equals("timetopost")) {
			// TODO: Get input for new time to set
			// toEdit.setTime(newTime);
		}
		else if (option.equals("numberofresponders")) {
			// TODO: Get input for new number of responders to set
			// toEdit.setNumberOfResponders(newNumberOfResponders);
		}

    }

    public void removeRequest(int ID) {

    }


}