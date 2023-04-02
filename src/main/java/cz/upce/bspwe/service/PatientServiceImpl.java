package cz.upce.bspwe.service;

import cz.upce.bspwe.db.repository.PatientRepository;
import cz.upce.bspwe.model.patient.PatientModel;
import jakarta.persistence.EntityExistsException;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PatientServiceImpl implements PatientService {

    private final PatientRepository patientRepository;

    @Override
    @SneakyThrows
    public PatientModel getOneByUuid(String uuid) {
        return new PatientModel(
            patientRepository.findByUuid(uuid).orElseThrow(EntityExistsException::new));
    }

    @Override
    public List<PatientModel> getAll() {
        return null;
    }
}
