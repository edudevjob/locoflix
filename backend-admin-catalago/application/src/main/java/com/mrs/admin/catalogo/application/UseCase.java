package com.mrs.admin.catalogo.application;

import com.mrs.admin.catalogo.domain.category.Category;

public class UseCase {
    public Category execute(){
        return new Category();
    }
}