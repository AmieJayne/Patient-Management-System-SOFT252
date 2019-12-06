public class Feedback {                             //admins create feedback based on ratings
                                                    //feedback sent to doctors automatically
    private String doctorID;
    private String feedback;

    public Feedback(String doctorID, String feedback) {
        this.doctorID = doctorID;
        this.feedback = feedback;
    }

    public String getDoctorID() {
        return doctorID;
    }

    public void setDoctorID(String doctorID) {
        this.doctorID = doctorID;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }
}
