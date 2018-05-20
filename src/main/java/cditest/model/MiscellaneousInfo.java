package cditest.model;


import java.util.List;
import java.util.Map;

import javax.json.bind.annotation.JsonbProperty;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class MiscellaneousInfo {
	//Key value "100": "Fokker 100"
	@JsonbProperty("aircraft_type")
	private Map<String, String>  aircraftType;
	
	//Key Value "SG": "Singapore Airways"
	private Map<String, String> airlines;
	
	@JsonbProperty("code_share_flight_range")
	private List<String> codeShareFlightRange;
	
	@JsonbProperty("international_flight_range")
	private List<String> internationalFlightRange;
	
	//Key Value "GK" : "Confirmed"
	@JsonbProperty("booking_status")
	private Map<String, String> bookingStatus;
	
	//Key Value "Z" : "Premium Economy"
	@JsonbProperty("cabin_classes")
	private Map<String, String> cabinClasses;
	
	//Key Value "AVML" : "Indian style vegetarian meal"
	@JsonbProperty("meal_types")
	private Map<String, String> mealTypes;
	
	//Key Value "W" : "Window"
	@JsonbProperty("seat_type")
	private Map<String, String> seatType;
	
	//Key Value "Mr" : "Mister"
	private Map<String, String> titles;
	
	@JsonbProperty("voucher_booking_codes")
	private List<String> voucherBookingCodes;
}