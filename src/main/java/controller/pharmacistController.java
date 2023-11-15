package controller;

import domain.pharmacist;
import lombok.extern.slf4j.Slf4j;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import service.IPharmacistService;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("E-Health-System/pharmacy")
@Slf4j
public class pharmacistController {


    private final IPharmacistService PharmacistService;

    @Autowired
    public pharmacistController(IPharmacistService PharmacistService){
        this.PharmacistService = PharmacistService;
    }

    //save
    @PostMapping("save")
    public ResponseEntity<pharmacist> save(@Valid @RequestBody pharmacist pharmacist){
        log.info("save request:{}", pharmacist);
        pharmacist save = PharmacistService.save(pharmacist);
        return ResponseEntity.ok(save);
    }
    //read
    @GetMapping("read/{pharmacistID}")
    public ResponseEntity <Optional<pharmacist>> read (@PathVariable String pharmacistID){
        log.info("read request:{}", pharmacistID);

        try {
            Optional<pharmacist> read = PharmacistService.read(pharmacistID);
            return ResponseEntity.ok(read);

        }catch(IllegalArgumentException e){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,e.getMessage());
        }
    }

    //Delete
    @DeleteMapping("delete/{pharmacist}")
    public ResponseEntity<pharmacist> delete (@PathVariable pharmacist pharmacist){
        log.info("read request:{}", pharmacist);
        this.PharmacistService.delete(pharmacist);
        return ResponseEntity.noContent().build();
    }
    //Get all
    @GetMapping("all")
    public ResponseEntity<List<pharmacist>>findAll(){
        List<pharmacist>pharmacistList = this.PharmacistService.readAll();
       return ResponseEntity.ok(pharmacistList);
    }
}
