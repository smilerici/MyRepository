package ch18.sec05.exam08_objectinputstream_objectoutputstream;

import java.io.*;

public class NonSerializableFarentExample {
	public static void main(String[] args) throws Exception{
		FileOutputStream fos = new FileOutputStream("C:/Temp/Object.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		Child child = new Child();
		child.field1 = "홍길동";
		child.field2 = "홍삼원";
		
		oos.writeObject(child);
		oos.flush();
		oos.close();
		fos.close();
		
		FileInputStream fis = new FileInputStream("C:/Temp/Object.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Child v = (Child) ois.readObject();
		System.out.println("field1 : "+v.field1);
		System.out.println("field2 : "+v.field2);
		ois.close();
		fis.close();
		
	}
}
