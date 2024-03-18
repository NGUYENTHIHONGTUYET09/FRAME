package B62_Stack;

import java.util.Scanner;
import java.util.Stack;

public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Stack<String> stackChuoi = new Stack<String>();
		//
		// stackChuoi.push("giá trị ") -> đưa gia trị vào stack
		// stackChuoi.pop() -> lấy giá trị ra , và xóa khỏi stack
		// stackChuoi.peek() -> lấy giá trị ra , nhưng ko xóa khỏi stack
		// stackChuoi.clear(); -> xóa tất cả phần tử trong stack
		// stackChuoi.contains(stackChuoi) -> xác định giá trị stackChuoi có tồn tại
		// trong stack hay ko
		// stackChuoi.size()=> độ lớn cua stack

		// ví dụ đảo ngược chuỗi
		System.out.println("nhập vào chuỗi: ");
		String s = sc.nextLine();
		// titv
		for (int i = 0; i < s.length(); i++) {
			stackChuoi.push(s.charAt(i) + "");
		}
		System.out.println("Chuỗi đảo ngược: ");
		for (int i = 0; i < s.length(); i++) {
			System.out.print(stackChuoi.pop());
		}

		System.out.println("\n");
		// chuyển từ thập sang nhị phaan
		Stack<String > stackSoDu = new Stack<String>();
		System.out.println(" \n nhập 1 số nguyên dương: ");
		int x = sc.nextInt();
		while (x > 0) {
			int soDu = x % 2;
			stackSoDu.push(soDu + " ");
			x = x / 2;
		}
		System.out.println(" số nhị phân là: ");
		int n = stackSoDu.size();
		for (int i = 0; i < n; i++) {
			System.out.print(stackSoDu.pop());

		}
	}
}
