package lab3.human;

public enum StorysBible {
    BEG1(0, "Говорят, что физика Роберта Уотсона однажды арестовала полиция за превышение скорости. А он им и говорит: "),
    BEG2(1, "Внимание, анекдот. Звонит мужик в полицию: 'Ало! Полиция? У нас тут соседи травкой торгуют!' Ему отвечают: 'И сколько за кг?' 'Ну, десять баксов.' А диспетчер ему: "),
    BEG3(2, "Везут в автозаке чукчу и других заключенных, поймали на границе. Видит водитель: по встречке фура летит, прямо в кутузку. \n" +
            "Он шепчет чукче: 'Мы щас столкнемся, отвлеки зэков, чтоб панику не подняли'. А чукча и говорит остальным: 'Хотите, я чихну, и машина развалится!'. Взял да и чихнул. \n" +
            "Машина - в щепки. Из под обломков вылезает полицейский, и говорит: "),
    END1(4, "'Дурак ты, чукча,и шутки у тебя дурацкие.'"),
    END2(5, "'Отлично, берите! Совсем не дорого!'"),
    END3(6, "'Если бы знал, что так будет, никогда не изобрёл бы радар!'");

    private final String body;
    private final int ID;

    StorysBible(int ID, String body){
        this.body = body;
        this.ID = ID;
    }

    public int getID() {
        return ID;
    }

    public String getBody() {
        return body;
    }
}
