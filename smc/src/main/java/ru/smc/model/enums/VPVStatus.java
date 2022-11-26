package ru.smc.model.enums;

public enum VPVStatus {

    OPEN("Открыта"),
    CLOSE("Закрыта"),
    KIT("Укомплектованы"),
    NOT_KIT("Не укомплектованы"),
    WORK("Система рабочая"),
    NOT_WORK("Система нерабочая");

    private final String title;

    VPVStatus(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
