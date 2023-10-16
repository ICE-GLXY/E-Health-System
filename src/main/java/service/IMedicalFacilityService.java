package service;

import domain.medicalFacility;

import java.util.List;

public interface IMedicalFacilityService extends IService<medicalFacility, String>{
    List<medicalFacility> readAll();
}
