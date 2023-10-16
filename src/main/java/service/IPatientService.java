package service;

import domain.patient;

import java.util.List;

public interface IPatientService extends IService<patient, String>{
    List<patient> readAll();
}
