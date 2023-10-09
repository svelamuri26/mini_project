package org.example;

import java.util.Scanner;

public class Task implements Taskable {

        private String title;
        private String description;
        private String priority;
        private String status;

        public Task(String title, String description, String priority) {
            this.title = title;
            this.description = description;
            this.priority = priority;
            this.status = "To-Do";
        }

        @Override
        public void displayTask() {
            System.out.println("Title: " + title);
            System.out.println("Description: " + description);
            System.out.println("Priority: " + priority);
            System.out.println("Status: " + status);
        }

        @Override
        public void editTask(String newDescription, String newPriority) {
            this.description = newDescription;
            this.priority = newPriority;
        }

        @Override
        public void changeStatus(String newStatus) {
            this.status = newStatus;
        }

    @Override
    public Object getTitle() {
        return null;
    }

    // Other methods, getters, setters, and toString can be added as needed

        @Override
        public String toString() {
            return title;
        }
    }
