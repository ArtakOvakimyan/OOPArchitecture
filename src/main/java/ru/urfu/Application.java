package ru.urfu;

import java.util.List;

/**
 * Класс для запуска приложения
 */
public class Application {

    public static void main(String[] args) {
        String telegramBotName = System.getenv("telegram_botName");
        String telegramToken = System.getenv("telegram_token");
        String discordToken = System.getenv("discord_token");

        MessageHandler handler = new MessageHandler();
        List<Bot> bots = List.of(new TelegramBot(telegramBotName, telegramToken, handler), new DiscordBot(discordToken, handler));

        for (Bot bot: bots) {
            bot.start();
        }
    }

}
