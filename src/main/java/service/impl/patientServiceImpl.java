package service.impl;

import domain.doctor;
import domain.patient;
import repository.IDoctorRepository;
import repository.IPatientRepository;
import service.IDoctorService;
import service.IPatientService;

import java.util.List;
import java.util.Optional;

public class patientServiceImpl implements IPatientService {
    private final IPatientRepository repository;

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
