package service;

import domain.User;

import java.util.List;

public interface IUserService extends IService<User, String> {
    List<User> readAll();
}
