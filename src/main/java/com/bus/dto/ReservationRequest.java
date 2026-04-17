package com.bus.dto;



import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class ReservationRequest {
@NotNull private Long busId;
@NotBlank private String source;
@NotBlank private String destination;
@NotBlank private String reservationType;
public Long getBusId() {
	return busId;
}
public void setBusId(Long busId) {
	this.busId = busId;
}
public String getSource() {
	return source;
}
public void setSource(String source) {
	this.source = source;
}
public String getDestination() {
	return destination;
}
public void setDestination(String destination) {
	this.destination = destination;
}
public String getReservationType() {
	return reservationType;
}
public void setReservationType(String reservationType) {
	this.reservationType = reservationType;
}





}




