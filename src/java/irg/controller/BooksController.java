/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package irg.controller;

import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
import javax.ws.rs.MatrixParam;

/**
 *
 * @author Mobile Apps
 */
@Path("/books")
public class BooksController {

    @GET
    @Path("{year}")
    public Response getBooks(@PathParam("year") String year, @MatrixParam("author") String author, @MatrixParam("title") String title) {

        return Response.ok(200).entity("Year " + year + " author " + author + " title " +  title ).build();
    }
}
