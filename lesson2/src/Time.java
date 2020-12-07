import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Time implements Command { // Имплементируюсь от Command

    String time = LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_TIME);// Переменная которая будет хранить время (форматирована)

    @Override
    public String getName() {
        return "Time";
    }

    @Override
    public String execute() {
        return time;
    }
}