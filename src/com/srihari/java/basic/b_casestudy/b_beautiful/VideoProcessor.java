package com.srihari.java.basic.b_casestudy.b_beautiful;

public class VideoProcessor {
    private final IVideoEncoder encoder;
    private final IVideoDatabase database;
    private final INotificationService emailService;

    public VideoProcessor(
            IVideoEncoder encoder,
            IVideoDatabase database,
            INotificationService emailService) {
        this.encoder = encoder;
        this.database = database;
        this.emailService = emailService;
    }

    public void process(Video video) {
        encoder.encode(video);
        database.store(video);
        emailService.sendEmail(video.getUser());
    }
}
