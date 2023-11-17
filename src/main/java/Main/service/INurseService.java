package Main.service;

import Main.domain.nurse;

import java.util.List;

public interface INurseService extends IService<nurse, String>{
    List<nurse> readAll();
}
