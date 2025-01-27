package th.ac.ku.kps.eng.soa.mid.controller;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import th.ac.ku.kps.eng.soa.mid.dao.DepartmentDAO;
import th.ac.ku.kps.eng.soa.mid.model.Department;
import th.ac.ku.kps.eng.soa.mid.model.Lecturer;

@Path("/services")
public class DepartmentService {
	
	 DepartmentDAO depDao = new DepartmentDAO();
	 @GET
	 @Path("/departments")
	 @Produces(MediaType.APPLICATION_JSON)
	 public List<Department> getUsers(){
		 return depDao.getAllDepartment();
	 }
	 
	 @GET
	 @Path("/departments/{param}")
	 @Produces(MediaType.APPLICATION_JSON)
	 public Department getDepartmentByid(@PathParam("param") String id){
		 return depDao.getDepartmentById(id);
	 }

}
