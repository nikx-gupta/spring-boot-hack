package org.hackspring.samplejdbc.controller;

import org.hackspring.samplejdbc.model.Student;
import org.hackspring.samplejdbc.model.StudentAddress;
import org.hackspring.samplejdbc.repository.StudentAddressJpaRepository;
import org.hackspring.samplejdbc.repository.StudentJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@RestController
@RequestMapping("/sa")
public class StudentAddressCrudJpaController {

    @Autowired
    StudentAddressJpaRepository studentRepository;

    @GetMapping
    public ResponseEntity<List<StudentAddress>> getAll() {
        return ResponseEntity.ok(studentRepository.findAll());
    }
}
