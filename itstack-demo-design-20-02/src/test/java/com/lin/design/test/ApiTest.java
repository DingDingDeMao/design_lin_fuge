package com.lin.design.test;

import com.lin.design.Context;
import com.lin.design.impl.MJCouponDiscount;
import com.lin.design.impl.NYGCouponDiscount;
import com.lin.design.impl.ZJCouponDiscount;
import com.lin.design.impl.ZKCouponDiscount;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author：铃儿响叮当
 * @Package：com.lin.design.test
 * @Date：2023/6/25 14:41
 * @Filename：ApiTest
 * @description:
 */
public class ApiTest {
    private Logger logger = LoggerFactory.getLogger(ApiTest.class);
    @Test
    public void test_zj() {
        // 直减；100-10，商品100元
        Context<Double> context = new Context<>(new ZJCouponDiscount());
        BigDecimal discountAmount = context.discountAmount(10D, new BigDecimal(200));
        logger.info("测试结果：直减优惠后金额 {}", discountAmount);
    }

    @Test
    public void test_mj(){
        // 满100减10，商品100元
        Context<Map<String, String>> mapContext = new Context<>(new MJCouponDiscount());
        HashMap<String, String> mapReq = new HashMap<>();
        mapReq.put("x","500");
        mapReq.put("n","30");
        BigDecimal discountAmount = mapContext.discountAmount(mapReq, new BigDecimal(500));
        logger.info("测试结果：满减优惠后金额 {}", discountAmount);
    }

    @Test
    public void test_zk(){
        Context<Double> context = new Context<>(new ZKCouponDiscount());
        // 折扣9折，商品100元
        BigDecimal discountAmount = context.discountAmount(0.9D, new BigDecimal(100));
        logger.info("测试结果：折扣9折后金额 {}", discountAmount);
    }

    @Test
    public void test_nyg(){
        // n元购；100-10，商品100元
        Context<Double> context = new Context<>(new NYGCouponDiscount());
        BigDecimal discountAmount = context.discountAmount(90D, new BigDecimal(100));
        logger.info("测试结果：n元购优惠后金额 {}", discountAmount);
    }
}
