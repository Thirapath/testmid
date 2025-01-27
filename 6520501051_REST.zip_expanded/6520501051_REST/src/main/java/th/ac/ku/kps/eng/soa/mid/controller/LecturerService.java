package th.ac.ku.kps.eng.soa.mid.controller;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import th.ac.ku.kps.eng.soa.mid.dao.LecturerDAO;
import th.ac.ku.kps.eng.soa.mid.model.Lecturer;

@Path("/services")
public class LecturerService {
	
	LecturerDAO lecDao = new LecturerDAO();
	 @GET
	 @Path("/lecturers")
	 @Produces(MediaType.APPLICATION_JSON)
	 public List<Lecturer> getUsers(){
		 return lecDao.getAllLecturer();
	 }
	 
	 @GET
	 @Path("/lecturers/{param}")
	 public Lecturer getLecturerByid(@PathParam("param") int id){
		 return lecDao.getLecturerById(id);
	 }

}
