package service.impl;

import domain.nurse;
import repository.INurseRepository;
import service.INurseService;

import java.util.List;
import java.util.Optional;

public class nurseServiceImpl implements INurseService {
    private final INurseRepository repository;

    public nurseServiceImpl(INurseRepository repository) {
        this.repository = repository;
    }

    @Override
    public nurse save(nurse nurse) {
        return this.repository.save(nurse);
    }

    @Override
    public Optional<nurse> read(String nurseID) {
        return this.repository.findById(nurseID);
    }

    @Override
    public void delete(nurse nurse) {
        this.repository.delete(nurse);
    }

    @Override
    public List<nurse> readAll() {
        return this.repository.findAll();
    }
}
