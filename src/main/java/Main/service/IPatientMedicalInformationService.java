package Main.service;

import Main.domain.patientMedicalInformation;

import java.util.List;

public interface IPatientMedicalInformationService extends IService<patientMedicalInformation, String > {

    List<patientMedicalInformation> readAll();
}
