package ru.smc.model.enums;

public enum Position {

    SPECIALIST("Специалист"),
    LEADING_SPECIALIST("Ведущий специалист"),
    DEPUTY_CHIEF("Заместитель начальника"),
    CHIEF("Начальник");

    private final String title;

    Position(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
