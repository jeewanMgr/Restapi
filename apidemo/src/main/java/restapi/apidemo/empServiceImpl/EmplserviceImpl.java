package restapi.apidemo.empServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import restapi.apidemo.Entity.Employer;
import restapi.apidemo.Repo.EmployerRepo;
import restapi.apidemo.empService.Employerservice;
import restapi.apidemo.vo.EmployerVO;

@Service
public class EmplserviceImpl implements Employerservice{

	@Autowired
	private EmployerRepo employservice;

	@Override
	public void add(EmployerVO empoy) {
		// TODO Auto-generated method stub
		Employer one = new Employer();
		BeanUtils.copyProperties(empoy, one);
		employservice.save(one);
		
	}

	@Override
	public List<EmployerVO> getList(String gender) {
		// TODO Auto-generated method stub
		List<Employer> dataone = employservice.findAll();
		List<EmployerVO> data = new ArrayList<>();
		 for(Employer onedata : dataone )
		 {
			 EmployerVO o = new EmployerVO();
			 BeanUtils.copyProperties(onedata, o);
			 data.add(o);
		 }
		
		 
		 if(gender.equalsIgnoreCase("male"))
		 {
			 List<EmployerVO> male = data.stream().filter(emp->
			 emp.getGender().equalsIgnoreCase("male")).collect(Collectors.toList());
			 return male;
			 
		 }
		 if(gender.equalsIgnoreCase("female")){
			 List<EmployerVO> female = data.stream().filter(emp->
			 emp.getGender().equalsIgnoreCase("female")).collect(Collectors.toList());
			 return female;
		 }
		return data;
	}

	@Override
	public List<EmployerVO> getList() {
		// TODO Auto-generated method stub
		List<Employer> dataone = employservice.findAll();
		List<EmployerVO> data = new ArrayList<>();
		 for(Employer onedata : dataone )
		 {
			 EmployerVO o = new EmployerVO();
			 BeanUtils.copyProperties(onedata, o);
			 data.add(o);
		 }
		return data;
	}
	
	
	
}
