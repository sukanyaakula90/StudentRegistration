package dakr.com.example.entity;

import lombok.Data;

import javax.persistence.*;

@Entity

@Data
@Table(name= "student_table")
public class StudentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )

    private Integer id;
    private String name;
    private String eMail;
    private Long phNo;
    private String address;
}
