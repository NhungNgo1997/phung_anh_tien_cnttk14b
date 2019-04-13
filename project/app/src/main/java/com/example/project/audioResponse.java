package com.example.project;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class audioResponse {
    private List<audio> audioList;

    public audioResponse(List<audio> audioList) {
        this.audioList = audioList;
    }

    public List<audio> getAudioList() {
        return audioList;
    }

    public void setAudioList(List<audio> audioList) {
        this.audioList = audioList;
    }
}
