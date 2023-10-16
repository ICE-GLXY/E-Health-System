package service.impl;

import domain.medicalFacility;
import repository.IMedicalFacilityRepository;
import service.IMedicalFacilityService;

import java.util.List;
import java.util.Optional;

public class medicalFacilityServiceImpl implements IMedicalFacilityService {
    private final IMedicalFacilityRepository repository;

    public medicalFacilityServiceImpl(IMedicalFacilityRepository repository) {
        this.repository = repository;
    }

    @Override
    public medicalFacility save(medicalFacility medicalFacility) {
        return this.repository.save(medicalFacility);
    }

    @Override
    public Optional<medicalFacility> read(String medicalFacilityID) {
        return this.repository.findById(medicalFacilityID);
    }

    @Override
    public void delete(medicalFacility medicalFacility) {
        this.repository.delete(medicalFacility);
    }

    @Override
    public List<medicalFacility> readAll() {
        return this.repository.findAll();
    }
}
