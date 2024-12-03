package Demir_shop;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.util.List;

public class Mybot extends TelegramLongPollingBot {
    private MyBotService myBotService = new MyBotService();

    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasMessage() && update.getMessage().hasText()) {
            Long chatId = update.getMessage().getChatId();
            String text = update.getMessage().getText();


            if (text.equals("/start")) {
                try {
                    execute(myBotService.sendMessage(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("O`zbek tili")) {
                try {
                    execute(myBotService.shareContact(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("PROFNASTIL")) {
                try {
                    execute(myBotService.profnastil(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Orqaga")) {
                try {
                    execute(myBotService.menu(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("chappa-rost valna")) {
                try {
                    execute(myBotService.profnastilmenu(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Ekonom valna")) {
                try {
                    execute(myBotService.profnastilmenu(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("П35 GOFRA")) {
                try {
                    execute(myBotService.profnastilmenu(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("П57 GOFRA")) {
                try {
                    execute(myBotService.profnastilmenu(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("CHEREPITSA")) {
                try {
                    execute(myBotService.profnastilmenu(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("CHEREPITSA KVADRATNIY")) {
                try {
                    execute(myBotService.profnastilmenu(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }


            if (text.equals("PROFIL")){
                try {
                    execute(myBotService.profilMenu(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (text.equals("Prays list\uD83D\uDCCB")){
                try {
                    execute(myBotService.praysListphoto(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (text.equals("Kontaktlar\uD83D\uDCF1")){
                try {
                    execute(myBotService.Kontaktlar(chatId));
                    execute(myBotService.Kontaktlar2(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (text.equals("Ijtimoiy tarmoq va veb-sayt\uD83C\uDF10")){
                try {
                    execute(myBotService.IjtimoiyTarmoq(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (text.equals("Bizning manzil\uD83D\uDDFA")){
                try {
                    execute(myBotService.location(chatId));
                    execute(myBotService.Manzillar(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (text.equals("Til tanlash/выбор языка\uD83C\uDF0F")){
                try {
                    execute(myBotService.Tiltanlash(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (text.equals("Video\uD83D\uDCF9")){
                try {
                    execute(myBotService.video(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (text.equals("Katalog\uD83D\uDDC3")){
                try {
                    execute(myBotService.document(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Zavod quvvati\uD83E\uDDBE")){
                try {
                    execute(myBotService.zavotquvvatidoc(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        if (update.hasMessage() && update.getMessage().hasContact()){
            Long chatId = update.getMessage().getChatId();
            try {
                execute(myBotService.menu(chatId));
            } catch (TelegramApiException e) {
                throw new RuntimeException(e);
            }
        }


    }






    @Override
    public String getBotUsername() {
        return "Demirshop_bot";
    }
    @Override
    public String getBotToken() {
        return "7842718204:AAFmwFo5a-7c3El-spMf4xizGBr51vqh-Gw";
    }


}
