package SocialCare;

public class Response {
    private String answer;
    private int responderID;

    public Response(String answer, int responderID) {
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public int getResponderID() {
        return responderID;
    }

    public void setResponderID(int responderID) {
        this.responderID = responderID;
    }
}