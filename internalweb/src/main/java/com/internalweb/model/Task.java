package com.internalweb.model;

public class Task {
    private Long id;
    private String description;
    private String assignedTo;
    private boolean completed;

    public Task() {}
    public Task(Long id, String description, String assignedTo) {
        this.id = id;
        this.description = description;
        this.assignedTo = assignedTo;
        this.completed = false;
    }
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public String getAssignedTo() { return assignedTo; }
    public void setAssignedTo(String assignedTo) { this.assignedTo = assignedTo; }
    public boolean isCompleted() { return completed; }
    public void setCompleted(boolean completed) { this.completed = completed; }
}
