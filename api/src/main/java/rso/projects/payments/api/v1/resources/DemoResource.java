package rso.projects.payments.api.v1.resources;

import com.kumuluz.ee.common.runtime.EeRuntime;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("demo")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@ApplicationScoped
public class DemoResource {

    @GET
    @Path("instanceid")
    public Response getInstanceId() {

        String instanceId =
                "{\"instanceId\" : \"" + EeRuntime.getInstance().getInstanceId() + "\"}";

        return Response.ok(instanceId).build();
    }

    @POST
    @Path("load")
    public Response loadPayment(Integer n) {

        for (int i = 1; i <= n; i++) {
            fibonacci(i);
        }

        return Response.status(Response.Status.OK).build();
    }

    private long fibonacci(int n) {
        if (n <= 1) return n;
        else return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
