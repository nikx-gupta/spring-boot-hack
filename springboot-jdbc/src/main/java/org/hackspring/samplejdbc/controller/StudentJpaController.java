package org.hackspring.samplejdbc.controller;

import org.hackspring.samplejdbc.model.Student;
import org.hackspring.samplejdbc.model.StudentAddress;
import org.hackspring.samplejdbc.model.StudentRepository;
import org.hackspring.samplejdbc.repository.StudentJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentJpaController {

    @Autowired
    StudentJpaRepository studentRepository;

    @GetMapping
    public ResponseEntity<List<Student>> getAll() {
        return ResponseEntity.ok(studentRepository.findAll());
    }

    @PostMapping
    public ResponseEntity<?> post() {
//        studentRepository.insertUsingLegacy(new Student());
        Student st = new Student();
        st.setAge(24);
        st.setName("Jpa Entity");
        st.setDescription("This is JPA Description");
        studentRepository.save(st);

        return ResponseEntity.ok(null);
    }
}
