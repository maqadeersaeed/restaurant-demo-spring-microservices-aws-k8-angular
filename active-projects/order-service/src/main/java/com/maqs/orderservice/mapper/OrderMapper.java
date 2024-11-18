package com.maqs.orderservice.mapper;


import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.maqs.orderservice.dto.OrderDTO;
import com.maqs.orderservice.entity.Order;

@Mapper
public interface OrderMapper {

    OrderMapper INSTANCE = Mappers.getMapper(OrderMapper.class);

    Order mapOrderDTOToOrder(OrderDTO orderDTO);
    OrderDTO mapOrderToOrderDTO(Order order);

}
