package com.srihari.java.basic.casestudy.beautiful;

public class VideoEncoder implements IVideoEncoder {
    @Override
    public void encode(Video video) {
        System.out.println("Encoding video...");
        System.out.println("Done!\n");
    }
}
