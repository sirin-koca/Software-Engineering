public class TaskManager {
    public static void main(String[] args) {
        Task task1 = new Task("Complete Java assignment");
        Task task2 = new Task("Study for upcoming exams");

        task1.markDone();

        System.out.println(task1);
        System.out.println(task2);
    }
}

class Task {
    private String description;
    private boolean isDone;

    public Task(String description) {
        this.description = description;
        this.isDone = false;
    }

    public void markDone() {
        this.isDone = true;
    }

    @Override
    public String toString() {
        return description + ": " + (isDone ? "Completed" : "Not Completed");
    }
}
