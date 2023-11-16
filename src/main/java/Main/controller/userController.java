package Main.controller;

import Main.domain.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import Main.service.IUserService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("E-Health-System/User")
@Slf4j
@Controller
public class userController {

    private final IUserService userService;

    @Autowired
    public userController(IUserService userService){
        this.userService = userService;
    }

    //save
    @PostMapping("save")
    public ResponseEntity<User> save(@RequestBody User user){
        log.info("save request:{}", user);
        User save = userService.save(user);
        return ResponseEntity.ok(save);
    }

    //read
    @GetMapping("read/{userName}")
    public ResponseEntity<Optional<User>> read (@PathVariable String userName){
        log.info("read request:{}",userName );

        try {
            Optional<User> read = userService.read(userName);
            return ResponseEntity.ok(read);

        }catch(IllegalArgumentException e){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,e.getMessage());
        }
    }

    //Delete
    @DeleteMapping("delete/{user}")
    public ResponseEntity<User> delete (@PathVariable User user){
        log.info("read request:{}", user);
        this.userService.delete(user);
        return ResponseEntity.noContent().build();
    }

    //Get all
    @GetMapping("all")
    public ResponseEntity<List<User>>findAll(){
        List<User>userList = this.userService.readAll();
        return ResponseEntity.ok(userList);
    }

}
