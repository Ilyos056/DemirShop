package Demir_shop;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.telegram.telegrambots.meta.api.methods.invoices.SendInvoice;
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

public class MyBotService {
    public SendMessage sendMessage(Long chatId) {

        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Asalomu aleykum! DEMIR_shop Telegramm botiga Xush kelibsiz\n" + "Здравствуйте!!! DEMIR_shop Добро пожаловать в Telegram-бот\n" + "");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();

        button.setText("O`zbek tili");
        row.add(button);
        rowList.add(row);

        KeyboardButton button1 = new KeyboardButton();
        button1.setText("Русский язык");
        row.add(button1);

        KeyboardButton button2 = new KeyboardButton();
        button2.setText("English language");
        row.add(button2);

        KeyboardButton button3 = new KeyboardButton();
        button3.setText("Қазақ тілі");
        row.add(button3);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;


    }
    public SendMessage shareContact(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Registratsiya qilish uchun telefon raqamingizni yuboring");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();
        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("ShareContact");
        button.setRequestContact(true);
        row.add(button);
        rowList.add(row);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;

    }
    public SendMessage menu(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Menyudan tanlang");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();
        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("PROFNASTIL");
        row.add(button);

        KeyboardButton button1 = new KeyboardButton();
        button1.setText("PROFIL");
        row.add(button1);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button2 = new KeyboardButton();
        button2.setText("GIPSOKARTON");
        row1.add(button2);

        KeyboardButton button3 = new KeyboardButton();
        button3.setText("Aksessuarlar");
        row1.add(button3);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;


    }



    //profnastil
    public SendMessage profnastil(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Profnastil gofrasini tanlang");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();
        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("chappa-rost valna");
        row.add(button);

        KeyboardButton button1 = new KeyboardButton();
        button1.setText("Ekonom valna");
        row.add(button1);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button2 = new KeyboardButton();
        button2.setText("П35 GOFRA");
        row1.add(button2);

        KeyboardButton button3 = new KeyboardButton();
        button3.setText("П57 GOFRA");
        row1.add(button3);
        rowList.add(row1);

        KeyboardRow row2 = new KeyboardRow();
        KeyboardButton button6 = new KeyboardButton();
        button6.setText("CHEREPITSA");
        row2.add(button6);

        KeyboardButton button4 = new KeyboardButton();
        button4.setText("CHEREPITSA KVADRATNIY");
        row2.add(button4);
        rowList.add(row2);

        KeyboardRow row3 = new KeyboardRow();
        KeyboardButton button5 = new KeyboardButton();
        button5.setText("ORQAGA");
        row3.add(button5);
        rowList.add(row3);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;
    }
    public SendMessage profnastilmenu(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Profnastil rangini tanlang");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();
        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("OQ (9016)");
        row.add(button);

        KeyboardButton button1 = new KeyboardButton();
        button1.setText("Qora (9005)");
        row.add(button1);

        KeyboardButton button2 = new KeyboardButton();
        button2.setText("QAYMOQ (1015)");
        row.add(button2);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button3 = new KeyboardButton();
        button3.setText("QIZIL (3003)");
        row1.add(button3);

        KeyboardButton button4 = new KeyboardButton();
        button4.setText("BARDOVI (3005)");
        row1.add(button4);

        KeyboardButton button5 = new KeyboardButton();
        button5.setText("YASHIL (6005)");
        row1.add(button5);
        rowList.add(row1);

        KeyboardRow row2 = new KeyboardRow();
        KeyboardButton button6 = new KeyboardButton();
        button6.setText("TO`Q QIZIL (3005)");
        row2.add(button6);

        KeyboardButton button7 = new KeyboardButton();
        button7.setText("Shkoladniy (8017)");
        row2.add(button7);


        KeyboardButton button8 = new KeyboardButton();
        button8.setText("MOKRI (7024)");
        row2.add(button8);
        rowList.add(row2);

        KeyboardRow row3 = new KeyboardRow();
        KeyboardButton button9 = new KeyboardButton();
        button9.setText("SERIY (7004)");
        row3.add(button9);

        KeyboardButton button10 = new KeyboardButton();
        button10.setText("ATSINKOVKA");
        row3.add(button10);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;

    }
    public SendMessage profnastilmasterprice(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Qalinligini tanlang");

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
        button3.setText("0.37 SMZ 1M = 65 000 ");
        row1.add(button3);

        KeyboardButton button4 = new KeyboardButton();
        button4.setText("0.40 SMZ 1M = 67 000 ");
        row1.add(button4);

        KeyboardButton button5 = new KeyboardButton();
        button5.setText("0.45 SMZ 1M = 72 000 ");
        row1.add(button5);
        rowList.add(row1);

        KeyboardRow row2 = new KeyboardRow();
        KeyboardButton button6 = new KeyboardButton();
        button6.setText("0.50 SMZ 1M = 78 000 ");
        row2.add(button6);


        KeyboardButton button7 = new KeyboardButton();
        button7.setText("0.60 SMZ 1M = 83 000 ");
        row2.add(button7);

        KeyboardButton button8 = new KeyboardButton();
        button8.setText("Orqaga qaytish");
        row2.add(button8);
        rowList.add(row2);


        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;
    }
    public SendMessage profnastilatsinkovkaprice(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Qalinligini tanlang");

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
        button3.setText("0.37 SMZ 1M = 55 000 ");
        row1.add(button3);

        KeyboardButton button4 = new KeyboardButton();
        button4.setText("0.40 SMZ 1M = 58 000 ");
        row1.add(button4);

        KeyboardButton button5 = new KeyboardButton();
        button5.setText("0.45 SMZ 1M = 62 000 ");
        row1.add(button5);
        rowList.add(row1);

        KeyboardRow row2 = new KeyboardRow();
        KeyboardButton button6 = new KeyboardButton();
        button6.setText("0.50 SMZ 1M = 67 000 ");
        row2.add(button6);


        KeyboardButton button7 = new KeyboardButton();
        button7.setText("0.60 SMZ 1M = 72 000 ");
        row2.add(button7);

        KeyboardButton button8 = new KeyboardButton();
        button8.setText("Orqaga qaytish");
        row2.add(button8);
        rowList.add(row2);


        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;
    }

