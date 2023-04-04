package cfss.REGISTRATION.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cfss.REGISTRATION.apiresponse.IStudentFormList;
import cfss.REGISTRATION.apiresponse.ResponseMessage;
import cfss.REGISTRATION.models.StudentFormEntity;
import cfss.REGISTRATION.request.StudentFormRequest;
import cfss.REGISTRATION.services.StudentFormService;

@RestController
@RequestMapping("/")

public class StudentFormController {
	@Autowired
	StudentFormService stuFormService;
	
	@PostMapping(value = "/studentform")
	public ResponseMessage saveStudentForm(@RequestBody StudentFormRequest stuReq) {
		return stuFormService.saveStudentForm(stuReq);
		
	}
	
	@GetMapping("/getStudentFormDetails")
	public List<IStudentFormList>getStudentFormLists(@RequestParam("id")Integer id){
		return stuFormService.getStudentFormLists(id);
		
	}
	@GetMapping("/getStudentFormDetails/{id}")
	public StudentFormEntity getStudentFormListById(@PathVariable("id") Integer id) {
		return stuFormService.getStudentFormListById(id);
	}
	
	@GetMapping("/getStudentFormEntireDetails")
	public List<StudentFormEntity> getEntireStudentFormList(){
		return stuFormService.getEntireStudentFormList();
	}
	
	@PutMapping("/updateStudentForm/{id}")
	public ResponseMessage updateStudentForm(@PathVariable("id")Integer id,@RequestBody StudentFormRequest stuReq) {
		return stuFormService.updateStudentForm(id, stuReq);
	}
	
	@DeleteMapping("/delateStudentForm/{id}")
	public ResponseMessage deleteStudentForm(@PathVariable("id")Integer id) {
		return stuFormService.deleteStudentForm(id);
	}

}
