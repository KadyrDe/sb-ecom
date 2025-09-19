package com.ecommerce.project.payload;

import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.NotBlank;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CategoryDTO {
    private Long categoryId;

    @NotBlank(message = "Must not be blank")
    @Size(min = 5, message = "Category must contain at least 5 characters")
    private String categoryName;
}
