package Demir_shop;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.EditMessageReplyMarkup;
import org.telegram.telegrambots.meta.api.objects.CallbackQuery;
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

            //profnastil hammasi
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
            if (text.equals("OQ (9016)")){
                try {
                    execute(myBotService.profnastilmasterprice(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Qora (9005)")){
                try {
                    execute(myBotService.profnastilmasterprice(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("QAYMOQ (1015)")){
                try {
                    execute(myBotService.profnastilmasterprice(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("QIZIL (3003)")){
                try {
                    execute(myBotService.profnastilmasterprice(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("BARDOVI (3005)")){
                try {
                    execute(myBotService.profnastilmasterprice(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("YASHIL (6005)")){
                try {
                    execute(myBotService.profnastilmasterprice(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("TO`Q QIZIL (3005)")){
                try {
                    execute(myBotService.profnastilmasterprice(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Shkoladniy (8017)")){
                try {
                    execute(myBotService.profnastilmasterprice(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("MOKRI (7024)")){
                try {
                    execute(myBotService.profnastilmasterprice(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("SERIY (7004)")){
                try {
                    execute(myBotService.profnastilmasterprice(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("ATSINKOVKA")){
                try {
                    execute(myBotService.profnastilatsinkovkaprice(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            //profil hammasi
            if (text.equals("PROFIL")){
                try {
                    execute(myBotService.profilMenu(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Prays list\uD83D\uDCCB")){
                try {
                    execute(myBotService.prayslistdoc(chatId));
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
            if (text.equals("\uD83D\uDECDBuyurtma berish")){
                try {
                    execute(myBotService.buyurtmaberish(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Profil")){
                try {
                    execute(myBotService.profilInline(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Qo'llanmalar profili")){
                try {
                    execute(myBotService.QollanmaprofiliInline(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Kulonlar (AGRO)")){
                try {
                    execute(myBotService.kulonlar(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("⬅\uFE0FOrqaga")){
                try {
                    execute(myBotService.profilMenu(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("⬅\uFE0F Orqaga")){
                try {
                    execute(myBotService.buyurtmaberish(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (text.equals("Стеновой профиль 50*40")){
                try {
                    execute(myBotService.buyurtmaberishctena(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (text.equals("Стеновой профиль 50*50")){
                try {
                    execute(myBotService.buyurtmaberishctena5050(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (text.equals("Стеновой профиль 75*40")){
                try {
                    execute(myBotService.buyurtmaberishctena7540(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (text.equals("Стеновой профиль 75*50")){
                try {
                    execute(myBotService.buyurtmaberishctena7550(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (text.equals("Стеновой профиль 100*40")){
                try {
                    execute(myBotService.buyurtmaberishctena10040(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (text.equals("Стеновой профиль 100*50")){
                try {
                    execute(myBotService.buyurtmaberishctena10050(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("⬅\uFE0F  Orqaga")){
                try {
                    execute(myBotService.menu(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
        } else if (update.hasCallbackQuery()) {
            CallbackQuery callbackQuery = update.getCallbackQuery();
            String data = callbackQuery.getData();
            Long chatId = callbackQuery.getMessage().getChatId();
            Integer messageId = callbackQuery.getMessage().getMessageId();


            if (data.equals("0,25Id")){
                try {
                    execute(myBotService.profilRasmInline(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("0,28Id")){
                try {
                    execute(myBotService.profilRasmInline(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("0,30Id")){
                try {
                    execute(myBotService.profilRasmInline(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("0,33Id")){
                try {
                    execute(myBotService.profilRasmInline(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("0,35Id")){
                try {
                    execute(myBotService.profilRasmInline(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("0,37Id")){
                try {
                    execute(myBotService.profilRasmInline(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("0,40Id")){
                try {
                    execute(myBotService.profilRasmInline(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("0,45Id")){
                try {
                    execute(myBotService.profilRasmInline(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("0,50Id")){
                try {
                    execute(myBotService.profilRasmInline(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("0,60Id")){
                try {
                    execute(myBotService.profilRasmInline(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("0,,33Id")){
                try {
                    execute(myBotService.ctena5040033(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("0,,35Id")){
                try {
                    execute(myBotService.ctena5040033(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("0,,37Id")){
                try {
                    execute(myBotService.ctena5040033(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("0,,40Id")){
                try {
                    execute(myBotService.ctena5040033(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("0,,45Id")){
                try {
                    execute(myBotService.ctena5040033(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("0,335050Id")){
                try {
                    execute(myBotService.ctena5050(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("+Id")){
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(messageId);
                editMessageReplyMarkup.setReplyMarkup(myBotService.profilRasmInlineqoshish(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("-Id")){
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(messageId);
                editMessageReplyMarkup.setReplyMarkup(myBotService.profilRasmInlineayrish(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }

            if (data.equals("qaytishIDdd")){
                try {
                    execute(myBotService.buyurtmaberishctena(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("qaytishIDd")){
                try {
                    execute(myBotService.buyurtmaberishctena5050(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("qaytishIdqollanma")){
                try {
                    execute(myBotService.QollanmaprofiliInline(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("75.40Id")){
                try {
                    execute(myBotService.ctena7540(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("qaytish7540Id")){
                try {
                    execute(myBotService.buyurtmaberishctena7540(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("75.50Id")){
                try {
                    execute(myBotService.ctena7550(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("qaytish7550Id")){
                try {
                    execute(myBotService.buyurtmaberishctena7550(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("qaytishIdprofil")){
                try {
                    execute(myBotService.profilInline(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("qaytish10040Id")){
                try {
                    execute(myBotService.buyurtmaberishctena10040(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("100.40Id")){
                try {
                    execute(myBotService.ctena10040(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("100.50Id")){
                try {
                    execute(myBotService.ctena10050(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("qaytish10050Id")){
                try {
                    execute(myBotService.buyurtmaberishctena10050(chatId));
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
