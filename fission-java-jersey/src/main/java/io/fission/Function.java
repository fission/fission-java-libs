package io.fission;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Request;

public interface Function<ContainerRequestContext, Response> {
	
	Response call(ContainerRequestContext req, Context context);

}
