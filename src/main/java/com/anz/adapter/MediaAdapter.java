package com.anz.adapter;

public class MediaAdapter implements MediaPlayer {

    public AdvancedMediaPlayer advancedMediaplayer;

    @Override
    public void playMp3(String filename, String format) {
        if ("Mp3".equalsIgnoreCase(format)) {
            System.out.println("Playing media, filename: " + filename + " , format: " + format);
        } else if ("Mp4".equalsIgnoreCase(format)) {
            advancedMediaplayer = new Mp4Player();
            advancedMediaplayer.playMP4(filename, format);
        } else if ("Vlc".equalsIgnoreCase(format)) {
            advancedMediaplayer = new VlcPlayer();
            advancedMediaplayer.playVlc(filename, format);
        } else {
            System.out.println("Format error, Media play doesn't support: " + format);
        }
    }
}