    //aksessuarlar
    public SendMessage aksessuarlar(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Aksessuarlarni tanlang Tanlang");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();
        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("Tarnov");
        row.add(button);

        KeyboardButton button1 = new KeyboardButton();
        button1.setText("Kanyok");
        row.add(button1);

        KeyboardButton button2 = new KeyboardButton();
        button2.setText("Tormuz");
        row.add(button2);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button3 = new KeyboardButton();
        button3.setText("Kranshteyn");
        row1.add(button3);

        KeyboardButton button4 = new KeyboardButton();
        button4.setText("Truba");
        row1.add(button4);

        KeyboardButton button5 = new KeyboardButton();
        button5.setText("Samarez");
        row1.add(button5);
        rowList.add(row1);

        KeyboardRow row2 = new KeyboardRow();
        KeyboardButton button6 = new KeyboardButton();
        button6.setText("Orqaga qaytish");
        row2.add(button6);
        rowList.add(row2);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;
    }
    public SendMessage tarnov(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Tarnovni tanlang");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();
        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("3/Bo`lakli");
        row.add(button);

        KeyboardButton button1 = new KeyboardButton();
        button1.setText("4/Bo`lakli");
        row.add(button1);

        KeyboardButton button2 = new KeyboardButton();
        button2.setText("5/Bo`lakli");
        row.add(button2);
        rowList.add(row);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;
    }
    public SendMessage kanyok(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Kanyokni tanlang");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();
        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("Figurni");
        row.add(button);

        KeyboardButton button1 = new KeyboardButton();
        button1.setText("Oddiy");
        row.add(button1);
        rowList.add(row);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;
    }
    public SendMessage tormuz(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Tormuzni tanlang");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();
        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("4/Bo`lakli");
        row.add(button);

        KeyboardButton button1 = new KeyboardButton();
        button1.setText("5/Bo`lakli");
        row.add(button1);

        KeyboardButton button2 = new KeyboardButton();
        button2.setText("Pressli");
        row.add(button2);
        rowList.add(row);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;
    }
    public SendMessage kranshteyn(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Kranshteynni tanlang");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();
        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("3/Bo`lakli");
        row.add(button);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();
        button1.setText("4/Bo`lakli");
        row.add(button1);

        KeyboardButton button2 = new KeyboardButton();
        button2.setText("5/Bo`lakli");
        row.add(button2);
        rowList.add(row);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;
    }
    public SendMessage truba(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Trubani tanlang");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();
        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("6cm X 9cm");
        row.add(button);

        KeyboardButton button1 = new KeyboardButton();
        button1.setText("7cm X 11cm");
        row.add(button1);

        KeyboardButton button2 = new KeyboardButton();
        button2.setText("Krugli 75");
        row.add(button2);
        rowList.add(row);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;
    }
    public SendMessage samarez(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Samarezni tanlang");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();
        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText(" Mexmash(6) 1KG = 42 000 ");
        row.add(button);
        rowList.add(row);

        KeyboardButton button1 = new KeyboardButton();

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;

    }


