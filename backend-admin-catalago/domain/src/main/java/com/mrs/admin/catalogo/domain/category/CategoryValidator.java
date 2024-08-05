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
        checkNameConstraints();
    }

    private void checkNameConstraints() {
        final String name = this.category.getName();
        if(name == null){
            this.validationHandler().append(new Error("'name' should not be null"));
            return;
        }
        if(name.isBlank()){
            this.validationHandler().append(new Error("'name' should not be empty"));
            return;
        }
        final int length = name.trim().length();
        if(length > 255 || length < 3){
            this.validationHandler().append(new Error("'name' must be less than 3 end 255 characters"));
        }
    }
}
