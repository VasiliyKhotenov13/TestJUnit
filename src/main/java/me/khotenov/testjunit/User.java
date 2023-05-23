package me.khotenov.testjunit;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class User {

    private String login;
    private String email;

    public User(String login, String email) {
        if (email == null || !email.contains("@") || !email.contains(".")) {
            throw new IllegalArgumentException("Введён неверный адрес электронной почты");
        }
        if (login.equals(email)) {
            throw new IllegalArgumentException("Логин и электронная почта не могут быть одинаковыми!");
        }
        this.login = login;
        this.email = email;
    }

    public User() {

    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
