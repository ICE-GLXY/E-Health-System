package service.impl;

import domain.patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.IPatientRepository;
import service.IPatientService;

import java.util.List;
import java.util.Optional;
@Service
public class patientServiceImpl implements IPatientService {
    private final IPatientRepository repository;
    @Autowired
    public patientServiceImpl(IPatientRepository repository) {
        this.repository = repository;
    }

    @Override
    public patient save(patient patient) {
        return this.repository.save(patient);
    }

    @Override
    public Optional<patient> read(String patientID) {
        return this.repository.findById(patientID);
    }

    @Override
    public void delete(patient patient) {
        this.repository.delete(patient);
    }

    @Override
    public List<patient> readAll() {
        return this.repository.findAll();
    }
}
