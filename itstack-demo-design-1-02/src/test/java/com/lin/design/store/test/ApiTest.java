package com.lin.design.store.test;

import com.lin.design.StoreFactory;
import com.lin.design.store.ICommodity;
import org.junit.Test;

import java.util.HashMap;

/**
 * @Author：铃儿响叮当
 * @Package：com.lin.design.store.test
 * @Date：2023/6/24 19:39
 * @Filename：ApiTest
 * @description:
 */
public class ApiTest {
    @Test
    public void test_commodity() throws Exception {
        StoreFactory storeFactory = new StoreFactory();
        //优惠券
        ICommodity commodityService_1 = storeFactory.getCommodityService(1);
        commodityService_1.sendCommodity("10001", "EGM1023938910232121323432", "791098764902132", null);

        //实体商品
        ICommodity commodityService_2 = storeFactory.getCommodityService(2);
        HashMap<String, String> extMap = new HashMap<>();
        extMap.put("consigneeUserName", "谢飞机");
        extMap.put("consigneeUserPhone", "15200292123");
        extMap.put("consigneeUserAddress", "吉林省.长春市.双阳区.XX街道.檀溪苑小区.#18-2109");


        HashMap<String, String> stringStringHashMap = new HashMap<>();
        stringStringHashMap.put("consigneeUserName", "谢飞机");
        stringStringHashMap.put("consigneeUserPhone", "15200292123");
        stringStringHashMap.put("consigneeUserAddress", "吉林省.长春市.双阳区.XX街道.檀溪苑小区.#18-2109");
        commodityService_2.sendCommodity("10001","9820198721311","1023000020112221113",stringStringHashMap);

        // 3. 第三方兑换卡(爱奇艺)
        ICommodity commodityService_3= storeFactory.getCommodityService(3);
        commodityService_3.sendCommodity("10001","AQY1xjkUodl8LO975GdfrYUio",null,null);
    }
}
