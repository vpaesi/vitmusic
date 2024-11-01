package br.com.vitmusic.main.models;

public class Audio {
    private String audioTitle;
    private int totalReproduces;
    private int totalLikes;
    private int classification;

    public String getAudioTitle() {
        return audioTitle;
    }

    public void setAudioTitle(String audioTitle) {
        this.audioTitle = audioTitle;
    }

    public int getTotalReproduces() {
        return totalReproduces;
    }

    public int getClassification() {
        return classification;
    }

    public int getTotalLikes() {
        return totalLikes;
    }

    public void like(){
        this.totalLikes++;
    }

    public void reproduce(){
        this.totalReproduces++;
    }

}
