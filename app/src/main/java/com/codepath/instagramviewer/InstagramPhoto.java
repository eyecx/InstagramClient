package com.codepath.instagramviewer;

import org.json.JSONArray;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by edmundye on 1/31/15.
 */
public class InstagramPhoto implements Serializable {
    public String username;
    public String caption;
    public String imageUrl;
    public String userProfilePicUrl;
    public String time;
    public ArrayList comments;
    public int imageHeight;
    public int likesCount;
}
