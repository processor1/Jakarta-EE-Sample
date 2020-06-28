/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package irg.controller;

import javax.ws.rs.Path;
import javax.ws.rs.POST;
import javax.ws.rs.FormParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

/**
 *
 * @author Mobile Apps
 */
@Path("/user")
public class UserController {

    @POST
    @Produces(MediaType.TEXT_PLAIN)
    public Response form(@FormParam("email") String email, @FormParam("pwd") String pwd) {
        String user_info = "Name  " + email +" ";
        String user_info_ = " Password  " + pwd;

        return Response.ok(200).entity(user_info + user_info_).build();

    }
}
