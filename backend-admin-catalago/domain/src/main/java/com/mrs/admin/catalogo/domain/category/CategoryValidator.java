package com.mrs.admin.catalogo.domain.category;

import com.mrs.admin.catalogo.domain.validation.ValidationHandler;
import com.mrs.admin.catalogo.domain.validation.Validator;
import com.mrs.admin.catalogo.domain.validation.Error;

public class CategoryValidator extends Validator {

    private final Category category;

    public CategoryValidator(final Category aCategory, final ValidationHandler aHandler) {
        super(aHandler);
        this.category = aCategory;
    }

    @Override
    public void validate() {
        if(this.category.getName() == null){
            this.validationHandler().append(new Error("'name' should not be null"));
        }
    }
}
