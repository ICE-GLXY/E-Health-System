package factory;

import domain.patientMedicalInformation;

public class patientMedicalInformationFactory {

    public static patientMedicalInformation builder(String MedicalRecordID, String MedicalProblems, String Prescription, String medicalTestResults, String Allergies,
                                                    String ChronicMedication, String Immunisations, String Hospitalisations, int folderNumber){

        if (MedicalRecordID.isEmpty())
            throw new IllegalArgumentException("No Medical Record ID");

        return new patientMedicalInformation.Builder()
                .MedicalRecordID(MedicalRecordID)
                .MedicalProblems(MedicalProblems)
                .Prescription(Prescription)
                .medicalTestResults(medicalTestResults)
                .Allergies(Allergies)
                .ChronicMedication(ChronicMedication)
                .Immunisations(Immunisations)
                .Hospitalisations(Hospitalisations)
                .folderNumber(folderNumber)
                .build();
    }
}
