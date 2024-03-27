package login_and_validation;

import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;
import java.io.*;
import java.sql.*;

@WebServlet("/login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Login() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

//		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String email = request.getParameter("email");
		String pass = request.getParameter("password");

		System.out.println("my email is " + email + ",\n my password is" + pass);
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_pac_1", "root",
					"1997");
			PreparedStatement preparedStatement = connection
					.prepareStatement("select * from signup where c_email=? and c_password=?;");

			preparedStatement.setString(1, email);
			preparedStatement.setString(2, pass);

			ResultSet resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {
				try {
					Thread.sleep(3000);

					System.out.println("my name is " + resultSet.getString("c_name"));
					response.sendRedirect("sucess.html");
				} catch (Exception e) {
					e.printStackTrace();
				}
			} else {
				response.sendRedirect("failed.html");

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
