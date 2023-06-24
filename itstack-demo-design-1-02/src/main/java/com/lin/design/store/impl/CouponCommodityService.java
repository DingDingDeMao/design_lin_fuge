package com.lin.design.store.impl;

import com.alibaba.fastjson.JSON;
import com.lin.design.card.IQiYiCardService;
import com.lin.design.coupon.CouponResult;
import com.lin.design.coupon.CouponService;
import com.lin.design.store.ICommodity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

/**
 * @Author：铃儿响叮当
 * @Package：com.lin.design.store.impl
 * @Date：2023/6/24 19:11
 * @Filename：CouponCommodityService
 * @description:
 */
public class CouponCommodityService implements ICommodity {
    private Logger logger = LoggerFactory.getLogger(ICommodity.class);
    //模拟注入
    private CouponService couponService = new CouponService();

    @Override
    public void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception {
        CouponResult couponResult = couponService.sendCoupon(uId, commodityId, bizId);
        logger.info("请求参数[优惠券] => uId：{} commodityId：{} bizId：{} extMap：{}", uId, commodityId, bizId, JSON.toJSON(extMap));
        logger.info("测试结果[优惠券]：{}", JSON.toJSON(couponResult));
        if(!"0000".equals(couponResult.getCode()))throw new RuntimeException(couponResult.getInfo());
    }
}
