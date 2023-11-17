package Main.controller;

import Main.domain.doctor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import Main.service.IDoctorService;

//import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("E-Health-System/doctor")
@Slf4j
@Controller
public class doctorController {

    private final IDoctorService doctorService;

    @Autowired
    public doctorController(IDoctorService doctorService){
        this.doctorService = doctorService;
    }

    //save
    @PostMapping("save")
    public ResponseEntity<doctor> save(@RequestBody doctor doctor){
        log.info("save request:{}", doctor);
        doctor save = doctorService.save(doctor);
        return ResponseEntity.ok(save);
    }

    //read
    @GetMapping("read/{doctorID}")
    public ResponseEntity<Optional<doctor>> read (@PathVariable String doctorID){
        log.info("read request:{}", doctorID);

        try {
            Optional<doctor> read = doctorService.read(doctorID);
            return ResponseEntity.ok(read);

        }catch(IllegalArgumentException e){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,e.getMessage());
        }
    }

    //Delete
    @DeleteMapping("delete/{doctor}")
    public ResponseEntity<doctor> delete (@PathVariable doctor doctor){
        log.info("read request:{}", doctor);
        this.doctorService.delete(doctor);
        return ResponseEntity.noContent().build();
    }

    //Get all
    @GetMapping("all")
    public ResponseEntity<List<doctor>>findAll(){
        List<doctor>doctorList = this.doctorService.readAll();
        return ResponseEntity.ok(doctorList);
    }
}
