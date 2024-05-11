package B78_JFrame_MVC;

import javax.swing.JFrame;
// jframe : tạo ra cửa sổ 

public class ViDu {
public static void main(String[] args) {
	// tạo cửa sổ
	JFrame jf = new JFrame();
	// tiêu đề 
	jf.setTitle("ví dụ JFrame");
	// tạo size cho nó
	jf.setSize(600,400);
	 
	
	//vòng lặp chạy hoài chạy hoài ko nên dùng
//	while(true) {
//		System.out.println(" chương trình đang chạy!");
//	}
	
	// gán vị trí hiển thị
	jf.setLocation(300,300);
	
	// thoát ra khỏi chương trình khi đóng cửa số
	jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	
	
	
	
	
	 // cho phép hiển thị cửa sổ / còn false thì ko / thường nằm cuối
		jf.setVisible(true);
	
}
}
