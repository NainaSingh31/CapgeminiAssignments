package com.example.orders.mapper;

import com.example.orders.dto.OrderRequestDTO;
import com.example.orders.dto.OrderResponseDTO;
import com.example.orders.entity.OrderEntity;

public class OrderMapper {

    public static OrderEntity toEntity(OrderRequestDTO dto) {
        OrderEntity e = new OrderEntity();
        e.setCustomerName(dto.getCustomerName());
        e.setEmail(dto.getEmail());
        e.setProductName(dto.getProductName());
        e.setQuantity(dto.getQuantity());
        e.setPricePerUnit(dto.getPricePerUnit());
        e.setTotalAmount(dto.getPricePerUnit() * dto.getQuantity());
        return e;
    }

    public static OrderResponseDTO toResponseDTO(OrderEntity entity) {
        OrderResponseDTO dto = new OrderResponseDTO();
        dto.setOrderId(entity.getId());
        dto.setCustomerName(entity.getCustomerName());
        dto.setEmail(entity.getEmail());
        dto.setProductName(entity.getProductName());
        dto.setQuantity(entity.getQuantity());
        dto.setPricePerUnit(entity.getPricePerUnit());
        dto.setTotalAmount(entity.getTotalAmount());
        return dto;
    }
}
