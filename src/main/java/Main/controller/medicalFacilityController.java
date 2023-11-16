package Main.controller;

import Main.domain.medicalFacility;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import Main.service.IMedicalFacilityService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("E-Health-System/medicalFacility")
@Slf4j
@Controller
public class medicalFacilityController {

    private final IMedicalFacilityService medicalFacilityService;

    @Autowired
    public medicalFacilityController(IMedicalFacilityService medicalFacilityService){
        this.medicalFacilityService = medicalFacilityService;
    }

    //save
    @PostMapping("save")
    public ResponseEntity<medicalFacility> save(@RequestBody medicalFacility medicalFacility){
        log.info("save request:{}", medicalFacility);
        medicalFacility save = medicalFacilityService.save(medicalFacility);
        return ResponseEntity.ok(save);
    }

    //read
    @GetMapping("read/{medicalFacilityID}")
    public ResponseEntity<Optional<medicalFacility>> read (@PathVariable String medicalFacilityID){
        log.info("read request:{}", medicalFacilityID);

        try {
            Optional<medicalFacility> read = medicalFacilityService.read(medicalFacilityID);
            return ResponseEntity.ok(read);

        }catch(IllegalArgumentException e){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,e.getMessage());
        }
    }

    //Delete
    @DeleteMapping("delete/{medicalFacility}")
    public ResponseEntity<medicalFacility> delete (@PathVariable medicalFacility medicalFacility){
        log.info("read request:{}", medicalFacility);
        this.medicalFacilityService.delete(medicalFacility);
        return ResponseEntity.noContent().build();
    }

    //Get all
    @GetMapping("all")
    public ResponseEntity<List<medicalFacility>>findAll(){
        List<medicalFacility>medicalFacilityList = this.medicalFacilityService.readAll();
        return ResponseEntity.ok(medicalFacilityList);
    }

}
