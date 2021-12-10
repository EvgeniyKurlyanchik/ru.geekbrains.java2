package ru.geekbrains.jv2lesson1;

public enum Week {
    MONDAY(40,"Понедешльник","рабочий"), TUESDAY(32,"Вторник","рабочий"), WEDNESDAY(24,"",""),
    THURSDAY(16,"","рабочий"), FRIDAY(8,"Пятница","рабочий"), SATURDAY(0,"Суббота","выходной"), SUNDAY(0,"Воскресенье","выходной");
    private int h;
    private String name;
    private String worked;

    Week(int h, String name, String worked) {
        this.h = h;
        this.name = name;
        this.worked = worked;
    }

    public int getH() {
        return h;
    }

    public String getName() {
        return name;
    }

    public String getWorked() {
        return worked;
    }

}