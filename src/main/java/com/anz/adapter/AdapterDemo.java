package com.anz.adapter;

public class AdapterDemo {

    public static void main(String[] args) {

        MediaPlayer mediaPlayer = new MediaAdapter();
        mediaPlayer.playMp3("hallo.mp3", "Mp3");
        mediaPlayer.playMp3("hallo.mp4", "Mp4");
        mediaPlayer.playMp3("hallo.vlc", "Vlc");
        mediaPlayer.playMp3("hallo.mp5", "Mp5");

    }

}
