package Demir_shop;

import org.telegram.telegrambots.meta.api.methods.send.SendLocation;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;
import org.telegram.telegrambots.meta.api.methods.send.SendVideo;
import org.telegram.telegrambots.meta.api.objects.InputFile;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class MyBotService {
    public SendMessage sendMessage(Long chatId) {

        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Asalomu aleykum! DEMIR_shop Telegramm botiga Xush kelibsiz\n"  + "Здравствуйте!!! DEMIR_shop Добро пожаловать в Telegram-бот\n" + "");

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
    public SendMessage menu(Long chatId){
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

        KeyboardButton button2 = new KeyboardButton();
        button2.setText("GIPSOKARTON");
        row.add(button2);
        rowList.add(row);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;


    }
    public SendMessage profnastil(Long chatId){
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
    public SendMessage profnastilmenu(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Profnastil rangini tanlang");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList= new ArrayList<>();
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
        button10.setText("Ko`K (5005)");
        row3.add(button10);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;

    }


    public SendMessage profilMenu(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Tanlang");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

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
        button9.setText("⬅\uFE0F Orqaga");
        row3.add(button9);
        rowList.add(row3);






        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;


    }

    public SendPhoto praysListphoto(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile(new File("C:\\Users\\hp\\Pictures\\Screenshots\\demirshop.png")));
        sendPhoto.setCaption("Export narxlari ro'yxatini olish uchun quyidagi aloqa ma'lumotlariga murojaat qiling:\n" +
                "\n" +
                "Sotish bo'limi - 998 (88) 224-44-44\n" +
                "Eksport bo'limi - 998 (95) 250-59-99\n" +
                "E-mail - info@demir-profil.com");

        return sendPhoto;
    }


    public SendMessage Kontaktlar(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("https://t.me/demirprofiluz");

        return sendMessage;
    }

    public SendMessage Kontaktlar2(Long chatId){
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

    public SendMessage IjtimoiyTarmoq(Long chatId){
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

    public SendLocation location(Long chatId){
        SendLocation sendLocation = new SendLocation();
        sendLocation.setChatId(chatId);
        sendLocation.setLatitude(39.6354094);
        sendLocation.setLongitude(66.8741039);
        return sendLocation;
    }

    public SendMessage Manzillar(Long chatId){

        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("O‘zbekiston, Samarqand, Xishrav-2 massivi, “Urgut” erkin iqtisodiy zonasi");
        return sendMessage;
    }

    public SendMessage Tiltanlash(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Версия чат-бота на русском языке – @DemirProfilBot");

        return sendMessage;
    }


    public SendVideo video(Long chatId){
        SendVideo sendVideo = new SendVideo();
        sendVideo.setChatId(chatId);
        sendVideo.setVideo(new InputFile(new File("C:\\Users\\hp\\Videos\\Captures\\demirshopvideo.mp4")));

        return sendVideo;

    }


}

