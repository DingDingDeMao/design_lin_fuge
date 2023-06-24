package com.lin.design;

import com.lin.design.store.ICommodity;
import com.lin.design.store.impl.CardCommodityService;
import com.lin.design.store.impl.CouponCommodityService;
import com.lin.design.store.impl.GoodsCommodityService;

/**
 * @Author：铃儿响叮当
 * @Package：com.lin.design.store
 * @Date：2023/6/24 19:21
 * @Filename：StoreFactory
 * @description:
 */
public class StoreFactory {
    public ICommodity getCommodityService(Integer commodityType) {
        if (null == commodityType) return null;
        if (1 == commodityType) return new CardCommodityService();
        if (2 == commodityType) return new GoodsCommodityService();
        if (3 == commodityType) return new CouponCommodityService();
        throw new RuntimeException("不存在的商品服务类型");
    }
}
