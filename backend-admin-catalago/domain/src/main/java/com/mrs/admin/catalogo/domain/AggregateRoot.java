package com.mrs.admin.catalogo.domain;

import com.mrs.admin.catalogo.domain.validation.ValidationHandler;

public class AggregateRoot<ID extends Identifier> extends Entity<ID> {
    protected AggregateRoot(ID id) {
        super(id);
    }

    @Override
    public void validate(ValidationHandler handler) {
        // Implementação do método de validação
    }
}
