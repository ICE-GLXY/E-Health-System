package controller;

import domain.administrator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import service.IAdministratorService;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("E-Health-System/administrator")
@Slf4j
public class administratorController {

    private final IAdministratorService administratorService;

    @Autowired
    public administratorController(IAdministratorService administratorService){
        this.administratorService = administratorService;
    }

    //save
    @PostMapping("save")
    public ResponseEntity<administrator> save(@Valid @RequestBody administrator administrator){
        log.info("save request:{}", administrator);
        administrator save = administratorService.save(administrator);
        return ResponseEntity.ok(save);
    }

    //read
    @GetMapping("read/{administratorID}")
    public ResponseEntity <Optional<administrator>> read (@PathVariable String administratorID){
        log.info("read request:{}",administratorID);

        try{
            Optional<administrator> read = administratorService.read(administratorID);
            return ResponseEntity.ok(read);

        } catch(IllegalArgumentException e){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,e.getMessage());
        }
    }

    //Delete
    @DeleteMapping("delete/{administrator}")
    public ResponseEntity<administrator> delete(@PathVariable administrator administrator){
        log.info("read request:{}", administrator);
        this.administratorService.delete(administrator);
        return ResponseEntity.noContent().build();
    }

    //Get all
    @GetMapping("all")
    public ResponseEntity<List<administrator>>findAll(){
        List<administrator>adminList = this.administratorService.readAll();
        return ResponseEntity.ok(adminList);
    }
}

