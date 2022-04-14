package dev.ranieri.app;

public class Suggestion {

    private String message;
    private int priority;

    public Suggestion() {
    }

    public Suggestion(String message, int priority) {
        this.message = message;
        this.priority = priority;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Suggestion{" +
                "message='" + message + '\'' +
                ", priority=" + priority +
                '}';
    }
}
