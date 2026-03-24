package com.example.orders.dto;

import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class OrderRequestDTO {
    @NotBlank(message = "customerName must not be blank")
    @Size(min = 3, message = "customerName must be at least 3 characters")
    private String customerName;

    @Email
    @NotNull(message = "email is required")
    private String email;

    @NotNull(message = "product name is required")
    private String productName;

    @NotNull(message = "quantity must be greater than 0")
    @Min(value = 1)
    private Integer quantity;

    @NotNull(message = "price unit is required")
    @Min(value = 1)
    private Double pricePerUnit;
}
