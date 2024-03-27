package delete;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

@WebServlet("/delete")
public class Delete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Delete() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String mobile_number;
//		name=request.getParameter("name");
		mobile_number=request.getParameter("mobNo");
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_pac_1","root","1997");
		PreparedStatement preparedStatement=connection.prepareStatement("delete from signup where c_mobNo=?;");
	    
//		preparedStatement.setString(1, name);
		preparedStatement.setString(1, mobile_number);
		
		int i=preparedStatement.executeUpdate();
		
		if (i>0) {
			System.out.println("delete");
		} else {
            System.out.println("deletion failed");
		}
		
		connection.close();
		
		} catch (Exception e) {
		e.printStackTrace();
	}
	}

}
