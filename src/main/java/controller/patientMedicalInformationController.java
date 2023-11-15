package controller;


import domain.patientMedicalInformation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import service.IPatientMedicalInformationService;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("E-Health-System/patientMedicalInformation")
@Slf4j

public class patientMedicalInformationController {


        private final IPatientMedicalInformationService PatientMedicalInformationService;

        @Autowired
        public patientMedicalInformationController(IPatientMedicalInformationService PatientMedicalInformationService){
            this.PatientMedicalInformationService = PatientMedicalInformationService;
        }

        //save
        @PostMapping("save")
        public ResponseEntity<patientMedicalInformation> save(@Valid @RequestBody patientMedicalInformation patientMedicalInformation){
            log.info("save request:{}", patientMedicalInformation);
            patientMedicalInformation save = PatientMedicalInformationService.save(patientMedicalInformation);
            return ResponseEntity.ok(save);
        }
        //read
        @GetMapping("read/{MedicalRecordID}")
        public ResponseEntity <Optional<patientMedicalInformation>> read (@PathVariable String MedicalRecordID){
            log.info("read request:{}", MedicalRecordID);

            try {
                Optional<patientMedicalInformation> read = PatientMedicalInformationService.read(MedicalRecordID);
                return ResponseEntity.ok(read);

            }catch(IllegalArgumentException e){
                throw new ResponseStatusException(HttpStatus.BAD_REQUEST,e.getMessage());
            }
        }

        //Delete
        @DeleteMapping("delete/{patientMedicalInformation}")
        public ResponseEntity<patientMedicalInformation> delete (@PathVariable patientMedicalInformation patientMedicalInformation){
            log.info("read request:{}", patientMedicalInformation);
            this.PatientMedicalInformationService.delete(patientMedicalInformation);
            return ResponseEntity.noContent().build();
        }

        //Get all
        @GetMapping("all")
        public ResponseEntity<List<patientMedicalInformation>>findAll(){
            List<patientMedicalInformation>pharmacistList = this.PatientMedicalInformationService.readAll();
            return ResponseEntity.ok(pharmacistList);
        }
    }

