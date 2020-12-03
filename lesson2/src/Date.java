import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Date implements Command { // Имплементируюсь от Command

    @Override
    public String getName() {
        return "Date";
    }

    @Override
    public String execute() {
        String date = LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE); // Переменная которая будет хранить дату (форматирована)
        return date;
    }
}
