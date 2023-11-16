package Main.service.impl;

import Main.domain.receptionist;
import Main.service.IReceptionistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import Main.repository.IReceptionistRepository;

import java.util.List;
import java.util.Optional;
@Service
public class receptionistServiceImpl implements IReceptionistService {

    private final IReceptionistRepository repository;
    @Autowired
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
