
package com.mallikarjun.resttemplate.springboot.domains;

import java.io.Serializable;

public class Geo implements Serializable
{

    private String lat;
    private String lng;
    private final static long serialVersionUID = 9005147717143479196L;

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

}
