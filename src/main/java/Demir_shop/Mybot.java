package Demir_shop;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.EditMessageReplyMarkup;
import org.telegram.telegrambots.meta.api.objects.CallbackQuery;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.util.List;

public class Mybot extends TelegramLongPollingBot {
    private MybotServiceRU mybotServiceRU=new MybotServiceRU();
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

            //aksessuarlar hammasi
            if (text.equals("Aksessuarlar")){
                try {
                    execute(myBotService.aksessuarlar(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Tarnov")){
                try {
                    execute(myBotService.tarnov(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (text.equals("Kanyok")){
                try {
                    execute(myBotService.kanyok(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Tormuz")){
                try {
                    execute(myBotService.tormuz(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Kranshteyn")){
                try {
                    execute(myBotService.kranshteyn(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Truba")){
                try {
                    execute(myBotService.truba(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Samarez")){
                try {
                    execute(myBotService.samarez(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Orqaga qaytish")){
                try {
                    execute(myBotService.menu(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            //lakatsiyalar
            if (text.equals("Bizning manzillar")){
                try {
                    execute(myBotService.manzillar(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("1-Shaxobcha")){
                try {
                    execute(myBotService.firstlakatsiya(chatId));
                    execute(myBotService.firstmessage(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("2-Shaxobcha")){
                try {
                    execute(myBotService.secondlakatsiya(chatId));
                    execute(myBotService.secondmessage(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("3-Shaxobcha")){
                try {
                    execute(myBotService.thirdlakatsiya(chatId));
                    execute(myBotService.thirdmessage(chatId));
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
            if (text.equals("ORQAGA")){
                try {
                    execute(myBotService.menu(chatId));
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
            if (text.equals("Napravlayushi profili")){
                try {
                    execute(myBotService.QollanmaprofiliInline(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Padves (AGRAF)")){
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
            if (text.equals("⬅\uFE0FAsosiy | Menu")){
                try {
                    execute(myBotService.menu(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            //Gipsokardon
            if (text.equals("GIPSOKARTON")){
                try {
                    execute(myBotService.gipsomenu(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (text.equals("Насьтенавой")){
                try {
                    execute(myBotService.nastenavoyInline(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (text.equals("Потолочный")){
                try {
                    execute(myBotService.potolochniyInline(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }




























            //RusTili
            if (text.equals("Русский язык")){
                try {
                    execute(mybotServiceRU.menu(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (text.equals("Профиль")){
                try {
                    execute(mybotServiceRU.profilMenu(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("\uD83D\uDECDСделать заказ")){
                try {
                    execute(mybotServiceRU.buyurtmaberish(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (text.equals("Прайс-лист\uD83D\uDCCB")){
                try {
                    execute(mybotServiceRU.prayslistdoc(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (text.equals("Контакты\uD83D\uDCF1")){
                try {
                    execute(mybotServiceRU.Kontaktlar(chatId));
                    execute(mybotServiceRU.Kontaktlar2(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (text.equals("Социальная сеть и сайт\uD83C\uDF10")){
                try {
                    execute(mybotServiceRU.IjtimoiyTarmoq(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (text.equals("Видео\uD83D\uDCF9")){
                try {
                    execute(mybotServiceRU.video(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (text.equals("Мощность завода\uD83E\uDDBE")){
                try {
                    execute(mybotServiceRU.zavotquvvatidoc(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (text.equals("Наш адрес\uD83D\uDDFA")){
                try {
                    execute(mybotServiceRU.location(chatId));
                    execute(mybotServiceRU.Manzillar(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (text.equals("Каталог\uD83D\uDDC3")){
                try {
                    execute(mybotServiceRU.document(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (text.equals("Профил")){
                try {
                    execute(mybotServiceRU.profilInline(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (text.equals("Направляющие Профиль")){
                try {
                    execute(mybotServiceRU.QollanmaprofiliInline(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (text.equals("Стеновой  профиль 50*40")){
                try {
                    execute(mybotServiceRU.buyurtmaberishctena5040RU(chatId));
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

            if (data.equals("75.40Id")){
                try {
                    execute(myBotService.ctena7540(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("humoId")){
                try {
                    execute(myBotService.plastikend(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("uzcardId")){
                try {
                    execute(myBotService.plastikend(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("mastercardId")){
                try {
                    execute(myBotService.plastikend(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("visaId")){
                try {
                    execute(myBotService.plastikend(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("sotibolishId")){
                try {
                    execute(myBotService.plastiklar(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }


            if (data.equals("50.40Id")){
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
            if (data.equals("75.50Id")){
                try {
                    execute(myBotService.ctena7550(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("qaytish5040Id")){
                try {
                    execute(myBotService.buyurtmaberishctena(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("qaytish5050Id")){
                try {
                    execute(myBotService.buyurtmaberishctena5050(chatId));
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

            if (data.equals("qaytish7550Id")){
                try {
                    execute(myBotService.buyurtmaberishctena7550(chatId));
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
            //RusTilidata

            if (data.equals("0,25RUId")){
                try {
                    execute(mybotServiceRU.profilRasmInlineRu(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("qaytishIdRUprofil")){
                try {
                    execute(mybotServiceRU.QollanmaprofiliInline(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }


            if (data.equals("50.40RUId")){
                try {
                    execute(mybotServiceRU.ctena5040RU(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("qaytish5040RUId")){
                try {
                    execute(mybotServiceRU.buyurtmaberishctena5040RU(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }











            if (data.equals("+RUId")){
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(messageId);
                editMessageReplyMarkup.setReplyMarkup(mybotServiceRU.profilRasmInlineqoshishRU(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("-RUId")){
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(messageId);
                editMessageReplyMarkup.setReplyMarkup(mybotServiceRU.profilRasmInlineayrishRU(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("+RU5040Id")){
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(messageId);
                editMessageReplyMarkup.setReplyMarkup(mybotServiceRU.profilRasmInlineqoshishRU5040(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("-RU5040Id")){
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(messageId);
                editMessageReplyMarkup.setReplyMarkup(mybotServiceRU.profilRasmInlineayrishRU0540(chatId));
                try {
                    execute(editMessageReplyMarkup);
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
