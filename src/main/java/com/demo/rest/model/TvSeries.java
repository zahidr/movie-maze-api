package com.demo.rest.model;
import java.net.URL;

public class TvSeries {

    private Long id;
    private URL url;
    private String name;
    private String language;
    private URL officialSite;

    public URL getOfficialSite() {
        return officialSite;
    }

    public void setOfficialSite(URL officialSite) {
        this.officialSite = officialSite;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public URL getUrl() {
        return url;
    }

    public void setUrl(URL url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
