package ru.common.springboot.tutorial.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.common.springboot.tutorial.entity.Student;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>
{
	List<Student> findByName(String name);
}
