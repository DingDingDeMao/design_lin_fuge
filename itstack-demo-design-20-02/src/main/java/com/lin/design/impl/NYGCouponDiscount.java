package com.lin.design.impl;

import com.lin.design.ICouponDiscount;

import java.math.BigDecimal;
import java.util.Map;

/**
 * @Author：铃儿响叮当
 * @Package：com.lin.design.impl
 * @Date：2023/6/25 13:37
 * @Filename：NYGCouponDiscount
 * @description:
 */
public class NYGCouponDiscount implements ICouponDiscount<Double> {


    /**
     * n元购购买
     * 1. 无论原价多少钱都固定金额购买
     */
    @Override
    public BigDecimal discountAmount(Double couponInfo, BigDecimal skuPrice) {
        return new BigDecimal(couponInfo);
    }
}
