package B70_rename_diChuyen_copy_file_tapTin;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

// đổi tên filee = hàm renameTo
//--------------------------------------------------------------------------------

public class viduFile {
	public static void copyAll(File f1, File f2) {
		// copy xong ghi đè lên lun
		try {
			Files.copy(f1.toPath(), f2.toPath(), StandardCopyOption.REPLACE_EXISTING);

		} catch (IOException e) {
			e.printStackTrace();
		}
		if(f1.isDirectory()) {
			//coppy các tập tin và thư mục con
		 	File[] mangCon = f1.listFiles();
			for(File file : mangCon) {
				File file_new = new File(f2.getAbsoluteFile()+"/"+file.getName());
				copyAll(file, file_new);
			}
 				
		}
	}
	//--------------------------------------------------------------------------------

	public static void main(String[] args) {
		// tạo file .txt
		File file1 = new File("C:\\Users\\LENOVO\\eclipse-workspace\\a6_TITV\\src\\B70_rename_diChuyen_copy_file_tapTin/File_1.txt");
		file1.mkdir();
		//--------------------------------------------------------------------------------
		// đặt vấn đề
		// f0 là file đã có sẵn( vừa đc tạo xong)
		// f1 là tên mới để thay cho f1
		File f0 = new File(
				"C:\\Users\\LENOVO\\eclipse-workspace\\a6_TITV\\src\\B70_rename_diChuyen_copy_file_tapTin/File_1.txt");
		File f1 = new File(
				"C:\\Users\\LENOVO\\eclipse-workspace\\a6_TITV\\src\\B70_rename_diChuyen_copy_file_tapTin/File_2.txt");
		File f2 = new File(
				"C:\\Users\\LENOVO\\eclipse-workspace\\a6_TITV\\src\\B70_rename_diChuyen_copy_file_tapTin/File_2xyz.txt");
		//--------------------------------------------------------------------------------

// 1. thay đổi tên file or folder
		//--------------------------------------------------------------------------------
		// cách 1. sử dụng file để thay đổi tên thông thường
		// f0.renameTo(f1);
		//--------------------------------------------------------------------------------

		// cách 2 , sử dụng file để thay dổi tên bằng xong thì biến thành file riêng
		// ko làm mất tên và file cũ / giống như tự tạo ra file mới có tên mới
//		try {
//			Files.move(f1.toPath(), f2.toPath(), StandardCopyOption.REPLACE_EXISTING);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//				
		//--------------------------------------------------------------------------------
// 2. di chuyển file File_2xyz.txt vào f1
//		File f_2new = new File("C:\\Users\\LENOVO\\eclipse-workspace\\a6_TITV\\src\\B70_rename_diChuyen_copy_file_tapTin\\f1\\File_2xyz.txt");
//		try {
//			Files.move(f2.toPath(), f_2new.toPath(), StandardCopyOption.REPLACE_EXISTING);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		if (f1.isDirectory()) {
//			// coppy các tập tin và thư mục con
//			File[] mangCon = f1.listFiles();
//			for (File file : mangCon) {
//				File file_new = new File(f2.getAbsoluteFile() + "/" + file.getName());
//			}
//
//		}
		//--------------------------------------------------------------------------------

//3. copy file
		//--------------------------------------------------------------------------------
		// biến coppy py f1 thành file f1_copy ( mới chị copy cái hộp còn cái ruột thì chưa , đợi hàm sau)
		File f_0 = new File("C:\\Users\\LENOVO\\eclipse-workspace\\a6_TITV\\src\\B70_rename_diChuyen_copy_file_tapTin\\f0");
		File f_0_copy = new File("C:\\Users\\LENOVO\\eclipse-workspace\\a6_TITV\\src\\B70_rename_diChuyen_copy_file_tapTin\\f0_copy");
		try {
			Files.copy(f_0.toPath(), f_0_copy.toPath(), StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// hàm này sẽ giúp coppy cả những cái con trong f1 sáng f1-copy
		// hàm này đc viết phía trên
		// tìm nó = cách ctrl + click vào nó
		viduFile.copyAll(f_0, f_0_copy);
		//--------------------------------------------------------------------------------
// all các câu lệch đều thành công
// chạy đoạn nào thì bật đoạn đó lên, 
// ko chạy cùng lúc để tránh xung đột
		//OKE
		
		

		
		
	}
}