package service.impl;

import domain.receptionist;
import repository.IReceptionistRepository;
import service.IReceptionistService;

import java.util.List;
import java.util.Optional;

public class receptionistServiceImpl implements IReceptionistService {

    private final IReceptionistRepository repository;

    public receptionistServiceImpl(IReceptionistRepository repository) {
        this.repository = repository;
    }



    @Override
    public receptionist save(receptionist receptionist) {
        return this.repository.save(receptionist);
    }

    @Override
    public Optional<receptionist> read(String receptionistID) {
        return this.repository.findById(receptionistID);
    }

    @Override
    public void delete(receptionist receptionist) {

        this.repository.delete(receptionist);
    }

    @Override
    public List<receptionist> readAll() {
        return this.repository.findAll();
    }
}
