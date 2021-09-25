package org.hackspring.samplejdbc.controller;

import org.hackspring.samplejdbc.model.Student;
import org.hackspring.samplejdbc.model.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pg")
public class PostgresController {

    @Autowired
    StudentRepository studentRepository;

    @GetMapping
    public ResponseEntity<List<Student>> getAll() {
        return ResponseEntity.ok(studentRepository.findAll());
    }

    @PostMapping
    public ResponseEntity<?> post() {
//        studentRepository.insertUsingLegacy(new Student());
        studentRepository.insertUsingPrepare(new Student());
        return ResponseEntity.ok(null);
    }
}
