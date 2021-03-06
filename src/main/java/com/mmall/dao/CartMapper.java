package com.mmall.dao;

import com.mmall.pojo.Cart;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CartMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Cart record);

    int insertSelective(Cart record);

    Cart selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Cart record);

    int updateByPrimaryKey(Cart record);

    Cart selectCartByUserProductId(@Param("userId") Integer userId, @Param("productId") Integer productId);

    List<Cart> selectCartByUserId(Integer userId);

    int selectCartProductCheckedStatusByUserId(Integer userId);

    int deleteByUserIdProductIds(@Param("userId")Integer userId,@Param("productIdList") List<String> productIdList);

    int checkedOrUnckeckedProduct(@Param("userId")Integer userId,@Param("checked")Integer checked,@Param("productId")Integer productId);

    int selectCartProductCount(@Param("userId")Integer userId);

    List<Cart> selectCheckedCartByUserId(@Param("userId")Integer userId);




}