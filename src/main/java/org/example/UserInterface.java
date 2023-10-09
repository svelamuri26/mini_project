package org.example;
import java.util.Scanner;

import java.util.Scanner;

public class UserInterface {
    private TaskList taskList;
    private Scanner scanner;

    public UserInterface(TaskList taskList) {
        this.taskList = taskList;
        this.scanner = new Scanner(System.in);
    }

    public void displayOptions() {
        int choice;

        do {
            System.out.println("Task Management System");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Update Task");
            System.out.println("4. Delete Task");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            switch (choice) {
                case 1:
                    addTask();
                    break;
                case 2:
                    viewTasks();
                    break;
                case 3:
                    updateTask();
                    break;
                case 4:
                    deleteTask();
                    break;
                case 5:
                    System.out.println("Exiting the application.");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 5);
    }

    private void addTask() {
        System.out.print("Enter task title: ");
        String title = scanner.nextLine();

        System.out.print("Enter task description: ");
        String description = scanner.nextLine();

        System.out.print("Enter task priority: ");
        String priority = scanner.nextLine();

        Task task = new Task(title, description, priority);
        taskList.addTask(task);
        System.out.println("Task added successfully.");
    }

    private void viewTasks() {
        taskList.viewTasks();
    }

    private void updateTask() {
        System.out.print("Enter the title of the task to update: ");
        String title = scanner.nextLine();

        System.out.print("Enter new description: ");
        String newDescription = scanner.nextLine();

        System.out.print("Enter new priority: ");
        String newPriority = scanner.nextLine();

        taskList.updateTask(title, newDescription, newPriority);
    }

    private void deleteTask() {
        System.out.print("Enter the title of the task to delete: ");
        String title = scanner.nextLine();
        taskList.deleteTask(title);
    }
}
