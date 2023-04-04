package cfss.REGISTRATION.apiresponse;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ResponseMessage {
	String status;
	String message;
	String dataMap;

	public ResponseMessage(String status, String message){
		this.status = status;
		this.message = message;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDataMap() {
		return dataMap;
	}

	public void setDataMap(String dataMap) {
		this.dataMap = dataMap;
	}





	

}
