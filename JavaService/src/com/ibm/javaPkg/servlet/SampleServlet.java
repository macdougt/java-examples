package com.ibm.javaPkg.servlet;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/** 
 */
@Path("/v1")
public class SampleServlet {
		
	@GET
	@Path("/subPath")
    @Produces(MediaType.TEXT_PLAIN)     // nature of MIME type  
    public String simpleStringResponse() {  
         return "hello from the text response of Hello";  
    }  
    @GET  
	@Path("/subPath")
    @Produces(MediaType.TEXT_HTML) // nature of MIME type  
    public String simpleHTMLResponse() {  
         return "<html> <title> Simple RESTful Hello</title> "  
                   + "<body><h2>Hello from the html response of class Hello :)</h2></body></html>";  
    } 

	
}
