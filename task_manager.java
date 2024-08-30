/**
 * This program demonstrates key software engineering principles, aimed at creating robust, maintainable, and scalable code:
 *
 * Encapsulation:
 * - Purpose: Hides the internal state of an object, facilitating interaction through public methods only.
 * - Implementation: The Task class keeps task details and status private with public methods for property manipulation.
 *
 * Simplicity:
 * - Purpose: Simplifies understanding and minimizes errors by maintaining straightforward code.
 * - Implementation: Focuses solely on essential task management functionalities without unnecessary complexity.
 *
 * Readability:
 * - Purpose: Facilitates easier debugging, updating, and sharing by using meaningful names and clear structure.
 * - Implementation: Uses clear names like Task, markDone, and isDone, with concise methods and well-defined class responsibilities.
 *
 * Maintainability:
 * - Purpose: Allows easy code updates and extensions without risking existing functionality.
 * - Implementation: Designed for easy addition of features like task prioritization and categorization with minimal changes to existing code.
 *
 * Separation of Concerns:
 * - Purpose: Divides the program into distinct sections for clearer modularity and easier management.
 * - Implementation: TaskManager manages user interactions while Task handles task-specific data and operations, allowing independent testing and modification.
 */


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
