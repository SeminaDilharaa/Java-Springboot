package lk.ac.vau.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import lk.ac.vau.Model.Worker;
@Repository
public interface WorkerRepo extends JpaRepository<Worker, Integer> {
	//JPQl JPA Query
	@Query("select w from Worker w where w.skillType = ?1")
	List<Worker> findBySkillType(String skill);
	 
	//name
	@Query("select w from Worker w where w.WorkerName like %?1%")
	List<Worker>findByName(String name);
	
	
	
	/*@Query("select w.Supervisor from Worker w where w.WorkerId = ?1")
	Worker  findBySupervisor(int id);*/

	
	
	
	
	
	
	
}
