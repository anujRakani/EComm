package com.springmvcdemo.ecomm.dao;

import java.util.List;

import com.springmvcdemo.ecomm.model.CartInfo;
import com.springmvcdemo.ecomm.model.OrderDetailInfo;
import com.springmvcdemo.ecomm.model.OrderInfo;
import com.springmvcdemo.ecomm.model.PaginationResult;

public interface OrderDAO {

	public void saveOrder(CartInfo cartInfo);
	 
    public PaginationResult<OrderInfo> listOrderInfo(int page,
            int maxResult, int maxNavigationPage);
    
    public OrderInfo getOrderInfo(String orderId);
    
    public List<OrderDetailInfo> listOrderDetailInfos(String orderId);
    
}
