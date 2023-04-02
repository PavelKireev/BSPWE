package cz.upce.bspwe.service;

import cz.upce.bspwe.model.appointment.AppointmentModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentServiceImpl implements AppointmentService {

    @Override
    public AppointmentModel getOneByUuid(String uuid) {
        return null;
    }

    @Override
    public List<AppointmentModel> getAll() {
        return null;
    }
}
