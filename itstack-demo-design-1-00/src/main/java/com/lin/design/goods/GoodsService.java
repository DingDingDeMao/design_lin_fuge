package com.lin.design.goods;

import com.alibaba.fastjson.JSON;

/**
 * @Author：铃儿响叮当
 * @Package：com.lin.design.goods
 * @Date：2023/6/24 16:52
 * @Filename：GoodsService
 * @description:
 */
public class GoodsService {
    public Boolean deliverGoods(DeliverReq req){
        System.out.println("模拟发货实物商品一个：" + JSON.toJSONString(req));
        return true;
    }
}
