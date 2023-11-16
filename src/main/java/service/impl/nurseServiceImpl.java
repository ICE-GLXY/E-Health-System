package service.impl;

import domain.nurse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.INurseRepository;
import service.INurseService;

import java.util.List;
import java.util.Optional;
@Service
public class nurseServiceImpl implements INurseService {
    private final INurseRepository repository;
    @Autowired
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
