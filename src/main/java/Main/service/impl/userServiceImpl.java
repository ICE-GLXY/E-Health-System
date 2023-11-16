package Main.service.impl;


import Main.domain.User;
import Main.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import Main.repository.IUserRepository;

import java.util.List;
import java.util.Optional;
@Service
public class userServiceImpl implements IUserService {
    private final IUserRepository repository;
    @Autowired
    public userServiceImpl(IUserRepository repository) {
        this.repository = repository;
    }

    @Override
    public User save(User user) {
        return this.repository.save(user);
    }

    @Override
    public Optional<User> read(String username) {
        return this.repository.findById(username);
    }

    @Override
    public void delete(User user) {
        this.repository.delete(user);
    }

    @Override
    public List<User> readAll() {
        return this.repository.findAll();
    }
}
