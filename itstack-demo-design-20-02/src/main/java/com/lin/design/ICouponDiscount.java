package com.lin.design;

import java.math.BigDecimal;

/**
 * @Author：铃儿响叮当
 * @Package：com.lin.design
 * @Date：2023/6/25 13:24
 * @Filename：ICouponDiscount
 * @description:
 */
public interface ICouponDiscount<T> {
    /**
     * 优惠券金额计算
     * @param couponInfo 券折扣信息；直减、满减、折扣、N元购
     * @param skuPrice   sku金额
     * @return           优惠后金额
     */
    BigDecimal discountAmount(T couponInfo,BigDecimal skuPrice);
}
