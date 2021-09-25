package org.hackspring.samplejdbc.repository;

import org.hackspring.samplejdbc.model.Student;
import org.hackspring.samplejdbc.model.StudentAddress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentAddressJpaRepository extends JpaRepository<StudentAddress, Long> {

}
