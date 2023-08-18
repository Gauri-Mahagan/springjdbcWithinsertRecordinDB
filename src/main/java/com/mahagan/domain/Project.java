package com.mahagan.domain;

public class Project {
    private int projectNo;
    private String title;
    private String decription;
    private int duration;
    private String status;

    public int getProjectNo() {
        return projectNo;
    }

    public void setProjectNo(int projectNo) {
        this.projectNo = projectNo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDecription() {
        return decription;
    }

    public void setDecription(String decription) {
        this.decription = decription;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Project(int projectNo, String title, String decription, int duration, String status) {
        this.projectNo = projectNo;
        this.title = title;
        this.decription = decription;
        this.duration = duration;
        this.status = status;
    }

    public Project() {
    }

    @Override
    public String toString() {
        return "Project{" +
                "projectNo=" + projectNo +
                ", title='" + title + '\'' +
                ", decription='" + decription + '\'' +
                ", duration=" + duration +
                ", status='" + status + '\'' +
                '}';
    }

}
