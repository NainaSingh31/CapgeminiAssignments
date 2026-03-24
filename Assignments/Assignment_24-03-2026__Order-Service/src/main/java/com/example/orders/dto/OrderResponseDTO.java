package com.example.orders.dto;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class OrderResponseDTO {
    private Long orderId;

    private String customerName;
    private String email;
    private String productName;
    private Integer quantity;
    private Double pricePerUnit;
    private Double totalAmount;
}