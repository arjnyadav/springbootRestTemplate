
package com.mallikarjun.resttemplate.springboot.domains;

import java.io.Serializable;

public class Company implements Serializable
{

    private String name;
    private String catchPhrase;
    private String bs;
    private final static long serialVersionUID = -5156627477026716814L;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCatchPhrase() {
        return catchPhrase;
    }

    public void setCatchPhrase(String catchPhrase) {
        this.catchPhrase = catchPhrase;
    }

    public String getBs() {
        return bs;
    }

    public void setBs(String bs) {
        this.bs = bs;
    }

}
