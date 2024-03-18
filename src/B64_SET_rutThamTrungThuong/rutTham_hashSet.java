package B64_SET_rutThamTrungThuong;
/*HashSet
 * khi xuất ra các kết quả như mảng thì sẽ ko tự động sắp xếp 
 * mà cái nào vào trước thì xếp trước 
 * vd 3.6.4.7.5.8.4.*/
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

// set là tập hợp

public class rutTham_hashSet {
	Set<String> thungPhieuDuThuong = new HashSet<String>(); // tạo thùng đựng phiếu

	public rutTham_hashSet() {
	}

	// 1. them phiếu
	public boolean themPhieu(String giaTri) {
		return this.thungPhieuDuThuong.add(giaTri);
	}

	// 2. xóa
	public boolean xoaPhieu(String giTri) {
		return this.thungPhieuDuThuong.remove(giTri);

	}

	// 3. ktr phiếu tồn tai
	public boolean ktraTonTai(String giaTri) {
		return this.thungPhieuDuThuong.contains(giaTri);
	}

	// 4. xóa all phiếu
	public void xoaAllPhieu() {
		this.thungPhieuDuThuong.clear();
	}

	// 5. số lượng phiếu
	public int soluongPhieu() {
		return this.thungPhieuDuThuong.size();
	}

	// 6.rút thăm trúng thưởng
	public String rutTham1Phieu() {
		String ketqua = "";
		Random rd = new Random();
		int viTri = rd.nextInt(this.thungPhieuDuThuong.size()); // lấy ra các vị trí có trrong thùng phiếu thôi
		ketqua = (String) this.thungPhieuDuThuong.toArray()[viTri];
		return ketqua;

	}
	
	
	public void inAll() {
		System.out.println(Arrays.toString(this.thungPhieuDuThuong.toArray()));
	}

	public static void main(String[] args) {
		// menu
		int luachon = 0;
		Scanner sc = new Scanner(System.in);
		rutTham_hashSet rt = new rutTham_hashSet();
		do {
			System.out.println("--------------------------------------");
			System.out.println("***MENU***");
			System.out.println(" 1. thêm mã số dự thưởng ");
			System.out.println(" 2. xóa mã số dự thưởng ");
			System.out.println(" 3. ktra số dự thưởng có tồn tại ko: ");
			System.out.println(" 4. xoa all phiếu dự thưởng: ");
			System.out.println(" 5. số lượng phiếu dự thưởng:  ");
			System.out.println(" 6. rút thăm trúng thưởng:  ");
			System.out.println(" 7. in ra all các phiếu");
			System.out.println(" 0. thoát khỏi chương trình");

			luachon = sc.nextInt();
			sc.nextLine();
			if(luachon == 1 || luachon ==2 || luachon == 3) {
				System.out.println(" nhập vào mã phiếu dự thưởng");
				String giaTri = sc.nextLine();
				if(luachon ==1) {
					rt.themPhieu(giaTri);
				}else if( luachon ==2) {
					rt.xoaAllPhieu();
				}
				else {
					System.out.println(" kết quả  ktr: "+rt.ktraTonTai(giaTri));
				}
			}else if( luachon == 4) {
				rt.xoaAllPhieu();
			}else if( luachon ==5) {
				System.out.println(" số lượng phiếu là: "+rt.soluongPhieu());
			}
			else if(luachon ==6) {
				System.out.println(" mã số trúng thưởng là: "+rt.rutTham1Phieu());
			}else if( luachon ==7) {
				System.out.println(" các mã phiếu dự thưởng là: ");
				rt.inAll();
			}
			else {
				System.out.println("///////////////////////////");
			}
			
			
		}while(luachon!=0);

}

}
