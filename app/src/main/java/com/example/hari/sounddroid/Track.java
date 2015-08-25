package com.example.hari.sounddroid;

import android.util.Log;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Nicky on 8/24/2015.
 */
public class Track {
    private String title;
    private String streamURL;
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

    public static Track parseJSON(JSONObject jsonObject){
        Track t=new Track();
        try {
            t.setTitle(jsonObject.getString("title"));
            Log.d("Track details","Track title is"+t.getTitle());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return t;

    }
}

