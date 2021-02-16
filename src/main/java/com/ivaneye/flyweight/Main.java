package com.ivaneye.flyweight;

/**
 * 假装这是DictController
 *
 * @author ivaneye
 * @since 2021-02-10 11:48:26
 */
public class Main {

    // 假装注入Service
    private static DictService service = new DictService();

    public static void main(String[] args) {
        // 获取数据
        Dict dict1 = service.get("key1");
        System.out.println(dict1);
        Dict dict2 = service.get("key2");
        System.out.println(dict2);
        Dict dict3 = service.get("key1");
        System.out.println(dict3);
        System.out.println(dict1 == dict2);
        System.out.println(dict1 == dict3);
    }
}
