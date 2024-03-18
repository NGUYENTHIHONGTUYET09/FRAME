package B79_thanhPhan_boCuc;

import java.awt.FlowLayout;
import java.util.concurrent.Flow;

import javax.swing.JButton;
import javax.swing.JFrame;

import B70_rename_diChuyen_copy_file_tapTin.viduFile;
import B78_JFrame.ViDu;

/*
 * panel khung lớn chưa
 * label : login, passwd... chú thishc cho ng dùng thấy
 * text field : ng dùng gõ chữ dô
 * button : nút để ấn dô , : ok , reset
 * frame : bảng / cửa sổ có   |- , vuông, x|
 *  controles  : đối tượng điều khiển lựa chonn ấn dô
 *  layout : bố trí các khu vực trong cửa sổ
 *  thêm 1 điều khiển vật chứa (panel)  add(Component c);
 * */



/*
 * FlowLayout : các thành phần xếp thành 1 luồng liên tiếp
 * ( 1 hàng ow nhiều hàng)
 * từ trái sang phải  hoặc ở giữa 
 * 
 * GridLayout: các thành phần được sắp xếp thành 1 
 * lưới các thành phần có kích thước cỡ như nhau (các ô bằng nhau)
 * 
 * BorderLayout: các thành phần đc booss trí lần lượt vào các khu vực 
 * sắp xếp nó tùy ý phía
 * ( bắc - North(trên)
 * / đông - East(phải)
 *  tây - West(trái)
 *   giữa - Center (giữa)  
 * */
public class ViDu_FlowLayout extends JFrame{ // kế thừa all những j cử jframe
	public ViDu_FlowLayout() {
		this.setTitle("ViDu_FlowLayout");
		this.setSize(600,400);
		this.setLocationRelativeTo(null);//  căn chỉnh cho cửa sổ nằm ở giữa màn hình
		
		//set layout
		//FlowLayout button xếp từ trái sang phải
		FlowLayout flowLayout = new FlowLayout();
		FlowLayout flowLayout_1 = new FlowLayout(FlowLayout.RIGHT);// nằm bên phải
		FlowLayout flowLayout_2 = new FlowLayout(FlowLayout.CENTER,50,50);


		//this.setLayout(flowLayout); // phải truyền biến vừa tạo vô
		//this.setLayout(flowLayout_1); // phải truyền biến vừa tạo vô
		this.setLayout(flowLayout_2); // phải truyền biến vừa tạo vô

		
		
		// tạo button
		JButton jButton_1 = new JButton("1");
		JButton jButton_2 = new JButton("2");
		JButton jButton_3 = new JButton("3");
		
		// add các thành phần
		this.add(jButton_1);
		this.add(jButton_2);
		this.add(jButton_3);


		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new ViDu_FlowLayout();
	}

}
