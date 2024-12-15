package Demir_shop;

import org.dom4j.CDATA;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.EditMessageReplyMarkup;
import org.telegram.telegrambots.meta.api.objects.CallbackQuery;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Mybot extends TelegramLongPollingBot {
    private MybotServiceRU mybotServiceRU = new MybotServiceRU();
    private MyBotService myBotService = new MyBotService();
    private MyBotServiceENG myBotServiceENG = new MyBotServiceENG();

    private Map<Long, String> userState = new HashMap<>();
    private Map<String, String> userInfo = new HashMap<>();

    private Map<Long, String> userStateENG = new HashMap<>();
    private Map<String, String> userInfoENG = new HashMap<>();

    private Map<Long, String> userStateRU = new HashMap<>();
    private Map<String, String> userInfoRU = new HashMap<>();

    private Map<Long, String> userStateKarta = new HashMap<>();
    private Map<String, String> userInfoKarta = new HashMap<>();

    private Map<Long, String> userStateKartaRU = new HashMap<>();
    private Map<String, String> userInfoKartaRU = new HashMap<>();

    private Map<Long, String> userStateKartaENG = new HashMap<>();
    private Map<String, String> userInfoKartaENG = new HashMap<>();

    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasMessage() && update.getMessage().hasText()) {
            Long chatId = update.getMessage().getChatId();
            String text = update.getMessage().getText();


            if (text.startsWith("\uD83D\uDCAC Izoh qoldirish")) {
                String state = userState.getOrDefault(chatId, "\uD83D\uDCAC Izoh qoldirish");

                if (state.equals("\uD83D\uDCAC Izoh qoldirish")) {
                    sendmessage(chatId, "Izoh qoldiring:");
                    userState.put(chatId, "finish");
                }
            } else if (userState.containsKey(chatId) && userState.get(chatId).equals("finish")) {
                userInfo.put(chatId + "\uD83D\uDCAC Izoh qoldirish", text);
                sendmessage(chatId, "Rahmat! Izohingiz saqlandi.");
                System.out.println("\uD83D\uDCAC Izoh qoldirish: " + userInfo.get(chatId + "\uD83D\uDCAC Izoh qoldirish"));
                userState.remove(chatId);
            } else {
                System.out.println("Xatolik sodir boldi");
            }


            //English comment

            if (text.startsWith("Comment")) {
                String state = userStateENG.getOrDefault(chatId, "Comment");

                if (state.equals("Comment")) {
                    sendmessage(chatId, "Leave a comment:");
                    userStateENG.put(chatId, "finish");
                }
            } else if (userStateENG.containsKey(chatId) && userStateENG.get(chatId).equals("finish")) {
                userInfoENG.put(chatId + "Comment", text);
                sendmessage(chatId, "Thank you! Your comment has been saved.");
                System.out.println("Comment: " + userInfoENG.get(chatId + "Comment"));
                userStateENG.remove(chatId);
            } else {
                System.out.println("Xatolik sodir boldi");
            }



            //Russian Comment


            if (text.startsWith("\uD83D\uDCAC Оставить комментарий")) {
                String state = userStateRU.getOrDefault(chatId, "\uD83D\uDCAC Оставить комментарий");

                if (state.equals("\uD83D\uDCAC Оставить комментарий")) {
                    sendmessage(chatId, "Оставить комментарий:");
                    userStateRU.put(chatId, "finish");
                }
            } else if (userStateRU.containsKey(chatId) && userStateRU.get(chatId).equals("finish")) {
                userInfoRU.put(chatId + "\uD83D\uDCAC Оставить комментарий", text);
                sendmessage(chatId, "Спасибо! Ваш комментарий сохранен.");
                System.out.println("\uD83D\uDCAC Оставить комментарий: " + userInfoRU.get(chatId + "\uD83D\uDCAC Оставить комментарий"));
                userStateRU.remove(chatId);
            } else {
                System.out.println("Xatolik sodir boldi");
            }




            //UZBEK SOTIB OLISH

            if (text.startsWith("humoId")) {
                String state = userStateKarta.getOrDefault(chatId, "humoId");

                if (state.equals("humoId")) {
                    sendmessage(chatId, "Kartangizni kiriting:");
                    userStateKarta.put(chatId, "finishUzhumo");
                }
            } else if (userStateKarta.containsKey(chatId) && userStateKarta.get(chatId).equals("finishUzhumo")) {
                userInfoKarta.put(chatId + "humoId", text);
                sendmessage(chatId, "Demir shop botidan xarid qilganingiz uchun raxmat!!!");
                System.out.println("humoId: " + userInfoKarta.get(chatId + "humoId"));
                userStateKarta.remove(chatId);
            } else {
                System.out.println("Xatolik sodir boldi");

            }


            if (text.startsWith("uzcardId")) {
                String state = userStateKarta.getOrDefault(chatId, "uzcardId");

                if (state.equals("uzcardId")) {
                    sendmessage(chatId, "Kartangizni kiriting:");
                    userStateKarta.put(chatId, "finishUzuzcard");
                }
            } else if (userStateKarta.containsKey(chatId) && userStateKarta.get(chatId).equals("finishUzuzcard")) {
                userInfoKarta.put(chatId + "uzcardId", text);
                sendmessage(chatId, "Demir shop botidan xarid qilganingiz uchun raxmat!!!");
                System.out.println("uzcardId: " + userInfoKarta.get(chatId + "uzcardId"));
                userStateKarta.remove(chatId);
            } else {
                System.out.println("Xatolik sodir boldi");
            }


            if (text.startsWith("mastercardId")) {
                String state = userStateKarta.getOrDefault(chatId, "mastercardId");

                if (state.equals("mastercardId")) {
                    sendmessage(chatId, "Kartangizni kiriting:");
                    userStateKarta.put(chatId, "finishUzmaster");
                }
            } else if (userStateKarta.containsKey(chatId) && userStateKarta.get(chatId).equals("finishUzmaster")) {
                userInfoKarta.put(chatId + "mastercardId", text);
                sendmessage(chatId, "Demir shop botidan xarid qilganingiz uchun raxmat!!!");
                System.out.println("mastercardId: " + userInfoKarta.get(chatId + "mastercardId"));
                userStateKarta.remove(chatId);
            } else {
                System.out.println("Xatolik sodir boldi");
            }


            if (text.startsWith("visaId")) {
                String state = userStateKarta.getOrDefault(chatId, "visaId");

                if (state.equals("visaId")) {
                    sendmessage(chatId, "Kartangizni kiriting:");
                    userStateKarta.put(chatId, "finishUzvisa");
                }
            } else if (userStateKarta.containsKey(chatId) && userStateKarta.get(chatId).equals("finishUzvisa")) {
                userInfoKarta.put(chatId + "visaId", text);
                sendmessage(chatId, "Demir shop botidan xarid qilganingiz uchun raxmat!!!");
                System.out.println("visaId: " + userInfoKarta.get(chatId + "visaId"));
                userStateKarta.remove(chatId);
            } else {
                System.out.println("Xatolik sodir boldi");
            }


            //RUS TILI SOTIB OLISH


            if (text.startsWith("humoRUId")) {
                String state = userStateKartaRU.getOrDefault(chatId, "humoRUId");

                if (state.equals("humoRUId")) {
                    sendmessage(chatId, "Введите свою карту:");
                    userStateKartaRU.put(chatId, "finishRUhumo");
                }
            } else if (userStateKartaRU.containsKey(chatId) && userStateKartaRU.get(chatId).equals("finishRUhumo")) {
                userInfoKartaRU.put(chatId + "humoRUId", text);
                sendmessage(chatId, "Спасибо за покупки в боте Demir Shop!!!");
                System.out.println("humoRUId: " + userInfoKartaRU.get(chatId + "humoRUId"));
                userStateKartaRU.remove(chatId);
            } else {
                System.out.println("Xatolik sodir boldi");
            }


            if (text.startsWith("uzcardRUId")) {
                String state = userStateKartaRU.getOrDefault(chatId, "uzcardRUId");

                if (state.equals("uzcardRUId")) {
                    sendmessage(chatId, "Введите свою карту:");
                    userStateKartaRU.put(chatId, "finishRUuzcard");
                }
            } else if (userStateKartaRU.containsKey(chatId) && userStateKartaRU.get(chatId).equals("finishRUuzcard")) {
                userInfoKartaRU.put(chatId + "uzcardRUId", text);
                sendmessage(chatId, "Спасибо за покупки в боте Demir Shop!!!");
                System.out.println("uzcardRUId: " + userInfoKartaRU.get(chatId + "uzcardRUId"));
                userStateKartaRU.remove(chatId);
            } else {
                System.out.println("Xatolik sodir boldi");
            }


            if (text.startsWith("mastercardRUId")) {
                String state = userStateKartaRU.getOrDefault(chatId, "mastercardRUId");

                if (state.equals("mastercardRUId")) {
                    sendmessage(chatId, "Введите свою карту:");
                    userStateKartaRU.put(chatId, "finishRUmaster");
                }
            } else if (userStateKartaRU.containsKey(chatId) && userStateKartaRU.get(chatId).equals("finishRUmaster")) {
                userInfoKartaRU.put(chatId + "mastercardRUId", text);
                sendmessage(chatId, "Спасибо за покупки в боте Demir Shop!!!");
                System.out.println("mastercardRUId: " + userInfoKartaRU.get(chatId + "mastercardRUId"));
                userStateKartaRU.remove(chatId);
            } else {
                System.out.println("Xatolik sodir boldi");
            }


            if (text.startsWith("visaRUId")) {
                String state = userStateKartaRU.getOrDefault(chatId, "visaRUId");

                if (state.equals("visaRUId")) {
                    sendmessage(chatId, "Введите свою карту:");
                    userStateKartaRU.put(chatId, "finishRUvisa");
                }
            } else if (userStateKartaRU.containsKey(chatId) && userStateKartaRU.get(chatId).equals("finishRUvisa")) {
                userInfoKartaRU.put(chatId + "visaRUId", text);
                sendmessage(chatId, "Спасибо за покупки в боте Demir Shop!!!");
                System.out.println("visaRUId: " + userInfoKartaRU.get(chatId + "visaRUId"));
                userStateKartaRU.remove(chatId);
            } else {
                System.out.println("Xatolik sodir boldi");
            }

            //ENGLISH SOTIB OLISH


            if (text.startsWith("humoENGId")) {
                String state = userStateKartaENG.getOrDefault(chatId, "humoENGId");

                if (state.equals("humoENGId")) {
                    sendmessage(chatId, "Enter your card:");
                    userStateKartaENG.put(chatId, "finishENGhumo");
                }
            } else if (userStateKartaENG.containsKey(chatId) && userStateKartaENG.get(chatId).equals("finishENGhumo")) {
                userInfoKartaENG.put(chatId + "humoENGId", text);
                sendmessage(chatId, "Thank you for shopping in the Demir Shop bot!!!");
                System.out.println("humoENGId: " + userInfoKartaENG.get(chatId + "humoENGId"));
                userStateKartaENG.remove(chatId);
            } else {
                System.out.println("Xatolik sodir boldi");
            }


            if (text.startsWith("uzcardENGId")) {
                String state = userStateKartaENG.getOrDefault(chatId, "uzcardENGId");

                if (state.equals("uzcardENGId")) {
                    sendmessage(chatId, "Enter your card:");
                    userStateKartaENG.put(chatId, "finishENGuzcard");
                }
            } else if (userStateKartaENG.containsKey(chatId) && userStateKartaENG.get(chatId).equals("finishENGuzcard")) {
                userInfoKartaENG.put(chatId + "uzcardENGId", text);
                sendmessage(chatId, "Thank you for shopping in the Demir Shop bot!!!");
                System.out.println("uzcardENGId: " + userInfoKartaENG.get(chatId + "uzcardENGId"));
                userStateKartaENG.remove(chatId);
            } else {
                System.out.println("Xatolik sodir boldi");
            }


            if (text.startsWith("mastercardENGId")) {
                String state = userStateKartaENG.getOrDefault(chatId, "mastercardENGId");

                if (state.equals("mastercardENGId")) {
                    sendmessage(chatId, "Enter your card:");
                    userStateKartaENG.put(chatId, "finishENGmastercard");
                }
            } else if (userStateKartaENG.containsKey(chatId) && userStateKartaENG.get(chatId).equals("finishENGmastercard")) {
                userInfoKartaENG.put(chatId + "mastercardENGId", text);
                sendmessage(chatId, "Thank you for shopping in the Demir Shop bot!!!");
                System.out.println("mastercardENGId: " + userInfoKartaENG.get(chatId + "mastercardENGId"));
                userStateKartaENG.remove(chatId);
            } else {
                System.out.println("Xatolik sodir boldi");
            }


            if (text.startsWith("visaENGId")) {
                String state = userStateKartaENG.getOrDefault(chatId, "visaENGId");

                if (state.equals("visaENGId")) {
                    sendmessage(chatId, "Enter your card:");
                    userStateKartaENG.put(chatId, "finishENGvisa");
                }
            } else if (userStateKartaENG.containsKey(chatId) && userStateKartaENG.get(chatId).equals("finishENGvisa")) {
                userInfoKartaENG.put(chatId + "visaENGId", text);
                sendmessage(chatId, "Thank you for shopping in the Demir Shop bot!!!");
                System.out.println("visaENGId: " + userInfoKartaENG.get(chatId + "visaENGId"));
                userStateKartaENG.remove(chatId);
            } else {
                System.out.println("Xatolik sodir boldi");
            }


            if (text.equals("/start")) {
                try {
                    execute(myBotService.shareContact(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("O`zbek tili")) {
                try {
                    execute(myBotService.menu(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }


            //Ustalar ro`yxati
            if (text.equals("Ustalar Ro'yxati")){
                try {
                    execute(myBotService.ustalar(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Tom usti")){
                try {
                    execute(myBotService.tom(chatId));
                    execute(myBotService.tom1(chatId));
                    execute(myBotService.tom2(chatId));
                    execute(myBotService.tom3(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Patalochni")){
                try {
                    execute(myBotService.patalochni(chatId));
                    execute(myBotService.patalochni1(chatId));
                    execute(myBotService.patalochni2(chatId));
                    execute(myBotService.patalochni3(chatId));
                    execute(myBotService.patalochni4(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (text.equals("Orqaga")){
                try {
                    execute(myBotService.menu(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            //aksessuarlar hammasi
            if (text.equals("Aksessuarlar")) {
                try {
                    execute(myBotService.aksessuarlar(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Tarnov")) {
                try {
                    execute(myBotService.tarnov(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (text.equals("Kanyok")) {
                try {
                    execute(myBotService.kanyok(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Tormuz")) {
                try {
                    execute(myBotService.tormuz(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Kranshteyn")) {
                try {
                    execute(myBotService.kranshteyn(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Truba")) {
                try {
                    execute(myBotService.truba(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Samarez")) {
                try {
                    execute(myBotService.samarez(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Orqaga qaytish")) {
                try {
                    execute(myBotService.menu(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            //lakatsiyalar
            if (text.equals("Bizning manzillar")) {
                try {
                    execute(myBotService.manzillar(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("1-Shaxobcha")) {
                try {
                    execute(myBotService.firstlakatsiya(chatId));
                    execute(myBotService.firstmessage(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("2-Shaxobcha")) {
                try {
                    execute(myBotService.secondlakatsiya(chatId));
                    execute(myBotService.secondmessage(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("3-Shaxobcha")) {
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
            if (text.equals("Oq (9003)")) {
                try {
                    execute(myBotService.profnastilmasterprice(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("OQ (9016)")) {
                try {
                    execute(myBotService.profnastilmasterprice(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Qora (9005)")) {
                try {
                    execute(myBotService.profnastilmasterprice(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("QAYMOQ (1015)")) {
                try {
                    execute(myBotService.profnastilmasterprice(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("QIZIL (3003)")) {
                try {
                    execute(myBotService.profnastilmasterprice(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("BARDOVI (3005)")) {
                try {
                    execute(myBotService.profnastilmasterprice(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("YASHIL (6005)")) {
                try {
                    execute(myBotService.profnastilmasterprice(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("TO`Q QIZIL (3005)")) {
                try {
                    execute(myBotService.profnastilmasterprice(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Shkoladniy (8017)")) {
                try {
                    execute(myBotService.profnastilmasterprice(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("MOKRI (7024)")) {
                try {
                    execute(myBotService.profnastilmasterprice(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("SERIY (7004)")) {
                try {
                    execute(myBotService.profnastilmasterprice(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("ATSINKOVKA")) {
                try {
                    execute(myBotService.profnastilatsinkovkaprice(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            //profnastilrus
            if (text.equals("Профнастил")){
                try {
                    execute(mybotServiceRU.profnastilru(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("прямо вальна")){
                try {
                    execute(mybotServiceRU.profnastilmenuru(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Экономическая вална")){
                try {
                    execute(mybotServiceRU.profnastilmenuru(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("П35 ГОФРИРОВАННЫЙ")){
                try {
                    execute(mybotServiceRU.profnastilmenuru(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("П57 ГОФРИРОВАННЫЙ")){
                try {
                    execute(mybotServiceRU.profnastilmenuru(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("ЧЕРЕПИЦА")){
                try {
                    execute(mybotServiceRU.profnastilmenuru(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("КВАДРАТНЫЕ ПЛИТКИ")){
                try {
                    execute(mybotServiceRU.profnastilmenuru(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("НАЗАД")){
                try {
                    execute(mybotServiceRU.menuRU(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Белый (9003)")){
                try {
                    execute(mybotServiceRU.profnastilmasterpriceru(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Черный (9005)")){
                try {
                    execute(mybotServiceRU.profnastilmasterpriceru(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("КРЕМОВЫЙ цвет (1015)")){
                try {
                    execute(mybotServiceRU.profnastilmasterpriceru(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("КРАСНЫЙ (3003)")){
                try {
                    execute(mybotServiceRU.profnastilmasterpriceru(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("БАРДОВЫЙ (3005)")){
                try {
                    execute(mybotServiceRU.profnastilmasterpriceru(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("ЗЕЛЕНЫЙ (6005)")){
                try {
                    execute(mybotServiceRU.profnastilmasterpriceru(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("ТЕМНО-КРАСНЫЙ (3011)")){
                try {
                    execute(mybotServiceRU.profnastilmasterpriceru(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Коричневый (8017)")){
                try {
                    execute(mybotServiceRU.profnastilmasterpriceru(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Графитовый серый (7024)")){
                try {
                    execute(mybotServiceRU.profnastilmasterpriceru(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("серый (7004)")){
                try {
                    execute(mybotServiceRU.profnastilmasterpriceru(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Белый (9016)")){
                try {
                    execute(mybotServiceRU.profnastilmasterpriceru(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Оцинкованный")){
                try {
                    execute(mybotServiceRU.profnastilatsinkovkapriceru(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            //master profnastil
            if (text.equals("0.30 SMZ 1M = 55 000")) {
                try {
                    execute(myBotService.profnastilinlineMaster(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("0.33 SMZ  1M = 58 000")) {
                try {
                    execute(myBotService.profnastilinlineMaster(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("0.35 SMZ  1M = 62 000")) {
                try {
                    execute(myBotService.profnastilinlineMaster(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("0.37 SMZ  1M = 65 000")) {
                try {
                    execute(myBotService.profnastilinlineMaster(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("0.40 SMZ  1M = 67 000")) {
                try {
                    execute(myBotService.profnastilinlineMaster(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("0.45 SMZ  1M = 72 000")) {
                try {
                    execute(myBotService.profnastilinlineMaster(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("0.50 SMZ  1M = 78 000")) {
                try {
                    execute(myBotService.profnastilinlineMaster(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("0.60 SMZ  1M = 83 000")) {
                try {
                    execute(myBotService.profnastilinlineMaster(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            //atsinkovka profnastil
            if (text.equals("0.30 SMZ 1M = 48 000")) {
                try {
                    execute(myBotService.profnastilinlineAtsinkovka(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("0.33 SMZ 1M = 51 000")) {
                try {
                    execute(myBotService.profnastilinlineAtsinkovka(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("0.35 SMZ 1M = 53 000")) {
                try {
                    execute(myBotService.profnastilinlineAtsinkovka(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("0.37 SMZ 1M = 55 000")) {
                try {
                    execute(myBotService.profnastilinlineAtsinkovka(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("0.40 SMZ 1M = 58 000")) {
                try {
                    execute(myBotService.profnastilinlineAtsinkovka(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("0.45 SMZ 1M = 62 000")) {
                try {
                    execute(myBotService.profnastilinlineAtsinkovka(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("0.50 SMZ 1M = 67 000")) {
                try {
                    execute(myBotService.profnastilinlineAtsinkovka(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("0.60 SMZ 1M = 72 000")) {
                try {
                    execute(myBotService.profnastilinlineAtsinkovka(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }


            //profil hammasi
            if (text.equals("PROFIL")) {
                try {
                    execute(myBotService.profilMenu(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Prays list\uD83D\uDCCB")) {
                try {
                    execute(myBotService.prayslistdoc(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Kontaktlar\uD83D\uDCF1")) {
                try {
                    execute(myBotService.Kontaktlar(chatId));
                    execute(myBotService.Kontaktlar2(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Ijtimoiy tarmoq va veb-sayt\uD83C\uDF10")) {
                try {
                    execute(myBotService.IjtimoiyTarmoq(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Bizning manzil\uD83D\uDDFA")) {
                try {
                    execute(myBotService.location(chatId));
                    execute(myBotService.Manzillar(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Til tanlash/выбор языка\uD83C\uDF0F")) {
                try {
                    execute(myBotService.Tiltanlash(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Video\uD83D\uDCF9")) {
                try {
                    execute(myBotService.video(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Katalog\uD83D\uDDC3")) {
                try {
                    execute(myBotService.document(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Zavod quvvati\uD83E\uDDBE")) {
                try {
                    execute(myBotService.zavotquvvatidoc(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("\uD83D\uDECDBuyurtma berish")) {
                try {
                    execute(myBotService.buyurtmaberish(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Profil")) {
                try {
                    execute(myBotService.profilInline(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Qo'llanmalar profili")) {
                try {
                    execute(myBotService.QollanmaprofiliInline(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Padves (AGRAF)")) {
                try {
                    execute(myBotService.kulonlar(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("⬅\uFE0FOrqaga")) {
                try {
                    execute(myBotService.profilMenu(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("⬅\uFE0F Orqaga")) {
                try {
                    execute(myBotService.buyurtmaberish(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Стеновой профиль 50*40")) {
                try {
                    execute(myBotService.buyurtmaberishctena(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Стеновой профиль 50*50")) {
                try {
                    execute(myBotService.buyurtmaberishctena5050(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Стеновой профиль 75*40")) {
                try {
                    execute(myBotService.buyurtmaberishctena7540(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Стеновой профиль 75*50")) {
                try {
                    execute(myBotService.buyurtmaberishctena7550(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Стеновой профиль 100*40")) {
                try {
                    execute(myBotService.buyurtmaberishctena10040(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Стеновой профиль 100*50")) {
                try {
                    execute(myBotService.buyurtmaberishctena10050(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("⬅\uFE0F  Orqaga")) {
                try {
                    execute(myBotService.menu(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("⬅\uFE0FAsosiy | Menu")) {
                try {
                    execute(myBotService.menu(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            //Gipsokardon
            if (text.equals("GIPSOKARTON")) {
                try {
                    execute(myBotService.gipsomenu(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Насьтенавой")) {
                try {
                    execute(myBotService.nastenavoyInline(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Потолочный")) {
                try {
                    execute(myBotService.potolochniyInline(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            //RusTili
            if (text.equals("Русский язык")) {
                try {
                    execute(mybotServiceRU.menuRU(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Профиль")) {
                try {
                    execute(mybotServiceRU.profilMenu(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("\uD83D\uDECDСделать заказ")) {
                try {
                    execute(mybotServiceRU.buyurtmaberish(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Прайс-лист\uD83D\uDCCB")) {
                try {
                    execute(mybotServiceRU.prayslistdoc(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Контакты\uD83D\uDCF1")) {
                try {
                    execute(mybotServiceRU.Kontaktlar(chatId));
                    execute(mybotServiceRU.Kontaktlar2(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Социальная сеть и сайт\uD83C\uDF10")) {
                try {
                    execute(mybotServiceRU.IjtimoiyTarmoq(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Видео\uD83D\uDCF9")) {
                try {
                    execute(mybotServiceRU.video(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Мощность завода\uD83E\uDDBE")) {
                try {
                    execute(mybotServiceRU.zavotquvvatidoc(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Наш адрес\uD83D\uDDFA")) {
                try {
                    execute(mybotServiceRU.location(chatId));
                    execute(mybotServiceRU.Manzillar(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Каталог\uD83D\uDDC3")) {
                try {
                    execute(mybotServiceRU.document(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("⬅\uFE0F  Назад")) {
                try {
                    execute(mybotServiceRU.menuRU(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Профил")) {
                try {
                    execute(mybotServiceRU.profilInline(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Направляющие Профиль")) {
                try {
                    execute(mybotServiceRU.QollanmaprofiliInline(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Стеновой  профиль 50*40")) {
                try {
                    execute(mybotServiceRU.buyurtmaberishctena5040RU(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Стеновой  профиль 50*50")) {
                try {
                    execute(mybotServiceRU.buyurtmaberishctena5050(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Стеновой  профиль 75*40")) {
                try {
                    execute(mybotServiceRU.buyurtmaberishctena7540(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Стеновой  профиль 75*50")) {
                try {
                    execute(mybotServiceRU.buyurtmaberishctena7550(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Стеновой  профиль 100*40")) {
                try {
                    execute(mybotServiceRU.buyurtmaberishctena10040(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Стеновой  профиль 100*50")) {
                try {
                    execute(mybotServiceRU.buyurtmaberishctena10050(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("⬅\uFE0FНазад")) {
                try {
                    execute(mybotServiceRU.profilMenu(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("⬅\uFE0FГлавная | Меню")) {
                try {
                    execute(mybotServiceRU.menuRU(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            //Gipsokartonrus
            if (text.equals("ГИПСОВЫЙ КАРТОН")) {
                try {
                    execute(mybotServiceRU.gipsomenuRU(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Настенавой")) {
                try {
                    execute(mybotServiceRU.nastenavoyInlineRU(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Потaлочный")) {
                try {
                    execute(mybotServiceRU.potolochniyInlineRU(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            //English Language
            if (text.equals("English language")) {
                try {
                    execute(myBotServiceENG.menuENG(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Profnastyle")) {
                try {
                    execute(myBotServiceENG.profnastilMenu(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Opposite-growth wave")) {
                try {
                    execute(myBotServiceENG.profnastildescription(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Economical")) {
                try {
                    execute(myBotServiceENG.profnastildescription(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("П35 corrugation")) {
                try {
                    execute(myBotServiceENG.profnastildescription(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("П57 corrugation")) {
                try {
                    execute(myBotServiceENG.profnastildescription(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Tile")) {
                try {
                    execute(myBotServiceENG.profnastildescription(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Square tiles")) {
                try {
                    execute(myBotServiceENG.profnastildescription(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("BACK")) {
                try {
                    execute(myBotServiceENG.menuENG(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("⬅\uFE0FBack")) {
                try {
                    execute(myBotServiceENG.profnastilMenu(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("White (9003)")) {
                try {
                    execute(myBotServiceENG.profnastilmasterpriceENG(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Black (9005)")) {
                try {
                    execute(myBotServiceENG.profnastilmasterpriceENG(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Cream (1015)")) {
                try {
                    execute(myBotServiceENG.profnastilmasterpriceENG(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Red (3003)")) {
                try {
                    execute(myBotServiceENG.profnastilmasterpriceENG(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("vinous (3005)")) {
                try {
                    execute(myBotServiceENG.profnastilmasterpriceENG(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("GREEN (6005)")) {
                try {
                    execute(myBotServiceENG.profnastilmasterpriceENG(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("DARK RED (3005)")) {
                try {
                    execute(myBotServiceENG.profnastilmasterpriceENG(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Chocolate color (8017)")) {
                try {
                    execute(myBotServiceENG.profnastilmasterpriceENG(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Mripping (7024)")) {
                try {
                    execute(myBotServiceENG.profnastilmasterpriceENG(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("grey (7004)")) {
                try {
                    execute(myBotServiceENG.profnastilmasterpriceENG(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("galvanized")) {
                try {
                    execute(myBotServiceENG.profnastilmasterpriceENG(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("White (9016)")) {
                try {
                    execute(myBotServiceENG.profnastilmasterpriceENG(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Back")) {
                try {
                    execute(myBotServiceENG.menuENG(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("0.30 SMZ 1m = 55 000")) {
                try {
                    execute(myBotServiceENG.profnastilinlineENG(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("0.33 SMZ  1m = 58 000")) {
                try {
                    execute(myBotServiceENG.profnastilinlineENG(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("0.35 SMZ 1m = 62 000")) {
                try {
                    execute(myBotServiceENG.profnastilinlineENG(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("0.37 SMZ 1m = 65 000")) {
                try {
                    execute(myBotServiceENG.profnastilinlineENG(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("0.40 SMZ 1m = 67 000")) {
                try {
                    execute(myBotServiceENG.profnastilinlineENG(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("0.45 SMZ 1m = 72 000")) {
                try {
                    execute(myBotServiceENG.profnastilinlineENG(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("0.50 SMZ 1m = 78 000")) {
                try {
                    execute(myBotServiceENG.profnastilinlineENG(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("0.60 SMZ 1m = 83 000")) {
                try {
                    execute(myBotServiceENG.profnastilinlineENG(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            //ENGProfil
            if (text.equals("⬅\uFE0F  Back")) {
                try {
                    execute(myBotServiceENG.menuENG(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Profile")) {
                try {
                    execute(myBotServiceENG.profilMenuENG(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("\uD83D\uDECDPlace an order")) {
                try {
                    execute(myBotServiceENG.buyurtmaberishENG(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("⬅\uFE0F    Back")) {
                try {
                    execute(myBotServiceENG.profilMenuENG(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Price list\uD83D\uDCCB")) {
                try {
                    execute(myBotServiceENG.prayslistdocENG(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Contacts\uD83D\uDCF1")) {
                try {
                    execute(myBotServiceENG.KontaktlarENG(chatId));
                    execute(myBotServiceENG.Kontaktlar2ENG(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Social network and website\uD83C\uDF10")) {
                try {
                    execute(myBotServiceENG.IjtimoiyTarmoqENG(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Our address\uD83D\uDDFA")) {
                try {
                    execute(myBotServiceENG.locationENG(chatId));
                    execute(myBotServiceENG.ManzillarENG(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Language selection\uD83C\uDF0F")) {
                try {
                    execute(myBotService.sendMessage(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Catalog\uD83D\uDDC3")) {
                try {
                    execute(myBotServiceENG.KatalogENG(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (text.equals("Video\uD83D\uDCF9")) {
                try {
                    execute(myBotServiceENG.videoENG(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Profill")) {
                try {
                    execute(myBotServiceENG.profilInlineENG(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("0,25ENGId")) {
                try {
                    execute(myBotServiceENG.profilRasmInlineENG(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Guides profile")) {
                try {
                    execute(myBotServiceENG.profilInlineENG(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Wall profile 50*40")) {
                try {
                    execute(myBotServiceENG.buyurtmaberishctena5040ENG(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Wall profile 50*50")) {
                try {
                    execute(myBotServiceENG.buyurtmaberishctena5050ENG(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Wall profile 75*40")) {
                try {
                    execute(myBotServiceENG.buyurtmaberishctena7540ENG(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Wall profile 75*50")) {
                try {
                    execute(myBotServiceENG.buyurtmaberishctena7550ENG(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Wall profile 100*40")) {
                try {
                    execute(myBotServiceENG.buyurtmaberishctena10040ENG(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Wall profile 100*50")) {
                try {
                    execute(myBotServiceENG.buyurtmaberishctena10050ENG(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            //GipsoEnglish
            if (text.equals("Nastenavoy")) {
                try {
                    execute(myBotServiceENG.nastenavoyInlineENG(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Ceiling")) {
                try {
                    execute(myBotServiceENG.potolochniyInlineENG(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Gypsum cardboard")) {
                try {
                    execute(myBotServiceENG.gipsomenuENG(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("⬅\uFE0FBACK")) {
                try {
                    execute(myBotServiceENG.menuENG(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            //Manzillar
            if (text.equals("Our addresses")) {
                try {
                    execute(myBotServiceENG.manzillarENG(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("1-branch")) {
                try {
                    execute(myBotServiceENG.firstlakatsiyaENG(chatId));
                    execute(myBotServiceENG.firstmessageENG(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("2-branch")) {
                try {
                    execute(myBotServiceENG.secondlakatsiyaENG(chatId));
                    execute(myBotServiceENG.secondmessageENG(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("3-branch")) {
                try {
                    execute(myBotServiceENG.thirdlakatsiyaENG(chatId));
                    execute(myBotServiceENG.thirdmessageENG(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("BAck")) {
                try {
                    execute(myBotServiceENG.menuENG(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

        } else if (update.hasCallbackQuery()) {
            CallbackQuery callbackQuery = update.getCallbackQuery();
            String data = callbackQuery.getData();
            Long chatId = callbackQuery.getMessage().getChatId();
            Integer messageId = callbackQuery.getMessage().getMessageId();


            if (data.startsWith("humoId")) {
                String state = userStateKarta.getOrDefault(chatId, "humoId");

                if (state.equals("humoId")) {
                    sendmessage(chatId, "Kartangizni kiriting:");
                    userStateKarta.put(chatId, "finishUzhumo");
                }
            } else if (userStateKarta.containsKey(chatId) && userStateKarta.get(chatId).equals("finishUzhumo")) {
                userInfoKarta.put(chatId + "humoId", data);
                sendmessage(chatId, "Demir shop botidan xarid qilganingiz uchun raxmat!!!.");
                System.out.println("humoId: " + userInfoKarta.get(chatId + "humoId"));
                userStateKarta.remove(chatId);
            } else {
                System.out.println("Xatolik sodir boldi");
            }


            if (data.startsWith("uzcardId")) {
                String state = userStateKarta.getOrDefault(chatId, "uzcardId");

                if (state.equals("uzcardId")) {
                    sendmessage(chatId, "Kartangizni kiriting:");
                    userStateKarta.put(chatId, "finishUzuzcard");
                }
            } else if (userStateKarta.containsKey(chatId) && userStateKarta.get(chatId).equals("finishUzuzcard")) {
                userInfoKarta.put(chatId + "uzcardId", data);
                sendmessage(chatId, "Demir shop botidan xarid qilganingiz uchun raxmat!!!");
                System.out.println("uzcardId: " + userInfoKarta.get(chatId + "uzcardId"));
                userStateKarta.remove(chatId);
            } else {
                System.out.println("Xatolik sodir boldi");

            }


            if (data.startsWith("mastercardId")) {
                String state = userStateKarta.getOrDefault(chatId, "mastercardId");

                if (state.equals("mastercardId")) {
                    sendmessage(chatId, "Kartangizni kiriting:");
                    userStateKarta.put(chatId, "finishUzmaster");
                }
            } else if (userStateKarta.containsKey(chatId) && userStateKarta.get(chatId).equals("finishUzmaster")) {
                userInfoKarta.put(chatId + "mastercardId", data);
                sendmessage(chatId, "Demir shop botidan xarid qilganingiz uchun raxmat!!!");
                System.out.println("mastercardId: " + userInfoKarta.get(chatId + "mastercardId"));
                userStateKarta.remove(chatId);
            } else {
                System.out.println("Xatolik sodir boldi");
            }


            if (data.startsWith("visaId")) {
                String state = userStateKarta.getOrDefault(chatId, "visaId");

                if (state.equals("visaId")) {
                    sendmessage(chatId, "Kartangizni kiriting:");
                    userStateKarta.put(chatId, "finishUzvisa");
                }
            } else if (userStateKarta.containsKey(chatId) && userStateKarta.get(chatId).equals("finishUzvisa")) {
                userInfoKarta.put(chatId + "visaId", data);
                sendmessage(chatId, "Demir shop botidan xarid qilganingiz uchun raxmat!!!");
                System.out.println("visaId: " + userInfoKarta.get(chatId + "visaId"));
                userStateKarta.remove(chatId);
            } else {
                System.out.println("Xatolik sodir boldi");
            }


            //RUS TILI SOTIB OLISH


            if (data.startsWith("humoRUId")) {
                String state = userStateKartaRU.getOrDefault(chatId, "humoRUId");

                if (state.equals("humoRUId")) {
                    sendmessage(chatId, "Введите свою карту:");
                    userStateKartaRU.put(chatId, "finishRUhumo");
                }
            } else if (userStateKartaRU.containsKey(chatId) && userStateKartaRU.get(chatId).equals("finishRUhumo")) {
                userInfoKartaRU.put(chatId + "humoRUId", data);
                sendmessage(chatId, "Спасибо за покупки в боте Demir Shop!!!");
                System.out.println("humoRUId: " + userInfoKartaRU.get(chatId + "humoRUId"));
                userStateKartaRU.remove(chatId);
            } else {
                System.out.println("Xatolik sodir boldi");
            }


            if (data.startsWith("uzcardRUId")) {
                String state = userStateKartaRU.getOrDefault(chatId, "uzcardRUId");

                if (state.equals("uzcardRUId")) {
                    sendmessage(chatId, "Введите свою карту:");
                    userStateKartaRU.put(chatId, "finishRUuzcard");
                }
            } else if (userStateKartaRU.containsKey(chatId) && userStateKartaRU.get(chatId).equals("finishRUuzcard")) {
                userInfoKartaRU.put(chatId + "uzcardRUId", data);
                sendmessage(chatId, "Спасибо за покупки в боте Demir Shop!!!");
                System.out.println("uzcardRUId: " + userInfoKartaRU.get(chatId + "uzcardRUId"));
                userStateKartaRU.remove(chatId);
            } else {
                System.out.println("Xatolik sodir boldi");
            }


            if (data.startsWith("mastercardRUId")) {
                String state = userStateKartaRU.getOrDefault(chatId, "mastercardRUId");

                if (state.equals("mastercardRUId")) {
                    sendmessage(chatId, "Введите свою карту:");
                    userStateKartaRU.put(chatId, "finishRUmaster");
                }
            } else if (userStateKartaRU.containsKey(chatId) && userStateKartaRU.get(chatId).equals("finishRUmaster")) {
                userInfoKartaRU.put(chatId + "mastercardRUId", data);
                sendmessage(chatId, "Спасибо за покупки в боте Demir Shop!!!");
                System.out.println("mastercardRUId: " + userInfoKartaRU.get(chatId + "mastercardRUId"));
                userStateKartaRU.remove(chatId);
            } else {
                System.out.println("Xatolik sodir boldi");
            }


            if (data.startsWith("visaRUId")) {
                String state = userStateKartaRU.getOrDefault(chatId, "visaRUId");

                if (state.equals("visaRUId")) {
                    sendmessage(chatId, "Введите свою карту:");
                    userStateKartaRU.put(chatId, "finishRUvisa");
                }
            } else if (userStateKartaRU.containsKey(chatId) && userStateKartaRU.get(chatId).equals("finishRUvisa")) {
                userInfoKartaRU.put(chatId + "visaRUId", data);
                sendmessage(chatId, "Спасибо за покупки в боте Demir Shop!!!");
                System.out.println("visaRUId: " + userInfoKartaRU.get(chatId + "visaRUId"));
                userStateKartaRU.remove(chatId);
            } else {
                System.out.println("Xatolik sodir boldi");
            }


            //ENGLISH SOTIB OLISH


            if (data.startsWith("humoENGId")) {
                String state = userStateKartaENG.getOrDefault(chatId, "humoENGId");

                if (state.equals("humoENGId")) {
                    sendmessage(chatId, "Enter your card:");
                    userStateKartaENG.put(chatId, "finishENGhumo");
                }
            } else if (userStateKartaENG.containsKey(chatId) && userStateKartaENG.get(chatId).equals("finishENGhumo")) {
                userInfoKartaENG.put(chatId + "humoENGId", data);
                sendmessage(chatId, "Thank you for shopping in the Demir Shop bot!!!");
                System.out.println("humoENGId:" + userInfoKartaENG.get(chatId + "humoENGId"));
                userStateKartaENG.remove(chatId);
            } else {
                System.out.println("Xatolik sodir boldi");
            }


            if (data.startsWith("uzcardENGId")) {
                String state = userStateKartaENG.getOrDefault(chatId, "uzcardENGId");

                if (state.equals("uzcardENGId")) {
                    sendmessage(chatId, "Enter your card:");
                    userStateKartaENG.put(chatId, "finishENGuzcard");
                }
            } else if (userStateKartaENG.containsKey(chatId) && userStateKartaENG.get(chatId).equals("finishENGuzcard")) {
                userInfoKartaENG.put(chatId + "uzcardENGId", data);
                sendmessage(chatId, "Thank you for shopping in the Demir Shop bot!!!");
                System.out.println("uzcardENGId:" + userInfoKartaENG.get(chatId + "uzcardENGId"));
                userStateKartaENG.remove(chatId);
            } else {
                System.out.println("Xatolik sodir boldi");
            }


            if (data.startsWith("mastercardENGId")) {
                String state = userStateKartaENG.getOrDefault(chatId, "mastercardENGId");

                if (state.equals("mastercardENGId")) {
                    sendmessage(chatId, "Enter your card:");
                    userStateKartaENG.put(chatId, "finishENGmastercard");
                }
            } else if (userStateKartaENG.containsKey(chatId) && userStateKartaENG.get(chatId).equals("finishENGmastercard")) {
                userInfoKartaENG.put(chatId + "mastercardENGId", data);
                sendmessage(chatId, "Thank you for shopping in the Demir Shop bot!!!");
                System.out.println("mastercardENGId:" + userInfoKartaENG.get(chatId + "mastercardENGId"));
                userStateKartaENG.remove(chatId);
            } else {
                System.out.println("Xatolik sodir boldi");
            }


            if (data.startsWith("visaENGId")) {
                String state = userStateKartaENG.getOrDefault(chatId, "visaENGId");

                if (state.equals("visaENGId")) {
                    sendmessage(chatId, "Enter your card:");
                    userStateKartaENG.put(chatId, "finishENGvisa");
                }
            } else if (userStateKartaENG.containsKey(chatId) && userStateKartaENG.get(chatId).equals("finishENGvisa")) {
                userInfoKartaENG.put(chatId + "visaENGId", data);
                sendmessage(chatId, "Thank you for shopping in the Demir Shop bot!!!");
                System.out.println("visaENGId:" + userInfoKartaENG.get(chatId + "visaENGId"));
                userStateKartaENG.remove(chatId);
            } else {
                System.out.println("Xatolik sodir boldi");
            }
            if (data.equals("0,25Id")) {
                try {
                    execute(myBotService.profilRasmInline(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("0,28Id")) {
                try {
                    execute(myBotService.profilRasmInline(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("0,30Id")) {
                try {
                    execute(myBotService.profilRasmInline(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("0,33Id")) {
                try {
                    execute(myBotService.profilRasmInline(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("0,35Id")) {
                try {
                    execute(myBotService.profilRasmInline(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("0,37Id")) {
                try {
                    execute(myBotService.profilRasmInline(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("0,40Id")) {
                try {
                    execute(myBotService.profilRasmInline(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("0,45Id")) {
                try {
                    execute(myBotService.profilRasmInline(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("0,50Id")) {
                try {
                    execute(myBotService.profilRasmInline(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("0,60Id")) {
                try {
                    execute(myBotService.profilRasmInline(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("qaytishIdprofil")) {
                try {
                    execute(myBotService.profilInline(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("qaytish10040Id")) {
                try {
                    execute(myBotService.buyurtmaberishctena10040(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("100.40Id")) {
                try {
                    execute(myBotService.ctena10040(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("100.50Id")) {
                try {
                    execute(myBotService.ctena10050(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("qaytish10050Id")) {
                try {
                    execute(myBotService.buyurtmaberishctena10050(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("75.40Id")) {
                try {
                    execute(myBotService.ctena7540(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

//            if (data.equals("humoId")){
//                try {
//                    execute(myBotService.plastikend(chatId));
//                } catch (TelegramApiException e) {
//                    throw new RuntimeException(e);
//                }
//            }

//            if (data.equals("uzcardId")){
//                try {
//                    execute(myBotService.plastikend(chatId));
//                } catch (TelegramApiException e) {
//                    throw new RuntimeException(e);
//                }
//            }

//            if (data.equals("mastercardId")){
//                try {
//                    execute(myBotService.plastikend(chatId));
//                } catch (TelegramApiException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//
//            if (data.equals("visaId")){
//                try {
//                    execute(myBotService.plastikend(chatId));
//                } catch (TelegramApiException e) {
//                    throw new RuntimeException(e);
//                }
//            }

            if (data.equals("sotibolishId")) {
                try {
                    execute(myBotService.plastiklar(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("50.40Id")) {
                try {
                    execute(myBotService.ctena5040033(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("0,335050Id")) {
                try {
                    execute(myBotService.ctena5050(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("75.50Id")) {
                try {
                    execute(myBotService.ctena7550(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("qaytish5040Id")) {
                try {
                    execute(myBotService.buyurtmaberishctena(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("qaytish5050Id")) {
                try {
                    execute(myBotService.buyurtmaberishctena5050(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("qaytish7540Id")) {
                try {
                    execute(myBotService.buyurtmaberishctena7540(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("qaytish7550Id")) {
                try {
                    execute(myBotService.buyurtmaberishctena7550(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("qaytishRU7550Id")) {
                try {
                    execute(mybotServiceRU.buyurtmaberishctena7550(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("+Id")) {
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
            if (data.equals("-Id")) {
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
            if (data.equals("+prId")) {
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(messageId);
                editMessageReplyMarkup.setReplyMarkup(myBotService.profilRasmInlineqoshishprofil(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("-prId")) {
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(messageId);
                editMessageReplyMarkup.setReplyMarkup(myBotService.profilRasmInlineayrishprofil(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("+5050Id")) {
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(messageId);
                editMessageReplyMarkup.setReplyMarkup(myBotService.profilRasmInlineqoshish5050(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("-5050Id")) {
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(messageId);
                editMessageReplyMarkup.setReplyMarkup(myBotService.profilRasmInlineayrish5050(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("+7540Id")) {
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(messageId);
                editMessageReplyMarkup.setReplyMarkup(myBotService.profilRasmInlineqoshish7540(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("-7540Id")) {
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(messageId);
                editMessageReplyMarkup.setReplyMarkup(myBotService.profilRasmInlineayrish7540(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("+7550Id")) {
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(messageId);
                editMessageReplyMarkup.setReplyMarkup(myBotService.profilRasmInlineqoshish7550(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("-7550Id")) {
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(messageId);
                editMessageReplyMarkup.setReplyMarkup(myBotService.profilRasmInlineayrish7550(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("+10040Id")) {
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(messageId);
                editMessageReplyMarkup.setReplyMarkup(myBotService.profilRasmInlineqoshish10040(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("-10040Id")) {
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(messageId);
                editMessageReplyMarkup.setReplyMarkup(myBotService.profilRasmInlineayrish10040(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("+10050Id")) {
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(messageId);
                editMessageReplyMarkup.setReplyMarkup(myBotService.profilRasmInlineqoshish10050(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("-10050Id")) {
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(messageId);
                editMessageReplyMarkup.setReplyMarkup(myBotService.profilRasmInlineayrish10050(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            //gipsoUZ
            if (data.equals("+GipsoUzId")) {
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(messageId);
                editMessageReplyMarkup.setReplyMarkup(myBotService.GipsoRasmInlineqoshishUZ(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("-GipsoUzId")) {
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(messageId);
                editMessageReplyMarkup.setReplyMarkup(myBotService.GipsoRasmInlineayrishUZ(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("+potoId")) {
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(messageId);
                editMessageReplyMarkup.setReplyMarkup(myBotService.GipsoRasmInlineqoshishUZpoto(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("-potoId")) {
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(messageId);
                editMessageReplyMarkup.setReplyMarkup(myBotService.GipsoRasmInlineayrishUZpoto(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            //RusTilidata
            if (data.equals("0,25RUId")) {
                try {
                    execute(mybotServiceRU.profilRasmInlineRu(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("qaytishIdRUprofil")) {
                try {
                    execute(mybotServiceRU.QollanmaprofiliInline(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("100.40RUId")) {
                try {
                    execute(mybotServiceRU.ctena10040(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("50.40RUId")) {
                try {
                    execute(mybotServiceRU.ctena5040RU(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("qaytish5040RUId")) {
                try {
                    execute(mybotServiceRU.buyurtmaberishctena5040RU(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("5050RUId")) {
                try {
                    execute(mybotServiceRU.ctena5050(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("qaytish5050RUId")) {
                try {
                    execute(mybotServiceRU.buyurtmaberishctena5050(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("75.40RUId")) {
                try {
                    execute(mybotServiceRU.ctena7540(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("qaytish7540RUId")) {
                try {
                    execute(mybotServiceRU.buyurtmaberishctena7540(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("75.50RUId")) {
                try {
                    execute(mybotServiceRU.ctena7550(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("qaytishRU10040Id")) {
                try {
                    execute(mybotServiceRU.buyurtmaberishctena10040(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("100.50RUId")) {
                try {
                    execute(mybotServiceRU.ctena10050(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("qaytishRU10050Id")) {
                try {
                    execute(mybotServiceRU.buyurtmaberishctena10050(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

//            if (data.equals("humoRUId")){
//                try {
//                    execute(mybotServiceRU.plastikendRU(chatId));
//                } catch (TelegramApiException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//
//            if (data.equals("uzcardRUId")){
//                try {
//                    execute(mybotServiceRU.plastikendRU(chatId));
//                } catch (TelegramApiException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//
//            if (data.equals("mastercardId")){
//                try {
//                    execute(mybotServiceRU.plastikendRU(chatId));
//                } catch (TelegramApiException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//
//
//
//            if (data.equals("visaId")){
//                try {
//                    execute(mybotServiceRU.plastikendRU(chatId));
//                } catch (TelegramApiException e) {
//                    throw new RuntimeException(e);
//                }
//            }

            if (data.equals("sotibolishallRUId")) {
                try {
                    execute(mybotServiceRU.plastiklarRU(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }


            //Rustili inline
            if (data.equals("+RUprofilId")) {
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
            if (data.equals("-RUprofilId")) {
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
            if (data.equals("+RU5040Id")) {
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
            if (data.equals("-RU5040Id")) {
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
            if (data.equals("+RU5050Id")) {
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(messageId);
                editMessageReplyMarkup.setReplyMarkup(mybotServiceRU.profilRasmInlineqoshishRU5050(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("-RU5050Id")) {
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(messageId);
                editMessageReplyMarkup.setReplyMarkup(mybotServiceRU.profilRasmInlineayrishRU5050(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("-RU7540Id")) {
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(messageId);
                editMessageReplyMarkup.setReplyMarkup(mybotServiceRU.profilRasmInlineayrishRU7540(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("+RU7540Id")) {
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(messageId);
                editMessageReplyMarkup.setReplyMarkup(mybotServiceRU.profilRasmInlineqoshishRU7540(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("+RU7550Id")) {
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(messageId);
                editMessageReplyMarkup.setReplyMarkup(mybotServiceRU.profilRasmInlineqoshishRU7550(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("-RU7550Id")) {
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(messageId);
                editMessageReplyMarkup.setReplyMarkup(mybotServiceRU.profilRasmInlineayrishRU7550(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("+RU10040Id")) {
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(messageId);
                editMessageReplyMarkup.setReplyMarkup(mybotServiceRU.profilRasmInlineqoshishRU10040(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("-RU10040Id")) {
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(messageId);
                editMessageReplyMarkup.setReplyMarkup(mybotServiceRU.profilRasmInlineayrishRU10040(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("+RU10050Id")) {
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(messageId);
                editMessageReplyMarkup.setReplyMarkup(mybotServiceRU.profilRasmInlineqoshishRU10050(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("-RU10050Id")) {
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(messageId);
                editMessageReplyMarkup.setReplyMarkup(mybotServiceRU.profilRasmInlineayrishRU10050(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            //Gipsokarton
            if (data.equals("+GipsoId")) {
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(messageId);
                editMessageReplyMarkup.setReplyMarkup(mybotServiceRU.GipsoInlineqoshishRU(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("-GipsoId")) {
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(messageId);
                editMessageReplyMarkup.setReplyMarkup(mybotServiceRU.GipsoInlineayrishRU(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            //English Language
            if (data.equals("0,25ENGId")) {
                try {
                    execute(myBotServiceENG.profilRasmInlineENG(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("50.40ENGId")) {
                try {
                    execute(myBotServiceENG.ctena5040ENG(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("qaytish5040ENGId")) {
                try {
                    execute(myBotServiceENG.buyurtmaberishctena5040ENG(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("5050ENGId")) {
                try {
                    execute(myBotServiceENG.ctena5050ENG(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("qaytish5050ENGId")) {
                try {
                    execute(myBotServiceENG.buyurtmaberishctena5050ENG(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("75.40ENGId")) {
                try {
                    execute(myBotServiceENG.ctena7540ENG(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("qaytish7540ENGId")) {
                try {
                    execute(myBotServiceENG.buyurtmaberishctena7540ENG(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("75.50ENGId")) {
                try {
                    execute(myBotServiceENG.ctena7550ENG(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("100.40ENGId")) {
                try {
                    execute(myBotServiceENG.ctena10040ENG(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("qaytish10040ENGId")) {
                try {
                    execute(myBotServiceENG.buyurtmaberishctena10040ENG(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("100.50ENGId")) {
                try {
                    execute(myBotServiceENG.ctena10050ENG(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            if (data.equals("qaytish10050ENGId")) {
                try {
                    execute(myBotServiceENG.buyurtmaberishctena10050ENG(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("qaytish7550ENGId")) {
                try {
                    execute(myBotServiceENG.buyurtmaberishctena7550ENG(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("sotibolishENGId")) {
                try {
                    execute(myBotServiceENG.plastiklarENG(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("+ENGId")) {
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(messageId);
                editMessageReplyMarkup.setReplyMarkup(myBotServiceENG.profnastilinlineqoshish(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("-ENGId")) {
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(messageId);
                editMessageReplyMarkup.setReplyMarkup(myBotServiceENG.profnastilinlineayrish(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("+prENGId")) {
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(messageId);
                editMessageReplyMarkup.setReplyMarkup(myBotServiceENG.profilRasmInlineqoshishprofilENG(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("-prENGId")) {
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(messageId);
                editMessageReplyMarkup.setReplyMarkup(myBotServiceENG.profilRasmInlineayrishprofilENG(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("+5040ENGId")) {
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(messageId);
                editMessageReplyMarkup.setReplyMarkup(myBotServiceENG.profilRasmInlineqoshish5040ENG(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("-5040ENGId")) {
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(messageId);
                editMessageReplyMarkup.setReplyMarkup(myBotServiceENG.profilRasmInlineayrish5040ENG(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("+5050ENGId")) {
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(messageId);
                editMessageReplyMarkup.setReplyMarkup(myBotServiceENG.profilRasmInlineqoshish5050ENG(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("-5050ENGId")) {
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(messageId);
                editMessageReplyMarkup.setReplyMarkup(myBotServiceENG.profilRasmInlineayrish5050ENG(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("+7540ENGId")) {
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(messageId);
                editMessageReplyMarkup.setReplyMarkup(myBotServiceENG.profilRasmInlineqoshish7540ENG(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("-7540ENGId")) {
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(messageId);
                editMessageReplyMarkup.setReplyMarkup(myBotServiceENG.profilRasmInlineayrish7540ENG(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("+7550ENGId")) {
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(messageId);
                editMessageReplyMarkup.setReplyMarkup(myBotServiceENG.profilRasmInlineqoshish7550ENG(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("-7550ENGId")) {
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(messageId);
                editMessageReplyMarkup.setReplyMarkup(myBotServiceENG.profilRasmInlineayrish7550ENG(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("+10040ENGId")) {
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(messageId);
                editMessageReplyMarkup.setReplyMarkup(myBotServiceENG.profilRasmInlineqoshish10040ENG(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("-10040ENGId")) {
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(messageId);
                editMessageReplyMarkup.setReplyMarkup(myBotServiceENG.profilRasmInlineayrish10040ENG(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("+10050ENGId")) {
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(messageId);
                editMessageReplyMarkup.setReplyMarkup(myBotServiceENG.profilRasmInlineqoshish10050ENG(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("-10050ENGId")) {
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(messageId);
                editMessageReplyMarkup.setReplyMarkup(myBotServiceENG.profilRasmInlineayrish10050ENG(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            //GipsoEnglish
            if (data.equals("+GipsoENGId")) {
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(messageId);
                editMessageReplyMarkup.setReplyMarkup(myBotServiceENG.GipsoRasmInlineqoshishENG(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("-GipsoENGId")) {
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(messageId);
                editMessageReplyMarkup.setReplyMarkup(myBotServiceENG.GipsoRasmInlineayrishENG(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("+potoENGId")) {
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(messageId);
                editMessageReplyMarkup.setReplyMarkup(myBotServiceENG.GipsoRasmInlineqoshishENGpoto(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("-potoENGId")) {
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(messageId);
                editMessageReplyMarkup.setReplyMarkup(myBotServiceENG.GipsoRasmInlineayrishENGpoto(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
        }


        if (update.hasMessage() && update.getMessage().hasContact()) {
            Long chatId = update.getMessage().getChatId();
            try {
                execute(myBotService.sendMessage(chatId));
            } catch (TelegramApiException e) {
                throw new RuntimeException(e);
            }
        }

    }





private void sendmessage(Long chatId, String text){
    SendMessage sendMessage = new SendMessage();
    sendMessage.setChatId(chatId.toString());
    sendMessage.setText(text);
    try {
        execute(sendMessage);
    } catch (TelegramApiException e) {
        throw new RuntimeException(e);
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
