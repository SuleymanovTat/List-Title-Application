package ru.suleymanovtat.listtitleapplication;

/**
 * Created by suleymanovtat on 05.03.2018.
 */

public class Сontact {

    private String name;
    private String phone;
    private String title;
    private boolean isHeader;

    Сontact(String name, String phone, String title, boolean isHeader) {
        this.name = name;
        this.phone = phone;
        this.title = title;
        this.isHeader = isHeader;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getTitle() {
        return title;
    }

    public boolean isHeader() {
        return isHeader;
    }
}
