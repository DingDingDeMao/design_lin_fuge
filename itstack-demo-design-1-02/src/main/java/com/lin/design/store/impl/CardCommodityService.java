package com.lin.design.store.impl;

import com.alibaba.fastjson.JSON;
import com.lin.design.card.IQiYiCardService;
import com.lin.design.store.ICommodity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

/**
 * @Author：铃儿响叮当
 * @Package：com.lin.design.store.impl
 * @Date：2023/6/24 19:01
 * @Filename：CardCommodityService
 * @description:
 */
public class CardCommodityService implements ICommodity {
    private Logger logger = LoggerFactory.getLogger(ICommodity.class);
    //模拟注入
    private IQiYiCardService iQiYiCardService = new IQiYiCardService();
    @Override
    public void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception {
        String mobile = queryUserMobile(uId);
        iQiYiCardService.grantToken(mobile,bizId);
        logger.info("请求参数[爱奇艺兑换卡] => uId：{} commodityId：{} bizId：{} extMap：{}", uId, commodityId, bizId, JSON.toJSON(extMap));
        logger.info("测试结果[爱奇艺兑换卡]：success");
    }
    private String queryUserMobile(String uid){
        return "15200101232";
    }
}
