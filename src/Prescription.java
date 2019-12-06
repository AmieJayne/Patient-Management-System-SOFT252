public class Prescription {

    private String doctorID;
    private String patientID;
    private String notes;               // change to diff object??
    private String medicineName;
    private int quantity;
    private String dosage;
    private boolean pickedUp;           // T = patient has collected this prescription

    public Prescription(String doctorID, String patientID, String notes, String medicineName, int quantity, String dosage) {
        this.doctorID = doctorID;
        this.patientID = patientID;
        this.notes = notes;
        this.medicineName = medicineName;
        this.quantity = quantity;
        this.dosage = dosage;
        this.pickedUp = false;
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

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

    public boolean isPickedUp() {
        return pickedUp;
    }

    public void setPickedUp(boolean pickedUp) {
        this.pickedUp = pickedUp;
    }
}
