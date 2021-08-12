package restapi.apidemo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import restapi.apidemo.Entity.Employer;

public interface EmployerRepo extends JpaRepository<Employer, Integer>{

}
