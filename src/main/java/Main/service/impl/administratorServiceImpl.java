package Main.service.impl;

import Main.domain.administrator;
import Main.service.IAdministratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import Main.repository.IAdministratorRepository;


import java.util.List;
import java.util.Optional;
@Service
public class administratorServiceImpl implements IAdministratorService {
    private final IAdministratorRepository repository;
    @Autowired
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
