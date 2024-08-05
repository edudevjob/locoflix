package com.mrs.admin.catalogo.domain.validation;

import java.util.List;

// Interface Fluente
public interface ValidationHandler {
    ValidationHandler append(Error anError);
    ValidationHandler append(ValidationHandler anError);
    ValidationHandler validate(Validation aValidation);

    List<Error> getErrors();

    default boolean hasError(){
        return getErrors() != null && !getErrors().isEmpty();
    }

    public interface Validation{
        void validate();
    }
}
