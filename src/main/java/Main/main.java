package Main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class main
{
    public static void main(String[] args)
    {
        SpringApplication.run(main.class, args);
    }
}
