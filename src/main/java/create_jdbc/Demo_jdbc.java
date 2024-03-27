package create_jdbc;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

@WebServlet("/demo")
public class Demo_jdbc extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Demo_jdbc() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		System.out.println(100);
		String name = request.getParameter("c_name");
		String password = request.getParameter("pass");
		String mobileNumber=request.getParameter("mobileNo");

		System.out.println("your name is " + name);
		System.out.println("your password is " + password);
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_pac_1", "root",
					"1997");
			PreparedStatement preparedStatement = connection
					.prepareStatement("insert into cust(c_name,c_password,c_mobNo) values(?,?,?)");
			preparedStatement.setString(1, name);
			preparedStatement.setString(2, password);
			preparedStatement.setString(3, mobileNumber);

			int i = preparedStatement.executeUpdate();
			if (i > 0) {
				System.out.println(i + " of number of records is updated");
			} else {
				System.out.println("failed to update");
			}

			connection.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
