package com.xdh;

import com.xdh.info.Result;
import com.xdh.info.request.LoginMessage;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * @Package: com.xdh
 * @ClassName: ServiceRESTFul
 * @Description: TODO
 * @Author: LaoShiRen
 * @CreateDate: 2019-07-13 15:19
 * @Version: 1.0
 */
@Produces({ MediaType.APPLICATION_JSON })
@Consumes({ MediaType.APPLICATION_JSON })
public interface ServiceRESTFul {

    @POST
    @Path("/login")
    Result<Object> login(LoginMessage message);

}
