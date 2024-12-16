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
import java.util.Stack;

public class MyBotServiceENG {

    public SendMessage menuENG(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Select from the menu");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();
        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("Profnastyle");
        row.add(button);

        KeyboardButton button1 = new KeyboardButton();
        button1.setText("Profile");
        row.add(button1);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button2 = new KeyboardButton();
        button2.setText("Gypsum cardboard");
        row1.add(button2);

        KeyboardButton button3 = new KeyboardButton();
        button3.setText("Calculator");
        row1.add(button3);
        rowList.add(row1);

        KeyboardButton button4 = new KeyboardButton();
        button4.setText("Our addresses");
        row1.add(button4);

        KeyboardButton button5 = new KeyboardButton();
        button5.setText("List of Masters");
        row1.add(button5);

        KeyboardRow row2 = new KeyboardRow();
        KeyboardButton button6 = new KeyboardButton();
        button6.setText("Comment");
        row2.add(button6);
        rowList.add(row2);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;
    }
    //profnastil
    public SendMessage profnastilMenu(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendMessage.setChatId(chatId);
        sendMessage.setText("Choose Profnastil corrugation");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();
        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("Opposite-growth wave");
        row.add(button);

        KeyboardButton button1 = new KeyboardButton();
        button1.setText("Economical");
        row.add(button1);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button2 = new KeyboardButton();
        button2.setText("П35 corrugation");
        row1.add(button2);

        KeyboardButton button3 = new KeyboardButton();
        button3.setText("П57 corrugation");
        row1.add(button3);
        rowList.add(row1);

        KeyboardRow row2 = new KeyboardRow();
        KeyboardButton button6 = new KeyboardButton();
        button6.setText("Tile");
        row2.add(button6);

        KeyboardButton button4 = new KeyboardButton();
        button4.setText("Square tiles");
        row2.add(button4);
        rowList.add(row2);

        KeyboardRow row3 = new KeyboardRow();
        KeyboardButton button5 = new KeyboardButton();
        button5.setText("BACK");
        row3.add(button5);
        rowList.add(row3);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;
    }
    public SendMessage profnastildescription(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Choose a profile color");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();
        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("White (9003)");
        row.add(button);

        KeyboardButton button1 = new KeyboardButton();
        button1.setText("Black (9005)");
        row.add(button1);

        KeyboardButton button2 = new KeyboardButton();
        button2.setText("Cream (1015)");
        row.add(button2);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button3 = new KeyboardButton();
        button3.setText("Red (3003)");
        row1.add(button3);

        KeyboardButton button4 = new KeyboardButton();
        button4.setText("vinous (3005)");
        row1.add(button4);

        KeyboardButton button5 = new KeyboardButton();
        button5.setText("GREEN (6005)");
        row1.add(button5);
        rowList.add(row1);

        KeyboardRow row2 = new KeyboardRow();
        KeyboardButton button6 = new KeyboardButton();
        button6.setText("DARK RED (3005)");
        row2.add(button6);

        KeyboardButton button7 = new KeyboardButton();
        button7.setText("Chocolate color (8017)");
        row2.add(button7);


        KeyboardButton button8 = new KeyboardButton();
        button8.setText("Mripping (7024)");
        row2.add(button8);
        rowList.add(row2);

        KeyboardRow row3 = new KeyboardRow();
        KeyboardButton button9 = new KeyboardButton();
        button9.setText("grey (7004)");
        row3.add(button9);

        KeyboardButton button10 = new KeyboardButton();
        button10.setText("galvanized");
        row3.add(button10);

        KeyboardRow row4 = new KeyboardRow();
        KeyboardButton button11 = new KeyboardButton();
        button11.setText("White (9016)");
        row4.add(button11);

        KeyboardRow row6 = new KeyboardRow();
        KeyboardButton button12 = new KeyboardButton();
        button12.setText("Back");
        row6.add(button12);
        rowList.add(row6);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;

    }

