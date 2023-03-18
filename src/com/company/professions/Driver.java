package com.company.professions;

public class Driver {
    private String fullName;
    private String experienceDriving;

    public Driver(String fullName, String experienceDriving) {
        this.fullName = fullName;
        this.experienceDriving = experienceDriving;
    }

    public Driver() {
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getExperienceDriving() {
        return experienceDriving;
    }

    public void setExperienceDriving(String experienceDriving) {
        this.experienceDriving = experienceDriving;
    }

    @Override
    public String toString() {
        return "Driver :" +
                "fullName - " + fullName  +
                ", ExperienceDriving - " + experienceDriving ;
    }
}
