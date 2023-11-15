package controller;


import domain.receptionist;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import service.IReceptionistService;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/E-Health-System/receptionist/")
@Slf4j
public class receptionistController {

    private final IReceptionistService ReceptionistService;

    @Autowired
    public receptionistController(IReceptionistService ReceptionistService){
        this.ReceptionistService = ReceptionistService;
    }

    //save
    @PostMapping("save")
    public ResponseEntity<receptionist> save(@Valid @RequestBody receptionist receptionist){
        log.info("save request:{}", receptionist);
        receptionist save = ReceptionistService.save(receptionist);
        return ResponseEntity.ok(save);
    }
    //read
    @GetMapping("read/{receptionistID}")
    public ResponseEntity <Optional<receptionist>> read (@PathVariable String receptionistID){
        log.info("read request:{}", receptionistID);

        try {
            Optional<receptionist> read = ReceptionistService.read(receptionistID);
            return ResponseEntity.ok(read);

        }catch(IllegalArgumentException e){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,e.getMessage());
        }
    }

    //Delete
    @DeleteMapping("delete/{receptionist}")
    public ResponseEntity<receptionist> delete (@PathVariable receptionist receptionist){
        log.info("read request:{}", receptionist);
        this.ReceptionistService.delete(receptionist);
        return ResponseEntity.noContent().build();
    }
    //Get all
    @GetMapping("all")
    public ResponseEntity<List<receptionist>>findAll(){
        List<receptionist>receptionistList = this.ReceptionistService.readAll();
        return ResponseEntity.ok(receptionistList);
    }
}


