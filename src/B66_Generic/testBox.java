package B66_Generic;

public class testBox {
 public static void main(String[] args) {
	Box box = new Box(15);
	System.out.println(" giá trị: "+box.getValue());
	
	//	Box box = new Box(15.5); báo lỗi
//	Box box = new Box(" mười lăm" ); báo lỗi
	 // nhưng khi chỉ cần dùng generic là box<t> thì ta có thể 
	// thay đổi cái t đó thành string , double, hay integer, hay float 
	// nó sẽ rất linh hoạt 
	// thì thay vì dung private int a 
	//``````` thì nên   public static void box<t>{
							//private T a

}
}
