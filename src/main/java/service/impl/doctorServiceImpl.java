package service.impl;
import domain.doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.IDoctorRepository;
import service.IDoctorService;

import java.util.List;
import java.util.Optional;
@Service
public class doctorServiceImpl implements IDoctorService {
    private final IDoctorRepository repository;
    @Autowired
    public doctorServiceImpl(IDoctorRepository repository) {
        this.repository = repository;
    }

    @Override
    public doctor save(doctor doctor) {
        return this.repository.save(doctor);
    }

    @Override
    public Optional<doctor> read(String doctorID) {
        return this.repository.findById(doctorID);
    }

    @Override
    public void delete(doctor doctor) {
        this.repository.delete(doctor);
    }

    @Override
    public List<doctor> readAll() {
        return this.repository.findAll();
    }
}

