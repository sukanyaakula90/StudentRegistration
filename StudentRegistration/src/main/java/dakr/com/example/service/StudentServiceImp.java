package dakr.com.example.service;

import dakr.com.example.Repository.StudentRepository;
import dakr.com.example.entity.StudentEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImp  implements StudentService{
@Autowired
private StudentRepository repo;
    @Override
    public StudentEntity saveStu(StudentEntity student) {

        return repo.save(student);
    }
}
