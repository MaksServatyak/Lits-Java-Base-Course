package Lesson11;

import java.time.LocalDateTime;

public class Task2 {
    private int dataNumber;
    private LocalDateTime updatedDate;

    public Task2(int dataNumber, LocalDateTime updatedDate) {
        this.dataNumber = dataNumber;
        this.updatedDate = updatedDate;
    }

    public LocalDateTime getUpdatedDate() {
        return updatedDate;
    }

    public String toString() {
        return String.format("Data Number: %s, Updated Date: %s", this.dataNumber, this.updatedDate);
    }


}
