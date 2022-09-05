package exception;

public class finallyExample {
	public static void main(String[] args) {
		try {
			System.out.println("JDBC/File Connection opened...");//opened JDBC/File connection.
			int i=100/10;
			System.out.println(i);
			//closing connection ...
			//system.out.println("inside try,JDBC/file connection closed ...");
		}
		catch (NullPointerException e) {
			// closing connection ...
			//system.out.println("Inside catch,JDBC/file Connection closed ...");
		}
		finally {
			System.out.println("Inside finally,JDBC/file connection closed...");
		}
	}

}
