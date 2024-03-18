package B58_time_dateformat_calendar;


import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Year;
import java.util.Calendar;

// quản lý time

import java.util.concurrent.TimeUnit;

public class TEST {
public static void main(String[] args) {
	// hàm lấy ra time hiện tại 
	long t1 = System.currentTimeMillis();
	for ( int i=0; i< 10; i++) {
		System.out.println("test");
	}
	long t2 = System.currentTimeMillis();
	
	System.out.println(" trước khi chạy for: "+t1);
	System.out.println(" sau khi chạy for: "+t1);
	System.out.println(" thời gian chạy từ 1 đến 50 là : "+((t2-t1))+"mls");
	System.out.println(" thời gian ....................: "+((t2-t1))+ "s");
	
	
	
	//timeUnit -> chuyển dổi đơn vị time -> time -> phút -> giay
	// TimeUnit
	System.out.println("3000 năm ="+ TimeUnit.DAYS.toSeconds(3000*365) +"s");
	System.out.println("1.3h ="+TimeUnit.HOURS.toSeconds(25)+"s");
	
	
	
	//Date
//	System.currentTimeMillis() -> tính time hiện tại trên máy tính của bạn 
	Date d = new Date(System.currentTimeMillis());
	System.out.println(d.getDate()+"/"+(d.getMonth()+1)+"/"+(d.getYear()+1900));
	
	
	// calendar đối tường này mô tả thời điểm hiện tại 
	Calendar c = Calendar.getInstance();
	System.out.println(c.get(Calendar.DATE)+"-" +(c.get(Calendar.MONTH)+1)+"-"+c.get(Calendar.YEAR));
	
	
	// cộng thêm h thì dùng 
	c.add(Calendar.HOUR, 24); // 24 là số h mún cộng thêm 
	//System.out.println(c.toString());
	System.out.println(c.get(Calendar.DATE)+"-" +(c.get(Calendar.MONTH)+1)+"-"+c.get(Calendar.YEAR));

	// công/ trừ thêm bớt ngày 
	c.add(Calendar.DATE, -14); // 24 là số h mún cộng thêm 
	//System.out.println(c.toString());
	System.out.println(c.get(Calendar.DATE)+"-" +(c.get(Calendar.MONTH)+1)+"-"+c.get(Calendar.YEAR));

	//DateFormat lấy ra ngày tháng năm
	DateFormat df = new SimpleDateFormat();// ko truyền j vô dateformat thì nó sẽ tự default 
	System.out.println(df.format(d));
	  
	 df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	 System.out.println(df.format(d));
	
	
	
	
	
	
	}
}
