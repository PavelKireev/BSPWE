package cz.upce.bspwe.controller;

import cz.upce.bspwe.model.doctor.DoctorModel;
import cz.upce.bspwe.model.doctor.DoctorUpdateModel;
import cz.upce.bspwe.model.patient.PatientModel;
import cz.upce.bspwe.service.DoctorService;
import cz.upce.bspwe.service.PatientService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("doctor")
@RequiredArgsConstructor
public class DoctorRestController {

    private final DoctorService doctorService;
    private final PatientService patientService;

    @GetMapping("list")
    public List<DoctorModel> list() {
        return doctorService.getAll();
    }

    @GetMapping("patient/list")
    public List<PatientModel> patientList() {
        return Collections.emptyList();
    }

    @GetMapping("{uuid}")
    public DoctorModel getOne(
        @PathVariable String uuid
    ) {
        return doctorService.getOneByUuid(uuid);
    }

    @PostMapping("create")
    public void create(
        @RequestBody String s
    ) {

    }

    @PostMapping("update")
    public void update(
        @RequestBody DoctorUpdateModel s
    ) {

    }

    @DeleteMapping("delete/{uuid}")
    public void delete(
        @PathVariable String uuid
    ) {

    }

}
