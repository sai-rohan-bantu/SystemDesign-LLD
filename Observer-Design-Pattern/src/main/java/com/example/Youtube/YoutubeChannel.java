package com.example.Youtube;

import com.example.Subscribers.Subscriber;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel implements Youtube {
    private List<Subscriber> subscribers;

    private String video;
    public YoutubeChannel() {
        this.subscribers = new ArrayList<>();
    }

    @Override
    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers(String video) {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(video);
        }
    }

    public void uploadVideo(String video) {
        this.video = video;
        System.out.println("New video uploaded: " + video);
        notifySubscribers(video);
    }
}
