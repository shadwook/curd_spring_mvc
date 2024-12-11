package mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import mvc.dao.EmployeeDao;
import mvc.dto.Employee;

@Service
public class EmployeeService {
	@Autowired
	EmployeeDao dao;

	public String add(Employee employee, ModelMap map) {
		dao.save(employee);
		map.put("success", "Add Successed");
		
		return "home.jsp";
		
	}
	
	public String fetch(ModelMap map) {
		List<Employee> list=dao.fetchAll();
		if(list.isEmpty()) {
			map.put("failuer", "The Data Fails to fetch");
			return "home.jsp";
		}
		else {
			map.put("list", list);
			return "fetch.jsp";
		}
	}

	public String delete(int id, ModelMap map) {
		
		Employee employee=dao.find(id);
		dao.delete(employee);
		map.put("success", "Record Deleted Success");
		return "fetch";
		
	}

	public String edit(int id, ModelMap map) {
		Employee employee=dao.find(id);
		map.put("emp", employee);
		return "edit.jsp";
	}

	public String update(Employee employee, ModelMap map) {
		dao.update(employee);
		map.put("success", "updated Success");
		return "fetch";
	}

	

}
