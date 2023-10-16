package service.impl;

import domain.User;
import domain.administrator;
import repository.IAdministratorRepository;
import service.IAdministratorService;


import java.util.List;
import java.util.Optional;

public class administratorServiceImpl implements IAdministratorService {
    private final IAdministratorRepository repository;

    public administratorServiceImpl(IAdministratorRepository repository) {
        this.repository = repository;
    }

    @Override
    public administrator save(administrator administrator) {
        return this.repository.save(administrator);
    }

    @Override
    public Optional<administrator> read(String administratorID) {
        return this.repository.findById(administratorID);
    }

    @Override
    public void delete(administrator administrator) {
        this.repository.delete(administrator);
    }

    @Override
    public List<administrator> readAll() {
        return this.repository.findAll();
    }
}
