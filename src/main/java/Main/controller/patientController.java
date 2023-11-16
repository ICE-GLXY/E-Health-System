package Main.controller;

import Main.domain.patient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import Main.service.IPatientService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("E-Health-System/patient")
@Slf4j
@Controller
public class patientController {

    private final IPatientService patientService;


    @Autowired
    public patientController(IPatientService patientService){
        this.patientService = patientService;
    }

    //save
    @PostMapping("save")
    public ResponseEntity<patient> save(@RequestBody patient patient){
        log.info("save request:{}", patient);
        patient save = patientService.save(patient);
        return ResponseEntity.ok(save);
    }

    //read
    @GetMapping("read/{patientID}")
    public ResponseEntity<Optional<patient>> read (@PathVariable String patientID){
        log.info("read request:{}", patientID);

        try {
            Optional<patient> read = patientService.read(patientID);
            return ResponseEntity.ok(read);

        }catch(IllegalArgumentException e){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,e.getMessage());
        }
    }

    //Delete
    @DeleteMapping("delete/{patient}")
    public ResponseEntity<patient> delete (@PathVariable patient patient){
        log.info("read request:{}", patient);
        this.patientService.delete(patient);
        return ResponseEntity.noContent().build();
    }

    //Get all
    @GetMapping("all")
    public ResponseEntity<List<patient>>findAll(){
        List<patient>patientList = this.patientService.readAll();
        return ResponseEntity.ok(patientList);
    }

}
