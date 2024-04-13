package co.istad.elearningrestapi.features.category;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/categories")
@RequiredArgsConstructor
public class CategoryController {

//[POST] /api/v1/categories => Create a new category
//[GET] /api/v1/categories => Find all categories by pagination
//[GET] /api/v1/categories/parents => Find all categories which have subcategories
//[GET] /api/v1/categories/{alias} => Find a category
//[PUT] /api/v1/categories/{alias} => Update a category’s information
//[PUT] /api/v1/categories/{alias} => Disable a category

}
