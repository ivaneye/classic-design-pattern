package com.ivaneye.memento;

/**
 * @author ivaneye
 * @since 2021-02-10 11:43:12
 */
public class PostService {

    // 假装注入PostDao
    private PostDao postDao = new PostDao();

    public long save(PostParam param) {
        Post post = param.getPost();
        long id = postDao.save(post);
        return id;
    }

    public PostParam get(Long id) {
        Post post = postDao.get(id);
        return new PostParam().restore(post);
    }

}
