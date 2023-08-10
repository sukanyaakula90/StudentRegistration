package dakr.com.example.controller;
import dakr.com.example.entity.StudentEntity;
import dakr.com.example.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class studentController {
    @Autowired
    private StudentService service;
    @PostMapping()
     public StudentEntity saveStu(@RequestBody StudentEntity student){
        return service.saveStu(student);
    }

}
