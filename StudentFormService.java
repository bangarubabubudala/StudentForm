package cfss.REGISTRATION.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cfss.REGISTRATION.apiresponse.IStudentFormList;
import cfss.REGISTRATION.apiresponse.ResponseMessage;
import cfss.REGISTRATION.models.StudentFormEntity;
import cfss.REGISTRATION.repository.StudentFormRepository;
import cfss.REGISTRATION.request.StudentFormRequest;

@Service
public class StudentFormService {
	@Autowired
	StudentFormRepository studentRepository;
	public ResponseMessage saveStudentForm(StudentFormRequest stuReq) {
		try {
			StudentFormEntity response = new StudentFormEntity();
			
			response.setStudentName(stuReq.getStudentName());
			response.setStudentFatherName(stuReq.getStudentFatherName());
			response.setDateOfBirth(stuReq.getDateOfBirth());
			response.setStudentGender(stuReq.getStudentGender());
			response.setStudentAadhaarNo(stuReq.getStudentAadhaarNo());
			response.setStudentMobileNo(stuReq.getStudentMobileNo());
			response.setStudentEmailId(stuReq.getStudentEmailId());
			response.setStudentState(stuReq.getStudentState());
			response.setStudentDistrict(stuReq.getStudentDistrict());
			response.setStudentMandal(stuReq.getStudentDistrict());
			response.setStudentVillage(stuReq.getStudentVillage());
			response.setStudentStreet(stuReq.getStudentStreet());
			response.setStudentPinCode(stuReq.getStudentPinCode());
			
			studentRepository.save(response);
			return new ResponseMessage("success","data  saved");
		}
		catch (Exception e) {
			return new ResponseMessage("error","data not saved please try again");
			
		}
				
	}
	public List<IStudentFormList>getStudentFormLists(Integer id){
		
		return studentRepository.getStudentFormList(id);
	}
	
	public ResponseMessage updateStudentForm(Integer id,StudentFormRequest stuReq) {
		try {
			StudentFormEntity response = studentRepository.findById(id).orElse(null);
			if(response == null) {
				return new ResponseMessage("error", "Resource Not Found With Given Id"+id);
			}
			
			response.setStudentName(stuReq.getStudentName());
			response.setStudentFatherName(stuReq.getStudentFatherName());
			response.setDateOfBirth(stuReq.getDateOfBirth());
			response.setStudentGender(stuReq.getStudentGender());
			response.setStudentAadhaarNo(stuReq.getStudentAadhaarNo());
			response.setStudentMobileNo(stuReq.getStudentMobileNo());
			response.setStudentEmailId(stuReq.getStudentEmailId());
			response.setStudentState(stuReq.getStudentState());
			response.setStudentDistrict(stuReq.getStudentDistrict());
			response.setStudentMandal(stuReq.getStudentDistrict());
			response.setStudentVillage(stuReq.getStudentVillage());
			response.setStudentStreet(stuReq.getStudentStreet());
			response.setStudentPinCode(stuReq.getStudentPinCode());
			
			studentRepository.save(response);
			return new ResponseMessage("success", "data  saved");
		}
		catch(Exception e){
			return new ResponseMessage("error", "data not saved please try again");
	
		}	
		}
	
	
	public ResponseMessage deleteStudentForm(Integer id) {
		
		try {
			StudentFormEntity response = studentRepository.findById(id).orElse(null);
			if(response.getIsDelete().equals(Boolean.TRUE)) {
				return new ResponseMessage("error", "Record alreday deleted : "+id);
			}
			if(response == null) {
				return new ResponseMessage("error", "Resource Not Found With Given Id"+id);
			}
			response.setIsDelete(true);;
			studentRepository.save(response);
			return new ResponseMessage("success", "data  saved");
			}
		catch(Exception e){
			return new ResponseMessage("error", "data not saved please try again");
	
		}
	}
	
	
	
	
	public StudentFormEntity getStudentFormListById(Integer id) {
		return studentRepository.findById(id).orElse(null);
	}
	public List<StudentFormEntity> getEntireStudentFormList(){
		return studentRepository.findAll();
	}
		

}