    public SendMessage profnastilmasterpriceENG(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Choose the thickness");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();
        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("0.30 SMZ 1m = 55 000");
        row.add(button);

        KeyboardButton button1 = new KeyboardButton();
        button1.setText("0.33 SMZ  1m = 58 000");
        row.add(button1);

        KeyboardButton button2 = new KeyboardButton();
        button2.setText("0.35 SMZ 1m = 62 000");
        row.add(button2);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button3 = new KeyboardButton();
        button3.setText("0.37 SMZ 1m = 65 000");
        row1.add(button3);

        KeyboardButton button4 = new KeyboardButton();
        button4.setText("0.40 SMZ 1m = 67 000");
        row1.add(button4);

        KeyboardButton button5 = new KeyboardButton();
        button5.setText("0.45 SMZ 1m = 72 000");
        row1.add(button5);
        rowList.add(row1);

        KeyboardRow row2 = new KeyboardRow();
        KeyboardButton button6 = new KeyboardButton();
        button6.setText("0.50 SMZ 1m = 78 000");
        row2.add(button6);


        KeyboardButton button7 = new KeyboardButton();
        button7.setText("0.60 SMZ 1m = 83 000");
        row2.add(button7);

        KeyboardButton button8 = new KeyboardButton();
        button8.setText("Back");
        row2.add(button8);
        rowList.add(row2);


        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;
    }
    public SendPhoto profnastilinlineENG(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://st2.stpulscen.ru/images/product/417/231/054_original.jpg"));
        sendPhoto.setCaption("Select");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<InlineKeyboardButton> row = new ArrayList<>();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("-ENGId");
        row.add(button);
        rowList.add(row);

        button=new InlineKeyboardButton();
        button.setText("1");
        button.setCallbackData("sonId");
        row.add(button);


        button=new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("+ENGId");
        row.add(button);


        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("Buying");
        button.setCallbackData("sotibolishENGId");
        row.add(button);
        rowList.add(row);

        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("⬅\uFE0FBACK");
        button.setCallbackData("qaytishIdprofnastilENG");
        row.add(button);
        rowList.add(row);


        inlineKeyboardMarkup.setKeyboard(rowList);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return sendPhoto;
    }
    int e=1;
    public InlineKeyboardMarkup profnastilinlineqoshish(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://st2.stpulscen.ru/images/product/417/231/054_original.jpg"));
        sendPhoto.setCaption("Select");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<InlineKeyboardButton> row = new ArrayList<>();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("-ENGId");
        row.add(button);
        rowList.add(row);

        button=new InlineKeyboardButton();
        button.setText(String.valueOf(++e));
        button.setCallbackData("sonId");
        row.add(button);


        button=new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("+ENGId");
        row.add(button);


        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("Buying");
        button.setCallbackData("sotibolishENGId");
        row.add(button);
        rowList.add(row);

        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("⬅\uFE0FBACK");
        button.setCallbackData("qaytishIdprofnastilENG");
        row.add(button);
        rowList.add(row);


        inlineKeyboardMarkup.setKeyboard(rowList);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup profnastilinlineayrish(Long chatId){

        if (e>1){
            --e;
        }
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://st2.stpulscen.ru/images/product/417/231/054_original.jpg"));
        sendPhoto.setCaption("Select");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<InlineKeyboardButton> row = new ArrayList<>();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("-ENGId");
        row.add(button);
        rowList.add(row);

        button=new InlineKeyboardButton();
        button.setText(String.valueOf(e));
        button.setCallbackData("sonId");
        row.add(button);


        button=new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("+ENGId");
        row.add(button);


        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("Buying");
        button.setCallbackData("sotibolishENGId");
        row.add(button);
        rowList.add(row);

        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("⬅\uFE0FBACK");
        button.setCallbackData("qaytishIdprofnastilENG");
        row.add(button);
        rowList.add(row);


        inlineKeyboardMarkup.setKeyboard(rowList);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }




    //profil

    public SendMessage profilMenuENG(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Select");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow keyboardRow = new KeyboardRow();
        KeyboardButton keyboardButton = new KeyboardButton();
        keyboardButton.setText("\uD83D\uDECDPlace an order");
        keyboardRow.add(keyboardButton);
        rowList.add(keyboardRow);

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("Price list\uD83D\uDCCB");
        row.add(button);
        rowList.add(row);


        KeyboardButton button1 = new KeyboardButton();
        button1.setText("Contacts\uD83D\uDCF1");
        row.add(button1);

        KeyboardButton button2 = new KeyboardButton();
        button2.setText("Catalog\uD83D\uDDC3");
        row.add(button2);


        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button3 = new KeyboardButton();
        button3.setText("Social network and website\uD83C\uDF10");
        row1.add(button3);
        rowList.add(row1);


        KeyboardButton button4 = new KeyboardButton();
        button4.setText("Photograph\uD83D\uDCF8");
        row1.add(button4);


        KeyboardButton button5 = new KeyboardButton();
        button5.setText("Video\uD83D\uDCF9");
        row1.add(button5);


        KeyboardRow row2 = new KeyboardRow();
        KeyboardButton button6 = new KeyboardButton();
        button6.setText("Factory capacity\uD83E\uDDBE");
        row2.add(button6);
        rowList.add(row2);


        KeyboardButton button7 = new KeyboardButton();
        button7.setText("Our address\uD83D\uDDFA");
        row2.add(button7);

        KeyboardButton button8 = new KeyboardButton();
        button8.setText("Language selection\uD83C\uDF0F");
        row2.add(button8);


        KeyboardRow row3 = new KeyboardRow();
        KeyboardButton button9 = new KeyboardButton();
        button9.setText("⬅\uFE0F  Back");
        row3.add(button9);
        rowList.add(row3);


        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;


    }

    public SendMessage buyurtmaberishENG(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Select");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();


        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("Profill");
        row.add(button);
        rowList.add(row);

        KeyboardButton button1 = new KeyboardButton();
        button1.setText("Guides profile");
        row.add(button1);


        KeyboardButton button2 = new KeyboardButton();
        button2.setText("Pendants (AGRO)");
        row.add(button2);

        KeyboardRow row2 = new KeyboardRow();
        KeyboardButton button4 = new KeyboardButton();
        button4.setText("Wall profile 50*40");
        row2.add(button4);
        rowList.add(row2);


        KeyboardButton button5 = new KeyboardButton();
        button5.setText("Wall profile 50*50");
        row2.add(button5);


        KeyboardButton button6 = new KeyboardButton();
        button6.setText("Wall profile 75*40");
        row2.add(button6);

        KeyboardRow row3 = new KeyboardRow();
        KeyboardButton button7 = new KeyboardButton();
        button7.setText("Wall profile 75*50");
        row3.add(button7);
        rowList.add(row3);

        KeyboardButton button8 = new KeyboardButton();
        button8.setText("Wall profile 100*40");
        row3.add(button8);


        KeyboardButton button9 = new KeyboardButton();
        button9.setText("Wall profile 100*50");
        row3.add(button9);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button3 = new KeyboardButton();
        button3.setText("⬅\uFE0F    Back");
        row1.add(button3);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;

    }
    public SendDocument prayslistdocENG(Long chatId) {
        SendDocument sendDocument = new SendDocument();
        sendDocument.setChatId(chatId);
        sendDocument.setDocument(new InputFile(new File("C:\\Users\\hp\\Documents\\Настраиваемые шаблоны Office\\(UZ) Прайс-лист Demir Profil от 25.04.2024 г.pdf")));
        sendDocument.setCaption("For a list of export prices, please contact the following contact details:\n" +
                "Sales Department - 998 (88) 224-44-44\n" +
                "Export Department - 998 (95) 250-59-99\n" +
                "E-mail - info@demir-profil.com");
        return sendDocument;
    }
    public SendMessage KontaktlarENG(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("https://t.me/demirprofiluz");

        return sendMessage;
    }
    public SendMessage Kontaktlar2ENG(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Sales department:\n" +
                "+998 (88) 224-44-44\n" +
                "\n" +
                "Export Department:\n" +
                "+ 998 (95) 250-59-99\n" +
                "\n" +
                "Regional managers:\n" +
                "+998 (88) 244-99-99\n" +
                "+998 (93) 722-06-63\n" +
                "+998 (97) 395-05-04\n" +
                "+998 (90) 655-45-25\n" +
                "\n" +
                "Mail:\n" +
                "info@demir-profil.com");


        return sendMessage;
    }
    public  SendDocument Photodoc(Long chatId){
        SendDocument sendDocument = new SendDocument();
        sendDocument.setChatId(chatId);
        sendDocument.setDocument(new InputFile(new File("C:\\Users\\hp\\Documents\\Настраиваемые шаблоны Office\\Products.pdf")));
        return sendDocument;
    }

    public SendVideo videoENG(Long chatId) {
        SendVideo sendVideo = new SendVideo();
        sendVideo.setChatId(chatId);
        sendVideo.setVideo(new InputFile(new File("C:\\Users\\hp\\Videos\\Captures\\demirshopvideo.mp4")));

        return sendVideo;

    }
    public SendMessage IjtimoiyTarmoqENG(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Social network:\n" +
                "https://www.instagram.com/demirprofiluz\n" +
                "https://www.facebook.com/demirprofil.uz\n" +
                "\n" +
                "Website:\n" +
                "https://demir-profil.com (https://demir-profil.com/)");

