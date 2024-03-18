package B66_Generic;

public class TestBox2 {
public static void main(String[] args) {
	Box2 b1 = new Box2<Integer>(15);
	System.out.println(" giá trị: "+b1.getValue());
	
	Box2 b2 = new Box2<String>("hello tú: ");
	System.out.println(" giá trị : "+b2.getValue());
	
	Box2 b3 = new Box2<Double>(12.5);
	System.out.println(" giá trị :"+b3.getValue());
	
	
	
	//	Box box = new Box(15.5); báo lỗi
//	Box box = new Box(" mười lăm" ); báo lỗi
	 // nhưng khi chỉ cần dùng generic là box<t> thì ta có thể 
	// thay đổi cái t đó thành string , double, hay integer, hay float 
	// nó sẽ rất linh hoạt 
	// thì thay vì dung private int a 
	//``````` thì nên   public  class box<t>{
							//private T a
// linh hoạt trong việc suất ra giá trị tùy ý , mà koo cần viêt s
	// lại hay ép kiểu các thứ
	
}
}
