package th.ac.ku.kps.eng.soa.mid.servlet;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

import th.ac.ku.kps.eng.soa.mid.dao.LecturerDAO;
import th.ac.ku.kps.eng.soa.mid.model.Lecturer;

public class LecturerServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		resp.setContentType("application/json");
		
		ArrayList<Lecturer> listOfLecturer = LecturerDAO.getAllLecturer();
		
		ByteArrayOutputStream op = new ByteArrayOutputStream();
		ObjectMapper mapper = new ObjectMapper();
		
		mapper.writeValue(op, listOfLecturer);
		byte[] data = op.toByteArray();
		out.write(new String(data).toString());
		
	}

}
