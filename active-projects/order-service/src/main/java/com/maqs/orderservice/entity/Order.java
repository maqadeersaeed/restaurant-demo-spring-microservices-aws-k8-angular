package com.maqs.orderservice.entity;


import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import com.maqs.orderservice.dto.FoodItemsDTO;
import com.maqs.orderservice.dto.Restaurant;
import com.maqs.orderservice.dto.UserDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document("order")
public class Order {
    private Integer orderId;
    private List<FoodItemsDTO> foodItemsList;
    private Restaurant restaurant;
    private UserDTO userDTO;

}
