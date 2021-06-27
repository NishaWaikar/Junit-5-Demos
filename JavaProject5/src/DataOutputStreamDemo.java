import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamDemo {
	public static void main(String[] args) {
		DataOutputStream stream = null;
		
		try {
			stream = new DataOutputStream(new FileOutputStream("dataIO"));
			stream.writeInt(10);
			stream.writeFloat(12.34f);
			stream.writeBoolean(true);
			stream.writeChar('A');
			stream.writeDouble(23.56);
			System.out.println("Primitives written in file");
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
