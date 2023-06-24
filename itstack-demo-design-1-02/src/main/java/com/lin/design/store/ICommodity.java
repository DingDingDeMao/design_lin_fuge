package com.lin.design.store;

import java.util.Map;

/**
 * @Author：铃儿响叮当
 * @Package：com.lin.design.store
 * @Date：2023/6/24 19:01
 * @Filename：ICommodity
 * @description:
 */
public interface ICommodity {
    void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception;
}
