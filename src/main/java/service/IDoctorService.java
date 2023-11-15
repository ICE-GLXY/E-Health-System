package service;

import java.util.List;

public interface IDoctorService extends IService<doctor, String>{
    List<doctor> readAll();
}