    //Shoxrux profil
    public SendMessage profilMenu(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Tanlang");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow keyboardRow = new KeyboardRow();
        KeyboardButton keyboardButton = new KeyboardButton();
        keyboardButton.setText("\uD83D\uDECDBuyurtma berish");
        keyboardRow.add(keyboardButton);
        rowList.add(keyboardRow);

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("Prays list\uD83D\uDCCB");
        row.add(button);
        rowList.add(row);


        KeyboardButton button1 = new KeyboardButton();
        button1.setText("Kontaktlar\uD83D\uDCF1");
        row.add(button1);

        KeyboardButton button2 = new KeyboardButton();
        button2.setText("Katalog\uD83D\uDDC3");
        row.add(button2);


        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button3 = new KeyboardButton();
        button3.setText("Ijtimoiy tarmoq va veb-sayt\uD83C\uDF10");
        row1.add(button3);
        rowList.add(row1);


        KeyboardButton button4 = new KeyboardButton();
        button4.setText("Fotosurat\uD83D\uDCF8");
        row1.add(button4);


        KeyboardButton button5 = new KeyboardButton();
        button5.setText("Video\uD83D\uDCF9");
        row1.add(button5);


        KeyboardRow row2 = new KeyboardRow();
        KeyboardButton button6 = new KeyboardButton();
        button6.setText("Zavod quvvati\uD83E\uDDBE");
        row2.add(button6);
        rowList.add(row2);


        KeyboardButton button7 = new KeyboardButton();
        button7.setText("Bizning manzil\uD83D\uDDFA");
        row2.add(button7);

        KeyboardButton button8 = new KeyboardButton();
        button8.setText("Til tanlash/выбор языка\uD83C\uDF0F");
        row2.add(button8);


        KeyboardRow row3 = new KeyboardRow();
        KeyboardButton button9 = new KeyboardButton();
        button9.setText("⬅\uFE0F  Orqaga");
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
        sendMessage.setText("Tanlang");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();


        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("Profil");
        row.add(button);
        rowList.add(row);

        KeyboardButton button1 = new KeyboardButton();
        button1.setText("Qo'llanmalar profili");
        row.add(button1);


        KeyboardButton button2 = new KeyboardButton();
        button2.setText("Kulonlar (AGRO)");
        row.add(button2);

        KeyboardRow row2 = new KeyboardRow();
        KeyboardButton button4 = new KeyboardButton();
        button4.setText("Стеновой профиль 50*40");
        row2.add(button4);
        rowList.add(row2);


        KeyboardButton button5 = new KeyboardButton();
        button5.setText("Стеновой профиль 50*50");
        row2.add(button5);


        KeyboardButton button6 = new KeyboardButton();
        button6.setText("Стеновой профиль 75*40");
        row2.add(button6);

        KeyboardRow row3 = new KeyboardRow();
        KeyboardButton button7 = new KeyboardButton();
        button7.setText("Стеновой профиль 75*50");
        row3.add(button7);
        rowList.add(row3);

        KeyboardButton button8 = new KeyboardButton();
        button8.setText("Стеновой профиль 100*40");
        row3.add(button8);


        KeyboardButton button9 = new KeyboardButton();
        button9.setText("Стеновой профиль 100*50");
        row3.add(button9);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button3 = new KeyboardButton();
        button3.setText("⬅\uFE0FOrqaga");
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
        sendDocument.setCaption("Export narxlari ro'yxatini olish uchun quyidagi aloqa ma'lumotlariga murojaat qiling:\n" +
                "\n" +
                "Sotish bo'limi - 998 (88) 224-44-44\n" +
                "Eksport bo'limi - 998 (95) 250-59-99\n" +
                "E-mail - info@demir-profil.com");
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
        sendMessage.setText("Savdo bo'limi:\n" +
                "+998 (88) 224-44-44\n" +
                "\n" +
                "Eksport bo'limi:\n" +
                "+ 998 (95) 250-59-99\n" +
                "\n" +
                "Mintaqaviy menejerlar:\n" +
                "+998 (88) 244-99-99\n" +
                "+998 (93) 722-06-63\n" +
                "+998 (97) 395-05-04\n" +
                "+998 (90) 655-45-25\n" +
                "\n" +
                "Pochta:\n" +
                "info@demir-profil.com");


        return sendMessage;
    }
    public SendMessage IjtimoiyTarmoq(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Ijtimoiy tarmoq:\n" +
                "https://www.instagram.com/demirprofiluz\n" +
                "https://www.facebook.com/demirprofil.uz\n" +
                "\n" +
                "Veb-sayt:\n" +
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
        sendMessage.setText("O‘zbekiston, Samarqand, Xishrav-2 massivi, “Urgut” erkin iqtisodiy zonasi");
        return sendMessage;
    }
    public SendMessage Tiltanlash(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Версия чат-бота на русском языке – @DemirProfilBot");

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
    public SendMessage profilInline(Long chatId){

        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Profilni qalinligini tanlang :");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<InlineKeyboardButton> row=new ArrayList<>();
        List<List<InlineKeyboardButton>> rowList=new ArrayList<>();

        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("0,25");
        button.setCallbackData("0,25Id");
        row.add(button);
        rowList.add(row);



        button=new InlineKeyboardButton();
        button.setText("0.28");
        button.setCallbackData("0,28Id");
        row.add(button);



        button=new InlineKeyboardButton();
        button.setText("0,30");
        button.setCallbackData("0,30Id");
        row.add(button);


        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("0,33");
        button.setCallbackData("0,33Id");
        row.add(button);
        rowList.add(row);



        button=new InlineKeyboardButton();
        button.setText("0,35");
        button.setCallbackData("0,35Id");
        row.add(button);



        button=new InlineKeyboardButton();
        button.setText("0,37");
        button.setCallbackData("0,37Id");
        row.add(button);


        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("0,40");
        button.setCallbackData("0,40Id");
        row.add(button);
        rowList.add(row);


        button=new InlineKeyboardButton();
        button.setText("0,45");
        button.setCallbackData("0,45Id");
        row.add(button);


        button=new InlineKeyboardButton();
        button.setText("0,50");
        button.setCallbackData("0,50Id");
        row.add(button);

        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("0,60");
        button.setCallbackData("0,60Id");
        row.add(button);
        rowList.add(row);



        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;

    }
    public SendMessage QollanmaprofiliInline(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Profil qalinligini tanlang :");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<InlineKeyboardButton> row=new ArrayList<>();
        List<List<InlineKeyboardButton>> rowList=new ArrayList<>();

        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("0,25");
        button.setCallbackData("0,25Id");
        row.add(button);
        rowList.add(row);



        button=new InlineKeyboardButton();
        button.setText("0.28");
        button.setCallbackData("0,28Id");
        row.add(button);



        button=new InlineKeyboardButton();
        button.setText("0,30");
        button.setCallbackData("0,30Id");
        row.add(button);


        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("0,33");
        button.setCallbackData("0,33");
        row.add(button);
        rowList.add(row);



        button=new InlineKeyboardButton();
        button.setText("0,35");
        button.setCallbackData("0,35Id");
        row.add(button);



        button=new InlineKeyboardButton();
        button.setText("0,37");
        button.setCallbackData("0,37Id");
        row.add(button);


        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("0,40");
        button.setCallbackData("0,40Id");
        row.add(button);
        rowList.add(row);


        button=new InlineKeyboardButton();
        button.setText("0,45");
        button.setCallbackData("0,45Id");
        row.add(button);


        button=new InlineKeyboardButton();
        button.setText("0,50");
        button.setCallbackData("0,50Id");
        row.add(button);

        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("0,60");
        button.setCallbackData("0,60Id");
        row.add(button);
        rowList.add(row);

    //Gipsokardon




        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;

    }
    public SendMessage kulonlar(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Tanlang ");


        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList=new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("salom");
        row.add(button);
        rowList.add(row);


        KeyboardButton button1 = new KeyboardButton();
        button1.setText("Mayagi");
        row.add(button1);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button2 = new KeyboardButton();
        button2.setText("⬅\uFE0F Orqaga");
        row1.add(button2);
        rowList.add(row1);

        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;

    }
    public SendPhoto profilRasmInline(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile(new File("C:\\Users\\hp\\Pictures\\Saved Pictures\\demirphoto.jpg")));
        sendPhoto.setCaption("0,25mm 1M=680GRAMM+/-\n" +
                "narxi:100$");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<InlineKeyboardButton> row=new ArrayList<>();
        List<List<InlineKeyboardButton>> rowList=new ArrayList<>();

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
        button.setText("Sotib olish");
        button.setCallbackData("sotibolishId");
        row.add(button);
        rowList.add(row);

        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("⬅\uFE0FQaytish");
        button.setCallbackData("qaytishIdprofil");
        row.add(button);
        rowList.add(row);


        inlineKeyboardMarkup.setKeyboard(rowList);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return sendPhoto;
    }

int i=1;
    public InlineKeyboardMarkup profilRasmInlineqoshish(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile(new File("C:\\Users\\hp\\Pictures\\Saved Pictures\\demirphoto.jpg")));
        sendPhoto.setCaption("0,25mm 1M=680GRAMM+/-\n" +
                "narxi:100$");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<InlineKeyboardButton> row=new ArrayList<>();
        List<List<InlineKeyboardButton>> rowList=new ArrayList<>();

        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("-Id");
        row.add(button);
        rowList.add(row);


