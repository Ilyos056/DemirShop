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
        button3.setText("Аксессуары");
        row1.add(button3);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;


    }
    public SendMessage shareContactRU(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Отправьте свой номер телефона для регистрации");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();
        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("Поделиться Контакты");
        button.setRequestContact(true);
        row.add(button);
        rowList.add(row);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
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


    //Inline
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
        sendPhoto.setCaption("Ozingiz malumotlarni kiriting Ilyos");

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
        button.setText(String.valueOf(t));
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
        sendPhoto.setCaption("Ozingiz malumotlarni kiriting Ilyos");

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
        sendPhoto.setCaption("Ozingiz malumotlarni kiriting Ilyos");

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
        sendPhoto.setCaption("Ozingiz malumotlarni kiriting Ilyos");

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
        sendPhoto.setCaption("Ozingiz malumotlarni kiriting Ilyos");

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
        sendPhoto.setCaption("Ozingiz malumotlarni kiriting Ilyos");

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
        button.setCallbackData("mastercardId");
        row.add(button);
        rowList.add(row);

        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("Visa");
        button.setCallbackData("visaId");
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
        return sendPhoto;
    }








}
