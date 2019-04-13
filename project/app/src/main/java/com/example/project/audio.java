package com.example.project;

import com.google.gson.annotations.SerializedName;

public class audio {

    @SerializedName("title")
    private String name;

    @SerializedName("singger")
    private String singger;

    @SerializedName("id")
    private int id;

    public audio(String name, String singger, int id) {
        this.name = name;
        this.singger = singger;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSingger() {
        return singger;
    }

    public void setSingger(String singger) {
        this.singger = singger;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
