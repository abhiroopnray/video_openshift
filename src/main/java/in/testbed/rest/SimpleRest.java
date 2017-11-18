package in.testbed.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/v1")
public class SimpleRest {

    @Path("/json")
    @GET
    public Response simpleJsonResponse() {
        return Response.ok().entity(generateData()).build();
    }


    private Status generateData() {
        Status status = new Status();
        status.setCode(200);
        status.setDesc("Simple desc");
        status.setName("Simple name");
        return status;
    }

    class Status {

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
