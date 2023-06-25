package com.lin.design.impl;

import com.lin.design.ICouponDiscount;

import java.math.BigDecimal;

/**
 * @Author：铃儿响叮当
 * @Package：com.lin.design.impl
 * @Date：2023/6/25 13:49
 * @Filename：ZKCouponDiscount
 * @description:
 */
public class ZKCouponDiscount implements ICouponDiscount<Double> {
    /**
     * 折扣计算
     * 1. 使用商品价格乘以折扣比例，为最后支付金额
     * 2. 保留两位小数
     * 3. 最低支付金额1元
     */
    @Override
    public BigDecimal discountAmount(Double couponInfo, BigDecimal skuPrice) {
        //最后支付金额
        BigDecimal discountAmount = skuPrice.multiply(new BigDecimal(couponInfo)).setScale(2, BigDecimal.ROUND_HALF_UP);
        if(discountAmount.compareTo(BigDecimal.ONE)<1) return BigDecimal.ONE;
        return discountAmount;
    }
}
