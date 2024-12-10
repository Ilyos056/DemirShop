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
    private MybotServiceRU mybotServiceRU=new MybotServiceRU();
    private MyBotService myBotService = new MyBotService();

    private Map<Long, String> userState=new HashMap<>();
    private Map<String, String > userInfo=new HashMap<>();

    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasMessage() && update.getMessage().hasText())  {
            Long chatId = update.getMessage().getChatId();
            String text = update.getMessage().getText();

            if (text.startsWith("Comment")) {
                String state = userState.getOrDefault(chatId, "Comment");

                if (state.equals("Comment")) {
                    sendmessage(chatId, "Izoh qoldiring:");
                    userState.put(chatId, "finish");
                }
            } else if (userState.containsKey(chatId) && userState.get(chatId).equals("finish")) {
                userInfo.put(chatId + "Comment", text);
                sendmessage(chatId, "Rahmat! Izohingiz saqlandi.");
                System.out.println("Comment: " + userInfo.get(chatId + "Comment"));
                userState.remove(chatId);
            } else {
                System.out.println("Xatolik sodir boldi");
            }




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
            if (text.equals("Oq (9003)")){
                try {
                    execute(myBotService.profnastilmasterprice(chatId));
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

            //master profnastil
            if (text.equals("0.30 SMZ 1M = 55 000")){
                try {
                    execute(myBotService.profnastilinlineMaster(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("0.33 SMZ  1M = 58 000")){
                try {
                    execute(myBotService.profnastilinlineMaster(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("0.35 SMZ  1M = 62 000")){
                try {
                    execute(myBotService.profnastilinlineMaster(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("0.37 SMZ  1M = 65 000")){
                try {
                    execute(myBotService.profnastilinlineMaster(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("0.40 SMZ  1M = 67 000")){
                try {
                    execute(myBotService.profnastilinlineMaster(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("0.45 SMZ  1M = 72 000")){
                try {
                    execute(myBotService.profnastilinlineMaster(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("0.50 SMZ  1M = 78 000")){
                try {
                    execute(myBotService.profnastilinlineMaster(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("0.60 SMZ  1M = 83 000")){
                try {
                    execute(myBotService.profnastilinlineMaster(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            //atsinkovka profnastil
            if (text.equals("0.30 SMZ 1M = 48 000")){
                try {
                    execute(myBotService.profnastilinlineAtsinkovka(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("0.33 SMZ 1M = 51 000")){
                try {
                    execute(myBotService.profnastilinlineAtsinkovka(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("0.35 SMZ 1M = 53 000")){
                try {
                    execute(myBotService.profnastilinlineAtsinkovka(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("0.37 SMZ 1M = 55 000")){
                try {
                    execute(myBotService.profnastilinlineAtsinkovka(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("0.40 SMZ 1M = 58 000")){
                try {
                    execute(myBotService.profnastilinlineAtsinkovka(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("0.45 SMZ 1M = 62 000")){
                try {
                    execute(myBotService.profnastilinlineAtsinkovka(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("0.50 SMZ 1M = 67 000")){
                try {
                    execute(myBotService.profnastilinlineAtsinkovka(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("0.60 SMZ 1M = 72 000")){
                try {
                    execute(myBotService.profnastilinlineAtsinkovka(chatId));
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
                    execute(mybotServiceRU.menuRU(chatId));
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

           if (text.equals("⬅\uFE0F  Назад")){
               try {
                   execute(mybotServiceRU.menuRU(chatId));
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

            if (text.equals("Стеновой  профиль 50*50")){
                try {
                    execute(mybotServiceRU.buyurtmaberishctena5050(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (text.equals("Стеновой  профиль 75*40")){
                try {
                    execute(mybotServiceRU.buyurtmaberishctena7540(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (text.equals("Стеновой  профиль 75*50")){
                try {
                    execute(mybotServiceRU.buyurtmaberishctena7550(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (text.equals("Стеновой  профиль 100*40")){
                try {
                    execute(mybotServiceRU.buyurtmaberishctena10040(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (text.equals("Стеновой  профиль 100*50")){
                try {
                    execute(mybotServiceRU.buyurtmaberishctena10050(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (text.equals("⬅\uFE0FНазад")){
                try {
                    execute(mybotServiceRU.profilMenu(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (text.equals("⬅\uFE0FГлавная | Меню")){
                try {
                    execute(mybotServiceRU.menuRU(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }


            //Gipsokarton

            if (text.equals("ГИПСОВЫЙ КАРТОН")){
                try {
                    execute(mybotServiceRU.gipsomenuRU(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (text.equals("Настенавой")){
                try {
                    execute(mybotServiceRU.nastenavoyInlineRU(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (text.equals("Потaлочный")){
                try {
                    execute(mybotServiceRU.potolochniyInlineRU(chatId));
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
                String state = userState.getOrDefault(chatId, "humoId");

                if (state.equals("humoId")) {
                    sendmessage(chatId, "Kartangizni kiriting :");
                    userState.put(chatId, "finish");
                }
            } else if (userState.containsKey(chatId) && userState.get(chatId).equals("finish")) {
                userInfo.put(chatId + "humoId", data);
                sendmessage(chatId, "Demir shop botidan xarid qilganingiz uchun Raxmat ! ! ! ");
                System.out.println("humoId:" + userInfo.get(chatId + "humoId"));
                userState.remove(chatId);
            } else {
                System.out.println("Xatolik sodir boldi");
            }



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

//            if (data.equals("humoId")){
//                try {
//                    execute(myBotService.plastikend(chatId));
//                } catch (TelegramApiException e) {
//                    throw new RuntimeException(e);
//                }
//            }

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

            if (data.equals("qaytishRU7550Id")){
                try {
                    execute(mybotServiceRU.buyurtmaberishctena7550(chatId));
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


            if (data.equals("+prId")){
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
            if (data.equals("-prId")){
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




            if (data.equals("+5050Id")){
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

            if (data.equals("-5050Id")){
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

            if (data.equals("+7540Id")){
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

            if (data.equals("-7540Id")){
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

            if (data.equals("+7550Id")){
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

            if (data.equals("-7550Id")){
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

            if (data.equals("+10040Id")){
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

            if (data.equals("-10040Id")){
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

            if (data.equals("+10050Id")){
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

            if (data.equals("-10050Id")){
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

            if (data.equals("+GipsoId")){
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

            if (data.equals("-GipsoId")){
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

            if (data.equals("+potoId")){
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

            if (data.equals("-potoId")){
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

            if (data.equals("100.40RUId")){
                try {
                    execute(mybotServiceRU.ctena10040(chatId));
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


            if (data.equals("5050RUId")){
                try {
                    execute(mybotServiceRU.ctena5050(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("qaytish5050RUId")){
                try {
                    execute(mybotServiceRU.buyurtmaberishctena5050(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }



            if (data.equals("75.40RUId")){
                try {
                    execute(mybotServiceRU.ctena7540(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("qaytish7540RUId")){
                try {
                    execute(mybotServiceRU.buyurtmaberishctena7540(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("75.50RUId")){
                try {
                    execute(mybotServiceRU.ctena7550(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("qaytishRU10040Id")){
                try {
                    execute(mybotServiceRU.buyurtmaberishctena10040(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("100.50RUId")){
                try {
                    execute(mybotServiceRU.ctena10050(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("qaytishRU10050Id")){
                try {
                    execute(mybotServiceRU.buyurtmaberishctena10050(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("humoRUId")){
                try {
                    execute(mybotServiceRU.plastikendRU(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("uzcardRUId")){
                try {
                    execute(mybotServiceRU.plastikendRU(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("mastercardId")){
                try {
                    execute(mybotServiceRU.plastikendRU(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }



            if (data.equals("visaId")){
                try {
                    execute(mybotServiceRU.plastikendRU(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (data.equals("sotibolishallRUId")){
                try {
                    execute(mybotServiceRU.plastiklarRU(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }












            //Rustili inline
            if (data.equals("+RUprofilId")){
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
            if (data.equals("-RUprofilId")){
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

            if (data.equals("+RU5050Id")){
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

            if (data.equals("-RU5050Id")){
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

            if (data.equals("-RU7540Id")){
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

            if (data.equals("+RU7540Id")){
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

            if (data.equals("+RU7550Id")){
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

            if (data.equals("-RU7550Id")){
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


            if (data.equals("+RU10040Id")){
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

            if (data.equals("-RU10040Id")){
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

            if (data.equals("+RU10050Id")){
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

            if (data.equals("-RU10050Id")){
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

            if (data.equals("+GipsoId")){
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

            if (data.equals("-GipsoId")){
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
