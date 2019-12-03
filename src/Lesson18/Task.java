package Lesson18;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Task {
    private String title;
    private LocalDate creationDate;
    private Type type;
    private String tags;



    public Task(String title, LocalDate creationDate, Type type, String tags) {
        this.title = title;
        this.creationDate = creationDate;
        this.type = type;
        this.tags  = tags;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(title, task.title) &&
                Objects.equals(creationDate, task.creationDate) &&
                type == task.type &&
                Objects.equals(tags, task.tags);
    }

    @Override
    public String toString() {
        return "Task{" +
                "title='" + title + '\'' +
                ", creationDate=" + creationDate +
                ", type=" + type +
                ", tags=" + tags +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }
}
