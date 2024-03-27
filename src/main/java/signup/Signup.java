package signup;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

@WebServlet("/sign")
public class Signup extends HttpServlet{
	private static final long serialVersionUID = 1L;
       
    
    public Signup() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String name,dob,mobile_number,address,email,password;
		name=request.getParameter("name");
		dob=request.getParameter("date");
		mobile_number=request.getParameter("mobNo");
		address=request.getParameter("address");
		email=request.getParameter("email");
		password=request.getParameter("pass");
		
		System.out.println("my name is"+name+"\n and i was born on "+dob+"\n my mobile number is "+mobile_number+
				"\n and my address is "+address+"\n my email is "+email+"\n and my password is "+password);
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_pac_1","root","1997");
			PreparedStatement preparedStatement=connection.prepareStatement("insert into signup(c_name,c_dob,c_email,c_password,c_mobNo,c_adres) values(?,?,?,?,?,?);");
			
			preparedStatement.setString(1, name);
			preparedStatement.setString(2, dob);
			preparedStatement.setString(3, email);
			preparedStatement.setString(4, password);
			preparedStatement.setString(5, mobile_number);
			preparedStatement.setString(6, address);
			
			int i=preparedStatement.executeUpdate();
			if(i>0) {
				System.out.println("updated");
				try {
					Thread.sleep(3000);
					System.out.println("sleep for 3 seconds");
					response.sendRedirect("login.jsp");
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
			else {
				System.out.println("failed");
				try {
					Thread.sleep(3000);
					System.out.println("sleep for 3 seconds");
				} catch (Exception e) {
					e.printStackTrace();
				}
				response.sendRedirect("index.jsp");
			}
			

//			if (name == null || name.trim().isEmpty() ||
//				    dob == null || dob.trim().isEmpty() ||
//				    mobile_number == null || mobile_number.trim().isEmpty() ||
//				    address == null || address.trim().isEmpty() ||
//				    email == null || email.trim().isEmpty() ||
//				    password == null || password.trim().isEmpty()) {
//				    System.out.println("null or empty");
//				} else {
//				    System.out.println("value");
//				}
			connection.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
