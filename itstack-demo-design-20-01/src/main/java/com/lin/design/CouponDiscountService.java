package com.lin.design;

/**
 * @Author：铃儿响叮当
 * @Package：com.lin.design
 * @Date：2023/6/25 13:13
 * @Filename：CouponDiscountService
 * @description:
 */
public class CouponDiscountService {
    public double discountAmount(int type, double typeContent, double skuPrice, double typeExt){
        //1、直减券
        if(1==type){
            return skuPrice - typeContent;
        }
        // 2. 满减券
        if(2==type){
            if(skuPrice<typeContent) return skuPrice;
            return skuPrice-typeContent;
        }
        // 3. 折扣券
        if(3==type){
            return skuPrice*typeContent;
        }
        if(4==type){
            return typeContent;
        }
        return 0D;
    }
}
