package com.epam.izh.rd.online.exception;

public class SimplePasswordException extends Exception {
    public SimplePasswordException() {
        System.err.println("Пароль не соответствует требованиям безопасности");
    }

}
