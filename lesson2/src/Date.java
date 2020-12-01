import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Date implements Command { // Имплементируюсь от Command

    String date = LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE); // Переменная которая будет хранить дату (форматирована)

    @Override
    public String getName() {
        return "Date";
    }

    @Override
    public String execute() {
        return date;
    }
}
