package com.anz.adapter;

public class Mp4Player implements AdvancedMediaPlayer {

    @Override
    public void playMP4(String filename, String format) {

        System.out.println("Playing video, filename: " + filename + ", format: " + format);
    }

    @Override
    public void playVlc(String filename, String format) {
        // TODO Auto-generated method stub

    }

}
