package Main.service;

import Main.domain.receptionist;

import java.util.List;

public interface IReceptionistService extends IService<receptionist, String> {

    List<receptionist> readAll();
}
