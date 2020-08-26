package org.dxc.springdatajpa.repository;

import java.util.List;

import org.dxc.springdatajpa.entity.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
	List<Employee> findByLastName(String lastName);

	@Query("SELECT e from Employee e WHERE e.age=:age")

	List<Employee> findByAge(@Param("age") int age);
}
