package com.lin.design.impl;

import com.lin.design.ICouponDiscount;

import java.math.BigDecimal;

/**
 * @Author：铃儿响叮当
 * @Package：com.lin.design.impl
 * @Date：2023/6/25 13:43
 * @Filename：ZJCouponDiscount
 * @description:
 */
public class ZJCouponDiscount implements ICouponDiscount<Double> {
    /**
     * 直减计算
     * 1. 使用商品价格减去优惠价格
     * 2. 最低支付金额1元
     */
    @Override
    public BigDecimal discountAmount(Double couponInfo, BigDecimal skuPrice) {
        //需要降扣的金额
        BigDecimal discountAmount = skuPrice.subtract(new BigDecimal(couponInfo));
        if(discountAmount.compareTo(BigDecimal.ONE)<1) return BigDecimal.ONE;
        return discountAmount;
    }
}
