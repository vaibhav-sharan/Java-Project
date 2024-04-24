package com.Practical.ModelMapper;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.modelmapper.ModelMapper;

public class ModelMapperExample2 {
    public static void main(String[] args) {
        // Create ModelMapper instance
        ModelMapper modelMapper = new ModelMapper();

        // Source object
        OrderDTO orderDTO = new OrderDTO("1234", "Product A", 2);

        // Perform mapping to destination object
        Order order = modelMapper.map(orderDTO, Order.class);

        // Output mapped object
        System.out.println("Mapped order object: " + order);
    }

    // Source DTO class
    @Data
    @AllArgsConstructor
    static class OrderDTO {
        // Getters and setters
        private String orderId;
        private String productName;
        private int quantity;

    }

    // Destination entity class
    @Data
    static class Order {
        // Getters and setters
        private String id;
        private String name;
        private int quantity;

    }
}