        button=new InlineKeyboardButton();
        button.setText(String.valueOf(++i));
        button.setCallbackData("sonId");
        row.add(button);


        button=new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("+Id");
        row.add(button);


        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("Sotib olish");
        button.setCallbackData("sotibolishallId");
        row.add(button);
        rowList.add(row);

        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("⬅\uFE0FQaytish");
        button.setCallbackData("qoshishall");
        row.add(button);
        rowList.add(row);


        inlineKeyboardMarkup.setKeyboard(rowList);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup profilRasmInlineayrish(Long chatId){

        if (i>1){
            --i;
        }
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile(new File("C:\\Users\\hp\\Pictures\\Saved Pictures\\demirphoto.jpg")));
        sendPhoto.setCaption("0,25mm 1M=680GRAMM+/-\n" +
                "narxi:100$");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<InlineKeyboardButton> row=new ArrayList<>();
        List<List<InlineKeyboardButton>> rowList=new ArrayList<>();

        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("➖");
        button.setCallbackData("-Id");
        row.add(button);
        rowList.add(row);


        button=new InlineKeyboardButton();
        button.setText(String.valueOf(i));
        button.setCallbackData("sonId");
        row.add(button);


        button=new InlineKeyboardButton();
        button.setText("➕");
        button.setCallbackData("+Id");
        row.add(button);


        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("Sotib olish");
        button.setCallbackData("sotibolishallId");
        row.add(button);
        rowList.add(row);


        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("⬅\uFE0FQaytish");
        button.setCallbackData("qaytishall");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;


    }
    public SendPhoto buyurtmaberishctena(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile(new File("C:\\Users\\hp\\Pictures\\Saved Pictures\\demir50.40.jpg")));
        sendPhoto.setCaption("Ozingiz malumotlarni kiriting Ilyos");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<InlineKeyboardButton> row=new ArrayList<>();
        List<List<InlineKeyboardButton>> rowList=new ArrayList<>();

        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("0,33");
        button.setCallbackData("50.40Id");
        row.add(button);
        rowList.add(row);

        button=new InlineKeyboardButton();
        button.setText("0,35");
        button.setCallbackData("50.40Id");
        row.add(button);

        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("0,37");
        button.setCallbackData("50.40Id");
        row.add(button);
        rowList.add(row);


        button=new InlineKeyboardButton();
        button.setText("0,40");
        button.setCallbackData("50.40Id");
        row.add(button);


        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("0,45");
        button.setCallbackData("50.40Id");
        row.add(button);
        rowList.add(row);


        button=new InlineKeyboardButton();
        button.setText("⬅\uFE0FQaytish");
        button.setCallbackData("qaytishId");
        row.add(button);


        inlineKeyboardMarkup.setKeyboard(rowList);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return sendPhoto;


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
        button.setCallbackData("0,335050Id");
        row.add(button);
        rowList.add(row);

        button=new InlineKeyboardButton();
        button.setText("0,35");
        button.setCallbackData("0,335050Id");
        row.add(button);

        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("0,37");
        button.setCallbackData("0,335050Id");
        row.add(button);
        rowList.add(row);


        button=new InlineKeyboardButton();
        button.setText("0,40");
        button.setCallbackData("0,335050Id");
        row.add(button);


        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("0,45");
        button.setCallbackData("0,335050Id");
        row.add(button);
        rowList.add(row);


        button=new InlineKeyboardButton();
        button.setText("⬅\uFE0FQaytish");
        button.setCallbackData("qaytishId");
        row.add(button);


        inlineKeyboardMarkup.setKeyboard(rowList);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return sendPhoto;


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
        button.setCallbackData("75.40Id");
        row.add(button);
        rowList.add(row);

        button=new InlineKeyboardButton();
        button.setText("0,35");
        button.setCallbackData("75.40Id");
        row.add(button);

        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("0,37");
        button.setCallbackData("75.40Id");
        row.add(button);
        rowList.add(row);


        button=new InlineKeyboardButton();
        button.setText("0,40");
        button.setCallbackData("75.40Id");
        row.add(button);


        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("0,45");
        button.setCallbackData("75.40Id");
        row.add(button);
        rowList.add(row);


        button=new InlineKeyboardButton();
        button.setText("⬅\uFE0FQaytish");
        button.setCallbackData("qaytishd");
        row.add(button);


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
        button.setText("Sotib olish");
        button.setCallbackData("sotibolishId");
        row.add(button);
        rowList.add(row);


        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("⬅\uFE0FQaytish");
        button.setCallbackData("qaytish7540Id");
        row.add(button);
        rowList.add(row);


        inlineKeyboardMarkup.setKeyboard(rowList);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return sendPhoto;
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
        button.setCallbackData("75.50Id");
        row.add(button);
        rowList.add(row);

        button=new InlineKeyboardButton();
        button.setText("0,35");
        button.setCallbackData("75.50Id");
        row.add(button);

        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("0,37");
        button.setCallbackData("75.50Id");
        row.add(button);
        rowList.add(row);


        button=new InlineKeyboardButton();
        button.setText("0,40");
        button.setCallbackData("75.50Id");
        row.add(button);


        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("0,45");
        button.setCallbackData("75.50Id");
        row.add(button);
        rowList.add(row);


        button=new InlineKeyboardButton();
        button.setText("⬅\uFE0FQaytish");
        button.setCallbackData("qaytishId");
        row.add(button);


        inlineKeyboardMarkup.setKeyboard(rowList);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return sendPhoto;


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
        button.setCallbackData("100.40Id");
        row.add(button);
        rowList.add(row);

        button=new InlineKeyboardButton();
        button.setText("0,35");
        button.setCallbackData("100.40Id");
        row.add(button);

        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("0,37");
        button.setCallbackData("100.40Id");
        row.add(button);
        rowList.add(row);


        button=new InlineKeyboardButton();
        button.setText("0,40");
        button.setCallbackData("100.40Id");
        row.add(button);


        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("0,45");
        button.setCallbackData("100.40Id");
        row.add(button);
        rowList.add(row);


        button=new InlineKeyboardButton();
        button.setText("⬅\uFE0FQaytish");
        button.setCallbackData("qaytishId");
        row.add(button);


        inlineKeyboardMarkup.setKeyboard(rowList);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return sendPhoto;


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
        button.setCallbackData("100.50Id");
        row.add(button);
        rowList.add(row);

        button=new InlineKeyboardButton();
        button.setText("0,35");
        button.setCallbackData("100.50Id");
        row.add(button);

        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("0,37");
        button.setCallbackData("100.50Id");
        row.add(button);
        rowList.add(row);


        button=new InlineKeyboardButton();
        button.setText("0,40");
        button.setCallbackData("100.50Id");
        row.add(button);


        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("0,45");
        button.setCallbackData("100.50Id");
        row.add(button);
        rowList.add(row);


        button=new InlineKeyboardButton();
        button.setText("⬅\uFE0FQaytish");
        button.setCallbackData("qaytishId");
        row.add(button);


        inlineKeyboardMarkup.setKeyboard(rowList);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return sendPhoto;


    }
    public SendPhoto ctena5040033(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile(new File("C:\\Users\\hp\\Pictures\\Saved Pictures\\demir50.40.jpg")));
        sendPhoto.setCaption("Ilyosga");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<InlineKeyboardButton> row=new ArrayList<>();
        List<List<InlineKeyboardButton>> rowList=new ArrayList<>();

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
        button.setText("Sotib olish");
        button.setCallbackData("sotibolishId");
        row.add(button);
        rowList.add(row);

        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("⬅\uFE0FQaytish");
        button.setCallbackData("qaytish5040Id");
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
        button.setText("Sotib olish");
        button.setCallbackData("sotibolishId");
        row.add(button);
        rowList.add(row);


        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("⬅\uFE0FQaytish");
        button.setCallbackData("qaytish5050Id");
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
        button.setText("Sotib olish");
        button.setCallbackData("sotibolishId");
        row.add(button);
        rowList.add(row);


        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("⬅\uFE0FQaytish");
        button.setCallbackData("qaytish7550Id");
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
        button.setText("Sotib olish");
        button.setCallbackData("sotibolishId");
        row.add(button);
        rowList.add(row);


        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("⬅\uFE0FQaytish");
        button.setCallbackData("qaytish10040Id");
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
        button.setText("Sotib olish");
        button.setCallbackData("sotibolishId");
        row.add(button);
        rowList.add(row);


        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("⬅\uFE0FQaytish");
        button.setCallbackData("qaytish10050Id");
        row.add(button);
        rowList.add(row);


        inlineKeyboardMarkup.setKeyboard(rowList);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return sendPhoto;
    }

    public SendMessage plastiklar(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("To'lov turini tanlang :");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<InlineKeyboardButton> row=new ArrayList<>();
        List<List<InlineKeyboardButton>> rowList=new ArrayList<>();

        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("Humo");
        button.setCallbackData("humoId");
        row.add(button);
        rowList.add(row);

        row=new ArrayList<>();
        button=new InlineKeyboardButton();
        button.setText("Uzcard");
        button.setCallbackData("uzcardId");
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

    public SendMessage plastikend(Long chatId){

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



    //Gipsokardon
   public SendMessage gipsomenu(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Gipsokartonni tanlang :");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList=new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("Насьтенавой");
        row.add(button);
        rowList.add(row);


        KeyboardButton button1 = new KeyboardButton();
        button1.setText("Потолочный");
        row.add(button1);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button2 = new KeyboardButton();
        button2.setText("⬅\uFE0F  Orqaga");
        row1.add(button2);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;



    }

   public SendPhoto nastenavoyInline(Long chatId){
       SendPhoto sendPhoto = new SendPhoto();
       sendPhoto.setChatId(chatId);
       sendPhoto.setPhoto(new InputFile(new File("C:\\Users\\hp\\Pictures\\Saved Pictures\\demirnastenniy.jpg")));
       sendPhoto.setCaption("Gipsokarton devori 2500/1200 / 12,5 mm\n" +
               "\n" +
               "Tavsif\n" +
               "Gipsokarton devori DEMIR GYPSUM \n" +
               "\n" +
               "Hajmi 2500/1200 / 12,5 mm\n" +
               "\n" +
               "Har xil turdagi va maqsaddagi gipsokarton bizning qurilish materiallari onlayn -do'koni tomonidan taklif etiladi. Mavjud gipsokarton devori, devor namligiga chidamli, ship, ship namlikka chidamli.\n" +
               "\n" +
               "Gipsokartonning afzalliklari:\n" +
               "\n" +
               "yengillik;\n" +
               "\n" +
               "ekologik toza;\n" +
               "\n" +
               "yaxshi ovoz va issiqlik izolyatsiyasi;\n" +
               "\n" +
               "qulay narx \n" +
               "42 000 so'm / dona\n" +
               "\n" +
               "Gipsokarton - zamonaviy qurilish materiali bo'lib, uning kuchi, yengilligi va kesish qulayligi tufayli devor qoplamasida, shiftini yopishda, shuningdek, ichki qismlar va boshqa me'moriy elementlarni yaratishda keng qo'llaniladi.\n" +
               "\n" +
               "Sayt mahsulotlarning to'liq assortimentini o'z ichiga oladi, shuning uchun sizga kerakli mahsulotni topish oson bo'ladi.\n" +
               "\n" +
               "Qo'ng'iroqlar va telefonlar orqali buyurtma:");


       InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
       List<InlineKeyboardButton> row=new ArrayList<>();
       List<List<InlineKeyboardButton>> rowList=new ArrayList<>();

       InlineKeyboardButton button = new InlineKeyboardButton();
       button.setText("➖");
       button.setCallbackData("-Id");
       row.add(button);
       rowList.add(row);


       button=new InlineKeyboardButton();
       button.setText(String.valueOf(++i));
       button.setCallbackData("sonId");
       row.add(button);


       button=new InlineKeyboardButton();
       button.setText("➕");
       button.setCallbackData("+Id");
       row.add(button);


       row=new ArrayList<>();
       button=new InlineKeyboardButton();
       button.setText("Sotib olish");
       button.setCallbackData("sotibolishId");
       row.add(button);
       rowList.add(row);

       row=new ArrayList<>();
       button=new InlineKeyboardButton();
       button.setText("⬅\uFE0FQaytish");
       button.setCallbackData("qaytishgipso");
       row.add(button);
       rowList.add(row);


       inlineKeyboardMarkup.setKeyboard(rowList);
       sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
       return sendPhoto;
   }

   public SendPhoto potolochniyInline(Long chatId){
       SendPhoto sendPhoto = new SendPhoto();
       sendPhoto.setChatId(chatId);
       sendPhoto.setPhoto(new InputFile(new File("C:\\Users\\hp\\Pictures\\Saved Pictures\\demirpotolochiny.jpg")));
       sendPhoto.setCaption("Shiftli gipsokarton DEMIR GYPSUM\n" +
               "\n" +
               "Qalinligi 9,5 mm\n" +
               "\n" +
               "Har xil turdagi va maqsaddagi gipsokarton bizning qurilish materiallari onlayn -do'koni tomonidan taklif etiladi. Mavjud gipsokarton devori, devor namligiga chidamli, ship, ship namlikka chidamli.\n" +
               "\n" +
               "Gipsokartonning afzalliklari:\n" +
               "\n" +
               "yengillik;\n" +
               "\n" +
               "ekologik toza;\n" +
               "\n" +
               "yaxshi ovoz va issiqlik izolyatsiyasi;\n" +
               "\n" +
               "qulay narx\n" +
               "32 500 so'm / dona\n" +
               "Gipsokarton - zamonaviy qurilish materiali bo'lib, uning kuchi, yengilligi va kesish qulayligi tufayli devor qoplamasida, shiftini yopishda, shuningdek, ichki qismlar va boshqa me'moriy elementlarni yaratishda keng qo'llaniladi.\n" +
               "\n" +
               "Sayt mahsulotlarning to'liq assortimentini o'z ichiga oladi, shuning uchun sizga kerakli mahsulotni topish oson bo'ladi.\n" +
               "\n" +
               "Qo'ng'iroqlar va telefonlar orqali buyurtma:");


       InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
       List<InlineKeyboardButton> row=new ArrayList<>();
       List<List<InlineKeyboardButton>> rowList=new ArrayList<>();

       InlineKeyboardButton button = new InlineKeyboardButton();
       button.setText("➖");
       button.setCallbackData("-Id");
       row.add(button);
       rowList.add(row);


       button=new InlineKeyboardButton();
       button.setText(String.valueOf(++i));
       button.setCallbackData("sonId");
       row.add(button);


       button=new InlineKeyboardButton();
       button.setText("➕");
       button.setCallbackData("+Id");
       row.add(button);


       row=new ArrayList<>();
       button=new InlineKeyboardButton();
       button.setText("Sotib olish");
       button.setCallbackData("sotibolishId");
       row.add(button);
       rowList.add(row);


       row=new ArrayList<>();
       button=new InlineKeyboardButton();
       button.setText("⬅\uFE0FQaytish");
       button.setCallbackData("qaytishgipso");
       row.add(button);
       rowList.add(row);


       inlineKeyboardMarkup.setKeyboard(rowList);
       sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
       return sendPhoto;
   }

}


