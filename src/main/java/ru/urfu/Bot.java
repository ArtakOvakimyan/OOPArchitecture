package ru.urfu;

public interface Bot {
    void start();
    void sendMessage(String chatId, String message);
}
