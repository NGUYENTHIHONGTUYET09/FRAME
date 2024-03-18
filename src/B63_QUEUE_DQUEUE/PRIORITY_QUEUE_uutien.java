package B63_QUEUE_DQUEUE;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class PRIORITY_QUEUE_uutien {
public static void main(String[] args) {
	Queue<String> danhSachSV = new PriorityQueue<String>(); 
	//PriorityQueue : sắp xếp ưu tiên cái nào nhỏ hơn thì đứng trước , lớn hơn thì đứng sau
	
	danhSachSV.offer("sv1"); // đưa vào dssv // đề xuất
	danhSachSV.offer("sv5");
	danhSachSV.offer("sv2");
	danhSachSV.offer("sv4");
	
	while(true) {// khi nào in ra đc thì in
		String ten = danhSachSV.poll() ;// lấy  ra xg xóa lun
	//	String ten = danhSachSV.peek(); // lấy ra nhưng ko xóa
		if(ten == null) {
			break;
			
		}
		System.out.println(ten);
		
		
	}
	//PriorityQueue-> kq: 1 2 4 5
}
}
