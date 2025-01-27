package th.ac.ku.kps.eng.soa.mid.controller;

import java.io.IOException;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

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
	 
	 @POST
	 @Path("/lecturers/create")
	 @Consumes(MediaType.APPLICATION_JSON)
	 public Response createLecturer(Lecturer lec) throws IOException {
	 int i = lecDao.addLecturer(lec);
	 if (i == 1)
		 return Response.status(201).entity("create successfully").build();
	 else
		 return Response.status(201).entity("create fail").build();
	 }

}
