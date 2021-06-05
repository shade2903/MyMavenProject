package HomeWorkVladimirHaiduk.MagicBall;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import java.util.List;
import java.util.Random;

public class MagicBall {
    Logger log = LoggerFactory.getLogger("MagicBall");
    Random value = new Random();
    int i = value.nextInt(20);

    public List<String> getList() {
        return list;
    }

    private List<String> list = List.of(
            "It is certain (Бесспорно)",
            "It is decidedly so (Предрешено)",
            "Without a doubt (Никаких сомнений)",
            "Yes — definitely (Определённо да)",
            "You may rely on it (Можешь быть уверен в этом)",

            "As I see it, yes (Мне кажется — «да»)",
            "Most likely (Вероятнее всего)",
            "Outlook good (Хорошие перспективы)",
            "Signs point to yes (Знаки говорят -«да»",
            "Yes (Да)",

            "Reply hazy, try again (Пока не ясно, попробуй снова)",
            "Ask again later (Спроси позже)",
            "Better not tell you now (Лучше не рассказывать)",
            "Cannot predict now (Сейчас нельзя предсказать)",
            "Concentrate and ask again (Сконцентрируйся и спроси опять)",

            "Don’t count on it (Даже не думай)",
            "My reply is no (Мой ответ — «нет»)",
            "My sources say no (По моим данным — «нет»)",
            "Outlook not so good (Перспективы не очень хорошие)",
            "Very doubtful (Весьма сомнительно)");


    public void getAnswer() {
        log.info(list.get(i));
    }


}

