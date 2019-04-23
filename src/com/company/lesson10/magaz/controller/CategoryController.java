package com.company.lesson10.magaz.controller;

import com.company.lesson10.magaz.model.Category;
import com.company.lesson10.magaz.model.CategoryDAO;

import java.util.Set;

public class CategoryController {
    public static Set<Category> categories() {
        return new CategoryDAO().getAll();
    }
}
