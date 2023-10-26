package service.impl;

import domain.pharmacist;
import repository.IPharmacistRepository;
import service.IPharmacistService;

import java.util.List;
import java.util.Optional;

public class pharmacistServiceImpl implements IPharmacistService {

    private final IPharmacistRepository repository;

    public pharmacistServiceImpl(IPharmacistRepository repository) {
        this.repository = repository;
    }


    @Override
    public pharmacist save(pharmacist pharmacist) {
        return this.repository.save(pharmacist);
    }

    @Override
    public Optional<pharmacist> read(String pharmacistID) {
        return this.repository.findById(pharmacistID);
    }

    @Override
    public void delete(pharmacist pharmacist) {
        this.repository.delete(pharmacist);
    }

    @Override
    public List<pharmacist> readAll() {
        return this.repository.findAll();
    }
}
