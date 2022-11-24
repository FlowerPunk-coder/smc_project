package ru.smc.model.enums;

public enum Roles {

    ROLE_ADMIN("Администратор"), ROLE_USER("Пользователь");

    private final String title;
    Roles(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }
}
