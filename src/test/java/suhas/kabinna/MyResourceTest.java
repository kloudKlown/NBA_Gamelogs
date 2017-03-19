package suhas.kabinna;

import java.util.ArrayList;


import javax.ws.rs.GET;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.glassfish.jersey.test.JerseyTest;

import suhas.kabinna.MyResource;

public class MyResourceTest extends JerseyTest {

//    @Override
//    protected Application configure() {
//        return new ResourceConfig(MyResource.class);
//    }
//
//    /**
//     * Test to see that the message "Got it!" is sent in the response.
//     */
//    @Test
//    public void testGetIt() {
//        final String responseMsg = target().path("myresource").request().get(String.class);
//
//        assertEquals("Hello, Heroku!", responseMsg);
//    }
}
