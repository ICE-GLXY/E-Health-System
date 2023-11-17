package Main.service.impl;

import Main.domain.medicalFacility;
import Main.service.IMedicalFacilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import Main.repository.IMedicalFacilityRepository;

import java.util.List;
import java.util.Optional;
@Service
public class medicalFacilityServiceImpl implements IMedicalFacilityService {
    private final IMedicalFacilityRepository repository;
    @Autowired
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
