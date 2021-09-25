package org.hackspring.samplejdbc.repository;

import org.hackspring.samplejdbc.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentJpaRepository extends JpaRepository<Student, Long> {

}
