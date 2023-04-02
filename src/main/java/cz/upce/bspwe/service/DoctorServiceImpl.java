package cz.upce.bspwe.service;

import cz.upce.bspwe.model.doctor.DoctorModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorServiceImpl implements DoctorService {
    @Override
    public DoctorModel getOneByUuid(String uuid) {
        return null;
    }

    @Override
    public List<DoctorModel> getAll() {
        return null;
    }
}
