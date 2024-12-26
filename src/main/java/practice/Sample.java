package practice;

//public class Sample {
//
//	public static void main(String[] args) {
//		System.out.println("Sampleです");
//		System.out.println("Java");
//	}
//
//}

import java.util.Date;

import Utility.DateFormat;

public class Sample {
	
	public static void main(String[] args) {
		
		Date date = new Date();
		
		String strDate = "";
		
		// DateFormatのdateFormatSlashメソッドを使う(yyyy/MM/dd)
		strDate = DateFormat.dateFormatSlash(date);
		
		System.out.println(strDate);
		
		// yyyy年MM月dd日
		strDate = DateFormat.dateFormatKanji(date);
		
		System.out.println(strDate);
	}

}