package com.springinaction.knights;

public class QuestException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public QuestException(String message) {
        super(message);
    }
}
