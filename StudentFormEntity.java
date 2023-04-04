package cfss.REGISTRATION.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(schema="apgsavm2023",name="student_form")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor


public class StudentFormEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="stu_id")
	private Integer studentId;
	
	@Column(name="stu_name")
	private String studentName;
	
	@Column(name="stu_fname")
	private String studentFatherName;
	
	@Column(name="stu_dob")
	private Date dateOfBirth;
	
	@Column(name="gender")
	private String studentGender;
	
	@Column(name="aadhaar")
	private Long studentAadhaarNo;
	
	@Column(name="mobile_no")
	private Long studentMobileNo;
	
	@Column(name="email_id")
	private String studentEmailId;
	
	@Column(name="stu_state")
	private String studentState;
	
	@Column(name="district")
	private String studentDistrict;
	
	@Column(name="mandal")
	private String studentMandal;
	
	@Column(name="village")
	private String studentVillage;
	
	@Column(name="street")
	private String studentStreet;
	
	@Column(name="pincode")
	private Integer studentPinCode;
	
	@Column(name="is_delete")
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
