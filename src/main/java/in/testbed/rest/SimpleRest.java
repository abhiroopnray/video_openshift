package in.testbed.rest;


import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import java.util.logging.Logger;

@Path("/v1")
@RequestScoped
public class SimpleRest {

    private static Logger LOG = Logger.getLogger(SimpleRest.class.getSimpleName());

    @Path("/json")
    @GET
    public Response simpleJsonResponse() {

        return Response.ok().entity(generateData()).build();
    }

    @PostConstruct
    public void init() {
        LOG.info("initialized the class");
    }


    private Status generateData() {
        Status status = new Status();
        status.setCode(200);
        status.setDesc("Simple desc");
        status.setName("Simple name");
        return status;
    }

    private class Status {

        private String name;
        private String desc;
        private int code;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public int getCode() {
            return code;
        }

        public void setCode(int code) {
            this.code = code;
        }
    }
}
