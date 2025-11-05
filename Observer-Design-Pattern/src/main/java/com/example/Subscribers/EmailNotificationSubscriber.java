package com.example.Subscribers;

public class EmailNotificationSubscriber implements Subscriber {
    private String email;

    public EmailNotificationSubscriber(String email) {
        this.email = email;
    }

    @Override
    public void update(String video) {
        System.out.println("Email sent to " + email + " for new video: " + video);
    }
}
