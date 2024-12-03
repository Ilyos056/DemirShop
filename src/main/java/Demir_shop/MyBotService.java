package Demir_shop;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

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





}

