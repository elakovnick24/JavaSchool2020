import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Time implements Command { // Имплементируюсь от Command

    @Override
    public String getName() {
        return "Time";
    }

    @Override
    public String execute() {
        String time = LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_TIME);// Переменная которая будет хранить время (форматирована)
        return time;
    }
}