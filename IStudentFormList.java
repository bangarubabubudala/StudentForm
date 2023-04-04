package cfss.REGISTRATION.apiresponse;

import java.util.Date;

public interface IStudentFormList {
	Integer getstudentId();
	String getstudentName();
	String getstudentFatherName();
	Date getdateOfBirth();
	String getstudentGender();
	Long getstudentAadhaarNo();
	Long getstudentMobileNo();
	String getstudentEmailId();
	String getstudentState();
	String getstudentDistrict();
	String getstudentMandal();
	String getstudentVillage();
	String getstudentStreet();
	Integer getstudentPinCode();
}
