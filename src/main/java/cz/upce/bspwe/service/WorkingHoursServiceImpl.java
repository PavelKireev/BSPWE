package cz.upce.bspwe.service;

import cz.upce.bspwe.model.workinghours.WorkingHoursModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkingHoursServiceImpl implements WorkingHoursService {
    @Override
    public WorkingHoursModel getOneByUuid(String uuid) {
        return null;
    }

    @Override
    public List<WorkingHoursModel> getAll() {
        return null;
    }
}
