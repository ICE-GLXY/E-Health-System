package Main.service;

import Main.domain.administrator;

import java.util.List;

public interface IAdministratorService extends IService<administrator, String>{
    List<administrator> readAll();
}
