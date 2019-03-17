package com.company.lesson8;

public class Aspirant extends Student {
    private String siencework;

    public Aspirant(String firstName, String lastName, String group, double averageMark, String siencework) {
        super(firstName, lastName, group, averageMark);
        this.siencework = siencework;
    }

    public String getSiencework() {
        return siencework;
    }

    public void setSiencework(String siencework) {
        this.siencework = siencework;

    }
    public int getScholarship() {
        return getAverageMark() == 5 ? 280 : 200;
    }
    // public void set
}
