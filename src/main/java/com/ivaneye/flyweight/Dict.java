package com.ivaneye.flyweight;

/**
 * 字典（Flyweight）
 *
 * @author ivaneye
 * @since 2021-02-13 10:54:16
 */
public class Dict {

    private String key;

    private String val;

    public Dict(String key, String val) {
        this.key = key;
        this.val = val;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getVal() {
        return val;
    }

    public void setVal(String val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return "Dict{" +
                "key='" + key + '\'' +
                ", val='" + val + '\'' +
                '}';
    }
}
