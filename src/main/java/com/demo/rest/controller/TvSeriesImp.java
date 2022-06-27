package com.demo.rest.controller;

import com.demo.rest.model.TvSeries;
import com.demo.rest.stub.TvSeriesStub;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import java.util.ArrayList;
import java.util.List;

@Path("tvseries")
public class TvSeriesImp {

    @Inject
    @RestClient
    private TvSeriesStub proxy;

    private List<TvSeries> episodes = new ArrayList();
    private  TvSeries episode;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response get() {
            TvSeries episode = proxy.get("game of thrones");
            episodes.add(episode);
            return Response.ok(episodes).build();
    }
}
