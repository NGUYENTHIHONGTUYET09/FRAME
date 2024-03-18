package B59_ENUM;

public class test {
	public static void main(String[] args) {
	thoiKHoaBieu tkb2 = new thoiKHoaBieu(Day.Monday, "toán , lý, hóa");
	thoiKHoaBieu tkb3 = new thoiKHoaBieu(Day.Tuesday, " văn, sử , địa");
	thoiKHoaBieu tkb4 = new thoiKHoaBieu(Day.Wednesday, " lý, hóa , sinh");
	thoiKHoaBieu tkb5 = new thoiKHoaBieu(Day.Thursday, " tin, gd , td");
	
	System.out.println(tkb5);
	
	//test class tháng
	int x = Thang.Thang_1.soNgay();
	System.out.println("so ngay cua thang 1: có " +x +" ngày");
	
	
	}
	
}
// run ko báo lỗi thì thành công