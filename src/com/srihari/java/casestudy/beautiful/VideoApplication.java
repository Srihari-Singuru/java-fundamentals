package com.srihari.java.casestudy.beautiful;

public class VideoApplication {
    public static void main(String[] args) {
        var video = new Video();
        video.setFileName("birthday.mp4");
        video.setTitle("Jennifer's birthday");
        video.setUser(new User("john@domain.com"));

        var processor = new VideoProcessor(
                new VideoEncoder(),
                new SqlVideoDatabase(),
                new EmailService()
        );
        processor.process(video);
    }
}
