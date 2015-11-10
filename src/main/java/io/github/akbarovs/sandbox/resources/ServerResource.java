package io.github.akbarovs.sandbox.resources;

import com.google.common.base.Optional;
import com.google.common.collect.Maps;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.util.Map;
import java.util.stream.Stream;

/**
 * ServerResource
 */
@Path("/server")
@Produces(MediaType.APPLICATION_JSON)
public class ServerResource {

    @GET
    public Map<String, String> list(@QueryParam("name") Optional<String> name) {
        Map<String, String> res = Maps.newHashMap();
        res.put("a", "Hello, world");
        res.put("name", "Your name is " + name.or("John Doe"));
        Stream.of(1, 2, 3, 4);

        final String test = test();

        return res;
    }

    private String test() {
        System.out.println("test");
        return "A";
    }
}
