package com.example.Youtube;

import com.example.Subscribers.Subscriber;

public interface Youtube {
    void subscribe(Subscriber subscriber);
    void unsubscribe(Subscriber subscriber);
    void notifySubscribers(String video);
}
