package com.ivaneye.memento;

import java.util.HashMap;
import java.util.Map;

/**
 * 帖子DAO(Caretaker)
 *
 * @author ivaneye
 * @since 2021-02-10 11:35:18
 */
public class PostDao {

    // 假装这是数据库
    private static Map<Long, Post> DB = new HashMap<>();

    public long save(Post post) {
        long id = System.currentTimeMillis();
        DB.put(id, post);
        return id;
    }

    public Post get(Long id) {
        return DB.get(id);
    }

}
