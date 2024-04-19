package stringfunctions;

import java.util.Date;

public class String_concat {

	public static void main(String[] args)
	{
		Date d1=new Date();
		//long a=d1.getTime();
		//System.out.println(a); //server time
		System.out.println(d1.getTime()); //server time
		Date d2=new Date(d1.getTime());   //human time
		System.out.println(d2);
		String current_time=d2.toString(); //converting d2 to string
		//String future_time=((current_time)+(1000*60*60*21*1));
		//System.out.println(future_time);
		Date d3=new Date(d1.getTime()+(1000*60*60*24*5));
		System.out.println(d3);
		String month=current_time.substring(4,7);
		System.out.println(month);
		String date=current_time.substring(8,10);
		System.out.println(date);
		String year=current_time.substring(current_time.length()-4);
		System.out.println(year);
		System.out.println(month.concat(" ").concat(date).concat(" ").concat(year));
		System.out.println(month.concat("/").concat(date).concat("/").concat(year));
		
		
		

	}

}
