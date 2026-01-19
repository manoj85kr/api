package com.api.utilities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Utilities {
	public static String getTimeStamp() {
		return LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-YYYY-HH-MM-SS"));
	}
}
