package me.khotenov.testjunit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserTest {

    private User user1;
    private User user2;
    private User user3;

    @BeforeEach
    public void setUp() {
        String goodEmail = "sky@pro.com";
        String badEmail = "sky_pro_com";

        user1 = new User("Vasiliy13", goodEmail);
        user2 = new User("Cvetochek123", badEmail);
        user3 = new User();

    }

    @Test
    @DisplayName("Задание 1. Тест создания объекта User с передачей в него 2х параметров.")
    public void checkUserWithParam() {
        assertNotNull(user1.getLogin());
        assertNotNull(user1.getEmail());
    }

    @Test
    @DisplayName("Задание 2. Тест создания объекта User без передачи в него параметров.")
    public void checkUserWithoutParam() {
        assertNull(user3.getLogin());
        assertNull(user3.getEmail());
    }

    @Test
    @DisplayName("Задание 3. Проверка корректности написания Email.")
    public void checkCorrectEmail() {
        assertTrue(user1.checkEmail(user1.getEmail()));
    }

    @Test
    @DisplayName("Задание 4. Проверка равенства login и email (они не должны быть равны).")
    public void checkEqualityEmailAndLogin() {
        assertNotEquals(user1.getLogin(), user1.getEmail());
    }
}
