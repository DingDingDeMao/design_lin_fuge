package com.lin.design;

import java.math.BigDecimal;

/**
 * @Author：铃儿响叮当
 * @Package：com.lin.design
 * @Date：2023/6/25 14:35
 * @Filename：Context
 * @description:
 */
public class Context<T> {
    private ICouponDiscount<T> couponDiscount;

    public Context(ICouponDiscount<T> couponDiscount) {
        this.couponDiscount = couponDiscount;
    }

    public BigDecimal discountAmount(T couponInfo,BigDecimal skuPrice){
        return couponDiscount.discountAmount(couponInfo,skuPrice);
    }
}
