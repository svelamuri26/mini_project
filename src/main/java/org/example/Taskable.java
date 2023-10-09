package org.example;
public interface Taskable {
        void displayTask();
        void editTask(String newDescription, String newPriority);
        void changeStatus(String newStatus);

        Object getTitle();
}
