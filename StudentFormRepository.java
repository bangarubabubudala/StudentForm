package cfss.REGISTRATION.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import cfss.REGISTRATION.apiresponse.IStudentFormList;
import cfss.REGISTRATION.models.StudentFormEntity;

@Repository


public interface StudentFormRepository extends JpaRepository<StudentFormEntity,Integer> {
	@Query(nativeQuery = true,value = "select stu_id as studentId, stu_name as studentName, stu_fname as studentFatherName, stu_dob as dateOfBirth, gender as studentGender, aadhaar as studentAadhaarNo,mobile_no as studentMobileNo, email_id as studentEmailId,stu_state as studentState, district as studentDistrict, mandal as studentMandal, village as studentVillage,street as studentStreet, pincode as studentPinCode from apgsavm2023.student_form where stu_id=?")
	List<IStudentFormList> getStudentFormList(Integer id);
	
	

}
