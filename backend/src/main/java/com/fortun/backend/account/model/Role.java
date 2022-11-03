package com.fortun.backend.account.model;

public enum Role {

    ADMIN("admin"),
    USER("user"),
    GUEST("guest");

    private final String value;

    Role(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public String toString() {
        return String.valueOf(value);
    }
}

