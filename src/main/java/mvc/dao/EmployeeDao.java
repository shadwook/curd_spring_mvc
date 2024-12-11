package mvc.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.stereotype.Repository;

import mvc.dto.Employee;

@Repository
public class EmployeeDao {

	EntityManagerFactory factory=Persistence.createEntityManagerFactory("m5");
	EntityManager manager = factory.createEntityManager();
	EntityTransaction transation = manager.getTransaction();
	
	public void save(Employee employee) {
		
		transation.begin();
		manager.persist(employee);
		transation.commit();
		
	}

	public List<Employee> fetchAll() {
		return manager.createNativeQuery("select * from employee",Employee.class).getResultList();
	}

	public Employee find(int id) {
		
		return manager.find(Employee.class, id);
	}

	public void delete(Employee employee) {
		transation.begin();
		manager.remove(employee);
		transation.commit();
		
	}

	public void update(Employee employee) {
		transation.begin();
		manager.merge(employee);
		transation.commit();
		
	}

	

}
