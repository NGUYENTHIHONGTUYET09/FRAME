package B67_file_folder;

import java.io.File;
import java.io.IOException;

public class create_file_folder {

	/// tạo tập tin và thư mục
	public static void main(String[] args) {
		
		// lưu ý:
		/*windown : \ => \\  ví dụ "C:\\thu muc 1\\thu mục 2\\ tep.docx......
		 
		 *linux, macOS ko dùng
		 * */
		 
		File folder1 = new File("C:\\Users\\LENOVO\\eclipse-workspace\\a6_TITV\\src\\B67_file_folder");
		//ktra file /folder có tồn tại chưa
		System.out.println(" kta f/f có tồn tại hay ko: "+folder1.exists()); 
		// => kq là đã tồn tại ; true
		
		// tạo thư mục
		// phương thức mkdir()  make diractory => tạo 1 thư mục
		File d1 = new File("C:\\Users\\LENOVO\\eclipse-workspace\\a6_TITV\\src\\B67_file_folder\\Directory_1");
		d1.mkdir();
		

		// phương thức mkdirs() -> tạo ra nhiều thư mục cùng lúc
		File d2 = new File("C:\\Users\\LENOVO\\eclipse-workspace\\a6_TITV\\src\\B67_file_folder\\Directory_1\\Directory_2\\Directory_3");
		d2.mkdirs();
		// kq cho ra 4 trong 3 trong 2 trong 1
		
		
		// tạo tập tin( có phần mở rộng .exe,  .txt,  .doc, .xls...
		File file1 = new File("C:\\Users\\LENOVO\\eclipse-workspace\\a6_TITV\\src\\B67_file_folder\\Directory_1\\vidu1.txt");
		try {
			file1.createNewFile();
		} catch (IOException e) {
			//ko có quyền tạo tập tin
			// ở cứng bị đầy
			// đường dẫn bị sai
			e.printStackTrace();
		}
		// try catch : ko phải cái nào cũng làm việc đc với cái j
		// thì cấp quyền cho nó thì bọc nó bằng try-catch 
		
		
		// khi tạo xong , nó có rồi thì nó sẽ ko tạo cái mới nữa
		// muôn skix thì ktra trước khi tạo 
	}
}
