package ru.urfu;

public class MessageHandler {
    public String getAnswer(String userMessage) {
        return String.format("Ваше сообщение: %s", userMessage);
    }
}
