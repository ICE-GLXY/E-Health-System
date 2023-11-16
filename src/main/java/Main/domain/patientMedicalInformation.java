package Main.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.validation.constraints.NotNull;

@Document(collection = "PatientMedicalInformation")
@Data
@AllArgsConstructor
//@Entity
public class patientMedicalInformation {
//    @Id
//    @NotNull
    private String MedicalRecordID;
    private String MedicalProblems;
    //medicines below
    private String Prescription;
    private String medicalTestResults;
    private String Allergies;
    private String ChronicMedication;
    private String Immunisations;
    private String Hospitalisations;
    private int folderNumber;

    protected patientMedicalInformation(){}

    private patientMedicalInformation(Builder b){
        this.MedicalRecordID = b.MedicalRecordID;
        this.MedicalProblems = b.MedicalProblems;
        this.Prescription = b.Prescription;
        this.medicalTestResults = b.medicalTestResults;
        this.Allergies = b.Allergies;
        this.ChronicMedication = b.ChronicMedication;
        this.Immunisations = b.Immunisations;
        this.Hospitalisations = b.Hospitalisations;
        this.folderNumber = b.folderNumber;
    }

    public String getMedicalRecordID() {
        return MedicalRecordID;
    }

    public void setMedicalRecordID(String medicalRecordID) {
        MedicalRecordID = medicalRecordID;
    }

    public String getMedicalProblems() {
        return MedicalProblems;
    }

    public void setMedicalProblems(String medicalProblems) {
        MedicalProblems = medicalProblems;
    }

    public String getPrescription() {
        return Prescription;
    }

    public void setPrescription(String prescription) {
        Prescription = prescription;
    }

    public String getMedicalTestResults() {
        return medicalTestResults;
    }

    public void setMedicalTestResults(String medicalTestResults) {
        this.medicalTestResults = medicalTestResults;
    }

    public String getAllergies() {
        return Allergies;
    }

    public void setAllergies(String allergies) {
        Allergies = allergies;
    }

    public String getChronicMedication() {
        return ChronicMedication;
    }

    public void setChronicMedication(String chronicMedication) {
        ChronicMedication = chronicMedication;
    }

    public String getImmunisations() {
        return Immunisations;
    }

    public void setImmunisations(String immunisations) {
        Immunisations = immunisations;
    }

    public String getHospitalisations() {
        return Hospitalisations;
    }

    public void setHospitalisations(String hospitalisations) {
        Hospitalisations = hospitalisations;
    }

    public int getFolderNumber() {
        return folderNumber;
    }

    public void setFolderNumber(int folderNumber) {
        this.folderNumber = folderNumber;
    }

    @Override
    public String toString() {
        return "patientMedicalInformation{" +
                "MedicalRecordID='" + MedicalRecordID + '\'' +
                ", MedicalProblems='" + MedicalProblems + '\'' +
                ", Prescription='" + Prescription + '\'' +
                ", medicalTestResults='" + medicalTestResults + '\'' +
                ", Allergies='" + Allergies + '\'' +
                ", ChronicMedication='" + ChronicMedication + '\'' +
                ", Immunisations='" + Immunisations + '\'' +
                ", Hospitalisations='" + Hospitalisations + '\'' +
                ", folderNumber=" + folderNumber +
                '}';
    }

    public static class Builder{
        private String MedicalRecordID;
        private String MedicalProblems;
        private String Prescription;
        private String medicalTestResults;
        private String Allergies;
        private String ChronicMedication;
        private String Immunisations;
        private String Hospitalisations;
        private int folderNumber;

        public Builder MedicalRecordID(String MedicalRecordID){
            this.MedicalRecordID = MedicalRecordID;
            return this;
        }

        public Builder MedicalProblems(String MedicalProblems){
            this.MedicalProblems = MedicalProblems;
            return this;
        }

        public Builder Prescription(String Prescription){
            this.Prescription = Prescription;
            return this;
        }

        public Builder medicalTestResults(String medicalTestResults){
            this.medicalTestResults = medicalTestResults;
            return this;
        }

        public Builder Allergies(String Allergies){
            this.Allergies = Allergies;
            return this;
        }

        public Builder ChronicMedication(String ChronicMedication){
            this.ChronicMedication = ChronicMedication;
            return this;
        }

        public Builder Immunisations(String Immunisations){
            this.Immunisations = Immunisations;
            return this;
        }

        public Builder Hospitalisations(String Hospitalisations){
            this.Hospitalisations = Hospitalisations;
            return this;
        }

        public Builder folderNumber(int folderNumber){
            this.folderNumber = folderNumber;
            return this;
        }

        public Builder copy(patientMedicalInformation e){
            this.MedicalRecordID = e.MedicalRecordID;
            this.MedicalProblems = e.MedicalProblems;
            this.Prescription = e.Prescription;
            this.medicalTestResults = e.medicalTestResults;
            this.Allergies = e.Allergies;
            this.ChronicMedication = e.ChronicMedication;
            this.Immunisations = e.Immunisations;
            this.Hospitalisations = e.Hospitalisations;
            this.folderNumber = e.folderNumber;
            return this;
        }
        public patientMedicalInformation build(){return new patientMedicalInformation(this);}

    }
}
