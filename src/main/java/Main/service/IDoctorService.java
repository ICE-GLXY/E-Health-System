package Main.service;
import Main.domain.doctor;
import java.util.List;

public interface IDoctorService extends IService<doctor, String>{
    List<doctor> readAll();
}
