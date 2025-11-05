package com.example;

import com.example.Subscribers.EmailNotificationSubscriber;
import com.example.Subscribers.Subscriber;
import com.example.Subscribers.YoutubeSubscriber;
import com.example.Youtube.Youtube;
import com.example.Youtube.YoutubeChannel;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Observer Design Pattern Example");

        Subscriber subscriber1 = new YoutubeSubscriber("Alice");
        Subscriber subscriber2 = new EmailNotificationSubscriber("Bob");

        YoutubeChannel youtubeChannel = new YoutubeChannel();

        youtubeChannel.subscribe(subscriber1);
        youtubeChannel.subscribe(subscriber2);
        youtubeChannel.uploadVideo("Design Patterns in Java");
    }
}