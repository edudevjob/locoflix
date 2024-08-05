package com.mrs.admin.catalogo.domain.exceptions;

import java.util.List;

import com.mrs.admin.catalogo.domain.validation.Error;

public class DomainException extends NoStacktraceExcepetion{

    private final List<Error> errors;

    private DomainException(final String aMessage, final List<Error> anErrors) {
        super(aMessage); // Para não colocar a Stack Tracer completa
        this.errors = anErrors;
    }

    public static DomainException with(final Error anErrors) {
            return new DomainException(anErrors.message(),List.of(anErrors));
    }

    public static DomainException with(final List<Error> anErrors) {
        return new DomainException("",anErrors);
    }

    public List<Error> getErrors() {
        return errors;
    }

}
