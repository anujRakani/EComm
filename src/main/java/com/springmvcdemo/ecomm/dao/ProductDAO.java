package com.springmvcdemo.ecomm.dao;

import com.springmvcdemo.ecomm.entity.Product;
import com.springmvcdemo.ecomm.model.PaginationResult;
import com.springmvcdemo.ecomm.model.ProductInfo;

public interface ProductDAO {

public Product findProduct(String code);
    
    public ProductInfo findProductInfo(String code) ;
  
    
    public PaginationResult<ProductInfo> queryProducts(int page,
                       int maxResult, int maxNavigationPage  );
    
    public PaginationResult<ProductInfo> queryProducts(int page, int maxResult,
                       int maxNavigationPage, String likeName);
 
    public void save(ProductInfo productInfo);
    
}
