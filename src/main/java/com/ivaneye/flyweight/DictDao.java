package com.ivaneye.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 字典DAO
 *
 * @author ivaneye
 * @since 2021-02-10 11:35:18
 */
public class DictDao {

    // 假装这是数据库
    private static Map<String, Dict> DB = new HashMap() {{
        this.put("key1", new Dict("key1", "val1"));
        this.put("key2", new Dict("key2", "val2"));
    }};

    public Dict get(String key) {
        return DB.get(key);
    }
}
