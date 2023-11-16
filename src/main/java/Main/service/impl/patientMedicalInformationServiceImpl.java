package Main.service.impl;

import Main.domain.patientMedicalInformation;
import Main.service.IPatientMedicalInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import Main.repository.IPatientMedicalInformationRepository;

import java.util.List;
import java.util.Optional;
@Service
public class patientMedicalInformationServiceImpl implements IPatientMedicalInformationService {

    private final IPatientMedicalInformationRepository repository;
    @Autowired
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
