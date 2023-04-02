package tasks;


import java.time.LocalDate;
import java.time.LocalDateTime;

public class DailyTask extends Task implements Repeatable {
    public DailyTask(String title, String description, boolean isWork, LocalDateTime dateTime) {
        super(title, description, isWork, dateTime);
    }

    public boolean checkIfSuitable(LocalDate date) {
        return date.equals(dateTime.toLocalDate()) || date.isAfter(dateTime.toLocalDate());
    }
}

        
    