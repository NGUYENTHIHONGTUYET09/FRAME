package B80_JPANEL_cauHinhLook_and_FEEL;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LookAndFeel;
import javax.swing.UIManager;


/*JPANEL Là 1 class trong java , nó là 1 vật chưa, có thể chứa các thành 
 * phần khác nhau trong 1 chương trình
 * */

public class MyCalculator extends JFrame {
// LOOK AND FEEL : NHÌN VÀ CẢM NHẬN
	
	//con
	
	public MyCalculator() {
		this.setTitle("My Calculator");
		this.setSize(300,300);
		this.setLocationRelativeTo(null);// cho nó nằm giữa
		this.setDefaultCloseOperation(MyCalculator.EXIT_ON_CLOSE);
		
		// nơi nhập dl vào:
		//JTextField  trường văn bản
		
		JTextField jTextField = new JTextField(200);
		
		// tạo chỗ chứa cho cái khung jtexfield
		JPanel jPanel_head = new JPanel();
		jPanel_head.setLayout(new BorderLayout());
		jPanel_head.add(jTextField, BorderLayout.CENTER);
		
		// jbutton : nút
		// jpanel : ibutton nằm trong ipanel
		
		
		JButton jButton_0 = new JButton("0");
		JButton jButton_1 = new JButton("1");
		JButton jButton_2 = new JButton("2");
		JButton jButton_3 = new JButton("3");
		JButton jButton_4 = new JButton("4");
		JButton jButton_5 = new JButton("5");
		JButton jButton_6 = new JButton("6");
		JButton jButton_7 = new JButton("7");
		JButton jButton_8= new JButton("8");
		JButton jButton_9 = new JButton("9");
		JButton jButton_cong = new JButton("+");
		JButton jButton_tru = new JButton("-");
		JButton jButton_nhan = new JButton("x");
		JButton jButton_chia = new JButton("/");
		JButton jButton_bang = new JButton("=");

		// tạo chỗ chứa cho các button
		JPanel jPanel_button = new JPanel();
		jPanel_button.setLayout(new GridLayout(5,3));	
		
		jPanel_button.add(jTextField);

		jPanel_button.add(jButton_0);
		jPanel_button.add(jButton_1);
		jPanel_button.add(jButton_2);
		jPanel_button.add(jButton_3);
		jPanel_button.add(jButton_4);
		jPanel_button.add(jButton_5);
		jPanel_button.add(jButton_6);
		jPanel_button.add(jButton_7);
		jPanel_button.add(jButton_8);
		jPanel_button.add(jButton_9);
		jPanel_button.add(jButton_cong);
		jPanel_button.add(jButton_tru);
		jPanel_button.add(jButton_nhan);
		jPanel_button.add(jButton_chia);
		jPanel_button.add(jButton_bang);
		
 		this.setLayout(new BorderLayout());
		this.add(jPanel_head, BorderLayout.NORTH);
		this.add(jPanel_button, BorderLayout.CENTER);
		this.add(jTextField, BorderLayout.NORTH );
		 
		
		this.setVisible(true);
	}
	
	
	public static void main(String[] args) {
		
		try {
			// quản lý giao diện ng dùng
			// nó hiển thị theo cách nào
			// lấy giao diện của hệ thống ra 
		//	UIManager.setLookAndFeel(LookAndFeel.());

			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		
		new MyCalculator();
	}
	
	
	
	// cách sử dụng look and feel 
	
	  
}
