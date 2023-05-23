package me.khotenov.testjunit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserTest {

    private User user1;
    private User user2;

    @BeforeEach
    public void setUp() {
        user1 = new User("Vasiliy13", "sky@pro.com");
        user2 = new User();
    }

    @Test
    @DisplayName("Задание 1. Тест создания объекта User с передачей в него 2х параметров.")
    public void checkUserWithParam() {
        assertEquals("Vasiliy13", user1.getLogin());
        assertEquals("sky@pro.com", user1.getEmail());
    }

    @Test
    @DisplayName("Задание 2. Тест создания объекта User без передачи в него параметров.")
    public void checkUserWithoutParam() {
        assertNull(user2.getLogin());
        assertNull(user2.getEmail());
    }

    @Test
    @DisplayName("Задание 3. Проверка корректности написания Email.")
    public void checkCorrectEmail() {
        assertThrows(IllegalArgumentException.class,
                () -> new User("login","skyprocom"));
    }

    @Test
    @DisplayName("Задание 4. Проверка равенства login и email (они не должны быть равны).")
    public void checkEqualityEmailAndLogin() {
        assertThrows(IllegalArgumentException.class,
                () -> new User("sky@pro.com","sky@pro.com"));
    }
}
