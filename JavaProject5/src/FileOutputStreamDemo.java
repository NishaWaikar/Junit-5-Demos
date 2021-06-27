import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
	public static void main(String[] args) {
		FileOutputStream stream = null;
		String str = "This is  data to write in the file";
		try {
			// exception is thrown
			stream = new FileOutputStream("fileIO", true);
			byte[] b = str.getBytes();
			stream.write(b);
			System.out.println("Data written in file");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(stream != null) {
				try {
					stream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
