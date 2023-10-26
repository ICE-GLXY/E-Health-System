package service;

import domain.patientMedicalInformation;

import java.util.List;

public interface IPatientMedicalInformationService extends IService<patientMedicalInformation, String > {

    List<patientMedicalInformation> readAll();
}
