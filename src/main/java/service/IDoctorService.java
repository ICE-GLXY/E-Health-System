package service;
import domain.doctor;
import java.util.List;

public interface IDoctorService extends IService<doctor, String>{
    List<doctor> readAll();
}
