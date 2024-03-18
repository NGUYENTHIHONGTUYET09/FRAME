package B63_QUEUE_DQUEUE;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class DEQUEUE {
public static void main(String[] args) {
	Deque<String> danhSachSV = new ArrayDeque<String>(); //linked.. là lớp implement cả list và queue lun
	
	danhSachSV.offer("sv1"); // đưa vào dssv // đề xuất
	danhSachSV.offer("sv5");
	danhSachSV.offer("sv3");
	danhSachSV.offer("sv4");
	
	danhSachSV.offerLast("sv6");
	danhSachSV.offerFirst("sv0" );
	
	
	
	 
	while(true) {// khi nào in ra đc thì in
		String ten = danhSachSV.poll() ;// lấy  ra xg xóa lun
	//	String ten = danhSachSV.peek(); // lấy ra nhưng ko xóa
		if(ten == null) {
			break;
			
		}
		System.out.println(ten);
		
		
	}
}
}
