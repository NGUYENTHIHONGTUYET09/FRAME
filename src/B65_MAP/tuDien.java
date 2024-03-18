package B65_MAP;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/*map là 1 interface đại diện cho 1 đối tượng chứa các ánh xạ giữa 
 * các khóa ( key) và các value .
 * mỗi khóa sẽ tương ứng với 1 giá trị , 
 * ví dụ như danh bạ điện thoại 
 * + số điện thoại là khóa 
 * + và tên người  là giá trị 
 * + mỗi khóa sẽ tương ứng với duy nhất 1 giá trị 
 * 
 
 
  */
//TreeMap sắp xếp có thứ tự
//hashmap  sắp xếp ko có thứ tự

//tra từ điển anh việt

public class tuDien { // từ điển

	private Map<String, String> data = new TreeMap<String, String>(); // k là key , v là value viết - string

	// khi ta ko tạo contrutor thì mắc định nó sẽ có 1 constructor rỗng

	
	public tuDien(Map<String, String> data) {
 		this.data = data;
	}

	public tuDien() {
 	}

	// 1. thêm từ vào
	public String themTu(String tuKhoa, String yNghia) {
		return this.data.put(tuKhoa, yNghia);
	}

	 
	// 2. xoa từ
	public String xoaTu(String tuKhoa) {
		return this.data.remove(tuKhoa);
	}

	// 3. tìm ý nghĩa của từ
	public String TraTu(String tuKhoa) {
		String yNghia = this.data.get(tuKhoa);
		return yNghia;
	}

	// 4. in ra danh sách từ khóa
	public void InTuKhoa() {
		Set<String> tapHopTuKhoa = this.data.keySet();
		// keyset() -> lấy ra toàn bộ các từ khóa
		System.out.println(Arrays.toString(tapHopTuKhoa.toArray())); // đưa mảng về chuỗi
	}

	// 5. in ra số lượng
	public int soluong() {
		return this.data.size();
	}

	// 6. xóa all các từ khóa
	public void xoaAllTuKhoa() {
		this.data.clear();
	}

	public static void main(String[] args) {
		// tạo 1 td1 mới
		System.out.println(" lựa chọn :");
		tuDien tuDien = new tuDien();
		int luachon = 0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("---------------------------------");
			System.out.println("***MENU***\n");
			System.out.println("Tra từ điển anh việt \n" 
					+ "1. thêm từ \n" 
					+ "2. xóa từ \n" 
					+ "3. tìm ý nghĩa \n"
					+ "4. in ra danh sách từ khóa  \n" 
					+ "5. in ra số lượng từ \n" 
					+ "6. xóa all các từ khóa.\n" 
					+ "0 thoát khỏi chương trình \n ");
			
			luachon = sc.nextInt();
			if (luachon == 1) {
				System.out.println(" nhập vào từ khóa:");
				String tuKhoa = sc.nextLine();
				sc.nextLine();
				System.out.println(" nhập vào ý nghĩa: ");
				String yNghia = sc.nextLine();
				tuDien.themTu(tuKhoa, yNghia); // gán td1 mới tạo vào them tu
			}else if (luachon == 2 || luachon == 3) {
				System.out.println(" nhập vào từ khóa: ");
				String tuKhoa = sc.nextLine();
				if (luachon == 2) {
					tuDien.xoaTu(tuKhoa);
				} else {
					System.out.println("ý nghĩa là: " + tuDien.TraTu(tuKhoa));
				}
			} else if (luachon == 4) {
				tuDien.InTuKhoa();
			} else if (luachon == 5) {
				System.out.println(" số lượng từ khóa là: " + tuDien.soluong());
			} else if (luachon == 6) {
				tuDien.xoaAllTuKhoa();

			}

		} while (luachon != 0);

	}

}
