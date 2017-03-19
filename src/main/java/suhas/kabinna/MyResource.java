package suhas.kabinna;

import java.util.ArrayList;

import suhas.kabinna.DB.*;
import suhas.kabinna.DBService.*;
import javax.ws.rs.GET;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("NBA-Logs")
public class MyResource {


    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public ArrayList<MongoDB_NBA> getIt(@QueryParam("name") String name) {    	
    	ArrayList<MongoDB_NBA>  blogList = null;
    	if ( name.length() >0 ){
	    	name = name.replace("-", " ");
	   		blogList = DBService.getDataByName(name);
	    	     
    	}
    	if ( name.length() == 0 ){
    		
    		blogList = DBService.getAllPlayerNames();
    	}
    	
//    	if(year.length() > 0 ){
//    		System.out.println(year);
//    		blogList = DBService.getDataByName(year);
//    	}
    	
    	return blogList;
    	    	
    }
    
  
    @GET
    @Path("/date")
    @Produces(MediaType.APPLICATION_XML)
    public ArrayList<MongoDB_NBA> getYear(@QueryParam("date") String date) {    	
    	ArrayList<MongoDB_NBA>  blogList = null;
    	if ( date.length() >0 ){
	   		blogList = DBService.getDataByDate(date);	     
    	}
    	
 
    	return blogList; 
    }
    
    
}
