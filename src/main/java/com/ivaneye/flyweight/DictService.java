package com.ivaneye.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 字典Service（FlyweightFactory）
 *
 * @author ivaneye
 * @since 2021-02-10 11:43:12
 */
public class DictService {

    private Map<String, Dict> cache = new HashMap<>();

    // 假装注入PostDao
    private DictDao dictDao = new DictDao();

    public Dict get(String key) {
        Dict dict = cache.get(key);
        if (dict == null) {
            dict = dictDao.get(key);
            cache.put(key, dict);
        }
        return dict;
    }
}
