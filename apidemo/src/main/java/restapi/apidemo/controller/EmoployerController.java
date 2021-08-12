package restapi.apidemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import restapi.apidemo.empService.Employerservice;
import restapi.apidemo.vo.EmployerVO;

@RestController
@RequestMapping("/Employer")
public class EmoployerController {
	
	@Autowired
	private Employerservice employerservices;
	
	
	@PostMapping("/create")
	public void addemployer(@ModelAttribute EmployerVO allempoloyer,Model model)
	{
		employerservices.add(allempoloyer); // 
		model.addAttribute("msg","You data has been submited");
		
	}
	
	@PostMapping("/list")
	public void Listofemployer(@RequestParam(required = false)String gender,Model model)
	{
		if(gender.isEmpty())
		{
			model.addAttribute("list", employerservices.getList());
		}
		model.addAttribute("list", employerservices.getList(gender));
	}
	
	

}
