package com.srihari.java.a_basic.b_casestudy.b_beautiful;

public class VideoEncoder implements IVideoEncoder {
    @Override
    public void encode(Video video) {
        System.out.println("Encoding video...");
        System.out.println("Done!\n");
    }
}
