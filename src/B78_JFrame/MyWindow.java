package B78_JFrame;

import javax.swing.JFrame;

// jframe là 1 cái lớp abstract
// vì vậy có thể extends lại có jframe này\/
// sau khi extends thì cái MyWindow sẽ có đầy đủ all các phương thức của JFrame

public class MyWindow extends JFrame{

	public MyWindow() {
		// contructor này giúp tắt hết các cửa sổ khi stop run
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	}
	
	public void showit() {
		this.setVisible(true);
		
	}
	
	public void showit(String title) { // có tiêu đề
		this.setTitle(title);
		this.setVisible(true);
	}
	
	public void showit(String title, int width , int height) {//tiêu đề và kích cỡ
		this.setTitle(title);
		this.setSize(width, height);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		MyWindow m1 = new MyWindow();
		m1.showit("Window 1"); // cử sổ nhỏ
		
		MyWindow m2 = new MyWindow();
		m2.showit("Window 2"); //cử sổ nhỏ
		
		MyWindow m3 = new MyWindow();
		m3.showit("Window 3" , 600, 400); // cửa số có kích thước
	}
	
	
	
}
