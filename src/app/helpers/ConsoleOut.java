package app.helpers;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ConsoleOut {

	private static Calendar cal = Calendar.getInstance();
	private static SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss.SSS");
	/**
	 * If output is enabled, the string is printed with a time stamp prefix 
	 * @param string
	 */
	public static void output(String string){
		if(Settings.output){
			System.out.println(Settings.extensionName+" "+sdf.format(cal.getTime())+" | "+string);
		}
	}
}
