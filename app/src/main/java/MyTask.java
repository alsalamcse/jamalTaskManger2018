import java.util.Date;

public class MyTask {


    private String key;
    private String title;
    private String text;
    private int important;
    private int necessary;
    private Date createdAt;
    private Date dueDate;

    public MyTask(String key, String title, String text, int important, int necessary, Date createdAt, Date dueDate) {
        this.key = key;
        this.title = title;
        this.text = text;
        this.important = important;
        this.necessary = necessary;
        this.createdAt = createdAt;
        this.dueDate = dueDate;
    }

    public String getKey() {
        return key;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }

    public int getImportant() {
        return important;
    }

    public int getNecessary() {
        return necessary;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setImportant(int important) {
        this.important = important;
    }

    public void setNecessary(int necessary) {
        this.necessary = necessary;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    @Override
    public String toString() {
        return "MyTask{" +
                "key='" + key + '\'' +
                ", title='" + title + '\'' +
                ", text='" + text + '\'' +
                ", important=" + important +
                ", necessary=" + necessary +
                ", createdAt=" + createdAt +
                ", dueDate=" + dueDate +
                '}';
    }
}

