public class AccountDeleteRequest {                 // will notify secretary when a request is created

    private String userID;

    public AccountDeleteRequest(String userID) {
        this.userID = userID;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }
}
