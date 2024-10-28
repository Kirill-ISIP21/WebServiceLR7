package ru.chukharev.WebServiceLR7.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.chukharev.WebServiceLR7.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {


}
