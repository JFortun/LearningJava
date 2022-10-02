package org.fortun.common;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

public class Account {

    private Integer id;
    private String email;
    private String name;
    private String password;
    private LocalDate birthDay;
    private AccountRoles role;
    private Integer money;

    public Account(Integer id, String email, String name, String password, LocalDate birthDay, AccountRoles role, Integer money) {
        this.id = id;
        this.email = email;
        this.name = name;
        this.password = password;
        this.birthDay = birthDay;
        this.role = role;
        this.money = money;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    public AccountRoles getRole() {
        return role;
    }

    public void setRole(AccountRoles role) {
        this.role = role;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public List<Account> getGeneratedExampleAccounts() {
        return Arrays.asList(
                new Account(1, "john@mail.com", "John", "john123", LocalDate.of(1, Month.JANUARY, 1), AccountRoles.ADMIN, 3000),
                new Account(1, "jane@mail.com", "Jane", "jane123", LocalDate.of(2, Month.FEBRUARY, 1), AccountRoles.USER, 5000),
                new Account(1, "frank@mail.com", "Frank", "frank123", LocalDate.of(3, Month.MARCH, 1), AccountRoles.GUEST, 7000),
                new Account(1, "Julia@mail.com", "Julia", "julia123", LocalDate.of(4, Month.APRIL, 1), AccountRoles.USER, 9000)
        );
    }
}
