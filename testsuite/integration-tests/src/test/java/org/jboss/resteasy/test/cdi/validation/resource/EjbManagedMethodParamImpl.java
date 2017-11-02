package org.jboss.resteasy.test.cdi.validation.resource;

import javax.ejb.Stateless;
import javax.validation.Valid;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Stateless
@Path("ejbManaged")
public class EjbManagedMethodParamImpl {

    @POST
    public void postBean(@Valid EjbParam ejbParam) {
    }
}
