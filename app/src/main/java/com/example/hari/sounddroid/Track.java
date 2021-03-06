package com.example.hari.sounddroid;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Nicky on 8/24/2015.
 */
public class Track {
    @SerializedName("title") //Tells Gson to map private member title to the 'title' in Json string
    private String title;
    @SerializedName("stream_url") //streamURL to json member 'stream_url'
    private String streamURL;
    @SerializedName("id")  //id to json member 'id'
    private int id;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStreamURL() {
        return streamURL;
    }

    public void setStreamURL(String streamURL) {
        this.streamURL = streamURL;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}

