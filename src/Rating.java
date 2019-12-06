public class Rating {                               //patients create ratings

    private String doctorID;
    private int rating;

    public Rating(String doctorID, int rating) {
        this.doctorID = doctorID;
        this.rating = rating;
    }

    public String getDoctorID() {
        return doctorID;
    }

    public void setDoctorID(String doctorID) {
        this.doctorID = doctorID;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
