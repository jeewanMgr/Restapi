package restapi.apidemo.empService;

import java.util.List;

import restapi.apidemo.vo.EmployerVO;

public interface Employerservice {
	
	public void add(EmployerVO empoy);
	public List<EmployerVO> getList(String gender);
	public List<EmployerVO> getList();

}
