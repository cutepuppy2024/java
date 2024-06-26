package p0626;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Car {
	{
		Date d =  new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
		this.serialNo = "S"+ sdf.format(d) + String.format("%03d", 1+count++);
	}
	
	Car(){}
	Car(String color, int door){
		this.color = color;
		this.door = door;
	}
	
	String getserialNo() {
		return serialNo;
	}
	
	void setserialNo(String serialNo) {
		
	}
	
	static int count;
	String serialNo;
	String color;
	int door;
	
	
}
