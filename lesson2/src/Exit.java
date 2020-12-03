public class Exit implements Command {

    @Override
    public String getName() {
        return "Exit"; // возращаем строку
    }

    @Override
    public String execute() {
        System.exit(0); //код возврата
        return " "; // Сюда не доходим
    }
}

