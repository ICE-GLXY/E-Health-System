package Main.controller;

import Main.domain.nurse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import Main.service.INurseService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("E-Health-System/nurse")
@Slf4j
@Controller
public class nurseController {

    private final INurseService nurseService;

    @Autowired
    public nurseController(INurseService nurseService){
        this.nurseService = nurseService;
    }

    //save
    @PostMapping("save")
    public ResponseEntity<nurse> save(@RequestBody nurse nurse){
        log.info("save request:{}", nurse);
        nurse save = nurseService.save(nurse);
        return ResponseEntity.ok(save);
    }

    //read
    @GetMapping("read/{nurseID}")
    public ResponseEntity<Optional<nurse>> read (@PathVariable String nurseID){
        log.info("read request:{}", nurseID);

        try {
            Optional<nurse> read = nurseService.read(nurseID);
            return ResponseEntity.ok(read);

        }catch(IllegalArgumentException e){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,e.getMessage());
        }
    }

    //Delete
    @DeleteMapping("delete/{nurse}")
    public ResponseEntity<nurse> delete (@PathVariable nurse nurse){
        log.info("read request:{}", nurse);
        this.nurseService.delete(nurse);
        return ResponseEntity.noContent().build();
    }

    //Get all
    @GetMapping("all")
    public ResponseEntity<List<nurse>>findAll(){
        List<nurse>nurseList = this.nurseService.readAll();
        return ResponseEntity.ok(nurseList);
    }


}
