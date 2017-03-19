package com.example.android.quakereport;

import java.util.Date;

/**
 * Created by Админ on 08.03.2017.
 */

public class Earthquake {
    private double mMagnitude;
    private String mLocation;
    private long mTimeInMilliseconds;
    private String mUrl;

    public Earthquake(double magnitude, String location, long timeInMilliseconds, String url){
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl = url;
    }
    public double getMagnitude(){
        return mMagnitude;
    }
    public String getLocation(){
        return mLocation;
    }
    public long getTimeInMilliseconds(){
        return mTimeInMilliseconds;
    }
    public String getmUrl(){
        return mUrl;
    }
}
