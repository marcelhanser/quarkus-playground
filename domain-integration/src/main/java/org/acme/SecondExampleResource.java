package org.acme;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/usecase")
public class SecondExampleResource {

    @Inject
    private PeripheralServiceUsingUseCase useCase;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return useCase.doSomeUseCaseStuff();
    }
}