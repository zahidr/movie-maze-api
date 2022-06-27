package com.demo.rest.stub;

import com.demo.rest.model.TvSeries;
import jakarta.enterprise.context.Dependent;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@Dependent
@RegisterRestClient(baseUri = "https://api.tvmaze.com/singlesearch/")
public interface TvSeriesStub extends AutoCloseable{

    @Path("shows")
    @GET
    TvSeries get(@QueryParam("q") String title);
}
