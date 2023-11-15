package service.impl;

import domain.patientMedicalInformation;
import repository.IPatientMedicalInformationRepository;
import service.IPatientMedicalInformationService;

import java.util.List;
import java.util.Optional;

public class patientMedicalInformationServiceImpl implements IPatientMedicalInformationService {

    private final IPatientMedicalInformationRepository repository;

    public patientMedicalInformationServiceImpl(IPatientMedicalInformationRepository repository) {
        this.repository = repository;
    }

    @Override
    public patientMedicalInformation save(patientMedicalInformation patientMedicalInformation) {
        return this.repository.save(patientMedicalInformation);
    }

    @Override
    public Optional<patientMedicalInformation> read(String MedicalRecordID) {
        return this.repository.findById(MedicalRecordID);
    }

    @Override
    public void delete(patientMedicalInformation patientMedicalInformation) {
        this.repository.delete(patientMedicalInformation);
    }

    @Override
    public List<patientMedicalInformation> readAll() {
        return this.repository.findAll();
    }
}
