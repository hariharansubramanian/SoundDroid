package com.example.hari.sounddroid;

import java.util.List;

import retrofit.http.GET;
import retrofit.http.Query;

/**
 * Created by Nicky on 8/31/2015.
 */
public interface SoundCloudService {
    //@GET can only have constants hence we declare as constant
    static final String CLIENT_ID="57ffe342c618cb46f9485d712bb66cbf";

    @GET("/tracks?client_id="+CLIENT_ID)
    public List<Track> searchSongs(@Query("q") String query);

}
