package Main.factory;

import Main.domain.patientMedicalInformation;

public class patientMedicalInformationFactory {

    public static patientMedicalInformation builder(String medicalRecordID, String MedicalProblems, String Prescription, String medicalTestResults, String Allergies,
                                                    String ChronicMedication, String Immunisations, String Hospitalisations, int folderNumber){

        if (medicalRecordID.isEmpty())
            throw new IllegalArgumentException("No Medical Record ID");

        return new patientMedicalInformation.Builder()
                .medicalRecordID(medicalRecordID)
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
