package com.ivaneye.memento;

/**
 * 假装这是PostController
 *
 * @author ivaneye
 * @since 2021-02-10 11:48:26
 */
public class Main {

    // 假装注入Service
    private static PostService service = new PostService();

    public static void main(String[] args) {
        // 构造参数
        PostParam param = new PostParam();
        param.setTitle("帖子标题");
        param.setContent("帖子内容");
        System.out.println(param);
        // 保存数据
        long id = service.save(param);
        // 获取数据
        PostParam restoreParam = service.get(id);
        System.out.println(restoreParam);
    }
}
