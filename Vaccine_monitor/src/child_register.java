

import java.io.IOException;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class child_register
 */
public class child_register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public child_register() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String name;
		String wod;
		String identifiers;
		String ta;
		String mmob;
		
		if(request.getParameter("name")==null){
			 name="no name";
		}
		else{
			 name =request.getParameter("name");
		}
		
		if(request.getParameter("wod")==null){
			 wod="null";
		}
		else{
			 wod =request.getParameter("wod");
		}
		
		if(request.getParameter("identifiers")==null){
			 identifiers="null";
		}
		else{
			 identifiers =request.getParameter("identifiers");
		}
		
		if(request.getParameter("ta")==null){
			 ta="null";
		}
		else{
			 ta =request.getParameter("ta");
		}
		
		if(request.getParameter("mmob")==null){
			 mmob="null";
		}
		else{
			 mmob =request.getParameter("mmob");
		
		 
		String dob =request.getParameter("dob");
		String tob =request.getParameter("tob");
		String sex =request.getParameter("sex");
		String wob =request.getParameter("wob");
		String delivery =request.getParameter("delivery");
		String metabolic_screening =request.getParameter("metabolic_screening");
		String tg =request.getParameter("tg");
		String gyne =request.getParameter("gyne");
		String mname =request.getParameter("mname");
		String fname =request.getParameter("fname");
		String fmob =request.getParameter("fmob");
		String address =request.getParameter("address");
		String height =request.getParameter("height");
		String bg =request.getParameter("bg");
		String hospital =request.getParameter("hospital");
		
		ServletContext sc=getServletContext();
		String driver=sc.getInitParameter("driver");
		String url=sc.getInitParameter("url");
		String user1=sc.getInitParameter("user");
		String password=sc.getInitParameter("password");
	
		try{
			
			
			Class.forName(driver);
			Connection conn = DriverManager.getConnection(url,user1,password);

			PreparedStatement ps = conn.prepareStatement("insert into child_login("
		+ "name,dob,tob,sex,wob,wod,delivery,identifiers,metabolic_screening,tg,ta,gyne,mname,fname,fmob,mmob,address,height,bg,hospital) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);");
			ps.setString(1,name);
			ps.setString(2,dob);
			ps.setString(3,tob);
			ps.setString(4,sex);
			ps.setString(5,wob);
			ps.setString(6,wod);
			ps.setString(7,delivery);
			ps.setString(8,identifiers);
			ps.setString(9,metabolic_screening);
			ps.setString(10,tg);
			ps.setString(11,ta);
			ps.setString(12,gyne);
			ps.setString(13,mname);
			ps.setString(14,fname);
			ps.setString(15,fmob);
			ps.setString(16,mmob);
			ps.setString(17,address);
			ps.setString(18,height);
			ps.setString(19,bg);
			ps.setString(20,hospital);
			
			
			
			
			int i = ps.executeUpdate();
			if(i>0){
				
				out.print("<div id=header style=background-color:#AAA500;> <h4 style=margin-centers:700;>" +
				  "done with quality</h4></div>");
		
		RequestDispatcher rd=request.getRequestDispatcher("child_info.jsp");
		rd.include(request, response);
			
			sms sms12=new sms();
			
			}
		}catch(Exception e1){
			e1.printStackTrace();
			
		}

		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
