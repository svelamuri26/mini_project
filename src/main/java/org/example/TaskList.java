package org.example;
import java.util.ArrayList;
import java.util.List;

public class TaskList {
    private List<Task> tasks;

    public TaskList() {
        tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void viewTasks() {
        for (Task task : tasks) {
            task.displayTask();
            System.out.println();  // Add a newline after each task
        }
    }

    public Task getTaskByTitle(String title) {
        for (Task task : tasks) {
            if (task.getTitle().equals(title)) {
                return task;
            }
        }
        return null;
    }

    public void updateTask(String title, String newDescription, String newPriority) {
        Task task = getTaskByTitle(title);
        if (task != null) {
            task.editTask(newDescription, newPriority);
        } else {
            System.out.println("Task not found.");
        }
    }

    public void deleteTask(String title) {
        Task task = getTaskByTitle(title);
        if (task != null) {
            tasks.remove(task);
            System.out.println("Task deleted: " + title);
        } else {
            System.out.println("Task not found.");
        }
    }
}

