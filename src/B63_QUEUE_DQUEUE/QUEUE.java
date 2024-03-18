package B63_QUEUE_DQUEUE;

import java.util.LinkedList;
import java.util.Queue;

public class QUEUE {
public static void main(String[] args) {
	Queue<String> danhSachSV = new LinkedList<String>(); //linked.. là lớp implement cả list và queue lun
			
	danhSachSV.offer("sv1"); // đưa vào dssv // đề xuất
	danhSachSV.offer("sv5");
	danhSachSV.offer("sv3");
	danhSachSV.offer("sv4");
	
	while(true) {// khi nào in ra đc thì in
		String ten = danhSachSV.poll() ;// lấy  ra xg xóa lun
	//	String ten = danhSachSV.peek(); // lấy ra nhưng ko xóa
		if(ten == null) {
			break;
			
		}
		System.out.println(ten);
		
		
	}
	// offer đưa dl vào
	//poll lấy dl ra
	// peek lấy dl ra nhưng ko xóa
	
	
	//LinkedList-> kq: 1 5 3 4 
}
}
