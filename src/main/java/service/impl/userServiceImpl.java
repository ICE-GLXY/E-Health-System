package service.impl;


import domain.User;
import repository.IUserRepository;
import service.IUserService;

import java.util.List;
import java.util.Optional;

public class userServiceImpl implements IUserService {
    private final IUserRepository repository;

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
