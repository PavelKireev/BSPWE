package cz.upce.bspwe.controller;

import cz.upce.bspwe.model.patient.PatientModel;
import cz.upce.bspwe.service.PatientService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("patient")
@RequiredArgsConstructor
public class PatientRestController {

    private final PatientService patientService;

    @GetMapping("list")
    public List<PatientModel> list(){
        return patientService.getAll();
    }

    @GetMapping("{uuid}")
    public PatientModel getOne(
        @PathVariable String uuid
    ) {
        return patientService.getOneByUuid(uuid);
    }

    @PostMapping("create")
    public void create(
        @RequestBody String s
    ) {

    }

    @PostMapping("update")
    public void update(
        @RequestBody String s
    ){

    }

    @DeleteMapping("delete/{uuid}")
    public void delete(
        @PathVariable String uuid
    ) {

    }

}
