public class Appointment {

    private String doctorID;
    private String patientID;
    private String date;
    private String time;

    public Appointment(String doctorID, String patientID, String date, String time) {
        this.doctorID = doctorID;
        this.patientID = patientID;
        this.date = date;
        this.time = time;
    }

    public String getDoctorID() {
        return doctorID;
    }

    public void setDoctorID(String doctorID) {
        this.doctorID = doctorID;
    }

    public String getPatientID() {
        return patientID;
    }

    public void setPatientID(String patientID) {
        this.patientID = patientID;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
