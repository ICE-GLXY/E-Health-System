package Main.service;

import Main.domain.patient;

import java.util.List;

public interface IPatientService extends IService<patient, String>{
    List<patient> readAll();
}
