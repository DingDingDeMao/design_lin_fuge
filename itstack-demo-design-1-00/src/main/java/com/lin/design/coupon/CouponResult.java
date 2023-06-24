package com.lin.design.coupon;

/**
 * @Author：铃儿响叮当
 * @Package：com.lin.design.coupon
 * @Date：2023/6/24 16:41
 * @Filename：CouponResult
 * @description:
 */
public class CouponResult {
    //优惠券编号
    private String code;
    //描述
    private String info;

    public CouponResult(String code, String info) {
        this.code = code;
        this.info = info;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
