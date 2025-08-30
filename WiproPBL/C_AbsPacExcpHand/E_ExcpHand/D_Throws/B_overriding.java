import java.io.IOException;
import java.io.FileNotFoundException;
import java.sql.SQLException;

// this rule won't apply for unchecked exceptions (runtime related)
// rule is the overriding method can only throw the same or subclass exception (learn more from example)
// think like if parent is telling you this method will throw these type of exceptions
// you can either throw the same or more specific (subclass exceptions) not completely different types of exceptions
// NOTE : HERE YOU ARE MODIFYING THE METHOD AND IF IT IS SAID TO THROW AN EXCEPTION OF CERTAIN TYPE
// THE METHOD YOU CREATE SHOULD BE EITHER DECLARED TO THROW THE SAME OR SOME SPECIALIZED FORM OF IT
// YOU CAN'T GO TO ANOTHER TYPE OF EXCEPTION
public class B_overriding extends parent {

	// void method1() throws SQLException{//the overriding method should not throw
	// the sibling Exception class (parallel)
	// void method1() throws Exception{}//it should not throw the parent class

	// void method1() throws IOException { // acceptable
	// 	// throw new SQLException();//not compatable
	// 	throw new IOException();
	// }

	void method1() throws FileNotFoundException{
	//throw new SQLException();
		throw new FileNotFoundException();
	}
	// this is also correct as FileNotFoundException is a subclass of IOException

	void method2() throws IOException { // IOException is subclass of Exception
		// throw new SQLException(); // err : unreported exception SQLException; must be caught or declared to be thrown
		// meaning : the method must handle or declare the SQLException
		throw new FileNotFoundException();
	}

	public static void main(String[] args) {
	}
}

class parent {
	void method1() throws IOException {
		throw new IOException();
	}
	void method2() throws Exception {
		throw new SQLException();
	}
}