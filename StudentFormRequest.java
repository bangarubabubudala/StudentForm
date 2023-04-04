package cfss.REGISTRATION.request;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class StudentFormRequest {
	
	private Integer studentId;
	
	private String studentName;
	
	private String studentFatherName;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date dateOfBirth;
	
	private String studentGender;
	
	private Long studentAadhaarNo;
	
	private Long studentMobileNo;
	
	private String studentEmailId;
	
	private String studentState;
	
	private String studentDistrict;
	
	private String studentMandal;
	
	private String studentVillage;
	
	private String studentStreet;
	
	private Integer studentPinCode;
	
	private Boolean isDelete;

	public Boolean getIsDelete() {
		return isDelete;
	}

	public void setIsDelete(Boolean isDelete) {
		this.isDelete = isDelete;
	}

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentFatherName() {
		return studentFatherName;
	}

	public void setStudentFatherName(String studentFatherName) {
		this.studentFatherName = studentFatherName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getStudentGender() {
		return studentGender;
	}

	public void setStudentGender(String studentGender) {
		this.studentGender = studentGender;
	}

	public Long getStudentAadhaarNo() {
		return studentAadhaarNo;
	}

	public void setStudentAadhaarNo(Long studentAadhaarNo) {
		this.studentAadhaarNo = studentAadhaarNo;
	}

	public Long getStudentMobileNo() {
		return studentMobileNo;
	}

	public void setStudentMobileNo(Long studentMobileNo) {
		this.studentMobileNo = studentMobileNo;
	}

	public String getStudentEmailId() {
		return studentEmailId;
	}

	public void setStudentEmailId(String studentEmailId) {
		this.studentEmailId = studentEmailId;
	}

	public String getStudentState() {
		return studentState;
	}

	public void setStudentState(String studentState) {
		this.studentState = studentState;
	}

	public String getStudentDistrict() {
		return studentDistrict;
	}

	public void setStudentDistrict(String studentDistrict) {
		this.studentDistrict = studentDistrict;
	}

	public String getStudentMandal() {
		return studentMandal;
	}

	public void setStudentMandal(String studentMandal) {
		this.studentMandal = studentMandal;
	}

	public String getStudentVillage() {
		return studentVillage;
	}

	public void setStudentVillage(String studentVillage) {
		this.studentVillage = studentVillage;
	}

	public String getStudentStreet() {
		return studentStreet;
	}

	public void setStudentStreet(String studentStreet) {
		this.studentStreet = studentStreet;
	}

	public Integer getStudentPinCode() {
		return studentPinCode;
	}

	public void setStudentPinCode(Integer studentPinCode) {
		this.studentPinCode = studentPinCode;
	}
	
	

}
