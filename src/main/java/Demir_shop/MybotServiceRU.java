package Demir_shop;

import org.telegram.telegrambots.meta.api.methods.send.*;
import org.telegram.telegrambots.meta.api.objects.InputFile;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class MybotServiceRU{

    public SendMessage menuRU(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Выберите из меню");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();
        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
                                        button.setText("Профнастил");
        row.add(button);

        KeyboardButton button1 = new KeyboardButton();
        button1.setText("Профиль");
        row.add(button1);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button2 = new KeyboardButton();
        button2.setText("ГИПСОВЫЙ КАРТОН");
        row1.add(button2);

        KeyboardButton button3 = new KeyboardButton();
        button3.setText("Калькулятор");
        row1.add(button3);
        rowList.add(row1);

        KeyboardButton button4 = new KeyboardButton();
        button4.setText("Наши адреса");
        row1.add(button4);

        KeyboardButton button5 = new KeyboardButton();
        button5.setText("Список мастеров");
        row1.add(button5);

        KeyboardRow row2 = new KeyboardRow();
        KeyboardButton button6 = new KeyboardButton();
        button6.setText("\uD83D\uDCAC Оставить комментарий");
        row2.add(button6);
        rowList.add(row2);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;


    }

    //Profnastil
    public SendMessage profnastilru(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Выбирайте гофру Профнастил");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("прямо вальна");
        row.add(button);

        KeyboardButton button1 = new KeyboardButton();
        button1.setText("Экономическая вална");
        row.add(button1);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button2 = new KeyboardButton();
        button2.setText("П35 ГОФРИРОВАННЫЙ");
        row1.add(button2);

        KeyboardButton button3 = new KeyboardButton();
        button3.setText("П57 ГОФРИРОВАННЫЙ");
        row1.add(button3);
        rowList.add(row1);

        KeyboardRow row2 = new KeyboardRow();
        KeyboardButton button6 = new KeyboardButton();
        button6.setText("ЧЕРЕПИЦА");
        row2.add(button6);

        KeyboardButton button4 = new KeyboardButton();
        button4.setText("КВАДРАТНЫЕ ПЛИТКИ");
        row2.add(button4);
        rowList.add(row2);

        KeyboardRow row3 = new KeyboardRow();
        KeyboardButton button5 = new KeyboardButton();
        button5.setText("НаЗАД");
        row3.add(button5);
        rowList.add(row3);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;
    }
    public SendMessage profnastilmenuru(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Выберите цвет профиля");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();
        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("Белый (9003)");
        row.add(button);

        KeyboardButton button1 = new KeyboardButton();
        button1.setText("Черный (9005)");
        row.add(button1);

        KeyboardButton button2 = new KeyboardButton();
        button2.setText("КРЕМОВЫЙ цвет (1015)");
        row.add(button2);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button3 = new KeyboardButton();
        button3.setText("КРАСНЫЙ (3003)");
        row1.add(button3);

        KeyboardButton button4 = new KeyboardButton();
        button4.setText("БАРДОВЫЙ (3005)");
        row1.add(button4);

        KeyboardButton button5 = new KeyboardButton();
        button5.setText("ЗЕЛЕНЫЙ (6005)");
        row1.add(button5);
        rowList.add(row1);

        KeyboardRow row2 = new KeyboardRow();
        KeyboardButton button6 = new KeyboardButton();
        button6.setText("ТЕМНО-КРАСНЫЙ (3011)");
        row2.add(button6);

        KeyboardButton button7 = new KeyboardButton();
        button7.setText("Коричневый (8017)");
        row2.add(button7);


        KeyboardButton button8 = new KeyboardButton();
        button8.setText("Графитовый серый (7024)");
        row2.add(button8);
        rowList.add(row2);

        KeyboardRow row3 = new KeyboardRow();
        KeyboardButton button9 = new KeyboardButton();
        button9.setText("серый (7004)");
        row3.add(button9);

        KeyboardButton button10 = new KeyboardButton();
        button10.setText("Оцинкованный");
        row3.add(button10);

        KeyboardRow row4 = new KeyboardRow();
        KeyboardButton button11 = new KeyboardButton();
        button11.setText("Белый (9016)");
        row3.add(button11);
        rowList.add(row3);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;

    }
    public SendMessage profnastilmasterpriceru(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Выберите толщину");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();
        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("0.30 SMZ 1M = 55 000");
        row.add(button);

        KeyboardButton button1 = new KeyboardButton();
        button1.setText("0.33 SMZ  1M = 58 000");
        row.add(button1);

        KeyboardButton button2 = new KeyboardButton();
        button2.setText("0.35 SMZ 1M = 62 000");
        row.add(button2);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button3 = new KeyboardButton();
        button3.setText("0.37 SMZ 1M = 65 000");
        row1.add(button3);

        KeyboardButton button4 = new KeyboardButton();
        button4.setText("0.40 SMZ 1M = 67 000");
        row1.add(button4);

        KeyboardButton button5 = new KeyboardButton();
        button5.setText("0.45 SMZ 1M = 72 000");
        row1.add(button5);
        rowList.add(row1);

        KeyboardRow row2 = new KeyboardRow();
        KeyboardButton button6 = new KeyboardButton();
        button6.setText("0.50 SMZ 1M = 78 000");
        row2.add(button6);


        KeyboardButton button7 = new KeyboardButton();
        button7.setText("0.60 SMZ 1M = 83 000");
        row2.add(button7);

        KeyboardButton button8 = new KeyboardButton();
        button8.setText("НАЗАД");
        row2.add(button8);
        rowList.add(row2);


        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;
    }
    public SendMessage profnastilatsinkovkapriceru(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Выберите толщину");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();
        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("0.30 SMZ 1M = 48 000");
        row.add(button);

        KeyboardButton button1 = new KeyboardButton();
        button1.setText("0.33 SMZ  1M = 51 000");
        row.add(button1);

        KeyboardButton button2 = new KeyboardButton();
        button2.setText("0.35 SMZ 1M = 53 000");
        row.add(button2);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button3 = new KeyboardButton();
        button3.setText("0.37 SMZ 1M = 55 000");
        row1.add(button3);

        KeyboardButton button4 = new KeyboardButton();
        button4.setText("0.40 SMZ 1M = 58 000");
        row1.add(button4);

        KeyboardButton button5 = new KeyboardButton();
        button5.setText("0.45 SMZ 1M = 62 000");
        row1.add(button5);
        rowList.add(row1);

        KeyboardRow row2 = new KeyboardRow();
        KeyboardButton button6 = new KeyboardButton();
        button6.setText("0.50 SMZ 1M = 67 000");
        row2.add(button6);


        KeyboardButton button7 = new KeyboardButton();
        button7.setText("0.60 SMZ 1M = 72 000");
        row2.add(button7);

        KeyboardButton button8 = new KeyboardButton();
        button8.setText("НАЗАД");
        row2.add(button8);
        rowList.add(row2);


        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;
    }
    public SendPhoto profnastilinlineMasterru(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://st2.stpulscen.ru/images/product/417/231/054_original.jpg"));
        sendPhoto.setCaption("");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<InlineKeyboardButton> row = new ArrayList<>();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("-Id");
        row.add(button);
        rowList.add(row);

        button=new InlineKeyboardButton();
        button.setText("1");
        button.setCallbackData("sonId");
        row.add(button);


        button=new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("+Id");
        row.add(button);


        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("Покупка");
        button.setCallbackData("sotibolishRUId");
        row.add(button);
        rowList.add(row);

        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("⬅\uFE0FНазад");
        button.setCallbackData("qaytishIdpRUrofnastil");
        row.add(button);
        rowList.add(row);


        inlineKeyboardMarkup.setKeyboard(rowList);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return sendPhoto;
    }
    public SendPhoto profnastilinlineAtsinkovkaru(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("\"C:\\Users\\user\\Downloads\\Telegram Desktop\\photo_2024-12-15_21-56-31.jpg\""));
        sendPhoto.setCaption("Выбирать");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<InlineKeyboardButton> row = new ArrayList<>();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("-Id");
        row.add(button);
        rowList.add(row);

        button=new InlineKeyboardButton();
        button.setText("1");
        button.setCallbackData("sonId");
        row.add(button);


        button=new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("+Id");
        row.add(button);


        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("Покупка");
        button.setCallbackData("sotibolishRUId");
        row.add(button);
        rowList.add(row);

        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("Назад");
        button.setCallbackData("qaytishIdprofnastil");
        row.add(button);
        rowList.add(row);


        inlineKeyboardMarkup.setKeyboard(rowList);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return sendPhoto;
    }


    //lakatsitya rus
    public SendMessage manzillarru(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Выберите адрес");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();
        KeyboardButton button = new KeyboardButton();
        KeyboardRow row = new KeyboardRow();
        button.setText("Филиал 1");
        row.add(button);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();
        button1.setText("Филиал 2");
        row.add(button1);
        rowList.add(row);

        KeyboardButton button2 = new KeyboardButton();
        button2.setText("Филиал 3");
        row1.add(button2);

        KeyboardButton button3 = new KeyboardButton();
        button3.setText("Назад");
        row1.add(button3);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;
    }
    public SendLocation firstlakatsiyaru(Long chatId) {
        SendLocation sendLocation = new SendLocation();
        sendLocation.setChatId(chatId);
        sendLocation.setLatitude(39.597569);
        sendLocation.setLongitude(66.929696);
        return sendLocation;

    }
    public SendMessage firstmessageru(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("\uD83D\uDCCD 1-филиал\n" +
                "\uD83D\uDDFA Адрес: Базар Такта, Самарканд, Самаркандская область, Узбекистан\n" +
                "\n" +
                "\uD83C\uDFE2Ориентир: напротив Хумо Мед\n" +
                "\n" +
                "☎\uFE0FТелефон: +998939926700.\n" +
                "☎\uFE0FТелефон: +998987076700.\n" +
                "\uD83D\uDD59 Время работы: 7:00 - 20:00");
        return sendMessage;
    }
    public SendLocation secondlakatsiyaru(Long chatId) {
        SendLocation sendLocation = new SendLocation();
        sendLocation.setChatId(chatId);
        sendLocation.setLatitude(39.5991705);
        sendLocation.setLongitude(66.9356548);
        return sendLocation;

    }
    public SendMessage secondmessageru(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("\uD83D\uDCCD 2-филиал\n" +
                "\uD83D\uDDFA Адрес: Базар Такта, Самарканд, Самаркандская область, Узбекистан\n" +
                "\n" +
                "\uD83C\uDFE2Ориентир: улица Новой Жизни\n" +
                "\n" +
                "☎\uFE0FТелефон: +998982732101.\n" +
                "☎\uFE0FТелефон: +998902713131.\n" +
                "\uD83D\uDD59 Время работы: 7:00 - 20:00.");
        return sendMessage;
    }
    public SendLocation thirdlakatsiyaru(Long chatId) {
        SendLocation sendLocation = new SendLocation();
        sendLocation.setChatId(chatId);
        sendLocation.setLatitude(39.598700);
        sendLocation.setLongitude(66.936107);
        return sendLocation;

    }
    public SendMessage thirdmessageru(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("\uD83D\uDCCD  3-филиал\n" +
                "\uD83D\uDDFA Адрес: Базар Такта, Самарканд, Самаркандская область, Узбекистан\n" +
                "\n" +
                "\uD83C\uDFE2Ориентир: Напротив Тахт Базара\n" +
                "\n" +
                "☎\uFE0FТелефон: +998982791999.\n" +
                "☎\uFE0FТелефон: +998937235474.\n" +
                "\uD83D\uDD59 Время работы: 7:00 - 20:00");
        return sendMessage;
    }

    //Ustalar ro`yxati
    public SendMessage ustalarRU(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Выберите мастера, который вам нужен");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();
        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("На крыше");
        row.add(button);

        KeyboardButton button1 = new KeyboardButton();
        button1.setText("Паталочни");
        row.add(button1);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button2 = new KeyboardButton();
        button2.setText("назад");
        row1.add(button2);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;
    }
    public SendMessage tomRU(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText(" \uD83E\uDDD1\u200D\uD83D\uDD27 Имя: Бабур " +
                "             Вид работ: Кровельные работы" +
                "             \uD83D\uDCF1 Номер телефона: +998 99 944 22 23 ");
        return sendMessage;
    }
    public SendMessage tom1RU(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText(" \uD83E\uDDD1\u200D\uD83D\uDD27 Имя: Мурад " +
                "            Вид работ: Кровельные работы " +
                "             \uD83D\uDCF1 Номер телефона: +998 93 345 74 44  ");
        return sendMessage;
    }
    public SendMessage tom2RU(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText(" \uD83E\uDDD1\u200D\uD83D\uDD27 Имя: Хуршед" +
                "            Вид работ: Кровельные работы " +
                "             \uD83D\uDCF1 Номер телефона: +998 97 923 69 85  ");
        return sendMessage;
    }
    public SendMessage tom3RU(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText(" \uD83E\uDDD1\u200D\uD83D\uDD27 Имя: Шероз " +
                "             Вид работ: Кровельные работы " +
                "             \uD83D\uDCF1 Номер телефона: +998 99 595 95 35 ");
        return sendMessage;
    }
    public SendMessage patalochniRU(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText(" \uD83E\uDDD1\u200D\uD83D\uDD27Имя: Шохрух  " +
                "             Вид работы: Паталок " +
                "             \uD83D\uDCF1 Номер телефона: +998 93 999 06 06  ");
        return sendMessage;
    }
    public SendMessage patalochni1RU(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText(" \uD83E\uDDD1\u200D\uD83D\uDD27 Имя: Джонибек  " +
                "           Вид работы: Паталок " +
                "            \uD83D\uDCF1 Номер телефона: +998 99 777 65 21  ");
        return sendMessage;
    }
    public SendMessage patalochni2RU(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText(" \uD83E\uDDD1\u200D\uD83D\uDD27 Имя: Дилшад " +
                "             Вид работы: Паталок " +
                "             \uD83D\uDCF1 Номер телефона: +998 91 555 50 34 ");
        return sendMessage;
    }
    public SendMessage patalochni3RU(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText(" \uD83E\uDDD1\u200D\uD83D\uDD27 Имя: Алишер " +
                "             Вид работы: Паталок " +
                "             \uD83D\uDCF1 Номер телефона: +998 33 900 00 63 ");
        return sendMessage;
    }
    public SendMessage patalochni4RU(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText(" \uD83E\uDDD1\u200D\uD83D\uDD27 Имя: Мизроб " +
                "             Вид работы: Паталок " +
                "             \uD83D\uDCF1 Номер телефона: +998 94 357 38 95 ");
        return sendMessage;
    }



    public SendMessage profilMenu(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Выбирать");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow keyboardRow = new KeyboardRow();
        KeyboardButton keyboardButton = new KeyboardButton();
        keyboardButton.setText("\uD83D\uDECDСделать заказ");
        keyboardRow.add(keyboardButton);
        rowList.add(keyboardRow);

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("Прайс-лист\uD83D\uDCCB");
        row.add(button);
        rowList.add(row);


        KeyboardButton button1 = new KeyboardButton();
        button1.setText("Контакты\uD83D\uDCF1");
        row.add(button1);

        KeyboardButton button2 = new KeyboardButton();
        button2.setText("Каталог\uD83D\uDDC3");
        row.add(button2);


        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button3 = new KeyboardButton();
        button3.setText("Социальная сеть и сайт\uD83C\uDF10");
        row1.add(button3);
        rowList.add(row1);


        KeyboardButton button4 = new KeyboardButton();
        button4.setText("Фотография\uD83D\uDCF8");
        row1.add(button4);


        KeyboardButton button5 = new KeyboardButton();
        button5.setText("Видео\uD83D\uDCF9");
        row1.add(button5);


        KeyboardRow row2 = new KeyboardRow();
        KeyboardButton button6 = new KeyboardButton();
        button6.setText("Мощность завода\uD83E\uDDBE");
        row2.add(button6);
        rowList.add(row2);


        KeyboardButton button7 = new KeyboardButton();
        button7.setText("Наш адрес\uD83D\uDDFA");
        row2.add(button7);

        KeyboardButton button8 = new KeyboardButton();
        button8.setText("выбор языка\uD83C\uDF0F");
        row2.add(button8);


        KeyboardRow row3 = new KeyboardRow();
        KeyboardButton button9 = new KeyboardButton();
        button9.setText("⬅\uFE0F  Назад");
        row3.add(button9);
        rowList.add(row3);


        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;


    }
    public SendMessage buyurtmaberish(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Выбирать");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();


        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("Профил");
        row.add(button);
        rowList.add(row);

        KeyboardButton button1 = new KeyboardButton();
        button1.setText("Направляющие Профиль");
        row.add(button1);


        KeyboardButton button2 = new KeyboardButton();
        button2.setText("Подвески (АГРО)");
        row.add(button2);

        KeyboardRow row2 = new KeyboardRow();
        KeyboardButton button4 = new KeyboardButton();
        button4.setText("Стеновой  профиль 50*40");
        row2.add(button4);
        rowList.add(row2);


        KeyboardButton button5 = new KeyboardButton();
        button5.setText("Стеновой  профиль 50*50");
        row2.add(button5);


        KeyboardButton button6 = new KeyboardButton();
        button6.setText("Стеновой  профиль 75*40");
        row2.add(button6);

        KeyboardRow row3 = new KeyboardRow();
        KeyboardButton button7 = new KeyboardButton();
        button7.setText("Стеновой  профиль 75*50");
        row3.add(button7);
        rowList.add(row3);

        KeyboardButton button8 = new KeyboardButton();
        button8.setText("Стеновой  профиль 100*40");
        row3.add(button8);


        KeyboardButton button9 = new KeyboardButton();
        button9.setText("Стеновой  профиль 100*50");
        row3.add(button9);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button3 = new KeyboardButton();
        button3.setText("⬅\uFE0FНазад");
        row1.add(button3);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;

    }
    public SendDocument prayslistdoc(Long chatId) {
        SendDocument sendDocument = new SendDocument();
        sendDocument.setChatId(chatId);
        sendDocument.setDocument(new InputFile(new File("C:\\Users\\hp\\Documents\\Настраиваемые шаблоны Office\\(UZ) Прайс-лист Demir Profil от 25.04.2024 г.pdf")));
        sendDocument.setCaption("Для получения прайс-листа с экспортными ценами свяжитесь с нами по указанным ниже контактам:\n" +
                "\n" +
                "Отдел продаж – 998 (88) 224-44-44\n" +
                "Отдел экспорта – 998 (95) 250-59-99\n" +
                "E-mail – info@demir-profil.com");
        return sendDocument;
    }
    public SendMessage Kontaktlar(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("https://t.me/demirprofiluz");

        return sendMessage;
    }
    public SendMessage Kontaktlar2(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Отдел продаж:\n" +
                "+998 (88) 224-44-44\n" +
                "\n" +
                "Отдел экспорта:\n" +
                "+ 998 (95) 250-59-99\n" +
                "\n" +
                "Региональные менеджеры:\n" +
                "+998 (88) 244-99-99\n" +
                "+998 (93) 722-06-63\n" +
                "+998 (97) 395-05-04\n" +
                "+998 (90) 655-45-25\n" +
                "\n" +
                "Почта:\n" +
                "info@demir-profil.com");


        return sendMessage;
    }
    public SendMessage IjtimoiyTarmoq(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Соцсети:\n" +
                "https://www.instagram.com/demirprofiluz\n" +
                "https://www.facebook.com/demirprofil.uz\n" +
                "\n" +
                "Сайт:\n" +
                "https://demir-profil.com (https://demir-profil.com/)");

        return sendMessage;
    }
    public  SendDocument Photodoc(Long chatId){
        SendDocument sendDocument = new SendDocument();
        sendDocument.setChatId(chatId);
        sendDocument.setDocument(new InputFile(new File("C:\\Users\\hp\\Documents\\Настраиваемые шаблоны Office\\Products.pdf")));
        return sendDocument;
    }

    public SendLocation location(Long chatId) {
        SendLocation sendLocation = new SendLocation();
        sendLocation.setChatId(chatId);
        sendLocation.setLatitude(39.6354094);
        sendLocation.setLongitude(66.8741039);
        return sendLocation;
    }
    public SendMessage Manzillar(Long chatId) {

        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Узбекистан, г. Самарканд, массив Хишрав-2, свободная экономическая зона «Ургут»");
        return sendMessage;
    }
    public SendVideo video(Long chatId) {
        SendVideo sendVideo = new SendVideo();
        sendVideo.setChatId(chatId);
        sendVideo.setVideo(new InputFile(new File("C:\\Users\\hp\\Videos\\Captures\\demirshopvideo.mp4")));

        return sendVideo;

    }
    public SendVideo video2(Long chatId) {
        SendVideo sendVideo = new SendVideo();
        sendVideo.setChatId(chatId);
        sendVideo.setVideo(new InputFile(new File("C:\\Users\\hp\\Videos\\Captures\\demirshopvideo.mp4")));

        return sendVideo;

    }
    public SendDocument document(Long chatId) {
        SendDocument sendDocument = new SendDocument();
        sendDocument.setChatId(chatId);
        sendDocument.setDocument(new InputFile(new File("C:\\Users\\hp\\Documents\\Настраиваемые шаблоны Office\\demirshopdocument.pdf")));
        return sendDocument;
    }
    public SendDocument zavotquvvatidoc(Long chatId) {
        SendDocument sendDocument = new SendDocument();
        sendDocument.setChatId(chatId);
        sendDocument.setDocument(new InputFile(new File("C:\\Users\\hp\\Documents\\Настраиваемые шаблоны Office\\Мощность завода Demir Profil.pdf")));

        return sendDocument;
    }

    //profil Inline
    public SendMessage profilInline(Long chatId){

        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Выберите толщину профиля:");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<InlineKeyboardButton> row=new ArrayList<>();
        List<List<InlineKeyboardButton>> rowList=new ArrayList<>();

        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("0,25");
        button.setCallbackData("0,25RUId");
        row.add(button);
        rowList.add(row);



        button=new InlineKeyboardButton();
        button.setText("0.28");
        button.setCallbackData("0,25RUId");
        row.add(button);



        button=new InlineKeyboardButton();
        button.setText("0,30");
        button.setCallbackData("0,25RUId");
        row.add(button);


        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("0,33");
        button.setCallbackData("0,25RUId");
        row.add(button);
        rowList.add(row);



        button=new InlineKeyboardButton();
        button.setText("0,35");
        button.setCallbackData("0,25RUId");
        row.add(button);



        button=new InlineKeyboardButton();
        button.setText("0,37");
        button.setCallbackData("0,25RUId");
        row.add(button);


        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("0,40");
        button.setCallbackData("0,25RUId");
        row.add(button);
        rowList.add(row);


        button=new InlineKeyboardButton();
        button.setText("0,45");
        button.setCallbackData("0,25RUId");
        row.add(button);


        button=new InlineKeyboardButton();
        button.setText("0,50");
        button.setCallbackData("0,25RUId");
        row.add(button);

        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("0,60");
        button.setCallbackData("0,25RUId");
        row.add(button);
        rowList.add(row);



        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;

    }
    public SendMessage QollanmaprofiliInline(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Выберите толщину профиля :");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<InlineKeyboardButton> row=new ArrayList<>();
        List<List<InlineKeyboardButton>> rowList=new ArrayList<>();

        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("0,25");
        button.setCallbackData("0,25RUId");
        row.add(button);
        rowList.add(row);



        button=new InlineKeyboardButton();
        button.setText("0.28");
        button.setCallbackData("0,25RUId");
        row.add(button);



        button=new InlineKeyboardButton();
        button.setText("0,30");
        button.setCallbackData("0,25RUId");
        row.add(button);


        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("0,33");
        button.setCallbackData("0,25RUId");
        row.add(button);
        rowList.add(row);



        button=new InlineKeyboardButton();
        button.setText("0,35");
        button.setCallbackData("0,25RUId");
        row.add(button);



        button=new InlineKeyboardButton();
        button.setText("0,37");
        button.setCallbackData("0,25RUId");
        row.add(button);


        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("0,40");
        button.setCallbackData("0,25RUId");
        row.add(button);
        rowList.add(row);


        button=new InlineKeyboardButton();
        button.setText("0,45");
        button.setCallbackData("0,25RUId");
        row.add(button);


        button=new InlineKeyboardButton();
        button.setText("0,50");
        button.setCallbackData("0,25RUId");
        row.add(button);

        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("0,60");
        button.setCallbackData("0,25RUId");
        row.add(button);
        rowList.add(row);




        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;

    }
    public SendPhoto profilRasmInlineRu(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile(new File("C:\\Users\\hp\\Pictures\\Saved Pictures\\demirphoto.jpg")));
        sendPhoto.setCaption("0,25mm 1M=680GRAMM+/-\n" +
                "Цена:100$");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<InlineKeyboardButton> row=new ArrayList<>();
        List<List<InlineKeyboardButton>> rowList=new ArrayList<>();

        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("-RUprofilId");
        row.add(button);
        rowList.add(row);


        button=new InlineKeyboardButton();
        button.setText("1");
        button.setCallbackData("sonId");
        row.add(button);


        button=new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("+RUprofilId");
        row.add(button);


        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("Покупка");
        button.setCallbackData("sotibolishallRUId");
        row.add(button);
        rowList.add(row);

        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("⬅\uFE0FНазад");
        button.setCallbackData("qaytishIdRUprofil");
        row.add(button);
        rowList.add(row);


        inlineKeyboardMarkup.setKeyboard(rowList);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return sendPhoto;
    }
    int t=1;
    public InlineKeyboardMarkup profilRasmInlineqoshishRU(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile(new File("C:\\Users\\hp\\Pictures\\Saved Pictures\\demirphoto.jpg")));
        sendPhoto.setCaption("0,25mm 1M=680GRAMM+/-\n" +
                "Цена:100$");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<InlineKeyboardButton> row=new ArrayList<>();
        List<List<InlineKeyboardButton>> rowList=new ArrayList<>();

        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("-RUprofilId");
        row.add(button);
        rowList.add(row);


        button=new InlineKeyboardButton();
        button.setText(String.valueOf(++t));
        button.setCallbackData("sonId");
        row.add(button);


        button=new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("+RUprofilId");
        row.add(button);


        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("Покупка");
        button.setCallbackData("sotibolishallRUId");
        row.add(button);
        rowList.add(row);

        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("⬅\uFE0FНазад");
        button.setCallbackData("qaytishIdRUprofil");
        row.add(button);
        rowList.add(row);


        inlineKeyboardMarkup.setKeyboard(rowList);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup profilRasmInlineayrishRU(Long chatId){

        if (t>1){
            --t;
        }
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile(new File("C:\\Users\\hp\\Pictures\\Saved Pictures\\demirphoto.jpg")));
        sendPhoto.setCaption("0,25mm 1M=680GRAMM+/-\n" +
                "Цена:100$");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<InlineKeyboardButton> row=new ArrayList<>();
        List<List<InlineKeyboardButton>> rowList=new ArrayList<>();

        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("-RUprofilId");
        row.add(button);
        rowList.add(row);


        button=new InlineKeyboardButton();
        button.setText(String.valueOf(t));
        button.setCallbackData("sonId");
        row.add(button);


        button=new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("+RUprofilId");
        row.add(button);


        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("Покупка");
        button.setCallbackData("sotibolishallRUId");
        row.add(button);
        rowList.add(row);


        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("⬅\uFE0FНазад");
        button.setCallbackData("qaytishIdRUprofil");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;


    }
    public SendPhoto buyurtmaberishctena5040RU(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile(new File("C:\\Users\\hp\\Pictures\\Saved Pictures\\demir50.40.jpg")));
        sendPhoto.setCaption("Направляющий профиль Demir Profil 50*40 используется в качестве направляющего для стоечного профиля 50*50 при монтаже гипсокартонных изделий или настенных покрытий.\n" +
                " Его также используют для установки перемычек между ними. Направляющий профиль ПН 50*50 в основном выполняет вспомогательные функции и является частью каркаса.\n" +
                " Иногда его используют как основу для скрепления листов.\n" +
                "цена: 1,96$");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<InlineKeyboardButton> row=new ArrayList<>();
        List<List<InlineKeyboardButton>> rowList=new ArrayList<>();

        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("0,33");
        button.setCallbackData("50.40RUId");
        row.add(button);
        rowList.add(row);

        button=new InlineKeyboardButton();
        button.setText("0,35");
        button.setCallbackData("50.40RUId");
        row.add(button);

        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("0,37");
        button.setCallbackData("50.40RUId");
        row.add(button);
        rowList.add(row);


        button=new InlineKeyboardButton();
        button.setText("0,40");
        button.setCallbackData("50.40RUId");
        row.add(button);


        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("0,45");
        button.setCallbackData("50.40RUId");
        row.add(button);
        rowList.add(row);



        inlineKeyboardMarkup.setKeyboard(rowList);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return sendPhoto;


    }
    public SendPhoto ctena5040RU(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile(new File("C:\\Users\\hp\\Pictures\\Saved Pictures\\demir50.40.jpg")));
        sendPhoto.setCaption("Технические характеристики:\n" +
                "Производитель :магазин Демир  \n" +
                "Вес 1 кг/шт.\n" +
                "Длина 3 м; 4 м;\n" +
                "Покрытие цинк");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<InlineKeyboardButton> row=new ArrayList<>();
        List<List<InlineKeyboardButton>> rowList=new ArrayList<>();

        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("-RU5040Id");
        row.add(button);
        rowList.add(row);


        button=new InlineKeyboardButton();
        button.setText("1");
        button.setCallbackData("sonId");
        row.add(button);


        button=new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("+RU5040Id");
        row.add(button);


        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("Покупка");
        button.setCallbackData("sotibolishallRUId");
        row.add(button);
        rowList.add(row);

        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("⬅\uFE0FНазад");
        button.setCallbackData("qaytish5040RUId");
        row.add(button);
        rowList.add(row);


        inlineKeyboardMarkup.setKeyboard(rowList);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return sendPhoto;
    }
    int a=1;
    public InlineKeyboardMarkup profilRasmInlineqoshishRU5040(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile(new File("C:\\Users\\hp\\Pictures\\Saved Pictures\\demir50.40.jpg")));
        sendPhoto.setCaption("Ilyosga");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<InlineKeyboardButton> row=new ArrayList<>();
        List<List<InlineKeyboardButton>> rowList=new ArrayList<>();

        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("-RU5040Id");
        row.add(button);
        rowList.add(row);


        button=new InlineKeyboardButton();
        button.setText(String.valueOf(++a));
        button.setCallbackData("sonId");
        row.add(button);


        button=new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("+RU5040Id");
        row.add(button);


        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("Покупка");
        button.setCallbackData("sotibolishallRUId");
        row.add(button);
        rowList.add(row);

        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("⬅\uFE0FНазад");
        button.setCallbackData("qaytish5040RUId");
        row.add(button);
        rowList.add(row);


        inlineKeyboardMarkup.setKeyboard(rowList);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup profilRasmInlineayrishRU0540(Long chatId){

        if (a>1){
            --a;
        }
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile(new File("C:\\Users\\hp\\Pictures\\Saved Pictures\\demir50.40.jpg")));
        sendPhoto.setCaption("Ilyosga");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<InlineKeyboardButton> row=new ArrayList<>();
        List<List<InlineKeyboardButton>> rowList=new ArrayList<>();

        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("-RU5040Id");
        row.add(button);
        rowList.add(row);


        button=new InlineKeyboardButton();
        button.setText(String.valueOf(a));
        button.setCallbackData("sonId");
        row.add(button);


        button=new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("+RU5040Id");
        row.add(button);


        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("Покупка");
        button.setCallbackData("sotibolishallRUId");
        row.add(button);
        rowList.add(row);


        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("⬅\uFE0FНазад");
        button.setCallbackData("qaytish5040RUId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;


    }
    public SendPhoto buyurtmaberishctena5050(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile(new File("C:\\Users\\hp\\Pictures\\Saved Pictures\\demir50.50.jpg")));
        sendPhoto.setCaption("Демир профиль 50 х 50 применяется для монтажа деталей из гипсокартонных листов, а также его применяют при возведении фальш-стен.\n" +
                "С помощью этого материала можно качественно, быстро и грамотно построить перегородку в квартире, частном доме и офисе.\n" +
                "Профиль длиной 4 метра используется для высоких потолков, если обойтись без соединителей.\n" +
                "\n" +
                "Цена: 4,38$");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<InlineKeyboardButton> row=new ArrayList<>();
        List<List<InlineKeyboardButton>> rowList=new ArrayList<>();

        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("0,33");
        button.setCallbackData("5050RUId");
        row.add(button);
        rowList.add(row);

        button=new InlineKeyboardButton();
        button.setText("0,35");
        button.setCallbackData("5050RUId");
        row.add(button);

        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("0,37");
        button.setCallbackData("5050RUId");
        row.add(button);
        rowList.add(row);


        button=new InlineKeyboardButton();
        button.setText("0,40");
        button.setCallbackData("5050RUId");
        row.add(button);


        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("0,45");
        button.setCallbackData("5050RUId");
        row.add(button);
        rowList.add(row);



        inlineKeyboardMarkup.setKeyboard(rowList);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return sendPhoto;


    }
    public SendPhoto ctena5050(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile(new File("C:\\Users\\hp\\Pictures\\Saved Pictures\\demir50.50.jpg")));
        sendPhoto.setCaption("Технические характеристики:\n" +
                "Производитель: магазин Демир\n" +
                "Ширина: 50 мм\n" +
                "Высота: 50 мм\n" +
                "Длина: 4 м");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<InlineKeyboardButton> row=new ArrayList<>();
        List<List<InlineKeyboardButton>> rowList=new ArrayList<>();

        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("-RU5050Id");
        row.add(button);
        rowList.add(row);


        button=new InlineKeyboardButton();
        button.setText("1");
        button.setCallbackData("sonId");
        row.add(button);


        button=new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("+RU5050Id");
        row.add(button);


        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("Покупка");
        button.setCallbackData("sotibolishallRUId");
        row.add(button);
        rowList.add(row);


        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("⬅\uFE0FНазад");
        button.setCallbackData("qaytish5050RUId");
        row.add(button);
        rowList.add(row);


        inlineKeyboardMarkup.setKeyboard(rowList);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return sendPhoto;
    }
    int b=1;
    public InlineKeyboardMarkup profilRasmInlineqoshishRU5050(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile(new File("C:\\Users\\hp\\Pictures\\Saved Pictures\\demir50.40.jpg")));
        sendPhoto.setCaption("Ilyosga");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<InlineKeyboardButton> row=new ArrayList<>();
        List<List<InlineKeyboardButton>> rowList=new ArrayList<>();

        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("-RU5050Id");
        row.add(button);
        rowList.add(row);


        button=new InlineKeyboardButton();
        button.setText(String.valueOf(++b));
        button.setCallbackData("sonId");
        row.add(button);


        button=new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("+RU5050Id");
        row.add(button);


        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("Покупка");
        button.setCallbackData("sotibolishallRUId");
        row.add(button);
        rowList.add(row);

        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("⬅\uFE0FНазад");
        button.setCallbackData("qaytish5050RUId");
        row.add(button);
        rowList.add(row);


        inlineKeyboardMarkup.setKeyboard(rowList);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup profilRasmInlineayrishRU5050(Long chatId){

        if (b>1){
            --b;
        }
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile(new File("C:\\Users\\hp\\Pictures\\Saved Pictures\\demir50.40.jpg")));
        sendPhoto.setCaption("Ilyosga");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<InlineKeyboardButton> row=new ArrayList<>();
        List<List<InlineKeyboardButton>> rowList=new ArrayList<>();

        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("-RU5050Id");
        row.add(button);
        rowList.add(row);


        button=new InlineKeyboardButton();
        button.setText(String.valueOf(b));
        button.setCallbackData("sonId");
        row.add(button);


        button=new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("+RU5050Id");
        row.add(button);


        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("Покупка");
        button.setCallbackData("sotibolishallRUId");
        row.add(button);
        rowList.add(row);


        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("⬅\uFE0FНазад");
        button.setCallbackData("qaytish5050RUId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;


    }
    public SendPhoto buyurtmaberishctena7540(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile(new File("C:\\Users\\hp\\Pictures\\Saved Pictures\\demir75.40.jpg")));
        sendPhoto.setCaption("Описание Направляющий профиль 75 х 40, предназначен для монтажа гипсокартонных листов,\n" +
                " Его также используют при возведении фальш-стен.\n" +
                " С помощью этого материала можно качественно, быстро и грамотно построить перегородку в квартире, частном доме и офисе.\n" +
                "Цена: 3,10$");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<InlineKeyboardButton> row=new ArrayList<>();
        List<List<InlineKeyboardButton>> rowList=new ArrayList<>();

        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("0,33");
        button.setCallbackData("75.40RUId");
        row.add(button);
        rowList.add(row);

        button=new InlineKeyboardButton();
        button.setText("0,35");
        button.setCallbackData("75.40RUId");
        row.add(button);

        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("0,37");
        button.setCallbackData("75.40RUId");
        row.add(button);
        rowList.add(row);


        button=new InlineKeyboardButton();
        button.setText("0,40");
        button.setCallbackData("75.40RUId");
        row.add(button);


        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("0,45");
        button.setCallbackData("75.40RUId");
        row.add(button);
        rowList.add(row);



        inlineKeyboardMarkup.setKeyboard(rowList);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return sendPhoto;


    }
    public SendPhoto ctena7540(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile(new File("C:\\Users\\hp\\Pictures\\Saved Pictures\\demir75.40.jpg")));
        sendPhoto.setCaption("Технические характеристики:\n" +
                "Производитель: магазин Демир\n" +
                "Ширина 75 мм.\n" +
                "Высота 40 мм\n" +
                "Длина 3 м");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<InlineKeyboardButton> row=new ArrayList<>();
        List<List<InlineKeyboardButton>> rowList=new ArrayList<>();

        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("-RU7540Id");
        row.add(button);
        rowList.add(row);


        button=new InlineKeyboardButton();
        button.setText("1");
        button.setCallbackData("sonId");
        row.add(button);


        button=new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("+RU7540Id");
        row.add(button);


        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("Покупка");
        button.setCallbackData("sotibolishallRUId");
        row.add(button);
        rowList.add(row);


        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("⬅\uFE0FНазад");
        button.setCallbackData("qaytish7540RUId");
        row.add(button);
        rowList.add(row);


        inlineKeyboardMarkup.setKeyboard(rowList);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return sendPhoto;
    }
    public InlineKeyboardMarkup profilRasmInlineqoshishRU7540(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile(new File("C:\\Users\\hp\\Pictures\\Saved Pictures\\demir50.40.jpg")));
        sendPhoto.setCaption("Ilyosga");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<InlineKeyboardButton> row=new ArrayList<>();
        List<List<InlineKeyboardButton>> rowList=new ArrayList<>();

        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("-RU7540Id");
        row.add(button);
        rowList.add(row);


        button=new InlineKeyboardButton();
        button.setText(String.valueOf(++b));
        button.setCallbackData("sonId");
        row.add(button);


        button=new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("+RU7540Id");
        row.add(button);


        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("Покупка");
        button.setCallbackData("sotibolishallRUId");
        row.add(button);
        rowList.add(row);

        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("⬅\uFE0FНазад");
        button.setCallbackData("qaytish7540RUId");
        row.add(button);
        rowList.add(row);


        inlineKeyboardMarkup.setKeyboard(rowList);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup profilRasmInlineayrishRU7540(Long chatId){

        if (b>1){
            --b;
        }
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile(new File("C:\\Users\\hp\\Pictures\\Saved Pictures\\demir50.40.jpg")));
        sendPhoto.setCaption("Ilyosga");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<InlineKeyboardButton> row=new ArrayList<>();
        List<List<InlineKeyboardButton>> rowList=new ArrayList<>();

        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("-RU7540Id");
        row.add(button);
        rowList.add(row);


        button=new InlineKeyboardButton();
        button.setText(String.valueOf(b));
        button.setCallbackData("sonId");
        row.add(button);


        button=new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("+RU7540Id");
        row.add(button);


        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("Покупка");
        button.setCallbackData("sotibolishallRUId");
        row.add(button);
        rowList.add(row);


        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("⬅\uFE0FНазад");
        button.setCallbackData("qaytish7540RUId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;


    }
    public SendPhoto buyurtmaberishctena7550(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile(new File("C:\\Users\\hp\\Pictures\\Saved Pictures\\demir75.50.jpg")));
        sendPhoto.setCaption("Профиль CW 75/50 – стропильный профиль для гипсокартонных конструкций.\n" +
                " Профиль CW 75/50, вертикально прикрепленный с шагом 60 см между профилями типа UW 75/40, применяется для вертикальных колонн каркаса, предназначенных для гипсокартонных деталей.\n" +
                " Полочный профиль CW 75/50 используется в паре с соответствующим направляющим профилем UW 75/40.\n" +
                "Цена: 2,34$");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<InlineKeyboardButton> row=new ArrayList<>();
        List<List<InlineKeyboardButton>> rowList=new ArrayList<>();

        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("0,33");
        button.setCallbackData("75.50RUId");
        row.add(button);
        rowList.add(row);

        button=new InlineKeyboardButton();
        button.setText("0,35");
        button.setCallbackData("75.50RUId");
        row.add(button);

        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("0,37");
        button.setCallbackData("75.50RUId");
        row.add(button);
        rowList.add(row);


        button=new InlineKeyboardButton();
        button.setText("0,40");
        button.setCallbackData("75.50RUId");
        row.add(button);


        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("0,45");
        button.setCallbackData("75.50RUId");
        row.add(button);
        rowList.add(row);




        inlineKeyboardMarkup.setKeyboard(rowList);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return sendPhoto;


    }
    public SendPhoto ctena7550(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile(new File("C:\\Users\\hp\\Pictures\\Saved Pictures\\demir75.50.jpg")));
        sendPhoto.setCaption("Технические характеристики:\n" +
                "Производитель: магазин Демир\n" +
                "Тип: 75 х 50 мм\n" +
                "Материал: сталь\n" +
                "Длина: 3 м");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<InlineKeyboardButton> row=new ArrayList<>();
        List<List<InlineKeyboardButton>> rowList=new ArrayList<>();

        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("-RU7550Id");
        row.add(button);
        rowList.add(row);


        button=new InlineKeyboardButton();
        button.setText("1");
        button.setCallbackData("sonId");
        row.add(button);


        button=new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("+RU7550Id");
        row.add(button);


        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("Покупка");
        button.setCallbackData("sotibolishallRUId");
        row.add(button);
        rowList.add(row);


        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("⬅\uFE0FНазад");
        button.setCallbackData("qaytishRU7550Id");
        row.add(button);
        rowList.add(row);


        inlineKeyboardMarkup.setKeyboard(rowList);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return sendPhoto;
    }
    public InlineKeyboardMarkup profilRasmInlineqoshishRU7550(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile(new File("C:\\Users\\hp\\Pictures\\Saved Pictures\\demir50.40.jpg")));
        sendPhoto.setCaption("Ilyosga");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<InlineKeyboardButton> row=new ArrayList<>();
        List<List<InlineKeyboardButton>> rowList=new ArrayList<>();

        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("-RU7550Id");
        row.add(button);
        rowList.add(row);


        button=new InlineKeyboardButton();
        button.setText(String.valueOf(++b));
        button.setCallbackData("sonId");
        row.add(button);


        button=new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("+RU7550Id");
        row.add(button);


        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("Покупка");
        button.setCallbackData("sotibolishallRUId");
        row.add(button);
        rowList.add(row);

        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("⬅\uFE0FНазад");
        button.setCallbackData("qaytishRU7550Id");
        row.add(button);
        rowList.add(row);


        inlineKeyboardMarkup.setKeyboard(rowList);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup profilRasmInlineayrishRU7550(Long chatId){

        if (b>1){
            --b;
        }
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile(new File("C:\\Users\\hp\\Pictures\\Saved Pictures\\demir50.40.jpg")));
        sendPhoto.setCaption("Ilyosga");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<InlineKeyboardButton> row=new ArrayList<>();
        List<List<InlineKeyboardButton>> rowList=new ArrayList<>();

        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("-RU7550Id");
        row.add(button);
        rowList.add(row);


        button=new InlineKeyboardButton();
        button.setText(String.valueOf(b));
        button.setCallbackData("sonId");
        row.add(button);


        button=new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("+RU7550Id");
        row.add(button);


        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("Покупка");
        button.setCallbackData("sotibolishallRUId");
        row.add(button);
        rowList.add(row);


        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("⬅\uFE0FНазад");
        button.setCallbackData("qaytishRU7550Id");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;


    }
    public SendPhoto buyurtmaberishctena10040(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile(new File("C:\\Users\\hp\\Pictures\\Saved Pictures\\demir100.40.jpg")));
        sendPhoto.setCaption("Описание Профиль 100*40, длина 3,0 м, толщина от 0,4 до 0,7 мм, из оцинкованного металла. Используется в качестве основы для стоечных профилей, а также\n" +
                " используется для установки перемычек между секциями и крышками в рамах. \n" +
                "Цена: 5,31$");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<InlineKeyboardButton> row=new ArrayList<>();
        List<List<InlineKeyboardButton>> rowList=new ArrayList<>();

        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("0,33");
        button.setCallbackData("100.40RUId");
        row.add(button);
        rowList.add(row);

        button=new InlineKeyboardButton();
        button.setText("0,35");
        button.setCallbackData("100.40RUId");
        row.add(button);

        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("0,37");
        button.setCallbackData("100.40RUId");
        row.add(button);
        rowList.add(row);


        button=new InlineKeyboardButton();
        button.setText("0,40");
        button.setCallbackData("100.40RUId");
        row.add(button);


        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("0,45");
        button.setCallbackData("100.40RUId");
        row.add(button);
        rowList.add(row);




        inlineKeyboardMarkup.setKeyboard(rowList);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return sendPhoto;


    }
    public SendPhoto ctena10040(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile(new File("C:\\Users\\hp\\Pictures\\Saved Pictures\\demir100.40.jpg")));
        sendPhoto.setCaption("Технические характеристики:\n" +
                "Производитель: магазин Демир\n" +
                "Вес, кг: 2,5\n" +
                "Длина, мм: 3000\n" +
                "Ширина, мм: 100");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<InlineKeyboardButton> row=new ArrayList<>();
        List<List<InlineKeyboardButton>> rowList=new ArrayList<>();

        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("-RU10040Id");
        row.add(button);
        rowList.add(row);


        button=new InlineKeyboardButton();
        button.setText("1");
        button.setCallbackData("sonId");
        row.add(button);


        button=new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("+RU10040Id");
        row.add(button);


        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("Покупка");
        button.setCallbackData("sotibolishallRUId");
        row.add(button);
        rowList.add(row);


        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("⬅\uFE0FНазад");
        button.setCallbackData("qaytishRU10040Id");
        row.add(button);
        rowList.add(row);


        inlineKeyboardMarkup.setKeyboard(rowList);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return sendPhoto;
    }
    public InlineKeyboardMarkup profilRasmInlineqoshishRU10040(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile(new File("C:\\Users\\hp\\Pictures\\Saved Pictures\\demir50.40.jpg")));
        sendPhoto.setCaption("Ilyosga");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<InlineKeyboardButton> row=new ArrayList<>();
        List<List<InlineKeyboardButton>> rowList=new ArrayList<>();

        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("-RU10040Id");
        row.add(button);
        rowList.add(row);


        button=new InlineKeyboardButton();
        button.setText(String.valueOf(++b));
        button.setCallbackData("sonId");
        row.add(button);


        button=new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("+RU10040Id");
        row.add(button);


        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("Покупка");
        button.setCallbackData("sotibolishallRUId");
        row.add(button);
        rowList.add(row);

        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("⬅\uFE0FНазад");
        button.setCallbackData("qaytishRU10040Id");
        row.add(button);
        rowList.add(row);


        inlineKeyboardMarkup.setKeyboard(rowList);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup profilRasmInlineayrishRU10040(Long chatId){

        if (b>1){
            --b;
        }
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile(new File("C:\\Users\\hp\\Pictures\\Saved Pictures\\demir50.40.jpg")));
        sendPhoto.setCaption("Ilyosga");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<InlineKeyboardButton> row=new ArrayList<>();
        List<List<InlineKeyboardButton>> rowList=new ArrayList<>();

        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("-RU10040Id");
        row.add(button);
        rowList.add(row);


        button=new InlineKeyboardButton();
        button.setText(String.valueOf(b));
        button.setCallbackData("sonId");
        row.add(button);


        button=new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("+RU10040Id");
        row.add(button);


        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("Покупка");
        button.setCallbackData("sotibolishallRUId");
        row.add(button);
        rowList.add(row);


        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("⬅\uFE0FНазад");
        button.setCallbackData("qaytishRU10040Id");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;


    }
    public SendPhoto buyurtmaberishctena10050(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile(new File("C:\\Users\\hp\\Pictures\\Saved Pictures\\demir100.50.jpg")));
        sendPhoto.setCaption("Стоечный профиль 100 х 50 используется для монтажа кусков гипсокартона, а также для возведения фальш-стен.\n" +
                " С помощью этого материала вы сможете использовать качественные,\n" +
                " вы можете построить быстрое и компетентное подразделение.\n" +
                "Цена: 6,31$");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<InlineKeyboardButton> row=new ArrayList<>();
        List<List<InlineKeyboardButton>> rowList=new ArrayList<>();

        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("0,33");
        button.setCallbackData("100.50RUId");
        row.add(button);
        rowList.add(row);

        button=new InlineKeyboardButton();
        button.setText("0,35");
        button.setCallbackData("100.50RUId");
        row.add(button);

        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("0,37");
        button.setCallbackData("100.50RUId");
        row.add(button);
        rowList.add(row);


        button=new InlineKeyboardButton();
        button.setText("0,40");
        button.setCallbackData("100.50RUId");
        row.add(button);


        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("0,45");
        button.setCallbackData("100.50RUId");
        row.add(button);
        rowList.add(row);




        inlineKeyboardMarkup.setKeyboard(rowList);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return sendPhoto;


    }
    public SendPhoto ctena10050(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile(new File("C:\\Users\\hp\\Pictures\\Saved Pictures\\demir100.50.jpg")));
        sendPhoto.setCaption("Технические характеристики:\n" +
                "Производитель: магазин Демир\n" +
                "Ширина: 100 мм.\n" +
                "Высота: 50 мм\n" +
                "Длина: 4 м");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<InlineKeyboardButton> row=new ArrayList<>();
        List<List<InlineKeyboardButton>> rowList=new ArrayList<>();

        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("-RU10050Id");
        row.add(button);
        rowList.add(row);


        button=new InlineKeyboardButton();
        button.setText("1");
        button.setCallbackData("sonId");
        row.add(button);


        button=new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("-RU10050Id");
        row.add(button);


        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("Покупка");
        button.setCallbackData("sotibolishallRUId");
        row.add(button);
        rowList.add(row);


        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("⬅\uFE0FНазад");
        button.setCallbackData("qaytishRU10050Id");
        row.add(button);
        rowList.add(row);


        inlineKeyboardMarkup.setKeyboard(rowList);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return sendPhoto;
    }
    public InlineKeyboardMarkup profilRasmInlineqoshishRU10050(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile(new File("C:\\Users\\hp\\Pictures\\Saved Pictures\\demir50.40.jpg")));
        sendPhoto.setCaption("Ilyosga");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<InlineKeyboardButton> row=new ArrayList<>();
        List<List<InlineKeyboardButton>> rowList=new ArrayList<>();

        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("-RU10050Id");
        row.add(button);
        rowList.add(row);


        button=new InlineKeyboardButton();
        button.setText(String.valueOf(++b));
        button.setCallbackData("sonId");
        row.add(button);


        button=new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("+RU10050Id");
        row.add(button);


        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("Покупка");
        button.setCallbackData("sotibolishallRUId");
        row.add(button);
        rowList.add(row);

        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("⬅\uFE0FНазад");
        button.setCallbackData("qaytishRU10050Id");
        row.add(button);
        rowList.add(row);


        inlineKeyboardMarkup.setKeyboard(rowList);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup profilRasmInlineayrishRU10050(Long chatId){

        if (b>1){
            --b;
        }
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile(new File("C:\\Users\\hp\\Pictures\\Saved Pictures\\demir50.40.jpg")));
        sendPhoto.setCaption("Ilyosga");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<InlineKeyboardButton> row=new ArrayList<>();
        List<List<InlineKeyboardButton>> rowList=new ArrayList<>();

        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("-RU10050Id");
        row.add(button);
        rowList.add(row);


        button=new InlineKeyboardButton();
        button.setText(String.valueOf(b));
        button.setCallbackData("sonId");
        row.add(button);


        button=new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("+RU10050Id");
        row.add(button);


        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("Покупка");
        button.setCallbackData("sotibolishallRUId");
        row.add(button);
        rowList.add(row);


        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("⬅\uFE0FНазад");
        button.setCallbackData("qaytishRU10050Id");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;


    }
    public SendMessage plastiklarRU(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Выберите тип оплаты :");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<InlineKeyboardButton> row=new ArrayList<>();
        List<List<InlineKeyboardButton>> rowList=new ArrayList<>();

        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("Humo");
        button.setCallbackData("humoRUId");
        row.add(button);
        rowList.add(row);

        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("Uzcard");
        button.setCallbackData("uzcardRUId");
        row.add(button);
        rowList.add(row);


        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("Mastercard");
        button.setCallbackData("mastercardRUId");
        row.add(button);
        rowList.add(row);

        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("Visa");
        button.setCallbackData("visaRUId");
        row.add(button);
        rowList.add(row);



        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }
    public SendMessage plastikendRU(Long chatId){

        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Ваш заказ принят");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList=new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("⬅\uFE0FГлавная | Меню");
        row.add(button);
        rowList.add(row);


        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;
    }

    //GipsokardonRU
    public SendMessage gipsomenuRU(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Выбрать гипсокартон :");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList=new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("Настенавой");
        row.add(button);
        rowList.add(row);


        KeyboardButton button1 = new KeyboardButton();
        button1.setText("Потaлочный");
        row.add(button1);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button2 = new KeyboardButton();
        button2.setText("⬅\uFE0F  Назад");
        row1.add(button2);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;



    }
    public SendPhoto nastenavoyInlineRU(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile(new File("C:\\Users\\hp\\Pictures\\Saved Pictures\\demirnastenniy.jpg")));
        sendPhoto.setCaption("Гипсокартонная стена 2500/1200/12,5 мм\n" +
                "\n" +
                "Описание\n" +
                "Стена из гипсокартона ДЕМИР ГИПС\n" +
                "\n" +
                "Размер 2500/1200/12,5 мм\n" +
                "\n" +
                "Гипсокартон различных видов и назначений предлагает наш интернет-магазин строительных материалов. Существующие стены из гипсокартона, стены влагостойкие, потолок влагостойкий.\n" +
                "\n" +
                "Преимущества гипсокартона:\n" +
                "\n" +
                "облегчение;\n" +
                "\n" +
                "экологически чистый;\n" +
                "\n" +
                "хорошая звуко- и теплоизоляция;\n" +
                "\n" +
                "доступная цена\n" +
                "42 000 сум/шт.\n" +
                "\n" +
                "Гипсокартон – современный строительный материал, который широко применяется при облицовке стен, потолков, а также при создании деталей интерьера и других архитектурных элементов благодаря своей прочности, легкости и простоте резки.\n" +
                "\n" +
                "На сайте представлен полный ассортимент товаров, поэтому найти нужный товар будет легко.\n" +
                "\n" +
                "Заказ по звонкам и телефонам:");


        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<InlineKeyboardButton> row=new ArrayList<>();
        List<List<InlineKeyboardButton>> rowList=new ArrayList<>();

        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("-GipsoId");
        row.add(button);
        rowList.add(row);


        button=new InlineKeyboardButton();
        button.setText("1");
        button.setCallbackData("sonId");
        row.add(button);


        button=new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("+GipsoId");
        row.add(button);


        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("Покупка");
        button.setCallbackData("sotibolishallRUId");
        row.add(button);
        rowList.add(row);


        inlineKeyboardMarkup.setKeyboard(rowList);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return sendPhoto;
    }
    public InlineKeyboardMarkup GipsoInlineqoshishRU(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile(new File("C:\\Users\\hp\\Pictures\\Saved Pictures\\demirnastenniy.jpg")));
        sendPhoto.setCaption("Ilyosga");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<InlineKeyboardButton> row=new ArrayList<>();
        List<List<InlineKeyboardButton>> rowList=new ArrayList<>();

        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("-GipsoId");
        row.add(button);
        rowList.add(row);


        button=new InlineKeyboardButton();
        button.setText(String.valueOf(++b));
        button.setCallbackData("sonId");
        row.add(button);


        button=new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("+GipsoId");
        row.add(button);


        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("Покупка");
        button.setCallbackData("sotibolishallRUId");
        row.add(button);
        rowList.add(row);


        inlineKeyboardMarkup.setKeyboard(rowList);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup GipsoInlineayrishRU(Long chatId){

        if (b>1){
            --b;
        }
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile(new File("C:\\Users\\hp\\Pictures\\Saved Pictures\\demirnastenniy.jpg")));
        sendPhoto.setCaption("Ilyosga");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<InlineKeyboardButton> row=new ArrayList<>();
        List<List<InlineKeyboardButton>> rowList=new ArrayList<>();

        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("-GipsoId");
        row.add(button);
        rowList.add(row);


        button=new InlineKeyboardButton();
        button.setText(String.valueOf(b));
        button.setCallbackData("sonId");
        row.add(button);


        button=new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("+GipsoId");
        row.add(button);


        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("Покупка");
        button.setCallbackData("sotibolishallRUId");
        row.add(button);
        rowList.add(row);


        inlineKeyboardMarkup.setKeyboard(rowList);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;


    }
    public SendPhoto potolochniyInlineRU(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile(new File("C:\\Users\\hp\\Pictures\\Saved Pictures\\demirpotolochiny.jpg")));
        sendPhoto.setCaption("Потолок из гипсокартона ДЕМИР ГИПС\n" +
                "\n" +
                "Толщина 9,5 мм.\n" +
                "\n" +
                "Гипсокартон различных видов и назначений предлагает наш интернет-магазин строительных материалов. Существующие стены из гипсокартона, стены влагостойкие, потолок влагостойкий.\n" +
                "\n" +
                "Преимущества гипсокартона:\n" +
                "\n" +
                "облегчение;\n" +
                "\n" +
                "экологически чистый;\n" +
                "\n" +
                "хорошая звуко- и теплоизоляция;\n" +
                "\n" +
                "доступная цена\n" +
                "32 500 сум/шт.\n" +
                "Гипсокартон – современный строительный материал, который широко применяется при облицовке стен, потолков, а также при создании деталей интерьера и других архитектурных элементов благодаря своей прочности, легкости и простоте резки.\n" +
                "\n" +
                "На сайте представлен полный ассортимент товаров, поэтому найти нужный товар будет легко.\n" +
                "\n" +
                "Заказ по звонкам и телефонам:");


        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<InlineKeyboardButton> row=new ArrayList<>();
        List<List<InlineKeyboardButton>> rowList=new ArrayList<>();

        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("-GipsoId");
        row.add(button);
        rowList.add(row);


        button=new InlineKeyboardButton();
        button.setText("1");
        button.setCallbackData("sonId");
        row.add(button);


        button=new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("+GipsoId");
        row.add(button);


        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("Покупка");
        button.setCallbackData("sotibolishallRUId");
        row.add(button);
        rowList.add(row);





        inlineKeyboardMarkup.setKeyboard(rowList);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return sendPhoto;
    }
}
