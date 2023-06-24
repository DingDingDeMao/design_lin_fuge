package com.lin.design.store.impl;

import com.alibaba.fastjson.JSON;
import com.lin.design.goods.DeliverReq;
import com.lin.design.goods.GoodsService;
import com.lin.design.store.ICommodity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

/**
 * @Author：铃儿响叮当
 * @Package：com.lin.design.store.impl
 * @Date：2023/6/24 19:14
 * @Filename：GoodsCommodityService
 * @description:
 */
public class GoodsCommodityService implements ICommodity {
    private Logger logger = LoggerFactory.getLogger(GoodsCommodityService.class);
    GoodsService goodsService = new GoodsService();
    @Override
    public void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception {
        DeliverReq deliverReq = new DeliverReq();
        deliverReq.setUserName(queryUserName(uId));
        deliverReq.setUserPhone(queryUserPhoneNumber(uId));
        deliverReq.setSku(commodityId);
        deliverReq.setOrderId(bizId);
        deliverReq.setConsigneeUserName(extMap.get("consigneeUserName"));
        deliverReq.setConsigneeUserPhone(extMap.get("consigneeUserPhone"));
        deliverReq.setConsigneeUserAddress(extMap.get("consigneeUserAddress"));
        Boolean isSuccess = goodsService.deliverGoods(deliverReq);
        logger.info("请求参数[优惠券] => uId：{} commodityId：{} bizId：{} extMap：{}", uId, commodityId, bizId, JSON.toJSON(extMap));
        logger.info("测试结果[优惠券]：{}", isSuccess);

        if(!isSuccess) throw new RuntimeException("实物商品发放失败");
    }
    public String queryUserName(String uid){
        return "花花";
    }
    public String queryUserPhoneNumber(String uid){
        return "15200101232";
    }
}
