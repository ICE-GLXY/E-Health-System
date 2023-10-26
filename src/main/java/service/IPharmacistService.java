package service;

import domain.pharmacist;

import java.util.List;

public interface IPharmacistService extends IService<pharmacist, String>{

    List<pharmacist> readAll();
}
