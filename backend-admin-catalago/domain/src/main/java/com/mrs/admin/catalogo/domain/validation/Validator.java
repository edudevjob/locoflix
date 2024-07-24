package com.mrs.admin.catalogo.domain.validation;

public abstract class Validator {
    private final ValidationHandler handler;

    protected Validator(final ValidationHandler handler) {
        this.handler = handler;
    }

    public abstract void validate();

    //Helper
    protected ValidationHandler validationHandler(){
        return this.handler;
    }
}
