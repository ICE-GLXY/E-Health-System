package service;

import domain.receptionist;

import java.util.List;

public interface IReceptionistService extends IService<receptionist, String> {

    List<receptionist> readAll();
}
