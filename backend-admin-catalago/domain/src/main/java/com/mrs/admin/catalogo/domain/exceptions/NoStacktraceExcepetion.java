package com.mrs.admin.catalogo.domain.exceptions;

public class NoStacktraceExcepetion extends RuntimeException {
    public NoStacktraceExcepetion(final String message) {
        this(message, null);
    }

    public NoStacktraceExcepetion(final String message, final Throwable cause) {
        super(message, cause, true, false);
    }
}
