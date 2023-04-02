package cz.upce.bspwe.service;

import java.util.List;

public interface AbstractService<T> {

    T getOneByUuid(String uuid);
    List<T> getAll();

}
