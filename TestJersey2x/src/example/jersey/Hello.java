package example.jersey;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Start at: http://localhost:8080/TestJersey2x/jersey_test/hello
 *
 */
@Path("/hello")
public class Hello {
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	// nature of MIME type
	public String simpleStringResponse() {
		return "hello from the text response of Hello";
	}

	@GET
	@Produces(MediaType.TEXT_HTML)
	// nature of MIME type
	public String simpleHTMLResponse() {
		return "<html> <title> Simple RESTful Hello</title> "
				+ "<body><h2>Hello from the html response of class Hello :)</h2></body></html>";
	}
}
