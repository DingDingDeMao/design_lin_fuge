package com.lin.design.coupon;

/**
 * @Author：铃儿响叮当
 * @Package：com.lin.design.coupon
 * @Date：2023/6/24 16:49
 * @Filename：CouponService
 * @description:
 */
public class CouponService {
    public CouponResult sendCoupon(String uid,String couponNumber,String uuid){
        System.out.println("模拟发放优惠券一张：" + uid + "," + couponNumber + "," + uuid);
        return new CouponResult("0000", "发放成功");
    }
}
