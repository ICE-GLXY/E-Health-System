package Main.service.impl;

import Main.domain.pharmacist;
import Main.service.IPharmacistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import Main.repository.IPharmacistRepository;

import java.util.List;
import java.util.Optional;
@Service
public class pharmacistServiceImpl implements IPharmacistService {

    private final IPharmacistRepository repository;
    @Autowired
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
