//throws is used to indicate the potential threat by the method
//not necessarily thrown by it

import java.io.FileNotFoundException;

public class A_throws {
	public static void main(String[] args) {
		try {
			throwOne();//inside throwOne method
		}catch (Exception e) {
			System.out.println(e);//java.io.FileNotFoundException
		}
	}
	//static void throwOne() {}//ERror unhandled exception
	// indicating that this method can throw these exceptions
	static void throwOne()  throws Exception, FileNotFoundException{
		System.out.println("inside throwOne method");
		throw new FileNotFoundException();
	}
}
