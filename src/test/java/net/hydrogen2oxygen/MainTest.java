package net.hydrogen2oxygen;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;
import org.springframework.context.annotation.Bean;

public class MainTest {


	@Test
	public void test() throws Exception {

		Class.forName("org.h2.Driver");
		Connection conn = DriverManager.
		    getConnection("jdbc:h2:~/test");
		conn.close();
	}
}
