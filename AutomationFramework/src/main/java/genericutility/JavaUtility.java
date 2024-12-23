package genericutility;

import java.time.LocalDateTime;

public class JavaUtility {
/*
 * this method will capture current system date and time and return by replacing : with- 
 * */
	public String getSystemTime() {
		return LocalDateTime.now().toString().replace(":", "-");
	}
}