        return sendMessage;
    }
    public SendLocation locationENG(Long chatId) {
        SendLocation sendLocation = new SendLocation();
        sendLocation.setChatId(chatId);
        sendLocation.setLatitude(39.6354094);
        sendLocation.setLongitude(66.8741039);
        return sendLocation;
    }
    public SendMessage ManzillarENG(Long chatId) {

        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Uzbekistan, Samarkand, Khishrav-2 massif, Urgut, free economic zone");
        return sendMessage;
    }
    public SendDocument KatalogENG(Long chatId) {
        SendDocument sendDocument = new SendDocument();
        sendDocument.setChatId(chatId);
        sendDocument.setDocument(new InputFile(new File("C:\\Users\\hp\\Documents\\Настраиваемые шаблоны Office\\demirshopdocument.pdf")));
        return sendDocument;
    }



    //profile Inline
    public SendMessage profilInlineENG(Long chatId){

        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Select the thickness of the profile :");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<InlineKeyboardButton> row=new ArrayList<>();
        List<List<InlineKeyboardButton>> rowList=new ArrayList<>();

        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("0,25");
        button.setCallbackData("0,25ENGId");
        row.add(button);
        rowList.add(row);



        button=new InlineKeyboardButton();
        button.setText("0.28");
        button.setCallbackData("0,25ENGId");
        row.add(button);



        button=new InlineKeyboardButton();
        button.setText("0,30");
        button.setCallbackData("0,25ENGId");
        row.add(button);


        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("0,33");
        button.setCallbackData("0,25ENGId");
        row.add(button);
        rowList.add(row);



        button=new InlineKeyboardButton();
        button.setText("0,35");
        button.setCallbackData("0,25ENGId");
        row.add(button);



        button=new InlineKeyboardButton();
        button.setText("0,37");
        button.setCallbackData("0,25ENGId");
        row.add(button);


        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("0,40");
        button.setCallbackData("0,25ENGId");
        row.add(button);
        rowList.add(row);


        button=new InlineKeyboardButton();
        button.setText("0,45");
        button.setCallbackData("0,25ENGId");
        row.add(button);


        button=new InlineKeyboardButton();
        button.setText("0,50");
        button.setCallbackData("0,25ENGId");
        row.add(button);

        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("0,60");
        button.setCallbackData("0,25ENGId");
        row.add(button);
        rowList.add(row);



        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;

    }
    public SendPhoto profilRasmInlineENG(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile(new File("C:\\Users\\hp\\Pictures\\Saved Pictures\\demirphoto.jpg")));
        sendPhoto.setCaption("0,25mm 1M=680GRAMM+/-\n" +
                "price:100$");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<InlineKeyboardButton> row=new ArrayList<>();
        List<List<InlineKeyboardButton>> rowList=new ArrayList<>();

        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("-prENGId");
        row.add(button);
        rowList.add(row);


        button=new InlineKeyboardButton();
        button.setText("1");
        button.setCallbackData("sonId");
        row.add(button);


        button=new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("+prENGId");
        row.add(button);


        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("Buying");
        button.setCallbackData("sotibolishENGId");
        row.add(button);
        rowList.add(row);

        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("⬅\uFE0FBack");
        button.setCallbackData("qaytishIdprofilENG");
        row.add(button);
        rowList.add(row);


        inlineKeyboardMarkup.setKeyboard(rowList);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return sendPhoto;
    }
    int i=1;
    public InlineKeyboardMarkup profilRasmInlineqoshishprofilENG(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile(new File("C:\\Users\\hp\\Pictures\\Saved Pictures\\demirphoto.jpg")));
        sendPhoto.setCaption("0,25mm 1M=680GRAMM+/-\n" +
                "prise:100$");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<InlineKeyboardButton> row=new ArrayList<>();
        List<List<InlineKeyboardButton>> rowList=new ArrayList<>();

        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("-prENGId");
        row.add(button);
        rowList.add(row);


        button=new InlineKeyboardButton();
        button.setText(String.valueOf(++i));
        button.setCallbackData("sonId");
        row.add(button);


        button=new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("+prENGId");
        row.add(button);


        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("Buying");
        button.setCallbackData("sotibolishId");
        row.add(button);
        rowList.add(row);

        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("⬅\uFE0FBack");
        button.setCallbackData("qaytishIdprofilENG");
        row.add(button);
        rowList.add(row);


        inlineKeyboardMarkup.setKeyboard(rowList);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup profilRasmInlineayrishprofilENG(Long chatId){

        if (i>1){
            --i;
        }
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile(new File("C:\\Users\\hp\\Pictures\\Saved Pictures\\demirphoto.jpg")));
        sendPhoto.setCaption("0,25mm 1M=680GRAMM+/-\n" +
                "prise:100$");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<InlineKeyboardButton> row=new ArrayList<>();
        List<List<InlineKeyboardButton>> rowList=new ArrayList<>();

        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("-prENGId");
        row.add(button);
        rowList.add(row);


        button=new InlineKeyboardButton();
        button.setText(String.valueOf(i));
        button.setCallbackData("sonId");
        row.add(button);


        button=new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("+prENGId");
        row.add(button);


        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("Buying");
        button.setCallbackData("sotibolishId");
        row.add(button);
        rowList.add(row);


        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("⬅\uFE0FBack");
        button.setCallbackData("qaytishIdprofilENG");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;


    }
    public SendPhoto buyurtmaberishctena5040ENG(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile(new File("C:\\Users\\hp\\Pictures\\Saved Pictures\\demir50.40.jpg")));
        sendPhoto.setCaption("Demir Profil 50*40 guide profile is used as a guide for the 50*50 rack profile when installing plasterboard pieces or wall coverings.\n" +
                " It is also used to install jumpers between them. Guide profile PN 50 * 50 mainly performs auxiliary functions and is part of the frame.\n" +
                " Sometimes used as a base for fastening sheets.\n" +
                " price: $1.96");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<InlineKeyboardButton> row=new ArrayList<>();
        List<List<InlineKeyboardButton>> rowList=new ArrayList<>();

        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("0,33");
        button.setCallbackData("50.40ENGId");
        row.add(button);
        rowList.add(row);

        button=new InlineKeyboardButton();
        button.setText("0,35");
        button.setCallbackData("50.40ENGId");
        row.add(button);

        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("0,37");
        button.setCallbackData("50.40ENGId");
        row.add(button);
        rowList.add(row);


        button=new InlineKeyboardButton();
        button.setText("0,40");
        button.setCallbackData("50.40ENGId");
        row.add(button);


        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("0,45");
        button.setCallbackData("50.40ENGId");
        row.add(button);
        rowList.add(row);



        inlineKeyboardMarkup.setKeyboard(rowList);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return sendPhoto;


    }
    public SendPhoto ctena5040ENG(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile(new File("C:\\Users\\hp\\Pictures\\Saved Pictures\\demir50.40.jpg")));
        sendPhoto.setCaption("Weight\t1 kg / piece\n" +
                "Length\t3 m; 4 m;\n" +
                "Coating\tZinc");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<InlineKeyboardButton> row=new ArrayList<>();
        List<List<InlineKeyboardButton>> rowList=new ArrayList<>();

        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("-5040ENGId");
        row.add(button);
        rowList.add(row);


        button=new InlineKeyboardButton();
        button.setText("1");
        button.setCallbackData("sonId");
        row.add(button);


        button=new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("+5040ENGId");
        row.add(button);


        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("Buying");
        button.setCallbackData("sotibolishENGId");
        row.add(button);
        rowList.add(row);

        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("⬅\uFE0FBack");
        button.setCallbackData("qaytish5040ENGId");
        row.add(button);
        rowList.add(row);


        inlineKeyboardMarkup.setKeyboard(rowList);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return sendPhoto;
    }
    int w=1;
    public InlineKeyboardMarkup profilRasmInlineqoshish5040ENG(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile(new File("C:\\Users\\hp\\Pictures\\Saved Pictures\\demir50.40.jpg")));
        sendPhoto.setCaption("Weight \t 1 kg / piece\n" +
                "             Length \t 3 m; 4 m; \n" +
                "              Coating \t Zinc");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<InlineKeyboardButton> row=new ArrayList<>();
        List<List<InlineKeyboardButton>> rowList=new ArrayList<>();

        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("-5040ENGId");
        row.add(button);
        rowList.add(row);


        button=new InlineKeyboardButton();
        button.setText(String.valueOf(++w));
        button.setCallbackData("sonId");
        row.add(button);


        button=new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("+5040ENGId");
        row.add(button);


        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("Buying");
        button.setCallbackData("sotibolishENGId");
        row.add(button);
        rowList.add(row);

        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("⬅\uFE0FBack");
        button.setCallbackData("qaytish5040ENGId");
        row.add(button);
        rowList.add(row);


        inlineKeyboardMarkup.setKeyboard(rowList);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup profilRasmInlineayrish5040ENG(Long chatId){

        if (w>1){
            --w;
        }
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile(new File("C:\\Users\\hp\\Pictures\\Saved Pictures\\demir50.40.jpg")));
        sendPhoto.setCaption("Weight \t 1 kg / piece\n" +
                "             Length \t 3 m; 4 m;\n" +
                "             Coating \t Zinc");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<InlineKeyboardButton> row=new ArrayList<>();
        List<List<InlineKeyboardButton>> rowList=new ArrayList<>();

        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("-5040ENGId");
        row.add(button);
        rowList.add(row);


        button=new InlineKeyboardButton();
        button.setText(String.valueOf(w));
        button.setCallbackData("sonId");
        row.add(button);


        button=new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("+5040ENGId");
        row.add(button);


        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("Buying");
        button.setCallbackData("sotibolishENGId");
        row.add(button);
        rowList.add(row);


        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("⬅\uFE0FBack");
        button.setCallbackData("qaytish5040ENGId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;


    }
    public SendPhoto buyurtmaberishctena5050ENG(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile(new File("C:\\Users\\hp\\Pictures\\Saved Pictures\\demir50.50.jpg")));
        sendPhoto.setCaption("Demir profile 50 x 50 is used to install parts made of plasterboard sheets, and it is also used in the construction of false walls.\n" +
                " With this material, you can build a high-quality, fast and competent partition in an apartment, private house and office.\n" +
                " 4-meter profile is used for high ceilings, if you do without connectors.\n" +
                " Price: $4.38");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<InlineKeyboardButton> row=new ArrayList<>();
        List<List<InlineKeyboardButton>> rowList=new ArrayList<>();

        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("0,33");
        button.setCallbackData("5050ENGId");
        row.add(button);
        rowList.add(row);

        button=new InlineKeyboardButton();
        button.setText("0,35");
        button.setCallbackData("5050ENGId");
        row.add(button);

        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("0,37");
        button.setCallbackData("5050ENGId");
        row.add(button);
        rowList.add(row);


        button=new InlineKeyboardButton();
        button.setText("0,40");
        button.setCallbackData("5050ENGId");
        row.add(button);


        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("0,45");
        button.setCallbackData("5050ENGId");
        row.add(button);
        rowList.add(row);


        inlineKeyboardMarkup.setKeyboard(rowList);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return sendPhoto;


    }
    public SendPhoto ctena5050ENG(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile(new File("C:\\Users\\hp\\Pictures\\Saved Pictures\\demir50.50.jpg")));
        sendPhoto.setCaption("Specifications :\n" +
                "Manufacturer: Demir shop\n" +
                "Width : 50 mm\n" +
                "Height : 50 mm\n" +
                "Length: 4 m");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<InlineKeyboardButton> row=new ArrayList<>();
        List<List<InlineKeyboardButton>> rowList=new ArrayList<>();

        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("-5050ENGId");
        row.add(button);
        rowList.add(row);


        button=new InlineKeyboardButton();
        button.setText("1");
        button.setCallbackData("sonId");
        row.add(button);


        button=new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("+5050ENGId");
        row.add(button);


        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("Buying");
        button.setCallbackData("sotibolishENGId");
        row.add(button);
        rowList.add(row);


        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("⬅\uFE0FBack");
        button.setCallbackData("qaytish5050ENGId");
        row.add(button);
        rowList.add(row);


        inlineKeyboardMarkup.setKeyboard(rowList);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return sendPhoto;
    }
    int a=1;
    public InlineKeyboardMarkup profilRasmInlineqoshish5050ENG(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile(new File("C:\\Users\\hp\\Pictures\\Saved Pictures\\demir50.50.jpg")));
        sendPhoto.setCaption("0,25mm 1M=680GRAMM+/-\n" +
                "narxi:100$");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<InlineKeyboardButton> row=new ArrayList<>();
        List<List<InlineKeyboardButton>> rowList=new ArrayList<>();

        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("-5050ENGId");
        row.add(button);
        rowList.add(row);


        button=new InlineKeyboardButton();
        button.setText(String.valueOf(++a));
        button.setCallbackData("sonId");
        row.add(button);


        button=new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("+5050ENGId");
        row.add(button);


        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("Buying");
        button.setCallbackData("sotibolishENGId");
        row.add(button);
        rowList.add(row);

        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("⬅\uFE0FBack");
        button.setCallbackData("qaytish5050ENGId");
        row.add(button);
        rowList.add(row);


        inlineKeyboardMarkup.setKeyboard(rowList);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup profilRasmInlineayrish5050ENG(Long chatId){

        if (a>1){
            --a;
        }
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile(new File("C:\\Users\\hp\\Pictures\\Saved Pictures\\demir50.50.jpg")));
        sendPhoto.setCaption("0,25mm 1M=680GRAMM+/-\n" +
                "narxi:100$");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<InlineKeyboardButton> row=new ArrayList<>();
        List<List<InlineKeyboardButton>> rowList=new ArrayList<>();

        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("-5050ENGId");
        row.add(button);
        rowList.add(row);


        button=new InlineKeyboardButton();
        button.setText(String.valueOf(a));
        button.setCallbackData("sonId");
        row.add(button);


        button=new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("+5050ENGId");
        row.add(button);


        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("Buying");
        button.setCallbackData("sotibolishENGId");
        row.add(button);
        rowList.add(row);


        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("⬅\uFE0FBack");
        button.setCallbackData("qaytish5050ENGId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;


    }
    public SendPhoto buyurtmaberishctena7540ENG(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile(new File("C:\\Users\\hp\\Pictures\\Saved Pictures\\demir75.40.jpg")));
        sendPhoto.setCaption("Description Guide profile 75 x 40, used for installing pieces of plasterboard,\n" +
                " is also used in the construction of false walls.\n" +
                " With this material, you can build a high-quality, fast and competent partition in an apartment, private house and office.\n" +
                " Price: $3.10");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<InlineKeyboardButton> row=new ArrayList<>();
        List<List<InlineKeyboardButton>> rowList=new ArrayList<>();

        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("0,33");
        button.setCallbackData("75.40ENGId");
        row.add(button);
        rowList.add(row);

        button=new InlineKeyboardButton();
        button.setText("0,35");
        button.setCallbackData("75.40ENGId");
        row.add(button);

        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("0,37");
        button.setCallbackData("75.40ENGId");
        row.add(button);
        rowList.add(row);


        button=new InlineKeyboardButton();
        button.setText("0,40");
        button.setCallbackData("75.40ENGId");
        row.add(button);


        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("0,45");
        button.setCallbackData("75.40ENGId");
        row.add(button);
        rowList.add(row);


        inlineKeyboardMarkup.setKeyboard(rowList);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return sendPhoto;


    }
    public SendPhoto ctena7540ENG(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile(new File("C:\\Users\\hp\\Pictures\\Saved Pictures\\demir75.40.jpg")));
        sendPhoto.setCaption("Specifications:\n" +
                " Manufacturer : Demir shop\n" +
                " Width : 75 mm.\n" +
                " Height : 40mm\n" +
                " Length : 3 m");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<InlineKeyboardButton> row=new ArrayList<>();
        List<List<InlineKeyboardButton>> rowList=new ArrayList<>();

        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("-7540ENGId");
        row.add(button);
        rowList.add(row);


        button=new InlineKeyboardButton();
        button.setText("1");
        button.setCallbackData("sonId");
        row.add(button);


        button=new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("+7540ENGId");
        row.add(button);


        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("Buying");
        button.setCallbackData("sotibolishENGId");
        row.add(button);
        rowList.add(row);


        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("⬅\uFE0FBack");
        button.setCallbackData("qaytish7540ENGId");
        row.add(button);
        rowList.add(row);


        inlineKeyboardMarkup.setKeyboard(rowList);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return sendPhoto;
    }
    public InlineKeyboardMarkup profilRasmInlineqoshish7540ENG(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile(new File("C:\\Users\\hp\\Pictures\\Saved Pictures\\demir75.40.jpg")));
        sendPhoto.setCaption("0,25mm 1M=680GRAMM+/-\n" +
                "narxi:100$");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<InlineKeyboardButton> row=new ArrayList<>();
        List<List<InlineKeyboardButton>> rowList=new ArrayList<>();

        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("-7540ENGId");
        row.add(button);
        rowList.add(row);


        button=new InlineKeyboardButton();
        button.setText(String.valueOf(++a));
        button.setCallbackData("sonId");
        row.add(button);


        button=new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("+7540ENGId");
        row.add(button);


        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("Buying ");
        button.setCallbackData("sotibolishENGId");
        row.add(button);
        rowList.add(row);

        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("⬅\uFE0FBack");
        button.setCallbackData("qaytish7540ENGId");
        row.add(button);
        rowList.add(row);


        inlineKeyboardMarkup.setKeyboard(rowList);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup profilRasmInlineayrish7540ENG(Long chatId){

        if (a>1){
            --a;
        }
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile(new File("C:\\Users\\hp\\Pictures\\Saved Pictures\\demir75.40.jpg")));
        sendPhoto.setCaption("0,25mm 1M=680GRAMM+/-\n" +
                "narxi:100$");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<InlineKeyboardButton> row=new ArrayList<>();
        List<List<InlineKeyboardButton>> rowList=new ArrayList<>();

        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("-7540ENGId");
        row.add(button);
        rowList.add(row);


        button=new InlineKeyboardButton();
        button.setText(String.valueOf(a));
        button.setCallbackData("sonId");
        row.add(button);


        button=new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("+7540ENGId");
        row.add(button);


        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("Buying");
        button.setCallbackData("sotibolishENGId");
        row.add(button);
        rowList.add(row);


        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("⬅\uFE0FBack");
        button.setCallbackData("qaytish7540ENGId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;


    }
    public SendPhoto buyurtmaberishctena7550ENG(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile(new File("C:\\Users\\hp\\Pictures\\Saved Pictures\\demir75.50.jpg")));
        sendPhoto.setCaption("Profile CW 75/50 is a rafter profile for plasterboard constructions.\n" +
                "CW 75/50 profile, vertically attached with a step of 60 cm between UW 75/40 type profiles, is used for vertical frame columns intended for plasterboard parts.\n" +
                " Shelf profile CW 75/50 is used in pairs with the corresponding guide profile UW 75/40.\n" +
                " Price: $2.34");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<InlineKeyboardButton> row=new ArrayList<>();
        List<List<InlineKeyboardButton>> rowList=new ArrayList<>();

        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("0,33");
        button.setCallbackData("75.50ENGId");
        row.add(button);
        rowList.add(row);

        button=new InlineKeyboardButton();
        button.setText("0,35");
        button.setCallbackData("75.50ENGId");
        row.add(button);

        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("0,37");
        button.setCallbackData("75.50ENGId");
        row.add(button);
        rowList.add(row);


        button=new InlineKeyboardButton();
        button.setText("0,40");
        button.setCallbackData("75.50ENGId");
        row.add(button);


        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("0,45");
        button.setCallbackData("75.50ENGId");
        row.add(button);
        rowList.add(row);


        inlineKeyboardMarkup.setKeyboard(rowList);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return sendPhoto;


    }
    public SendPhoto ctena7550ENG(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile(new File("C:\\Users\\hp\\Pictures\\Saved Pictures\\demir75.50.jpg")));
        sendPhoto.setCaption("Manufacturer: Demir shop\n" +
                "Type : 75 x 50 mm\n" +
                "Material : steel\n" +
                "Length: 3 m");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<InlineKeyboardButton> row=new ArrayList<>();
        List<List<InlineKeyboardButton>> rowList=new ArrayList<>();

        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("-7550ENGId");
        row.add(button);
        rowList.add(row);


        button=new InlineKeyboardButton();
        button.setText("1");
        button.setCallbackData("sonId");
        row.add(button);


        button=new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("+7550ENGId");
        row.add(button);


        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("Buying");
        button.setCallbackData("sotibolishENGId");
        row.add(button);
        rowList.add(row);


        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("⬅\uFE0FBack");
        button.setCallbackData("qaytish7550ENGId");
        row.add(button);
        rowList.add(row);


        inlineKeyboardMarkup.setKeyboard(rowList);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return sendPhoto;
    }
    public InlineKeyboardMarkup profilRasmInlineqoshish7550ENG(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile(new File("C:\\Users\\hp\\Pictures\\Saved Pictures\\demir75.40.jpg")));
        sendPhoto.setCaption("0,25mm 1M=680GRAMM+/-\n" +
                "narxi:100$");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<InlineKeyboardButton> row=new ArrayList<>();
        List<List<InlineKeyboardButton>> rowList=new ArrayList<>();

        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("-7550ENGId");
        row.add(button);
        rowList.add(row);


        button=new InlineKeyboardButton();
        button.setText(String.valueOf(++a));
        button.setCallbackData("sonId");
        row.add(button);


        button=new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("+7550ENGId");
        row.add(button);


        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("Buying");
        button.setCallbackData("sotibolishENGId");
        row.add(button);
        rowList.add(row);

        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("⬅\uFE0FBack");
        button.setCallbackData("qaytish7550ENGId");
        row.add(button);
        rowList.add(row);


        inlineKeyboardMarkup.setKeyboard(rowList);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup profilRasmInlineayrish7550ENG(Long chatId){

        if (a>1){
            --a;
        }
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile(new File("C:\\Users\\hp\\Pictures\\Saved Pictures\\demir75.40.jpg")));
        sendPhoto.setCaption("0,25mm 1M=680GRAMM+/-\n" +
                "narxi:100$");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<InlineKeyboardButton> row=new ArrayList<>();
        List<List<InlineKeyboardButton>> rowList=new ArrayList<>();

        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("-7550ENGId");
        row.add(button);
        rowList.add(row);


        button=new InlineKeyboardButton();
        button.setText(String.valueOf(a));
        button.setCallbackData("sonId");
        row.add(button);


        button=new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("+7550ENGId");
        row.add(button);


        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("Buying");
        button.setCallbackData("sotibolishENGId");
        row.add(button);
        rowList.add(row);


        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("⬅\uFE0FBack");
        button.setCallbackData("qaytish7550ENGId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;


    }
    public SendPhoto buyurtmaberishctena10040ENG(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile(new File("C:\\Users\\hp\\Pictures\\Saved Pictures\\demir100.40.jpg")));
        sendPhoto.setCaption("Description Profile 100 * 40, length 3.0 m, thickness 0.4 to 0.7 mm, made of galvanized metal. It serves as a basis for rack profiles, as well as\n" +
                "are used to install jumpers between sections and cover frames.\n" +
                "price : 3.50$");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<InlineKeyboardButton> row=new ArrayList<>();
        List<List<InlineKeyboardButton>> rowList=new ArrayList<>();

        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("0,33");
        button.setCallbackData("100.40ENGId");
        row.add(button);
        rowList.add(row);

        button=new InlineKeyboardButton();
        button.setText("0,35");
        button.setCallbackData("100.40ENGId");
        row.add(button);

        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("0,37");
        button.setCallbackData("100.40ENGId");
        row.add(button);
        rowList.add(row);


        button=new InlineKeyboardButton();
        button.setText("0,40");
        button.setCallbackData("100.40ENGId");
        row.add(button);


        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("0,45");
        button.setCallbackData("100.40ENGId");
        row.add(button);
        rowList.add(row);



        inlineKeyboardMarkup.setKeyboard(rowList);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return sendPhoto;


    }
    public SendPhoto ctena10040ENG(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile(new File("C:\\Users\\hp\\Pictures\\Saved Pictures\\demir100.40.jpg")));
        sendPhoto.setCaption("Manufacturer: Demir shop\n" +
                "Weight, kg: 2.5\n" +
                "Length, mm: 3000\n" +
                "Width, mm: 100");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<InlineKeyboardButton> row=new ArrayList<>();
        List<List<InlineKeyboardButton>> rowList=new ArrayList<>();

        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("-10040ENGId");
        row.add(button);
        rowList.add(row);


        button=new InlineKeyboardButton();
        button.setText("1");
        button.setCallbackData("sonId");
        row.add(button);


        button=new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("+10040ENGId");
        row.add(button);


        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("Buying");
        button.setCallbackData("sotibolishENGId");
        row.add(button);
        rowList.add(row);


        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("⬅\uFE0FBack");
        button.setCallbackData("qaytish10040ENGId");
        row.add(button);
        rowList.add(row);


        inlineKeyboardMarkup.setKeyboard(rowList);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return sendPhoto;
    }
    public InlineKeyboardMarkup profilRasmInlineqoshish10040ENG(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile(new File("C:\\Users\\hp\\Pictures\\Saved Pictures\\demir100.40.jpg")));
        sendPhoto.setCaption("0,25mm 1M=680GRAMM+/-\n" +
                "narxi:100$");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<InlineKeyboardButton> row=new ArrayList<>();
        List<List<InlineKeyboardButton>> rowList=new ArrayList<>();

        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("-10040ENGId");
        row.add(button);
        rowList.add(row);


        button=new InlineKeyboardButton();
        button.setText(String.valueOf(++a));
        button.setCallbackData("sonId");
        row.add(button);


        button=new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("+10040ENGId");
        row.add(button);


        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("Buying");
        button.setCallbackData("sotibolishENGId");
        row.add(button);
        rowList.add(row);

        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("⬅\uFE0FBack");
        button.setCallbackData("qaytish10040ENGId");
        row.add(button);
        rowList.add(row);


        inlineKeyboardMarkup.setKeyboard(rowList);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup profilRasmInlineayrish10040ENG(Long chatId){

        if (a>1){
            --a;
        }
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile(new File("C:\\Users\\hp\\Pictures\\Saved Pictures\\demir100.40.jpg")));
        sendPhoto.setCaption("0,25mm 1M=680GRAMM+/-\n" +
                "narxi:100$");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<InlineKeyboardButton> row=new ArrayList<>();
        List<List<InlineKeyboardButton>> rowList=new ArrayList<>();

        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("-10040ENGId");
        row.add(button);
        rowList.add(row);


        button=new InlineKeyboardButton();
        button.setText(String.valueOf(a));
        button.setCallbackData("sonId");
        row.add(button);


        button=new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("+10040ENGId");
        row.add(button);


        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("Buying");
        button.setCallbackData("sotibolishENGId");
        row.add(button);
        rowList.add(row);


        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("⬅\uFE0FBack");
        button.setCallbackData("qaytish10040ENGId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;


    }
    public SendPhoto buyurtmaberishctena10050ENG(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile(new File("C:\\Users\\hp\\Pictures\\Saved Pictures\\demir100.50.jpg")));
        sendPhoto.setCaption("The rack profile 100 x 50 is used for the installation of pieces of plasterboard, as well as for the construction of false walls.\n" +
                " With the help of this material, you can have high quality in an apartment, private house and office,\n" +
                " you can build a fast and competent partition.\n" +
                " Price: $6.31  ");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<InlineKeyboardButton> row=new ArrayList<>();
        List<List<InlineKeyboardButton>> rowList=new ArrayList<>();

        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("0,33");
        button.setCallbackData("100.50ENGId");
        row.add(button);
        rowList.add(row);

        button=new InlineKeyboardButton();
        button.setText("0,35");
        button.setCallbackData("100.50ENGId");
        row.add(button);

        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("0,37");
        button.setCallbackData("100.50ENGId");
        row.add(button);
        rowList.add(row);


        button=new InlineKeyboardButton();
        button.setText("0,40");
        button.setCallbackData("100.50ENGId");
        row.add(button);


        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("0,45");
        button.setCallbackData("100.50ENGId");
        row.add(button);
        rowList.add(row);


        inlineKeyboardMarkup.setKeyboard(rowList);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return sendPhoto;


    }
    public SendPhoto ctena10050ENG(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile(new File("C:\\Users\\hp\\Pictures\\Saved Pictures\\demir100.50.jpg")));
        sendPhoto.setCaption("Specifications:\n" +
                "Manufacturer: Demir shop\n" +
                "Width : 100 mm.\n" +
                "Height : 50 mm\n" +
                "Length: 4 m");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<InlineKeyboardButton> row=new ArrayList<>();
        List<List<InlineKeyboardButton>> rowList=new ArrayList<>();

        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("-10050ENGId");
        row.add(button);
        rowList.add(row);


        button=new InlineKeyboardButton();
        button.setText("1");
        button.setCallbackData("sonId");
        row.add(button);


        button=new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("+10050ENGId");
        row.add(button);


        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("Buying");
        button.setCallbackData("sotibolishENGId");
        row.add(button);
        rowList.add(row);


        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("⬅\uFE0FBack");
        button.setCallbackData("qaytish10050ENGId");
        row.add(button);
        rowList.add(row);


        inlineKeyboardMarkup.setKeyboard(rowList);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return sendPhoto;
    }
    public InlineKeyboardMarkup profilRasmInlineqoshish10050ENG(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile(new File("C:\\Users\\hp\\Pictures\\Saved Pictures\\demir100.50.jpg")));
        sendPhoto.setCaption("0,25mm 1M=680GRAMM+/-\n" +
                "narxi:100$");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<InlineKeyboardButton> row=new ArrayList<>();
        List<List<InlineKeyboardButton>> rowList=new ArrayList<>();

        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("-10050ENGId");
        row.add(button);
        rowList.add(row);


        button=new InlineKeyboardButton();
        button.setText(String.valueOf(++a));
        button.setCallbackData("sonId");
        row.add(button);


        button=new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("+10050ENGId");
        row.add(button);


        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("Buying");
        button.setCallbackData("sotibolishENGId");
        row.add(button);
        rowList.add(row);

        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("⬅\uFE0FBack");
        button.setCallbackData("qaytish10050ENGId");
        row.add(button);
        rowList.add(row);


        inlineKeyboardMarkup.setKeyboard(rowList);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup profilRasmInlineayrish10050ENG(Long chatId){

        if (a>1){
            --a;
        }
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile(new File("C:\\Users\\hp\\Pictures\\Saved Pictures\\demir100.50.jpg")));
        sendPhoto.setCaption("0,25mm 1M=680GRAMM+/-\n" +
                "narxi:100$");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<InlineKeyboardButton> row=new ArrayList<>();
        List<List<InlineKeyboardButton>> rowList=new ArrayList<>();

        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("-10050ENGId");
        row.add(button);
        rowList.add(row);


        button=new InlineKeyboardButton();
        button.setText(String.valueOf(a));
        button.setCallbackData("sonId");
        row.add(button);


        button=new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("+10050ENGId");
        row.add(button);


        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("Buying");
        button.setCallbackData("sotibolishENGId");
        row.add(button);
        rowList.add(row);


        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("⬅\uFE0FBack");
        button.setCallbackData("qaytish10050Id");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;


    }



    //GipsokardonENG
    public SendMessage gipsomenuENG(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Choose plasterboard :");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList=new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("Nastenavoy");
        row.add(button);
        rowList.add(row);


        KeyboardButton button1 = new KeyboardButton();
        button1.setText("Ceiling");
        row.add(button1);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button2 = new KeyboardButton();
        button2.setText("⬅\uFE0FBACK");
        row1.add(button2);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;



    }
    public SendPhoto nastenavoyInlineENG(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile(new File("C:\\Users\\hp\\Pictures\\Saved Pictures\\demirnastenniy.jpg")));
        sendPhoto.setCaption("Plasterboard wall 2500/1200 / 12.5 mm\n" +
                "\n" +
                "Description\n" +
                "Plasterboard wall IRON GYPSUM\n" +
                "\n" +
                "Size 2500/1200 / 12.5 mm\n" +
                "\n" +
                "Gypsum board of various types and purposes is offered by our building materials online store. Existing plasterboard wall, wall moisture resistant, ceiling, ceiling moisture resistant.\n" +
                "\n" +
                "Advantages of plasterboard:\n" +
                "\n" +
                "relief;\n" +
                "\n" +
                "environmentally friendly;\n" +
                "\n" +
                "good sound and heat insulation;\n" +
                "\n" +
                "affordable price\n" +
                "42,000 soums/pc\n" +
                "\n" +
                "Gypsum board is a modern building material, which is widely used in wall cladding, ceiling covering, as well as in creating interior parts and other architectural elements due to its strength, lightness and ease of cutting.\n" +
                "\n" +
                "The site includes a full range of products, so it will be easy to find the product you need.\n" +
                "\n" +
                "Order by calls and phones:");


        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<InlineKeyboardButton> row=new ArrayList<>();
        List<List<InlineKeyboardButton>> rowList=new ArrayList<>();

        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("-GipsoENGId");
        row.add(button);
        rowList.add(row);


        button=new InlineKeyboardButton();
        button.setText("1");
        button.setCallbackData("sonId");
        row.add(button);


        button=new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("+GipsoENGId");
        row.add(button);


        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("Buying");
        button.setCallbackData("sotibolishId");
        row.add(button);
        rowList.add(row);



        inlineKeyboardMarkup.setKeyboard(rowList);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return sendPhoto;
    }
    int g=1;
    public InlineKeyboardMarkup GipsoRasmInlineqoshishENG(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile(new File("C:\\Users\\hp\\Pictures\\Saved Pictures\\demir100.50.jpg")));
        sendPhoto.setCaption("0,25mm 1M=680GRAMM+/-\n" +
                "narxi:100$");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<InlineKeyboardButton> row=new ArrayList<>();
        List<List<InlineKeyboardButton>> rowList=new ArrayList<>();

        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("-GipsoENGId");
        row.add(button);
        rowList.add(row);


        button=new InlineKeyboardButton();
        button.setText(String.valueOf(++g));
        button.setCallbackData("sonId");
        row.add(button);


        button=new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("+GipsoENGId");
        row.add(button);


        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("Buying");
        button.setCallbackData("sotibolishENGId");
        row.add(button);
        rowList.add(row);


        inlineKeyboardMarkup.setKeyboard(rowList);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup GipsoRasmInlineayrishENG(Long chatId){

        if (g>1){
            --g;
        }
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile(new File("C:\\Users\\hp\\Pictures\\Saved Pictures\\demir100.50.jpg")));
        sendPhoto.setCaption("0,25mm 1M=680GRAMM+/-\n" +
                "narxi:100$");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<InlineKeyboardButton> row=new ArrayList<>();
        List<List<InlineKeyboardButton>> rowList=new ArrayList<>();

        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("-GipsoENGId");
        row.add(button);
        rowList.add(row);


        button=new InlineKeyboardButton();
        button.setText(String.valueOf(g));
        button.setCallbackData("sonId");
        row.add(button);


        button=new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("+GipsoENGId");
        row.add(button);


        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("Buying");
        button.setCallbackData("sotibolishENGId");
        row.add(button);
        rowList.add(row);


        inlineKeyboardMarkup.setKeyboard(rowList);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;


    }
    public SendPhoto potolochniyInlineENG(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile(new File("C:\\Users\\hp\\Pictures\\Saved Pictures\\demirpotolochiny.jpg")));
        sendPhoto.setCaption("Ceiling plasterboard IRON GYPSUM\n" +
                "\n" +
                "The thickness is 9.5 mm\n" +
                "\n" +
                "Gypsum board of various types and purposes is offered by our building materials online store. Existing plasterboard wall, wall moisture resistant, ceiling, ceiling moisture resistant.\n" +
                "\n" +
                "Advantages of plasterboard:\n" +
                "\n" +
                "relief;\n" +
                "\n" +
                "environmentally friendly;\n" +
                "\n" +
                "good sound and heat insulation;\n" +
                "\n" +
                "affordable price\n" +
                "32,500 soums/pc\n" +
                "Gypsum board is a modern building material, which is widely used in wall cladding, ceiling covering, as well as in creating interior parts and other architectural elements due to its strength, lightness and ease of cutting.\n" +
                "\n" +
                "The site includes a full range of products, so it will be easy to find the product you need.\n" +
                "\n" +
                "Order by calls and phones:");


        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<InlineKeyboardButton> row=new ArrayList<>();
        List<List<InlineKeyboardButton>> rowList=new ArrayList<>();

        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("-potoENGId");
        row.add(button);
        rowList.add(row);


        button=new InlineKeyboardButton();
        button.setText("1");
        button.setCallbackData("sonId");
        row.add(button);


        button=new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("+potoENGId");
        row.add(button);


        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("Buying");
        button.setCallbackData("sotibolishId");
        row.add(button);
        rowList.add(row);



        inlineKeyboardMarkup.setKeyboard(rowList);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return sendPhoto;
    }
    int p=1;
    public InlineKeyboardMarkup GipsoRasmInlineqoshishENGpoto(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile(new File("C:\\Users\\hp\\Pictures\\Saved Pictures\\demir100.50.jpg")));
        sendPhoto.setCaption("0,25mm 1M=680GRAMM+/-\n" +
                "narxi:100$");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<InlineKeyboardButton> row=new ArrayList<>();
        List<List<InlineKeyboardButton>> rowList=new ArrayList<>();

        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("-potoENGId");
        row.add(button);
        rowList.add(row);


        button=new InlineKeyboardButton();
        button.setText(String.valueOf(++p));
        button.setCallbackData("sonId");
        row.add(button);


        button=new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("+potoENGId");
        row.add(button);


        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("Buying");
        button.setCallbackData("sotibolishENGId");
        row.add(button);
        rowList.add(row);


        inlineKeyboardMarkup.setKeyboard(rowList);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup GipsoRasmInlineayrishENGpoto(Long chatId){

        if (p>1){
            --p;
        }
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile(new File("C:\\Users\\hp\\Pictures\\Saved Pictures\\demir100.50.jpg")));
        sendPhoto.setCaption("0,25mm 1M=680GRAMM+/-\n" +
                "narxi:100$");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<InlineKeyboardButton> row=new ArrayList<>();
        List<List<InlineKeyboardButton>> rowList=new ArrayList<>();

        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("-potoENGId");
        row.add(button);
        rowList.add(row);


        button=new InlineKeyboardButton();
        button.setText(String.valueOf(p));
        button.setCallbackData("sonId");
        row.add(button);


        button=new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("+potoENGId");
        row.add(button);


        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("Buying");
        button.setCallbackData("sotibolishENGId");
        row.add(button);
        rowList.add(row);


        inlineKeyboardMarkup.setKeyboard(rowList);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;


    }
    public SendMessage plastiklarENG(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Select the payment type:");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<InlineKeyboardButton> row=new ArrayList<>();
        List<List<InlineKeyboardButton>> rowList=new ArrayList<>();

        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("Humo");
        button.setCallbackData("humoENGId");
        row.add(button);
        rowList.add(row);

        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("Uzcard");
        button.setCallbackData("uzcardENGId");
        row.add(button);
        rowList.add(row);


        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("Mastercard");
        button.setCallbackData("mastercardENGId");
        row.add(button);
        rowList.add(row);

        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("Visa");
        button.setCallbackData("visaENGId");
        row.add(button);
        rowList.add(row);



        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }
    public SendMessage plastikendENG(Long chatId){

        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Buyurtmangiz qabul qilindi");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList=new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("⬅\uFE0FAsosiy | Menu");
        row.add(button);
        rowList.add(row);


        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;
    }



    //lakatsiyalar
    public SendMessage manzillarENG(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Select an address :");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();
        KeyboardButton button = new KeyboardButton();
        KeyboardRow row = new KeyboardRow();
        button.setText("1-branch");
        row.add(button);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();
        button1.setText("2-branch");
        row.add(button1);
        rowList.add(row);

        KeyboardButton button2 = new KeyboardButton();
        button2.setText("3-branch");
        row1.add(button2);

        KeyboardButton button3 = new KeyboardButton();
        button3.setText("BAck");
        row1.add(button3);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;
    }
    public SendLocation firstlakatsiyaENG(Long chatId) {
        SendLocation sendLocation = new SendLocation();
        sendLocation.setChatId(chatId);
        sendLocation.setLatitude(39.597569);
        sendLocation.setLongitude(66.929696);
        return sendLocation;

    }
    public SendMessage firstmessageENG(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("\uD83D\uDCCD 1-Branch\n" +
                "\uD83D\uDDFA Address: Takta Bazaar, Samarkand, Samarkand Region, Uzbekistan\n" +
                "\n" +
                "\uD83C\uDFE2 Landmark: in front of Humo Med\n" +
                "\n" +
                "☎\uFE0F Phone number: +998939926700\n" +
                "☎\uFE0F Phone number: +998987076700\n" +
                "\uD83D\uDD59 Working hours: 7:00 - 20:00");
        return sendMessage;
    }
    public SendLocation secondlakatsiyaENG(Long chatId) {
        SendLocation sendLocation = new SendLocation();
        sendLocation.setChatId(chatId);
        sendLocation.setLatitude(39.5991705);
        sendLocation.setLongitude(66.9356548);
        return sendLocation;

    }
    public SendMessage secondmessageENG(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("\uD83D\uDCCD 2-Branch\n" +
                "\uD83D\uDDFA Address: Takta Bazaar, Samarkand, Samarkand Region, Uzbekistan\n" +
                "\n" +
                "\uD83C\uDFE2 Landmark: New Life Street\n" +
                "\n" +
                "☎\uFE0F Phone number: +998982732101\n" +
                "☎\uFE0F Phone number: +998902713131\n" +
                "\uD83D\uDD59 Working hours: 7:00 - 20:00");
        return sendMessage;
    }
    public SendLocation thirdlakatsiyaENG(Long chatId) {
        SendLocation sendLocation = new SendLocation();
        sendLocation.setChatId(chatId);
        sendLocation.setLatitude(39.598700);
        sendLocation.setLongitude(66.936107);
        return sendLocation;

    }
    public SendMessage thirdmessageENG(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("\uD83D\uDCCD 3-Branch\n" +
                "\uD83D\uDDFA Address: Takta Bazaar, Samarkand, Samarkand Region, Uzbekistan\n" +
                "\n" +
                "\uD83C\uDFE2 Landmark: Across from Takht Bazar\n" +
                "\n" +
                "☎\uFE0F Phone number: +998982791999\n" +
                "☎\uFE0F Phone number: +998937235474\n" +
                "\uD83D\uDD59 Working hours: 7:00 - 20:00");
        return sendMessage;
    }













}
