package org.fortun.common;

public enum AccountRoles {

    ADMIN("admin"),
    USER("user"),
    GUEST("guest");

    private final String name;

    AccountRoles(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
