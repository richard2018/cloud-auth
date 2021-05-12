package com.zte.mapper;

import com.zte.entity.OrderInfo;
import org.apache.ibatis.annotations.Param;

/**
 * Created by smlz on 2019/11/17.
 */
public interface OrderInfoMapper {

    OrderInfo selectOrderInfoByIdAndUserName(@Param("orderNo") String orderNo);

    int insertOrder(OrderInfo orderInfo);
}
