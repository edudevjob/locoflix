package com.mrs.admin.catalogo.domain.exceptions;

import com.mrs.admin.catalogo.domain.validation.Error;

import java.util.List;

public class DomainException extends RuntimeException{

    private final List<Error> errors;

    private DomainException(final List<Error> anErros) {
        super("", null, true, false); // Para não colocar a Stack Tracer completa
        this.errors = anErros;
    }

    public static DomainException with(final List<Error> anErros) {
            return new DomainException(anErros);
    }

    public List<Error> getErrors() {
        return errors;
    }

}
