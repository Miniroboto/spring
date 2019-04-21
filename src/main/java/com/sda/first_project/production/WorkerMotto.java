package com.sda.first_project.production;

public class WorkerMotto {
    String motto;

    public WorkerMotto(String motto) {
        this.motto = motto;
    }

    public String getMotto() {
        return motto;
    }

    public void setMotto(String motto) {
        this.motto = motto;
    }

    @Override
    public String toString() {
        return "WorkerMotto{" +
                "motto='" + motto + '\'' +
                '}';
    }
}
